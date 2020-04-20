package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAddResult extends IAPISuccessParam {
  var _id: DocumentId
}

object IAddResult {
  @scala.inline
  def apply(_id: DocumentId, errMsg: String): IAddResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddResult]
  }
}

