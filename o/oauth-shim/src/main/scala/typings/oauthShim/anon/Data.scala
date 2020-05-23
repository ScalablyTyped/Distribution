package typings.oauthShim.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.UndefOr[Accesstoken] = js.undefined
  var options: js.UndefOr[Dictkey] = js.undefined
  var redirect: js.UndefOr[String] = js.undefined
}

object Data {
  @scala.inline
  def apply(data: Accesstoken = null, options: Dictkey = null, redirect: String = null): Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

