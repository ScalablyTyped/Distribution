package typings
package atPopmotionPopcornLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@popmotion/popcorn", JSImport.Namespace)
@js.native
object atPopmotionPopcornMod extends js.Object {
  val anticipate: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val backIn: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val backInOut: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val backOut: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val circIn: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val circInOut: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val circOut: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val easeIn: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val easeInOut: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val easeOut: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val linear: atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  val mirrored: atPopmotionEasingLib.atPopmotionEasingMod.EasingModifier = js.native
  val reversed: atPopmotionEasingLib.atPopmotionEasingMod.EasingModifier = js.native
  def angle(a: atPopmotionPopcornLib.libTypesMod.Point): scala.Double = js.native
  def angle(a: atPopmotionPopcornLib.libTypesMod.Point, b: atPopmotionPopcornLib.libTypesMod.Point): scala.Double = js.native
  def applyOffset(from: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def applyOffset(from: scala.Double, to: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def clamp(min: scala.Double, max: scala.Double): js.Any = js.native
  def clamp(min: scala.Double, max: scala.Double, v: scala.Double): js.Any = js.native
  def conditional(
    check: atPopmotionPopcornLib.libUtilsConditionalMod.Check,
    apply: atPopmotionPopcornLib.libUtilsConditionalMod.Apply
  ): js.Function1[/* v */ js.Any, _] = js.native
  def createAnticipateEasing(power: scala.Double): atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  def createBackIn(power: scala.Double): atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  def createExpoIn(power: scala.Double): atPopmotionEasingLib.atPopmotionEasingMod.Easing = js.native
  def cubicBezier(mX1: scala.Double, mY1: scala.Double, mX2: scala.Double, mY2: scala.Double): js.Function1[/* aX */ scala.Double, scala.Double] = js.native
  def degreesToRadians(degrees: scala.Double): scala.Double = js.native
  def distance(a: atPopmotionPopcornLib.libUtilsDistanceMod._Point): scala.Double = js.native
  def distance(
    a: atPopmotionPopcornLib.libUtilsDistanceMod._Point,
    b: atPopmotionPopcornLib.libUtilsDistanceMod._Point
  ): scala.Double = js.native
  def interpolate[T](input: js.Array[scala.Double], output: js.Array[T]): atPopmotionPopcornLib.libUtilsInterpolateMod.Mix[T | java.lang.String | scala.Double] = js.native
  def interpolate[T](
    input: js.Array[scala.Double],
    output: js.Array[T],
    hasClampEaseMixer: atPopmotionPopcornLib.libUtilsInterpolateMod.InterpolateOptions[T]
  ): atPopmotionPopcornLib.libUtilsInterpolateMod.Mix[T | java.lang.String | scala.Double] = js.native
  def isPoint(point: js.Object): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point */ scala.Boolean = js.native
  def isPoint3D(point: atPopmotionPopcornLib.libTypesMod.Point): /* is @popmotion/popcorn.@popmotion/popcorn/lib/types.Point3D */ scala.Boolean = js.native
  def mix(from: scala.Double, to: scala.Double, progress: scala.Double): scala.Double = js.native
  def mixArray(
    from: js.Array[
      java.lang.String | scala.Double | styleDashValueDashTypesLib.libTypesMod.RGBA | styleDashValueDashTypesLib.libTypesMod.HSLA
    ],
    to: js.Array[
      java.lang.String | scala.Double | styleDashValueDashTypesLib.libTypesMod.RGBA | styleDashValueDashTypesLib.libTypesMod.HSLA
    ]
  ): js.Function1[
    /* v */ scala.Double, 
    js.Array[
      java.lang.String | scala.Double | styleDashValueDashTypesLib.libTypesMod.RGBA | styleDashValueDashTypesLib.libTypesMod.HSLA
    ]
  ] = js.native
  def mixColor(from: java.lang.String, to: java.lang.String): js.Function1[/* v */ scala.Double, _] = js.native
  def mixColor(from: java.lang.String, to: styleDashValueDashTypesLib.libTypesMod.HSLA): js.Function1[/* v */ scala.Double, _] = js.native
  def mixColor(from: java.lang.String, to: styleDashValueDashTypesLib.libTypesMod.RGBA): js.Function1[/* v */ scala.Double, _] = js.native
  def mixColor(from: styleDashValueDashTypesLib.libTypesMod.HSLA, to: java.lang.String): js.Function1[/* v */ scala.Double, _] = js.native
  def mixColor(from: styleDashValueDashTypesLib.libTypesMod.HSLA, to: styleDashValueDashTypesLib.libTypesMod.HSLA): js.Function1[/* v */ scala.Double, _] = js.native
  def mixColor(from: styleDashValueDashTypesLib.libTypesMod.HSLA, to: styleDashValueDashTypesLib.libTypesMod.RGBA): js.Function1[/* v */ scala.Double, _] = js.native
  def mixColor(from: styleDashValueDashTypesLib.libTypesMod.RGBA, to: java.lang.String): js.Function1[/* v */ scala.Double, _] = js.native
  def mixColor(from: styleDashValueDashTypesLib.libTypesMod.RGBA, to: styleDashValueDashTypesLib.libTypesMod.HSLA): js.Function1[/* v */ scala.Double, _] = js.native
  def mixColor(from: styleDashValueDashTypesLib.libTypesMod.RGBA, to: styleDashValueDashTypesLib.libTypesMod.RGBA): js.Function1[/* v */ scala.Double, _] = js.native
  def mixComplex(origin: java.lang.String, target: java.lang.String): atPopmotionPopcornLib.libUtilsMixDashComplexMod.MixComplex = js.native
  def mixObject(
    origin: atPopmotionPopcornLib.libUtilsMixDashComplexMod.BlendableObject,
    target: atPopmotionPopcornLib.libUtilsMixDashComplexMod.BlendableObject
  ): js.Function1[
    /* v */ scala.Double, 
    org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Double | styleDashValueDashTypesLib.libTypesMod.RGBA | styleDashValueDashTypesLib.libTypesMod.HSLA
    ]
  ] = js.native
  def pipe(transformers: js.Function*): js.Function = js.native
  def pointFromVector(origin: atPopmotionPopcornLib.libTypesMod.Point2D, angle: scala.Double, distance: scala.Double): atPopmotionPopcornLib.Anon_X = js.native
  def progress(from: scala.Double, to: scala.Double, value: scala.Double): scala.Double = js.native
  def radiansToDegrees(radians: scala.Double): scala.Double = js.native
  def smooth(): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def smooth(strength: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def smoothFrame(prevValue: scala.Double, nextValue: scala.Double, duration: scala.Double): scala.Double = js.native
  def smoothFrame(prevValue: scala.Double, nextValue: scala.Double, duration: scala.Double, smoothing: scala.Double): scala.Double = js.native
  def snap(points: js.Array[scala.Double]): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def snap(points: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def springForce(): js.Function3[/* min */ scala.Double, /* max */ scala.Double, /* v */ js.UndefOr[scala.Double], _] = js.native
  def springForce(alterDisplacement: js.Function): js.Function3[/* min */ scala.Double, /* max */ scala.Double, /* v */ js.UndefOr[scala.Double], _] = js.native
  def springForceExpo(min: scala.Double, max: scala.Double): js.Any = js.native
  def springForceExpo(min: scala.Double, max: scala.Double, v: scala.Double): js.Any = js.native
  def springForceLinear(min: scala.Double, max: scala.Double): js.Any = js.native
  def springForceLinear(min: scala.Double, max: scala.Double, v: scala.Double): js.Any = js.native
  def steps(steps: scala.Double): js.Function1[/* progress */ scala.Double, _] = js.native
  def steps(steps: scala.Double, direction: atPopmotionPopcornLib.libEasingStepsMod.Direction): js.Function1[/* progress */ scala.Double, _] = js.native
  def toDecimal(num: scala.Double): scala.Double = js.native
  def toDecimal(num: scala.Double, precision: scala.Double): scala.Double = js.native
  def velocityPerFrame(xps: scala.Double, frameDuration: scala.Double): scala.Double = js.native
  def velocityPerSecond(velocity: scala.Double, frameDuration: scala.Double): scala.Double = js.native
  def wrap(min: scala.Double, max: scala.Double): js.Any = js.native
  def wrap(min: scala.Double, max: scala.Double, v: scala.Double): js.Any = js.native
}

