package typings.minappEnv.DB

import typings.minappEnv.AnonCreated
import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetResult extends IAPISuccessParam {
  var _id: DocumentId
  var stats: AnonCreated
}

object ISetResult {
  @scala.inline
  def apply(_id: DocumentId, errMsg: String, stats: AnonCreated): ISetResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISetResult]
  }
}

