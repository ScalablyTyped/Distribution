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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popmotion/popcorn", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def angle(a: Point): Double = js.native
  def angle(a: Point, b: Point): Double = js.native
  
  val anticipate: Easing = js.native
  
  def applyOffset(from: Double): js.Function1[/* v */ Double, Double] = js.native
  def applyOffset(from: Double, to: Double): js.Function1[/* v */ Double, Double] = js.native
  
  val backIn: Easing = js.native
  
  val backInOut: Easing = js.native
  
  val backOut: Easing = js.native
  
  val circIn: Easing = js.native
  
  val circInOut: Easing = js.native
  
  val circOut: Easing = js.native
  
  def clamp(min: Double, max: Double): js.Any = js.native
  def clamp(min: Double, max: Double, v: Double): js.Any = js.native
  
  def conditional(check: Check, apply: Apply): js.Function1[/* v */ js.Any, _] = js.native
  
  def createAnticipateEasing(power: Double): Easing = js.native
  
  def createBackIn(power: Double): Easing = js.native
  
  def createExpoIn(power: Double): Easing = js.native
  
  def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): js.Function1[/* aX */ Double, Double] = js.native
  
  def degreesToRadians(degrees: Double): Double = js.native
  
  def distance(a: typings.popmotionPopcorn.distanceMod.Point): Double = js.native
  def distance(a: typings.popmotionPopcorn.distanceMod.Point, b: typings.popmotionPopcorn.distanceMod.Point): Double = js.native
  
  val easeIn: Easing = js.native
  
  val easeInOut: Easing = js.native
  
  val easeOut: Easing = js.native
  
  def interpolate[T](input: js.Array[Double], output: js.Array[T]): Mix[T | String | Double] = js.native
  def interpolate[T](input: js.Array[Double], output: js.Array[T], hasClampEaseMixer: InterpolateOptions[T]): Mix[T | String | Double] = js.native
  
  def isPoint(point: js.Object): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point */ Boolean = js.native
  
  def isPoint3D(point: Point): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point3D */ Boolean = js.native
  
  val linear: Easing = js.native
  
  val mirrored: EasingModifier = js.native
  
  def mix(from: Double, to: Double, progress: Double): Double = js.native
  
  def mixArray(from: js.Array[String | Double | RGBA | HSLA], to: js.Array[String | Double | RGBA | HSLA]): js.Function1[/* v */ Double, js.Array[String | Double | RGBA | HSLA]] = js.native
  
  def mixColor(from: String, to: String): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: String, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: String, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: HSLA, to: String): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: HSLA, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: HSLA, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: RGBA, to: String): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: RGBA, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  def mixColor(from: RGBA, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  
  def mixComplex(origin: String, target: String): MixComplex_ = js.native
  
  def mixObject(origin: BlendableObject, target: BlendableObject): js.Function1[/* v */ Double, StringDictionary[String | Double | RGBA | HSLA]] = js.native
  
  def pipe(transformers: js.Function*): js.Function = js.native
  
  def pointFromVector(origin: Point2D, angle: Double, distance: Double): X = js.native
  
  def progress(from: Double, to: Double, value: Double): Double = js.native
  
  def radiansToDegrees(radians: Double): Double = js.native
  
  val reversed: EasingModifier = js.native
  
  def smooth(): js.Function1[/* v */ Double, Double] = js.native
  def smooth(strength: Double): js.Function1[/* v */ Double, Double] = js.native
  
  def smoothFrame(prevValue: Double, nextValue: Double, duration: Double): Double = js.native
  def smoothFrame(prevValue: Double, nextValue: Double, duration: Double, smoothing: Double): Double = js.native
  
  def snap(points: js.Array[Double]): js.Function1[/* v */ Double, Double] = js.native
  def snap(points: Double): js.Function1[/* v */ Double, Double] = js.native
  
  def springForce(): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
  def springForce(alterDisplacement: js.Function): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
  
  def springForceExpo(min: Double, max: Double): js.Any = js.native
  def springForceExpo(min: Double, max: Double, v: Double): js.Any = js.native
  
  def springForceLinear(min: Double, max: Double): js.Any = js.native
  def springForceLinear(min: Double, max: Double, v: Double): js.Any = js.native
  
  def steps(steps: Double): js.Function1[/* progress */ Double, _] = js.native
  def steps(steps: Double, direction: Direction): js.Function1[/* progress */ Double, _] = js.native
  
  def toDecimal(num: Double): Double = js.native
  def toDecimal(num: Double, precision: Double): Double = js.native
  
  def velocityPerFrame(xps: Double, frameDuration: Double): Double = js.native
  
  def velocityPerSecond(velocity: Double, frameDuration: Double): Double = js.native
  
  def wrap(min: Double, max: Double): js.Any = js.native
  def wrap(min: Double, max: Double, v: Double): js.Any = js.native
}
