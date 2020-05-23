package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import typings.minappEnv.anon.Removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRemoveResult extends IAPISuccessParam {
  var stats: Removed
}

object IRemoveResult {
  @scala.inline
  def apply(errMsg: String, stats: Removed): IRemoveResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRemoveResult]
  }
}

