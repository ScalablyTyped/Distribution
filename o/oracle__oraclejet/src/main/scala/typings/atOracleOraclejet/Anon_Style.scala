package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Style extends js.Object {
  var style: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Anon_Style {
  @scala.inline
  def apply(style: js.Object = null, text: String = null): Anon_Style = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Style]
  }
}

