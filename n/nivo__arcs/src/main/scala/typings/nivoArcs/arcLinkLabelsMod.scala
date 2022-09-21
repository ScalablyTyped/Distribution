package typings.nivoArcs

import typings.nivoArcs.anon.ComputeExtraProps
import typings.nivoArcs.anon.DiagonalLength
import typings.nivoArcs.anon.InterpolateLink
import typings.nivoArcs.anon.Offset
import typings.nivoArcs.arcLinkLabelMod.ArcLinkLabelProps
import typings.nivoArcs.arcLinkLabelsLayerMod.ArcLinkLabelsLayerProps
import typings.nivoArcs.nivoArcsStrings.data
import typings.nivoArcs.nivoArcsStrings.end
import typings.nivoArcs.nivoArcsStrings.points
import typings.nivoArcs.nivoArcsStrings.side
import typings.nivoArcs.nivoArcsStrings.start
import typings.nivoArcs.typesMod.ArcLink
import typings.nivoArcs.typesMod.ArcLinkLabel
import typings.nivoArcs.typesMod.ArcLinkWithDatum
import typings.nivoArcs.typesTypesMod.Arc
import typings.nivoArcs.typesTypesMod.DatumWithArc
import typings.nivoArcs.typesTypesMod.DatumWithArcAndColor
import typings.nivoCore.mod.CompleteTheme
import typings.react.mod.global.JSX.Element
import typings.std.CanvasRenderingContext2D
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcLinkLabelsMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLinkLabelComponent[Datum /* <: DatumWithArcAndColor */](hasLabelStyle: ArcLinkLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelComponent")(hasLabelStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLinkLabelsLayer[Datum /* <: DatumWithArcAndColor */](
    hasCenterDataLabelAccessorSkipAngleOffsetDiagonalLengthStraightLengthStrokeWidthTextOffsetTextColorLinkColorComponent: ArcLinkLabelsLayerProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelsLayer")(hasCenterDataLabelAccessorSkipAngleOffsetDiagonalLengthStraightLengthStrokeWidthTextOffsetTextColorLinkColorComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def computeArcLink(arc: Arc, offset: Double, diagonalLength: Double, straightLength: Double): ArcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLink")(arc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], diagonalLength.asInstanceOf[js.Any], straightLength.asInstanceOf[js.Any])).asInstanceOf[ArcLink]
  
  inline def computeArcLinkTextAnchor(arc: Arc): start | end = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLinkTextAnchor")(arc.asInstanceOf[js.Any]).asInstanceOf[start | end]
  
  inline def drawCanvasArcLinkLabels[Datum /* <: DatumWithArcAndColor */](
    ctx: CanvasRenderingContext2D,
    labels: js.Array[ArcLinkLabel[Datum]],
    theme: CompleteTheme,
    strokeWidth: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLinkLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], strokeWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useArcLinkLabels[Datum /* <: DatumWithArcAndColor */](
    hasDataSkipAngleOffsetDiagonalLengthStraightLengthTextOffsetLabelLinkColorTextColor: DiagonalLength[Datum]
  ): js.Array[
    ArcLinkWithDatum[Datum] & (Omit[
      ArcLinkLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/arc_link_labels/types.ArcLinkWithDatum<Datum> */ data | side | points
    ])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinkLabels")(hasDataSkipAngleOffsetDiagonalLengthStraightLengthTextOffsetLabelLinkColorTextColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ArcLinkWithDatum[Datum] & (Omit[
      ArcLinkLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/arc_link_labels/types.ArcLinkWithDatum<Datum> */ data | side | points
    ])
  ]]
  
  inline def useArcLinkLabelsTransition[Datum /* <: DatumWithArcAndColor */](hasDataOffsetDiagonalLengthStraightLengthSkipAngleTextOffsetLinkColorTextColor: Offset[Datum]): InterpolateLink = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinkLabelsTransition")(hasDataOffsetDiagonalLengthStraightLengthSkipAngleTextOffsetLinkColorTextColor.asInstanceOf[js.Any]).asInstanceOf[InterpolateLink]
  
  inline def useArcLinks[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](
    hasDataSkipAngleOffsetDiagonalLengthStraightLengthComputeExtraProps: ComputeExtraProps[Datum, ExtraProps]
  ): js.Array[ArcLinkWithDatum[Datum] & ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinks")(hasDataSkipAngleOffsetDiagonalLengthStraightLengthComputeExtraProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[ArcLinkWithDatum[Datum] & ExtraProps]]
}
