package typings.octokitRequest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redirect extends js.Object {
  var redirect: js.UndefOr[String] = js.undefined
}

object Redirect {
  @scala.inline
  def apply(redirect: String = null): Redirect = {
    val __obj = js.Dynamic.literal()
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirect]
  }
}

