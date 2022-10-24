package typings.nivoArcs

import typings.nivoArcs.anon.ComputeExtraProps
import typings.nivoArcs.anon.DiagonalLength
import typings.nivoArcs.anon.InterpolateLink
import typings.nivoArcs.anon.Offset
import typings.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typings.nivoArcs.distTypesArcLinkLabelsArcLinkLabelsLayerMod.ArcLinkLabelsLayerProps
import typings.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLink
import typings.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkLabel
import typings.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkWithDatum
import typings.nivoArcs.distTypesTypesMod.Arc
import typings.nivoArcs.distTypesTypesMod.DatumWithArc
import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.nivoArcs.nivoArcsStrings.data
import typings.nivoArcs.nivoArcsStrings.end
import typings.nivoArcs.nivoArcsStrings.points
import typings.nivoArcs.nivoArcsStrings.side
import typings.nivoArcs.nivoArcsStrings.start
import typings.nivoCore.mod.CompleteTheme
import typings.react.mod.global.JSX.Element
import typings.std.CanvasRenderingContext2D
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLinkLabelsMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLinkLabelComponent[Datum /* <: DatumWithArcAndColor */](param0: ArcLinkLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLinkLabelsLayer[Datum /* <: DatumWithArcAndColor */](param0: ArcLinkLabelsLayerProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelsLayer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def computeArcLink(arc: Arc, offset: Double, diagonalLength: Double, straightLength: Double): ArcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLink")(arc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], diagonalLength.asInstanceOf[js.Any], straightLength.asInstanceOf[js.Any])).asInstanceOf[ArcLink]
  
  inline def computeArcLinkTextAnchor(arc: Arc): start | end = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLinkTextAnchor")(arc.asInstanceOf[js.Any]).asInstanceOf[start | end]
  
  inline def drawCanvasArcLinkLabels[Datum /* <: DatumWithArcAndColor */](
    ctx: CanvasRenderingContext2D,
    labels: js.Array[ArcLinkLabel[Datum]],
    theme: CompleteTheme,
    strokeWidth: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLinkLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], strokeWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useArcLinkLabels[Datum /* <: DatumWithArcAndColor */](param0: DiagonalLength[Datum]): js.Array[
    ArcLinkWithDatum[Datum] & (Omit[
      ArcLinkLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/arc_link_labels/types.ArcLinkWithDatum<Datum> */ data | side | points
    ])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinkLabels")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ArcLinkWithDatum[Datum] & (Omit[
      ArcLinkLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/arc_link_labels/types.ArcLinkWithDatum<Datum> */ data | side | points
    ])
  ]]
  
  inline def useArcLinkLabelsTransition[Datum /* <: DatumWithArcAndColor */](param0: Offset[Datum]): InterpolateLink = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinkLabelsTransition")(param0.asInstanceOf[js.Any]).asInstanceOf[InterpolateLink]
  
  inline def useArcLinks[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](param0: ComputeExtraProps[Datum, ExtraProps]): js.Array[ArcLinkWithDatum[Datum] & ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinks")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[ArcLinkWithDatum[Datum] & ExtraProps]]
}
