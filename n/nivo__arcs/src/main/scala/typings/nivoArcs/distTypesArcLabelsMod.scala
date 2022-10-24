package typings.nivoArcs

import typings.nivoArcs.anon.Data
import typings.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typings.nivoArcs.distTypesArcLabelsArcLabelsLayerMod.ArcLabelsLayerProps
import typings.nivoArcs.distTypesArcLabelsUseArcLabelsMod.ArcLabel
import typings.nivoArcs.distTypesCentersMod.ArcCenter
import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.nivoArcs.nivoArcsStrings.data
import typings.nivoArcs.nivoArcsStrings.x
import typings.nivoArcs.nivoArcsStrings.y
import typings.nivoCore.mod.CompleteTheme
import typings.react.mod.global.JSX.Element
import typings.std.CanvasRenderingContext2D
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLabelsMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_labels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLabelComponent[Datum /* <: DatumWithArcAndColor */](param0: ArcLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLabelComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLabelsLayer[Datum /* <: DatumWithArcAndColor */](param0: ArcLabelsLayerProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLabelsLayer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def drawCanvasArcLabels[Datum /* <: DatumWithArcAndColor */](ctx: CanvasRenderingContext2D, labels: js.Array[ArcLabel[Datum]], theme: CompleteTheme): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
}
