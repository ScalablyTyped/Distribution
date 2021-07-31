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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@popmotion/popcorn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def angle(a: Point): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def angle(a: Point, b: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@popmotion/popcorn", "anticipate")
  @js.native
  val anticipate: Easing = js.native
  
  @scala.inline
  def applyOffset(from: Double): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyOffset")(from.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
  @scala.inline
  def applyOffset(from: Double, to: Double): js.Function1[/* v */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOffset")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, Double]]
  
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
  
  @scala.inline
  def clamp(min: Double, max: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def clamp(min: Double, max: Double, v: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def conditional(check: Check, apply: Apply): js.Function1[/* v */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("conditional")(check.asInstanceOf[js.Any], apply.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ js.Any, js.Any]]
  
  @scala.inline
  def createAnticipateEasing(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnticipateEasing")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  @scala.inline
  def createBackIn(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createBackIn")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  @scala.inline
  def createExpoIn(power: Double): Easing = ^.asInstanceOf[js.Dynamic].applyDynamic("createExpoIn")(power.asInstanceOf[js.Any]).asInstanceOf[Easing]
  
  @scala.inline
  def cubicBezier(mX1: Double, mY1: Double, mX2: Double, mY2: Double): js.Function1[/* aX */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicBezier")(mX1.asInstanceOf[js.Any], mY1.asInstanceOf[js.Any], mX2.asInstanceOf[js.Any], mY2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* aX */ Double, Double]]
  
  @scala.inline
  def degreesToRadians(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("degreesToRadians")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def distance(a: typings.popmotionPopcorn.distanceMod.Point): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def distance(a: typings.popmotionPopcorn.distanceMod.Point, b: typings.popmotionPopcorn.distanceMod.Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@popmotion/popcorn", "easeIn")
  @js.native
  val easeIn: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "easeInOut")
  @js.native
  val easeInOut: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "easeOut")
  @js.native
  val easeOut: Easing = js.native
  
  @scala.inline
  def interpolate[T](input: js.Array[Double], output: js.Array[T]): Mix[T | String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Mix[T | String | Double]]
  @scala.inline
  def interpolate[T](input: js.Array[Double], output: js.Array[T], hasClampEaseMixer: InterpolateOptions[T]): Mix[T | String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(input.asInstanceOf[js.Any], output.asInstanceOf[js.Any], hasClampEaseMixer.asInstanceOf[js.Any])).asInstanceOf[Mix[T | String | Double]]
  
  @scala.inline
  def isPoint(point: js.Object): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint")(point.asInstanceOf[js.Any]).asInstanceOf[/* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point */ Boolean]
  
  @scala.inline
  def isPoint3D(point: Point): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point3D */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPoint3D")(point.asInstanceOf[js.Any]).asInstanceOf[/* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point3D */ Boolean]
  
  @JSImport("@popmotion/popcorn", "linear")
  @js.native
  val linear: Easing = js.native
  
  @JSImport("@popmotion/popcorn", "mirrored")
  @js.native
  val mirrored: EasingModifier = js.native
  
  @scala.inline
  def mix(from: Double, to: Double, progress: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mix")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], progress.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def mixArray(from: js.Array[String | Double | RGBA | HSLA], to: js.Array[String | Double | RGBA | HSLA]): js.Function1[/* v */ Double, js.Array[String | Double | RGBA | HSLA]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixArray")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Array[String | Double | RGBA | HSLA]]]
  
  @scala.inline
  def mixColor(from: String, to: String): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: String, to: HSLA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: String, to: RGBA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: HSLA, to: String): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: HSLA, to: HSLA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: HSLA, to: RGBA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: RGBA, to: String): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: RGBA, to: HSLA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: RGBA, to: RGBA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  
  @scala.inline
  def mixComplex(origin: String, target: String): MixComplex_ = (^.asInstanceOf[js.Dynamic].applyDynamic("mixComplex")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[MixComplex_]
  
  @scala.inline
  def mixObject(origin: BlendableObject, target: BlendableObject): js.Function1[/* v */ Double, StringDictionary[String | Double | RGBA | HSLA]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixObject")(origin.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, StringDictionary[String | Double | RGBA | HSLA]]]
  
  @scala.inline
  def pipe(transformers: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(transformers.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def pointFromVector(origin: Point2D, angle: Double, distance: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("pointFromVector")(origin.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[X]
  
  @scala.inline
  def progress(from: Double, to: Double, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("progress")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def radiansToDegrees(radians: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("radiansToDegrees")(radians.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("@popmotion/popcorn", "reversed")
  @js.native
  val reversed: EasingModifier = js.native
  
  @scala.inline
  def smooth(): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("smooth")().asInstanceOf[js.Function1[/* v */ Double, Double]]
  @scala.inline
  def smooth(strength: Double): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("smooth")(strength.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
  
  @scala.inline
  def smoothFrame(prevValue: Double, nextValue: Double, duration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothFrame")(prevValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def smoothFrame(prevValue: Double, nextValue: Double, duration: Double, smoothing: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smoothFrame")(prevValue.asInstanceOf[js.Any], nextValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], smoothing.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def snap(points: js.Array[Double]): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("snap")(points.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
  @scala.inline
  def snap(points: Double): js.Function1[/* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("snap")(points.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Double, Double]]
  
  @scala.inline
  def springForce(): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("springForce")().asInstanceOf[js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], js.Any]]
  @scala.inline
  def springForce(alterDisplacement: js.Function): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("springForce")(alterDisplacement.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], js.Any]]
  
  @scala.inline
  def springForceExpo(min: Double, max: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("springForceExpo")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def springForceExpo(min: Double, max: Double, v: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("springForceExpo")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def springForceLinear(min: Double, max: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("springForceLinear")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def springForceLinear(min: Double, max: Double, v: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("springForceLinear")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def steps(steps: Double): js.Function1[/* progress */ Double, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("steps")(steps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* progress */ Double, js.Any]]
  @scala.inline
  def steps(steps: Double, direction: Direction): js.Function1[/* progress */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("steps")(steps.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* progress */ Double, js.Any]]
  
  @scala.inline
  def toDecimal(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def toDecimal(num: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDecimal")(num.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def velocityPerFrame(xps: Double, frameDuration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("velocityPerFrame")(xps.asInstanceOf[js.Any], frameDuration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def velocityPerSecond(velocity: Double, frameDuration: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("velocityPerSecond")(velocity.asInstanceOf[js.Any], frameDuration.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def wrap(min: Double, max: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def wrap(min: Double, max: Double, v: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
