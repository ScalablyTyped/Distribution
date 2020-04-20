package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICountResult extends IAPISuccessParam {
  var total: Double
}

object ICountResult {
  @scala.inline
  def apply(errMsg: String, total: Double): ICountResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICountResult]
  }
}

