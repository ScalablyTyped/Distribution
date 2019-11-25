package typings.oauthDashShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.UndefOr[Anon_Accesstoken] = js.undefined
  var options: js.UndefOr[Anon_Key] = js.undefined
  var redirect: js.UndefOr[String] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: Anon_Accesstoken = null, options: Anon_Key = null, redirect: String = null): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

