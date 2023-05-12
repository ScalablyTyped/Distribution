package typings.nivoArcs

import typings.nivoArcs.anon.Interpolate
import typings.nivoArcs.anon.SkipAngle
import typings.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typings.nivoArcs.distTypesArcTransitionModeMod.TransitionExtra
import typings.nivoArcs.distTypesTypesMod.Arc
import typings.nivoArcs.distTypesTypesMod.DatumWithArc
import typings.nivoArcs.distTypesTypesMod.Point
import typings.reactSpringCore.mod.Interpolation
import typings.reactSpringWeb.mod.SpringValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCentersMod {
  
  @JSImport("@nivo/arcs/dist/types/centers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeArcCenter(arc: Arc, offset: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcCenter")(arc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Point]
  
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
  
  trait ArcCenter[Datum /* <: DatumWithArc */]
    extends StObject
       with Point {
    
    var data: Datum
  }
  object ArcCenter {
    
    inline def apply[Datum /* <: DatumWithArc */](data: Datum, x: Double, y: Double): ArcCenter[Datum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcCenter[Datum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArcCenter[?], Datum /* <: DatumWithArc */] (val x: Self & ArcCenter[Datum]) extends AnyVal {
      
      inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
