package typings.minappEnv.DB

import typings.minappEnv.AnonUpdated
import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUpdateResult extends IAPISuccessParam {
  var stats: AnonUpdated
}

object IUpdateResult {
  @scala.inline
  def apply(errMsg: String, stats: AnonUpdated): IUpdateResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUpdateResult]
  }
}

