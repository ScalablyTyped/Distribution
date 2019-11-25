package typings.next.distClientLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatResult extends js.Object {
  var as: js.UndefOr[String] = js.undefined
  var href: String
}

object FormatResult {
  @scala.inline
  def apply(href: String, as: String = null): FormatResult = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatResult]
  }
}

