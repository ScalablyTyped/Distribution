package typings.minappEnv.DB

import typings.minappEnv.AnonRemoved
import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRemoveResult extends IAPISuccessParam {
  var stats: AnonRemoved
}

object IRemoveResult {
  @scala.inline
  def apply(errMsg: String, stats: AnonRemoved): IRemoveResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRemoveResult]
  }
}

