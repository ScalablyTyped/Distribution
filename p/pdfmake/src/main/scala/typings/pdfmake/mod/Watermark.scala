package typings.pdfmake.mod

import typings.pdfmake.pdfmakeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watermark extends js.Object {
  /** angle of text rotation (minimal version: 0.1.60) */
  var angle: js.UndefOr[Double] = js.undefined
  /** bold style of text */
  var bold: js.UndefOr[Boolean] = js.undefined
  /** color of text */
  var color: js.UndefOr[String] = js.undefined
  /** own font size of text (ideal size is calculated automatically) (minimal version: 0.1.60) */
  var fontSize: js.UndefOr[Double] = js.undefined
  /** italics style of text */
  var italics: js.UndefOr[`true`] = js.undefined
  /** opacity of text */
  var opacity: js.UndefOr[Double] = js.undefined
  /** watermark text */
  var text: js.UndefOr[String] = js.undefined
}

object Watermark {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    fontSize: Int | Double = null,
    italics: `true` = null,
    opacity: Int | Double = null,
    text: String = null
  ): Watermark = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (italics != null) __obj.updateDynamic("italics")(italics.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Watermark]
  }
}

