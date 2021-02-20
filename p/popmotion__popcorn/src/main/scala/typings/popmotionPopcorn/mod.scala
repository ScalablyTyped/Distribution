package typings.popmotionPopcorn

import org.scalablytyped.runtime.StringDictionary
import typings.popmotionEasing.mod.Easing
import typings.popmotionEasing.mod.EasingModifier
import typings.popmotionPopcorn.anon.X
import typings.popmotionPopcorn.conditionalMod.Apply
import typings.popmotionPopcorn.conditionalMod.Check
import typings.popmotionPopcorn.interpolateMod.InterpolateOptions
import typings.popmotionPopcorn.interpolateMod.Mix
import typings.popmotionPopcorn.mixComplexMod.BlendableObject
import typings.popmotionPopcorn.mixComplexMod.MixComplex_
import typings.popmotionPopcorn.stepsMod.Direction
import typings.popmotionPopcorn.typesMod.Point
import typings.popmotionPopcorn.typesMod.Point2D
import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@popmotion/popcorn", "angle")
  @js.native
  def angle(a: Point): Double = js.native
  @JSImport("@popmotion/popcorn", "angle")
  @js.native
  def angle(a: Point, b: Point): Double = js.native
  
  @JSImport("@popmotion/popcorn", "anticipate")
  @js.native
  val anticipate: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "applyOffset")
  @js.native
  def applyOffset(from: Double): js.Function1[/* v */ Double, Double] = js.native
  @JSImport("@popmotion/popcorn", "applyOffset")
  @js.native
  def applyOffset(from: Double, to: Double): js.Function1[/* v */ Double, Double] = js.native
  
  @JSImport("@popmotion/popcorn", "backIn")
  @js.native
  val backIn: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "backInOut")
  @js.native
  val backInOut: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "backOut")
  @js.native
  val backOut: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "circIn")
  @js.native
  val circIn: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "circInOut")
  @js.native
  val circInOut: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "circOut")
  @js.native
  val circOut: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "clamp")
  @js.native
  def clamp(min: Double, max: Double): js.Any = js.native
  @JSImport("@popmotion/popcorn", "clamp")
  @js.native
  def clamp(min: Double, max: Double, v: Double): js.Any = js.native
  
  @JSImport("@popmotion/popcorn", "conditional")
  @js.native
  def conditional(check: Check, apply: Apply): js.Function1[/* v */ js.Any, _] = js.native
  
  @JSImport("@popmotion/popcorn", "createAnticipateEasing")
  @js.native
  def createAnticipateEasing(power: Double): Easing = js.native
  
  @JSImport("@popmotion/popcorn", "createBackIn")
  @js.native
  def createBackIn(power: Double): Easing = js.native
  
  @JSImport("@popmotion/popcorn", "createExpoIn")
  @js.native
  def createExpoIn(power: Double): Easing = js.native
  
  @JSImport("@popmotion/popcorn", "cubicBezier")
  @js.native
  def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): js.Function1[/* aX */ Double, Double] = js.native
  
  @JSImport("@popmotion/popcorn", "degreesToRadians")
  @js.native
  def degreesToRadians(degrees: Double): Double = js.native
  
  @JSImport("@popmotion/popcorn", "distance")
  @js.native
  def distance(a: typings.popmotionPopcorn.distanceMod.Point): Double = js.native
  @JSImport("@popmotion/popcorn", "distance")
  @js.native
  def distance(a: typings.popmotionPopcorn.distanceMod.Point, b: typings.popmotionPopcorn.distanceMod.Point): Double = js.native
  
  @JSImport("@popmotion/popcorn", "easeIn")
  @js.native
  val easeIn: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "easeInOut")
  @js.native
  val easeInOut: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "easeOut")
  @js.native
  val easeOut: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "interpolate")
  @js.native
  def interpolate[T](input: js.Array[Double], output: js.Array[T]): Mix[T | String | Double] = js.native
  @JSImport("@popmotion/popcorn", "interpolate")
  @js.native
  def interpolate[T](input: js.Array[Double], output: js.Array[T], hasClampEaseMixer: InterpolateOptions[T]): Mix[T | String | Double] = js.native
  
  @JSImport("@popmotion/popcorn", "isPoint")
  @js.native
  def isPoint(point: js.Object): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point */ Boolean = js.native
  
  @JSImport("@popmotion/popcorn", "isPoint3D")
  @js.native
  def isPoint3D(point: Point): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point3D */ Boolean = js.native
  
  @JSImport("@popmotion/popcorn", "linear")
  @js.native
  val linear: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "mirrored")
  @js.native
  val mirrored: EasingModifier = js.native
  
  @JSImport("@popmotion/popcorn", "mix")
  @js.native
  def mix(from: Double, to: Double, progress: Double): Double = js.native
  
  @JSImport("@popmotion/popcorn", "mixArray")
  @js.native
  def mixArray(from: js.Array[String | Double | RGBA | HSLA], to: js.Array[String | Double | RGBA | HSLA]): js.Function1[/* v */ Double, js.Array[String | Double | RGBA | HSLA]] = js.native
  
  @JSImport("@popmotion/popcorn", "mixColor")
  @js.native
  def mixColor(from: String, to: String): js.Function1[/* v */ Double, _] = js.native
  @JSImport("@popmotion/popcorn", "mixColor")
  @js.native
  def mixColor(from: String, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  @JSImport("@popmotion/popcorn", "mixColor")
  @js.native
  def mixColor(from: String, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  @JSImport("@popmotion/popcorn", "mixColor")
  @js.native
  def mixColor(from: HSLA, to: String): js.Function1[/* v */ Double, _] = js.native
  @JSImport("@popmotion/popcorn", "mixColor")
  @js.native
  def mixColor(from: HSLA, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  @JSImport("@popmotion/popcorn", "mixColor")
  @js.native
  def mixColor(from: HSLA, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  @JSImport("@popmotion/popcorn", "mixColor")
  @js.native
  def mixColor(from: RGBA, to: String): js.Function1[/* v */ Double, _] = js.native
  @JSImport("@popmotion/popcorn", "mixColor")
  @js.native
  def mixColor(from: RGBA, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  @JSImport("@popmotion/popcorn", "mixColor")
  @js.native
  def mixColor(from: RGBA, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  
  @JSImport("@popmotion/popcorn", "mixComplex")
  @js.native
  def mixComplex(origin: String, target: String): MixComplex_ = js.native
  
  @JSImport("@popmotion/popcorn", "mixObject")
  @js.native
  def mixObject(origin: BlendableObject, target: BlendableObject): js.Function1[/* v */ Double, StringDictionary[String | Double | RGBA | HSLA]] = js.native
  
  @JSImport("@popmotion/popcorn", "pipe")
  @js.native
  def pipe(transformers: js.Function*): js.Function = js.native
  
  @JSImport("@popmotion/popcorn", "pointFromVector")
  @js.native
  def pointFromVector(origin: Point2D, angle: Double, distance: Double): X = js.native
  
  @JSImport("@popmotion/popcorn", "progress")
  @js.native
  def progress(from: Double, to: Double, value: Double): Double = js.native
  
  @JSImport("@popmotion/popcorn", "radiansToDegrees")
  @js.native
  def radiansToDegrees(radians: Double): Double = js.native
  
  @JSImport("@popmotion/popcorn", "reversed")
  @js.native
  val reversed: EasingModifier = js.native
  
  @JSImport("@popmotion/popcorn", "smooth")
  @js.native
  def smooth(): js.Function1[/* v */ Double, Double] = js.native
  @JSImport("@popmotion/popcorn", "smooth")
  @js.native
  def smooth(strength: Double): js.Function1[/* v */ Double, Double] = js.native
  
  @JSImport("@popmotion/popcorn", "smoothFrame")
  @js.native
  def smoothFrame(prevValue: Double, nextValue: Double, duration: Double): Double = js.native
  @JSImport("@popmotion/popcorn", "smoothFrame")
  @js.native
  def smoothFrame(prevValue: Double, nextValue: Double, duration: Double, smoothing: Double): Double = js.native
  
  @JSImport("@popmotion/popcorn", "snap")
  @js.native
  def snap(points: js.Array[Double]): js.Function1[/* v */ Double, Double] = js.native
  @JSImport("@popmotion/popcorn", "snap")
  @js.native
  def snap(points: Double): js.Function1[/* v */ Double, Double] = js.native
  
  @JSImport("@popmotion/popcorn", "springForce")
  @js.native
  def springForce(): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
  @JSImport("@popmotion/popcorn", "springForce")
  @js.native
  def springForce(alterDisplacement: js.Function): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
  
  @JSImport("@popmotion/popcorn", "springForceExpo")
  @js.native
  def springForceExpo(min: Double, max: Double): js.Any = js.native
  @JSImport("@popmotion/popcorn", "springForceExpo")
  @js.native
  def springForceExpo(min: Double, max: Double, v: Double): js.Any = js.native
  
  @JSImport("@popmotion/popcorn", "springForceLinear")
  @js.native
  def springForceLinear(min: Double, max: Double): js.Any = js.native
  @JSImport("@popmotion/popcorn", "springForceLinear")
  @js.native
  def springForceLinear(min: Double, max: Double, v: Double): js.Any = js.native
  
  @JSImport("@popmotion/popcorn", "steps")
  @js.native
  def steps(steps: Double): js.Function1[/* progress */ Double, _] = js.native
  @JSImport("@popmotion/popcorn", "steps")
  @js.native
  def steps(steps: Double, direction: Direction): js.Function1[/* progress */ Double, _] = js.native
  
  @JSImport("@popmotion/popcorn", "toDecimal")
  @js.native
  def toDecimal(num: Double): Double = js.native
  @JSImport("@popmotion/popcorn", "toDecimal")
  @js.native
  def toDecimal(num: Double, precision: Double): Double = js.native
  
  @JSImport("@popmotion/popcorn", "velocityPerFrame")
  @js.native
  def velocityPerFrame(xps: Double, frameDuration: Double): Double = js.native
  
  @JSImport("@popmotion/popcorn", "velocityPerSecond")
  @js.native
  def velocityPerSecond(velocity: Double, frameDuration: Double): Double = js.native
  
  @JSImport("@popmotion/popcorn", "wrap")
  @js.native
  def wrap(min: Double, max: Double): js.Any = js.native
  @JSImport("@popmotion/popcorn", "wrap")
  @js.native
  def wrap(min: Double, max: Double, v: Double): js.Any = js.native
}
