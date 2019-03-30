package typings
package atNivoWaffleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoWaffleMod {
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
  type WaffleCanvasProps = WaffleBaseProps with WaffleCommonProps with stdLib.Partial[atNivoWaffleLib.Anon_PixelRatio]
  type WaffleCommonProps = atNivoCoreLib.atNivoCoreMod.ColorProps[WaffleDatum] with stdLib.Partial[atNivoWaffleLib.Anon_BorderColor]
  type WaffleHtmlProps = WaffleBaseProps with WaffleCommonProps with atNivoCoreLib.atNivoCoreMod.MotionProps
  type WaffleSvgProps = WaffleBaseProps with WaffleCommonProps with atNivoCoreLib.atNivoCoreMod.MotionProps with atNivoCoreLib.atNivoCoreMod.SvgDefsAndFill[WaffleDatum]
  type WaffleTooltipData = WaffleDatum with atNivoWaffleLib.Anon_Color
}
