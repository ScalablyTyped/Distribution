package typings.atOctokitRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Redirect extends js.Object {
  var redirect: js.UndefOr[String] = js.undefined
}

object Anon_Redirect {
  @scala.inline
  def apply(redirect: String = null): Anon_Redirect = {
    val __obj = js.Dynamic.literal()
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Redirect]
  }
}

