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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("popmotion", "angle")
  @js.native
  def angle(a: Point): Double = js.native
  @JSImport("popmotion", "angle")
  @js.native
  def angle(a: Point, b: Point): Double = js.native
  
  @JSImport("popmotion", "animate")
  @js.native
  def animate[V](
    hasFromAutoplayDriverElapsedRepeatRepeatTypeRepeatDelayOnPlayOnStopOnCompleteOnRepeatOnUpdateOptions: AnimationOptions[V]
  ): Stop = js.native
  
  @JSImport("popmotion", "anticipate")
  @js.native
  val anticipate: Easing = js.native
  
  @JSImport("popmotion", "applyOffset")
  @js.native
  def applyOffset(from: Double): js.Function1[/* v */ Double, Double] = js.native
  @JSImport("popmotion", "applyOffset")
  @js.native
  def applyOffset(from: Double, to: Double): js.Function1[/* v */ Double, Double] = js.native
  
  @JSImport("popmotion", "attract")
  @js.native
  def attract(constant: Double, origin: Double, v: Double): Double = js.native
  
  @JSImport("popmotion", "attractExpo")
  @js.native
  def attractExpo(constant: Double, origin: Double, v: Double): Double = js.native
  
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
  
  @JSImport("popmotion", "bounceInOut")
  @js.native
  def bounceInOut(p: Double): Double = js.native
  
  @JSImport("popmotion", "bounceOut")
  @js.native
  def bounceOut(p: Double): Double = js.native
  
  @JSImport("popmotion", "circIn")
  @js.native
  val circIn: Easing = js.native
  
  @JSImport("popmotion", "circInOut")
  @js.native
  val circInOut: Easing = js.native
  
  @JSImport("popmotion", "circOut")
  @js.native
  val circOut: Easing = js.native
  
  @JSImport("popmotion", "clamp")
  @js.native
  def clamp(min: Double, max: Double, v: Double): Double = js.native
  
  @JSImport("popmotion", "createAnticipate")
  @js.native
  def createAnticipate(power: Double): Easing = js.native
  
  @JSImport("popmotion", "createAttractor")
  @js.native
  def createAttractor(): js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double] = js.native
  @JSImport("popmotion", "createAttractor")
  @js.native
  def createAttractor(alterDisplacement: js.Function): js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double] = js.native
  
  @JSImport("popmotion", "createBackIn")
  @js.native
  def createBackIn(power: Double): Easing = js.native
  
  @JSImport("popmotion", "createExpoIn")
  @js.native
  def createExpoIn(power: Double): Easing = js.native
  
  @JSImport("popmotion", "cubicBezier")
  @js.native
  def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): Easing = js.native
  
  @JSImport("popmotion", "decay")
  @js.native
  def decay(hasVelocityFromPowerTimeConstantRestDeltaModifyTarget: DecayOptions): Animation[Double] = js.native
  
  @JSImport("popmotion", "degreesToRadians")
  @js.native
  def degreesToRadians(degrees: Double): Double = js.native
  
  @JSImport("popmotion", "distance")
  @js.native
  def distance(a: Double, b: Double): Double = js.native
  @JSImport("popmotion", "distance")
  @js.native
  def distance(a: Point3D, b: Point3D): Double = js.native
  @JSImport("popmotion", "distance")
  @js.native
  def distance[P /* <: X */](a: P, b: P): Double = js.native
  
  @JSImport("popmotion", "easeIn")
  @js.native
  val easeIn: Easing = js.native
  
  @JSImport("popmotion", "easeInOut")
  @js.native
  val easeInOut: Easing = js.native
  
  @JSImport("popmotion", "easeOut")
  @js.native
  val easeOut: Easing = js.native
  
  @JSImport("popmotion", "inertia")
  @js.native
  def inertia(
    hasFromVelocityMinMaxPowerTimeConstantBounceStiffnessBounceDampingRestDeltaModifyTargetDriverOnUpdateOnComplete: InertiaOptions
  ): Stop = js.native
  
  @JSImport("popmotion", "interpolate")
  @js.native
  def interpolate[T](input: js.Array[Double], output: js.Array[T]): js.Function1[/* v */ Double, T] = js.native
  @JSImport("popmotion", "interpolate")
  @js.native
  def interpolate[T](input: js.Array[Double], output: js.Array[T], hasClampEaseMixer: InterpolateOptions[T]): js.Function1[/* v */ Double, T] = js.native
  
  @JSImport("popmotion", "isPoint")
  @js.native
  def isPoint(point: js.Object): /* is popmotion.popmotion/lib/types.Point */ Boolean = js.native
  
  @JSImport("popmotion", "isPoint3D")
  @js.native
  def isPoint3D(point: Point): /* is popmotion.popmotion/lib/types.Point3D */ Boolean = js.native
  
  @JSImport("popmotion", "keyframes")
  @js.native
  def keyframes[V](hasFromToEaseOffsetDuration: KeyframeOptions[Double]): Animation[Double | String] = js.native
  
  @JSImport("popmotion", "linear")
  @js.native
  val linear: Easing = js.native
  
  @JSImport("popmotion", "mirrorEasing")
  @js.native
  val mirrorEasing: EasingModifier = js.native
  
  @JSImport("popmotion", "mix")
  @js.native
  def mix(from: Double, to: Double, progress: Double): Double = js.native
  
  @JSImport("popmotion", "mixColor")
  @js.native
  def mixColor(from: String, to: String): js.Function1[/* v */ Double, _] = js.native
  @JSImport("popmotion", "mixColor")
  @js.native
  def mixColor(from: String, to: Color): js.Function1[/* v */ Double, _] = js.native
  @JSImport("popmotion", "mixColor")
  @js.native
  def mixColor(from: Color, to: String): js.Function1[/* v */ Double, _] = js.native
  @JSImport("popmotion", "mixColor")
  @js.native
  def mixColor(from: Color, to: Color): js.Function1[/* v */ Double, _] = js.native
  
  @JSImport("popmotion", "mixComplex")
  @js.native
  def mixComplex(origin: String, target: String): MixComplex_ = js.native
  
  @JSImport("popmotion", "pipe")
  @js.native
  def pipe(transformers: js.Function*): js.Function = js.native
  
  @JSImport("popmotion", "pointFromVector")
  @js.native
  def pointFromVector(origin: Point2D, angle: Double, distance: Double): X = js.native
  
  @JSImport("popmotion", "progress")
  @js.native
  def progress(from: Double, to: Double, value: Double): Double = js.native
  
  @JSImport("popmotion", "radiansToDegrees")
  @js.native
  def radiansToDegrees(radians: Double): Double = js.native
  
  @JSImport("popmotion", "reverseEasing")
  @js.native
  val reverseEasing: EasingModifier = js.native
  
  @JSImport("popmotion", "smooth")
  @js.native
  def smooth(): js.Function1[/* v */ Double, Double] = js.native
  @JSImport("popmotion", "smooth")
  @js.native
  def smooth(strength: Double): js.Function1[/* v */ Double, Double] = js.native
  
  @JSImport("popmotion", "smoothFrame")
  @js.native
  def smoothFrame(prevValue: Double, nextValue: Double, duration: Double): Double = js.native
  @JSImport("popmotion", "smoothFrame")
  @js.native
  def smoothFrame(prevValue: Double, nextValue: Double, duration: Double, smoothing: Double): Double = js.native
  
  @JSImport("popmotion", "snap")
  @js.native
  def snap(points: js.Array[Double]): js.Function1[/* v */ Double, Double] = js.native
  @JSImport("popmotion", "snap")
  @js.native
  def snap(points: Double): js.Function1[/* v */ Double, Double] = js.native
  
  object spring {
    
    @JSImport("popmotion", "spring")
    @js.native
    def apply(hasFromToRestSpeedRestDeltaOptions: SpringOptions): Animation[Double] = js.native
    @JSImport("popmotion", "spring")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("popmotion", "spring.needsInterpolation")
    @js.native
    def needsInterpolation: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
    @scala.inline
    def needsInterpolation_=(x: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("needsInterpolation")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("popmotion", "steps")
  @js.native
  def steps(steps: Double): Easing = js.native
  @JSImport("popmotion", "steps")
  @js.native
  def steps(steps: Double, direction: Direction): Easing = js.native
  
  @JSImport("popmotion", "toDecimal")
  @js.native
  def toDecimal(num: Double): Double = js.native
  @JSImport("popmotion", "toDecimal")
  @js.native
  def toDecimal(num: Double, precision: Double): Double = js.native
  
  @JSImport("popmotion", "velocityPerFrame")
  @js.native
  def velocityPerFrame(xps: Double, frameDuration: Double): Double = js.native
  
  @JSImport("popmotion", "velocityPerSecond")
  @js.native
  def velocityPerSecond(velocity: Double, frameDuration: Double): Double = js.native
  
  @JSImport("popmotion", "wrap")
  @js.native
  def wrap(min: Double, max: Double, v: Double): Double = js.native
}
