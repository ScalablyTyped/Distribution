package typings.popmotion

import typings.popmotion.anon.Stop
import typings.popmotion.anon.X
import typings.popmotion.easingTypesMod.Easing
import typings.popmotion.easingTypesMod.EasingModifier
import typings.popmotion.interpolateMod.InterpolateOptions
import typings.popmotion.libTypesMod.Point
import typings.popmotion.libTypesMod.Point2D
import typings.popmotion.libTypesMod.Point3D
import typings.popmotion.mixComplexMod.MixComplex_
import typings.popmotion.stepsMod.Direction
import typings.popmotion.typesMod.Animation
import typings.popmotion.typesMod.AnimationOptions
import typings.popmotion.typesMod.DecayOptions
import typings.popmotion.typesMod.InertiaOptions
import typings.popmotion.typesMod.KeyframeOptions
import typings.popmotion.typesMod.SpringOptions
import typings.styleValueTypes.typesMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("popmotion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def angle(a: Point): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def angle(a: Point, b: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def animate[V](
    hasFromAutoplayDriverElapsedRepeatMaxRepeatTypeRepeatDelayOnPlayOnStopOnCompleteOnRepeatOnUpdateOptions: AnimationOptions[V]
  ): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(hasFromAutoplayDriverElapsedRepeatMaxRepeatTypeRepeatDelayOnPlayOnStopOnCompleteOnRepeatOnUpdateOptions.asInstanceOf[js.Any]).asInstanceOf[Stop]
  
  @JSImport("popmotion", "anticipate")
  @js.native
  val anticipate: Easing = js.native
  
  inline def applyOffset(from: Double): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyOffset")(from.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
  inline def applyOffset(from: Double, to: Double): js.Function1[/* v */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOffset")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Double]]
  
  inline def attract(constant: Double, origin: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("attract")(constant.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def attractExpo(constant: Double, origin: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("attractExpo")(constant.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("popmotion", "backIn")
  @js.native
  val backIn: Easing = js.native
  
  @JSImport("popmotion", "backInOut")
  @js.native
  val backInOut: Easing = js.native
  
  @JSImport("popmotion", "backOut")
  @js.native
  val backOut: Easing = js.native
  
  @JSImport("popmotion", "bounceIn")
  @js.native
  val bounceIn: Easing = js.native
  
  inline def bounceInOut(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceInOut")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def bounceOut(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bounceOut")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("popmotion", "circIn")
  @js.native
  val circIn: Easing = js.native
  
  @JSImport("popmotion", "circInOut")
  @js.native
  val circInOut: Easing = js.native
  
  @JSImport("popmotion", "circOut")
  @js.native
  val circOut: Easing = js.native
  
  inline def clamp(min: Double, max: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createAnticipate(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnticipate")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  inline def createAttractor(): js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAttractor")().asInstanceOf[js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double]]
  inline def createAttractor(alterDisplacement: js.Function): js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAttractor")(alterDisplacement.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double]]
  
  inline def createBackIn(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createBackIn")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  inline def createExpoIn(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createExpoIn")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  inline def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): Easing = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicBezier")(mX1.asInstanceOf[js.Any], mY1.asInstanceOf[js.Any], mX2.asInstanceOf[js.Any], mY2.asInstanceOf[js.Any])).asInstanceOf[Easing]
  
  inline def decay(hasVelocityFromPowerTimeConstantRestDeltaModifyTarget: DecayOptions): Animation[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decay")(hasVelocityFromPowerTimeConstantRestDeltaModifyTarget.asInstanceOf[js.Any]).asInstanceOf[Animation[Double]]
  
  inline def degreesToRadians(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degreesToRadians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def distance(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def distance(a: Point3D, b: Point3D): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def distance[P /* <: X */](a: P, b: P): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("popmotion", "easeIn")
  @js.native
  val easeIn: Easing = js.native
  
  @JSImport("popmotion", "easeInOut")
  @js.native
  val easeInOut: Easing = js.native
  
  @JSImport("popmotion", "easeOut")
  @js.native
  val easeOut: Easing = js.native
  
  inline def inertia(
    hasFromVelocityMinMaxPowerTimeConstantBounceStiffnessBounceDampingRestDeltaModifyTargetDriverOnUpdateOnCompleteOnStop: InertiaOptions
  ): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("inertia")(hasFromVelocityMinMaxPowerTimeConstantBounceStiffnessBounceDampingRestDeltaModifyTargetDriverOnUpdateOnCompleteOnStop.asInstanceOf[js.Any]).asInstanceOf[Stop]
  
  inline def interpolate[T](input: js.Array[Double], output: js.Array[T]): js.Function1[/* v */ Double, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, T]]
  inline def interpolate[T](input: js.Array[Double], output: js.Array[T], hasIsClampEaseMixer: InterpolateOptions[T]): js.Function1[/* v */ Double, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], hasIsClampEaseMixer.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, T]]
  
  inline def isPoint(point: js.Object): /* is popmotion.popmotion/lib/types.Point */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint")(point.asInstanceOf[js.Any]).asInstanceOf[/* is popmotion.popmotion/lib/types.Point */ Boolean]
  
  inline def isPoint3D(point: Point): /* is popmotion.popmotion/lib/types.Point3D */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint3D")(point.asInstanceOf[js.Any]).asInstanceOf[/* is popmotion.popmotion/lib/types.Point3D */ Boolean]
  
  inline def keyframes[V](hasFromToEaseOffsetDuration: KeyframeOptions[Double]): Animation[Double | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(hasFromToEaseOffsetDuration.asInstanceOf[js.Any]).asInstanceOf[Animation[Double | String]]
  
  @JSImport("popmotion", "linear")
  @js.native
  val linear: Easing = js.native
  
  @JSImport("popmotion", "mirrorEasing")
  @js.native
  val mirrorEasing: EasingModifier = js.native
  
  inline def mix(from: Double, to: Double, progress: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def mixColor(from: String, to: String): js.Function1[/* v */ Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Any]]
  inline def mixColor(from: String, to: Color): js.Function1[/* v */ Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Any]]
  inline def mixColor(from: Color, to: String): js.Function1[/* v */ Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Any]]
  inline def mixColor(from: Color, to: Color): js.Function1[/* v */ Double, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Any]]
  
  inline def mixComplex(origin: String, target: String): MixComplex_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mixComplex")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MixComplex_]
  inline def mixComplex(origin: String, target: Double): MixComplex_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mixComplex")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MixComplex_]
  inline def mixComplex(origin: Double, target: String): MixComplex_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mixComplex")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MixComplex_]
  inline def mixComplex(origin: Double, target: Double): MixComplex_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mixComplex")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MixComplex_]
  
  inline def pipe(transformers: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(transformers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function]
  
  inline def pointFromVector(origin: Point2D, angle: Double, distance: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("pointFromVector")(origin.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def progress(from: Double, to: Double, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def radiansToDegrees(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("radiansToDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("popmotion", "reverseEasing")
  @js.native
  val reverseEasing: EasingModifier = js.native
  
  inline def smooth(): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("smooth")().asInstanceOf[js.Function1[/* v */ Double, Double]]
  inline def smooth(strength: Double): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("smooth")(strength.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
  
  inline def smoothFrame(prevValue: Double, nextValue: Double, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothFrame")(prevValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def smoothFrame(prevValue: Double, nextValue: Double, duration: Double, smoothing: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothFrame")(prevValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], smoothing.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def snap(points: js.Array[Double]): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("snap")(points.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
  inline def snap(points: Double): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("snap")(points.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
  
  object spring {
    
    inline def apply(hasFromToRestSpeedRestDeltaOptions: SpringOptions): Animation[Double] = ^.asInstanceOf[js.Dynamic].apply(hasFromToRestSpeedRestDeltaOptions.asInstanceOf[js.Any]).asInstanceOf[Animation[Double]]
    
    @JSImport("popmotion", "spring")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("popmotion", "spring.needsInterpolation")
    @js.native
    def needsInterpolation: js.Function2[/* a */ Any, /* b */ Any, Boolean] = js.native
    inline def needsInterpolation_=(x: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("needsInterpolation")(x.asInstanceOf[js.Any])
  }
  
  inline def steps(steps: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("steps")(steps.asInstanceOf[js.Any]).asInstanceOf[Easing]
  inline def steps(steps: Double, direction: Direction): Easing = (^.asInstanceOf[js.Dynamic].applyDynamic("steps")(steps.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Easing]
  
  inline def toDecimal(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toDecimal(num: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(num.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def velocityPerFrame(xps: Double, frameDuration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("velocityPerFrame")(xps.asInstanceOf[js.Any], frameDuration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def velocityPerSecond(velocity: Double, frameDuration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("velocityPerSecond")(velocity.asInstanceOf[js.Any], frameDuration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def wrap(min: Double, max: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
}
