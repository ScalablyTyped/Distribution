package typings.pdfmake.interfacesMod

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
  var font: js.UndefOr[String] = js.undefined
  /** own font size of text (ideal size is calculated automatically) (minimal version: 0.1.60) */
  var fontSize: js.UndefOr[Double] = js.undefined
  /** italics style of text */
  var italics: js.UndefOr[Boolean] = js.undefined
  /** opacity of text */
  var opacity: js.UndefOr[Double] = js.undefined
  /** watermark text */
  var text: String
}

object Watermark {
  @scala.inline
  def apply(
    text: String,
    angle: Int | Double = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    font: String = null,
    fontSize: Int | Double = null,
    italics: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null
  ): Watermark = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(italics)) __obj.updateDynamic("italics")(italics.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Watermark]
  }
}

