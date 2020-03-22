package typings.minappEnv.ICloud

import typings.minappEnv.AnyObject
import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallFunctionResult extends IAPISuccessParam {
  var result: js.UndefOr[AnyObject | String] = js.undefined
}

object CallFunctionResult {
  @scala.inline
  def apply(errMsg: String, result: AnyObject | String = null): CallFunctionResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionResult]
  }
}

