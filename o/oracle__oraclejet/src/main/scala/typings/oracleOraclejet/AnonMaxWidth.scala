package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxWidth[K2, D2] extends js.Object {
  var label: js.UndefOr[Anon6[K2, D2]] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var rendered: js.UndefOr[on | off] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object AnonMaxWidth {
  @scala.inline
  def apply[K2, D2](
    label: Anon6[K2, D2] = null,
    maxWidth: String = null,
    rendered: on | off = null,
    width: String = null
  ): AnonMaxWidth[K2, D2] = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxWidth[K2, D2]]
  }
}

