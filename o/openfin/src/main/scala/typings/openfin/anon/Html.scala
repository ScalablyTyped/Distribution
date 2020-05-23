package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Html extends js.Object {
  var html: js.UndefOr[String] = js.undefined
  var rtf: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Html {
  @scala.inline
  def apply(html: String = null, rtf: String = null, text: String = null): Html = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (rtf != null) __obj.updateDynamic("rtf")(rtf.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html]
  }
}

