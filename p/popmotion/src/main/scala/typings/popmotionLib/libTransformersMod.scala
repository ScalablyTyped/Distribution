package typings
package popmotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/transformers", JSImport.Namespace)
@js.native
object libTransformersMod extends js.Object {
  def appendUnit(unit: java.lang.String): js.Function1[/* v */ scala.Double, java.lang.String] = js.native
  def applyOffset(from: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def applyOffset(from: scala.Double, to: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def blendArray(
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
  def blendColor(from: java.lang.String, to: java.lang.String): js.Function1[/* v */ scala.Double, _] = js.native
  def blendColor(from: java.lang.String, to: styleDashValueDashTypesLib.libTypesMod.HSLA): js.Function1[/* v */ scala.Double, _] = js.native
  def blendColor(from: java.lang.String, to: styleDashValueDashTypesLib.libTypesMod.RGBA): js.Function1[/* v */ scala.Double, _] = js.native
  def blendColor(from: styleDashValueDashTypesLib.libTypesMod.HSLA, to: java.lang.String): js.Function1[/* v */ scala.Double, _] = js.native
  def blendColor(from: styleDashValueDashTypesLib.libTypesMod.HSLA, to: styleDashValueDashTypesLib.libTypesMod.HSLA): js.Function1[/* v */ scala.Double, _] = js.native
  def blendColor(from: styleDashValueDashTypesLib.libTypesMod.HSLA, to: styleDashValueDashTypesLib.libTypesMod.RGBA): js.Function1[/* v */ scala.Double, _] = js.native
  def blendColor(from: styleDashValueDashTypesLib.libTypesMod.RGBA, to: java.lang.String): js.Function1[/* v */ scala.Double, _] = js.native
  def blendColor(from: styleDashValueDashTypesLib.libTypesMod.RGBA, to: styleDashValueDashTypesLib.libTypesMod.HSLA): js.Function1[/* v */ scala.Double, _] = js.native
  def blendColor(from: styleDashValueDashTypesLib.libTypesMod.RGBA, to: styleDashValueDashTypesLib.libTypesMod.RGBA): js.Function1[/* v */ scala.Double, _] = js.native
  def clamp(min: scala.Double, max: scala.Double): js.Any = js.native
  def clamp(min: scala.Double, max: scala.Double, v: scala.Double): js.Any = js.native
  def conditional(
    check: atPopmotionPopcornLib.libUtilsConditionalMod.Check,
    apply: atPopmotionPopcornLib.libUtilsConditionalMod.Apply
  ): js.Function1[/* v */ js.Any, _] = js.native
  def generateStaticSpring(): js.Function3[/* min */ scala.Double, /* max */ scala.Double, /* v */ js.UndefOr[scala.Double], _] = js.native
  def generateStaticSpring(alterDisplacement: js.Function): js.Function3[/* min */ scala.Double, /* max */ scala.Double, /* v */ js.UndefOr[scala.Double], _] = js.native
  def interpolate[T](input: js.Array[scala.Double], output: js.Array[T]): atPopmotionPopcornLib.libUtilsInterpolateMod.Mix[T | java.lang.String | scala.Double] = js.native
  def interpolate[T](
    input: js.Array[scala.Double],
    output: js.Array[T],
    hasClampEaseMixer: atPopmotionPopcornLib.libUtilsInterpolateMod.InterpolateOptions[T]
  ): atPopmotionPopcornLib.libUtilsInterpolateMod.Mix[T | java.lang.String | scala.Double] = js.native
  def linearSpring(min: scala.Double, max: scala.Double): js.Any = js.native
  def linearSpring(min: scala.Double, max: scala.Double, v: scala.Double): js.Any = js.native
  def nonlinearSpring(min: scala.Double, max: scala.Double): js.Any = js.native
  def nonlinearSpring(min: scala.Double, max: scala.Double, v: scala.Double): js.Any = js.native
  def pipe(transformers: js.Function*): js.Function = js.native
  def smooth(): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def smooth(strength: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def snap(points: js.Array[scala.Double]): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def snap(points: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def steps(st: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def steps(st: scala.Double, min: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def steps(st: scala.Double, min: scala.Double, max: scala.Double): js.Function1[/* v */ scala.Double, scala.Double] = js.native
  def transformMap(childTransformers: org.scalablytyped.runtime.StringDictionary[js.Function]): js.Function1[/* v */ js.Any, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def wrap(min: scala.Double, max: scala.Double): js.Any = js.native
  def wrap(min: scala.Double, max: scala.Double, v: scala.Double): js.Any = js.native
}

