package typings.popmotion.popmotionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPopmotionPopcorn.libUtilsConditionalMod.Apply
import typings.atPopmotionPopcorn.libUtilsConditionalMod.Check
import typings.atPopmotionPopcorn.libUtilsInterpolateMod.InterpolateOptions
import typings.atPopmotionPopcorn.libUtilsInterpolateMod.Mix
import typings.styleDashValueDashTypes.libTypesMod.HSLA
import typings.styleDashValueDashTypes.libTypesMod.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion", "transform")
@js.native
object transformNs extends js.Object {
  def appendUnit(unit: String): js.Function1[/* v */ Double, String] = js.native
  def applyOffset(from: Double): js.Function1[/* v */ Double, Double] = js.native
  def applyOffset(from: Double, to: Double): js.Function1[/* v */ Double, Double] = js.native
  def blendArray(from: js.Array[String | Double | RGBA | HSLA], to: js.Array[String | Double | RGBA | HSLA]): js.Function1[/* v */ Double, js.Array[String | Double | RGBA | HSLA]] = js.native
  def blendColor(from: String, to: String): js.Function1[/* v */ Double, _] = js.native
  def blendColor(from: String, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  def blendColor(from: String, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  def blendColor(from: HSLA, to: String): js.Function1[/* v */ Double, _] = js.native
  def blendColor(from: HSLA, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  def blendColor(from: HSLA, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  def blendColor(from: RGBA, to: String): js.Function1[/* v */ Double, _] = js.native
  def blendColor(from: RGBA, to: HSLA): js.Function1[/* v */ Double, _] = js.native
  def blendColor(from: RGBA, to: RGBA): js.Function1[/* v */ Double, _] = js.native
  def clamp(min: Double, max: Double): js.Any = js.native
  def clamp(min: Double, max: Double, v: Double): js.Any = js.native
  def conditional(check: Check, apply: Apply): js.Function1[/* v */ js.Any, _] = js.native
  def generateStaticSpring(): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
  def generateStaticSpring(alterDisplacement: js.Function): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
  def interpolate[T](input: js.Array[Double], output: js.Array[T]): Mix[T | String | Double] = js.native
  def interpolate[T](input: js.Array[Double], output: js.Array[T], hasClampEaseMixer: InterpolateOptions[T]): Mix[T | String | Double] = js.native
  def linearSpring(min: Double, max: Double): js.Any = js.native
  def linearSpring(min: Double, max: Double, v: Double): js.Any = js.native
  def nonlinearSpring(min: Double, max: Double): js.Any = js.native
  def nonlinearSpring(min: Double, max: Double, v: Double): js.Any = js.native
  def pipe(transformers: js.Function*): js.Function = js.native
  def smooth(): js.Function1[/* v */ Double, Double] = js.native
  def smooth(strength: Double): js.Function1[/* v */ Double, Double] = js.native
  def snap(points: js.Array[Double]): js.Function1[/* v */ Double, Double] = js.native
  def snap(points: Double): js.Function1[/* v */ Double, Double] = js.native
  def steps(st: Double): js.Function1[/* v */ Double, Double] = js.native
  def steps(st: Double, min: Double): js.Function1[/* v */ Double, Double] = js.native
  def steps(st: Double, min: Double, max: Double): js.Function1[/* v */ Double, Double] = js.native
  def transformMap(childTransformers: StringDictionary[js.Function]): js.Function1[/* v */ js.Any, StringDictionary[_]] = js.native
  def wrap(min: Double, max: Double): js.Any = js.native
  def wrap(min: Double, max: Double, v: Double): js.Any = js.native
}

