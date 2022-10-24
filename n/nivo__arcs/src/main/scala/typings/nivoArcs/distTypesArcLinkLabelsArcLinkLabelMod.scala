package typings.nivoArcs

import typings.nivoArcs.anon.LinkColor
import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLinkLabelsArcLinkLabelMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels/ArcLinkLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLinkLabel[Datum /* <: DatumWithArcAndColor */](param0: ArcLinkLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabel")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ArcLinkLabelProps[Datum /* <: DatumWithArcAndColor */] extends StObject {
    
    var datum: Datum
    
    var label: String
    
    var style: LinkColor
  }
  object ArcLinkLabelProps {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](datum: Datum, label: String, style: LinkColor): ArcLinkLabelProps[Datum] = {
      val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcLinkLabelProps[Datum]]
    }
    
    extension [Self <: ArcLinkLabelProps[?], Datum /* <: DatumWithArcAndColor */](x: Self & ArcLinkLabelProps[Datum]) {
      
      inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: LinkColor): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
