package typings.nivoArcs

import typings.nivoArcs.anon.Progress
import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLabelsArcLabelMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_labels/ArcLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLabel[Datum /* <: DatumWithArcAndColor */](hasLabelStyle: ArcLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLabel")(hasLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ArcLabelProps[Datum /* <: DatumWithArcAndColor */] extends StObject {
    
    var datum: Datum
    
    var label: String
    
    var style: Progress
  }
  object ArcLabelProps {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](datum: Datum, label: String, style: Progress): ArcLabelProps[Datum] = {
      val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcLabelProps[Datum]]
    }
    
    extension [Self <: ArcLabelProps[?], Datum /* <: DatumWithArcAndColor */](x: Self & ArcLabelProps[Datum]) {
      
      inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Progress): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
