package typings.oauthShim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.UndefOr[AnonAccesstoken] = js.undefined
  var options: js.UndefOr[AnonDictkey] = js.undefined
  var redirect: js.UndefOr[String] = js.undefined
}

object AnonData {
  @scala.inline
  def apply(data: AnonAccesstoken = null, options: AnonDictkey = null, redirect: String = null): AnonData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

