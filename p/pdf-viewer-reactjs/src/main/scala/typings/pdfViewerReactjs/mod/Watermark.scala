package typings.pdfViewerReactjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watermark extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var diagonal: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Watermark {
  @scala.inline
  def apply(
    color: String = null,
    diagonal: js.UndefOr[Boolean] = js.undefined,
    opacity: String = null,
    size: String = null,
    text: String = null
  ): Watermark = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(diagonal)) __obj.updateDynamic("diagonal")(diagonal.get.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Watermark]
  }
}

