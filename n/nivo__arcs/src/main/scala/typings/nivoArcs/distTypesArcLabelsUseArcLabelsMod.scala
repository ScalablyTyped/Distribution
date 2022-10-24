package typings.nivoArcs

import typings.nivoArcs.anon.Data
import typings.nivoArcs.distTypesCentersMod.ArcCenter
import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.nivoArcs.nivoArcsStrings.data
import typings.nivoArcs.nivoArcsStrings.x
import typings.nivoArcs.nivoArcsStrings.y
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLabelsUseArcLabelsMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_labels/useArcLabels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useArcLabels[Datum /* <: DatumWithArcAndColor */](param0: Data[Datum]): js.Array[
    ArcCenter[Datum] & (Omit[
      ArcLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/centers.ArcCenter<Datum> */ data | x | y
    ])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLabels")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ArcCenter[Datum] & (Omit[
      ArcLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/centers.ArcCenter<Datum> */ data | x | y
    ])
  ]]
  
  trait ArcLabel[Datum /* <: DatumWithArcAndColor */]
    extends StObject
       with ArcCenter[Datum] {
    
    var label: String
    
    var textColor: String
  }
  object ArcLabel {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](data: Datum, label: String, textColor: String, x: Double, y: Double): ArcLabel[Datum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcLabel[Datum]]
    }
    
    extension [Self <: ArcLabel[?], Datum /* <: DatumWithArcAndColor */](x: Self & ArcLabel[Datum]) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    }
  }
}
