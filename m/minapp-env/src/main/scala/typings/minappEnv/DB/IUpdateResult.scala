package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import typings.minappEnv.anon.Updated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUpdateResult extends IAPISuccessParam {
  var stats: Updated
}

object IUpdateResult {
  @scala.inline
  def apply(errMsg: String, stats: Updated): IUpdateResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateResult]
  }
}

