package typings.atNivoWaffle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoWaffleMod {
  import typings.atNivoCore.atNivoCoreMod.ColorProps
  import typings.atNivoCore.atNivoCoreMod.MotionProps
  import typings.atNivoCore.atNivoCoreMod.SvgDefsAndFill
  import typings.atNivoWaffle.Anon_BorderColor
  import typings.atNivoWaffle.Anon_Color
  import typings.atNivoWaffle.Anon_PixelRatio
  import typings.std.Partial

  type ValueFormatter = js.Function1[/* value */ Double, String | Double]
  type WaffleCanvasProps = WaffleBaseProps with WaffleCommonProps with Partial[Anon_PixelRatio]
  type WaffleCommonProps = ColorProps[WaffleDatum] with Partial[Anon_BorderColor]
  type WaffleHtmlProps = WaffleBaseProps with WaffleCommonProps with MotionProps
  type WaffleSvgProps = WaffleBaseProps with WaffleCommonProps with MotionProps with SvgDefsAndFill[WaffleDatum]
  type WaffleTooltipData = WaffleDatum with Anon_Color
}
