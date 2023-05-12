package typings.nivoArcs

import typings.nivoArcs.anon.ComputeExtraProps
import typings.nivoArcs.anon.CornerRadius
import typings.nivoArcs.anon.Data
import typings.nivoArcs.anon.DiagonalLength
import typings.nivoArcs.anon.Enter
import typings.nivoArcs.anon.Height
import typings.nivoArcs.anon.Interpolate
import typings.nivoArcs.anon.InterpolateLink
import typings.nivoArcs.anon.Offset
import typings.nivoArcs.anon.OuterRadius
import typings.nivoArcs.anon.SkipAngle
import typings.nivoArcs.anon.Transition
import typings.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typings.nivoArcs.distTypesArcLabelsArcLabelsLayerMod.ArcLabelsLayerProps
import typings.nivoArcs.distTypesArcLabelsUseArcLabelsMod.ArcLabel
import typings.nivoArcs.distTypesArcLineMod.ArcLineProps
import typings.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typings.nivoArcs.distTypesArcLinkLabelsArcLinkLabelsLayerMod.ArcLinkLabelsLayerProps
import typings.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLink
import typings.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkLabel
import typings.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkWithDatum
import typings.nivoArcs.distTypesArcShapeMod.ArcShapeProps
import typings.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typings.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionModeConfig
import typings.nivoArcs.distTypesArcTransitionModeMod.TransitionExtra
import typings.nivoArcs.distTypesArcsLayerMod.ArcsLayerProps
import typings.nivoArcs.distTypesCentersMod.ArcCenter
import typings.nivoArcs.distTypesTypesMod.Arc
import typings.nivoArcs.distTypesTypesMod.ArcGenerator
import typings.nivoArcs.distTypesTypesMod.DatumWithArc
import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.nivoArcs.distTypesTypesMod.Point
import typings.nivoArcs.nivoArcsStrings.centerRadius
import typings.nivoArcs.nivoArcsStrings.data
import typings.nivoArcs.nivoArcsStrings.end
import typings.nivoArcs.nivoArcsStrings.endAngle
import typings.nivoArcs.nivoArcsStrings.innerRadius
import typings.nivoArcs.nivoArcsStrings.middleAngle
import typings.nivoArcs.nivoArcsStrings.outerRadius
import typings.nivoArcs.nivoArcsStrings.points
import typings.nivoArcs.nivoArcsStrings.pushIn
import typings.nivoArcs.nivoArcsStrings.pushOut
import typings.nivoArcs.nivoArcsStrings.side
import typings.nivoArcs.nivoArcsStrings.start
import typings.nivoArcs.nivoArcsStrings.startAngle
import typings.nivoArcs.nivoArcsStrings.x
import typings.nivoArcs.nivoArcsStrings.y
import typings.nivoCore.mod.CompleteTheme
import typings.react.mod.global.JSX.Element
import typings.reactSpringCore.mod.Interpolation
import typings.reactSpringWeb.mod.SpringValue
import typings.std.CanvasRenderingContext2D
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nivo/arcs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLabelComponent[Datum /* <: DatumWithArcAndColor */](param0: ArcLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLabelComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLabelsLayer[Datum /* <: DatumWithArcAndColor */](param0: ArcLabelsLayerProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLabelsLayer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLine(param0: ArcLineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLine")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLinkLabelComponent[Datum /* <: DatumWithArcAndColor */](param0: ArcLinkLabelProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelComponent")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcLinkLabelsLayer[Datum /* <: DatumWithArcAndColor */](param0: ArcLinkLabelsLayerProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelsLayer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcShape[Datum /* <: DatumWithArcAndColor */](param0: ArcShapeProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcShape")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ArcsLayer[Datum /* <: DatumWithArcAndColor */](param0: ArcsLayerProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcsLayer")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/arcs", "arcTransitionModeById")
  @js.native
  val arcTransitionModeById: Record[ArcTransitionMode, ArcTransitionModeConfig] = js.native
  
  @JSImport("@nivo/arcs", "arcTransitionModes")
  @js.native
  val arcTransitionModes: js.Tuple8[startAngle, middleAngle, endAngle, innerRadius, centerRadius, outerRadius, pushIn, pushOut] = js.native
  
  inline def computeArcBoundingBox(centerX: Double, centerY: Double, radius: Double, startAngle: Double, endAngle: Double): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcBoundingBox")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def computeArcBoundingBox(
    centerX: Double,
    centerY: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    includeCenter: Boolean
  ): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcBoundingBox")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngle.asInstanceOf[js.Any], endAngle.asInstanceOf[js.Any], includeCenter.asInstanceOf[js.Any])).asInstanceOf[Height]
  
  inline def computeArcCenter(arc: Arc, offset: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcCenter")(arc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def computeArcLink(arc: Arc, offset: Double, diagonalLength: Double, straightLength: Double): ArcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLink")(arc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], diagonalLength.asInstanceOf[js.Any], straightLength.asInstanceOf[js.Any])).asInstanceOf[ArcLink]
  
  inline def computeArcLinkTextAnchor(arc: Arc): start | end = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArcLinkTextAnchor")(arc.asInstanceOf[js.Any]).asInstanceOf[start | end]
  
  inline def drawCanvasArcLabels[Datum /* <: DatumWithArcAndColor */](ctx: CanvasRenderingContext2D, labels: js.Array[ArcLabel[Datum]], theme: CompleteTheme): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawCanvasArcLinkLabels[Datum /* <: DatumWithArcAndColor */](
    ctx: CanvasRenderingContext2D,
    labels: js.Array[ArcLinkLabel[Datum]],
    theme: CompleteTheme,
    strokeWidth: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLinkLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], strokeWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findArcUnderCursor[A /* <: Arc */](
    centerX: Double,
    centerY: Double,
    radius: Double,
    innerRadius: Double,
    arcs: js.Array[A],
    cursorX: Double,
    cursorY: Double
  ): js.UndefOr[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("findArcUnderCursor")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], innerRadius.asInstanceOf[js.Any], arcs.asInstanceOf[js.Any], cursorX.asInstanceOf[js.Any], cursorY.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[A]]
  
  inline def interpolateArc(
    startAngleValue: SpringValue[Double],
    endAngleValue: SpringValue[Double],
    innerRadiusValue: SpringValue[Double],
    outerRadiusValue: SpringValue[Double],
    arcGenerator: ArcGenerator
  ): Interpolation[String | Null, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArc")(startAngleValue.asInstanceOf[js.Any], endAngleValue.asInstanceOf[js.Any], innerRadiusValue.asInstanceOf[js.Any], outerRadiusValue.asInstanceOf[js.Any], arcGenerator.asInstanceOf[js.Any])).asInstanceOf[Interpolation[String | Null, Any]]
  
  inline def interpolateArcCenter(offset: Double): js.Function4[
    /* startAngleValue */ SpringValue[Double], 
    /* endAngleValue */ SpringValue[Double], 
    /* innerRadiusValue */ SpringValue[Double], 
    /* outerRadiusValue */ SpringValue[Double], 
    Interpolation[String, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArcCenter")(offset.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* startAngleValue */ SpringValue[Double], 
    /* endAngleValue */ SpringValue[Double], 
    /* innerRadiusValue */ SpringValue[Double], 
    /* outerRadiusValue */ SpringValue[Double], 
    Interpolation[String, Any]
  ]]
  
  inline def isCursorInRing(
    centerX: Double,
    centerY: Double,
    radius: Double,
    innerRadius: Double,
    cursorX: Double,
    cursorY: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCursorInRing")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], innerRadius.asInstanceOf[js.Any], cursorX.asInstanceOf[js.Any], cursorY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useAnimatedArc(datumWithArc: typings.nivoArcs.anon.Arc, arcGenerator: ArcGenerator): OuterRadius = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedArc")(datumWithArc.asInstanceOf[js.Any], arcGenerator.asInstanceOf[js.Any])).asInstanceOf[OuterRadius]
  
  inline def useArcCenters[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](param0: SkipAngle[Datum, ExtraProps]): js.Array[ArcCenter[Datum] & ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcCenters")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[ArcCenter[Datum] & ExtraProps]]
  
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum]): Interpolate[Datum, ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any]).asInstanceOf[Interpolate[Datum, ExtraProps]]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Double): Interpolate[Datum, ExtraProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Interpolate[Datum, ExtraProps]]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Double, mode: Unit, extra: TransitionExtra[Datum, ExtraProps]): Interpolate[Datum, ExtraProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate[Datum, ExtraProps]]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Double, mode: ArcTransitionMode): Interpolate[Datum, ExtraProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Interpolate[Datum, ExtraProps]]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](
    data: js.Array[Datum],
    offset: Double,
    mode: ArcTransitionMode,
    extra: TransitionExtra[Datum, ExtraProps]
  ): Interpolate[Datum, ExtraProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate[Datum, ExtraProps]]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Unit, mode: Unit, extra: TransitionExtra[Datum, ExtraProps]): Interpolate[Datum, ExtraProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate[Datum, ExtraProps]]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Unit, mode: ArcTransitionMode): Interpolate[Datum, ExtraProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Interpolate[Datum, ExtraProps]]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](
    data: js.Array[Datum],
    offset: Unit,
    mode: ArcTransitionMode,
    extra: TransitionExtra[Datum, ExtraProps]
  ): Interpolate[Datum, ExtraProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate[Datum, ExtraProps]]
  
  inline def useArcGenerator(): ArcGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcGenerator")().asInstanceOf[ArcGenerator]
  inline def useArcGenerator(param0: CornerRadius): ArcGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcGenerator")(param0.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator]
  
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
  
  inline def useArcLinkLabelsTransition[Datum /* <: DatumWithArcAndColor */](param0: Offset[Datum]): InterpolateLink[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinkLabelsTransition")(param0.asInstanceOf[js.Any]).asInstanceOf[InterpolateLink[Datum]]
  
  inline def useArcLinks[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](param0: ComputeExtraProps[Datum, ExtraProps]): js.Array[ArcLinkWithDatum[Datum] & ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinks")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[ArcLinkWithDatum[Datum] & ExtraProps]]
  
  inline def useArcTransitionMode[Datum /* <: DatumWithArc */, ExtraProps](mode: ArcTransitionMode): Enter[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcTransitionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Enter[Datum]]
  inline def useArcTransitionMode[Datum /* <: DatumWithArc */, ExtraProps](mode: ArcTransitionMode, extraTransition: TransitionExtra[Datum, ExtraProps]): Enter[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcTransitionMode")(mode.asInstanceOf[js.Any], extraTransition.asInstanceOf[js.Any])).asInstanceOf[Enter[Datum]]
  
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum]): Transition[Datum, ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any]).asInstanceOf[Transition[Datum, ExtraProps]]
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], mode: Unit, extra: TransitionExtra[Datum, ExtraProps]): Transition[Datum, ExtraProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Transition[Datum, ExtraProps]]
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], mode: ArcTransitionMode): Transition[Datum, ExtraProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Transition[Datum, ExtraProps]]
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], mode: ArcTransitionMode, extra: TransitionExtra[Datum, ExtraProps]): Transition[Datum, ExtraProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Transition[Datum, ExtraProps]]
}
