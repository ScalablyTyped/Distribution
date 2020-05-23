package typings.pinoHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAttributeKeys extends js.Object {
  var err: js.UndefOr[String] = js.undefined
  var req: js.UndefOr[String] = js.undefined
  var res: js.UndefOr[String] = js.undefined
  var responseTime: js.UndefOr[String] = js.undefined
}

object CustomAttributeKeys {
  @scala.inline
  def apply(err: String = null, req: String = null, res: String = null, responseTime: String = null): CustomAttributeKeys = {
    val __obj = js.Dynamic.literal()
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    if (responseTime != null) __obj.updateDynamic("responseTime")(responseTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAttributeKeys]
  }
}

