package typings.nivoArcs

import typings.nivoArcs.anon.Interpolate
import typings.nivoArcs.anon.SkipAngle
import typings.nivoArcs.arcTransitionModeMod.ArcTransitionMode
import typings.nivoArcs.arcTransitionModeMod.TransitionExtra
import typings.nivoArcs.typesTypesMod.Arc
import typings.nivoArcs.typesTypesMod.DatumWithArc
import typings.nivoArcs.typesTypesMod.Point
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object centersMod {
  
  @JSImport("@nivo/arcs/dist/types/centers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeArcCenter(arc: Arc, offset: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("computeArcCenter")(arc.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def interpolateArcCenter(offset: Double): js.Function4[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* startAngleValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* endAngleValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* innerRadiusValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* outerRadiusValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.Interpolation<string, any> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateArcCenter")(offset.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* startAngleValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* endAngleValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* innerRadiusValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ /* outerRadiusValue */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.Interpolation<string, any> */ Any
  ]]
  
  inline def useArcCenters[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](hasDataOffsetSkipAngleComputeExtraProps: SkipAngle[Datum, ExtraProps]): js.Array[ArcCenter[Datum] & ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcCenters")(hasDataOffsetSkipAngleComputeExtraProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[ArcCenter[Datum] & ExtraProps]]
  
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum]): Interpolate = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any]).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Double): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Double, mode: Unit, extra: TransitionExtra[Datum, ExtraProps]): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Double, mode: ArcTransitionMode): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](
    data: js.Array[Datum],
    offset: Double,
    mode: ArcTransitionMode,
    extra: TransitionExtra[Datum, ExtraProps]
  ): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Unit, mode: Unit, extra: TransitionExtra[Datum, ExtraProps]): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], offset: Unit, mode: ArcTransitionMode): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  inline def useArcCentersTransition[Datum /* <: DatumWithArc */, ExtraProps](
    data: js.Array[Datum],
    offset: Unit,
    mode: ArcTransitionMode,
    extra: TransitionExtra[Datum, ExtraProps]
  ): Interpolate = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcCentersTransition")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Interpolate]
  
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
    
    extension [Self <: ArcCenter[?], Datum /* <: DatumWithArc */](x: Self & ArcCenter[Datum]) {
      
      inline def setData(value: Datum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
