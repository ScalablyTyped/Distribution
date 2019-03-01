package typings
package paypalDashRestDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancelurl extends js.Object {
  var cancel_url: js.UndefOr[java.lang.String] = js.undefined
  var return_url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Cancelurl {
  @scala.inline
  def apply(cancel_url: java.lang.String = null, return_url: java.lang.String = null): Anon_Cancelurl = {
    val __obj = js.Dynamic.literal()
    if (cancel_url != null) __obj.updateDynamic("cancel_url")(cancel_url)
    if (return_url != null) __obj.updateDynamic("return_url")(return_url)
    __obj.asInstanceOf[Anon_Cancelurl]
  }
}

