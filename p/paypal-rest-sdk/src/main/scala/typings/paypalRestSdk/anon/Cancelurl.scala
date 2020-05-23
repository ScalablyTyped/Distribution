package typings.paypalRestSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelurl extends js.Object {
  var cancel_url: js.UndefOr[String] = js.undefined
  var return_url: js.UndefOr[String] = js.undefined
}

object Cancelurl {
  @scala.inline
  def apply(cancel_url: String = null, return_url: String = null): Cancelurl = {
    val __obj = js.Dynamic.literal()
    if (cancel_url != null) __obj.updateDynamic("cancel_url")(cancel_url.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelurl]
  }
}

