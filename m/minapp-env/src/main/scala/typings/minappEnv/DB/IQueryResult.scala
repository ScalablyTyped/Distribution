package typings.minappEnv.DB

import typings.minappEnv.Array
import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryResult extends IAPISuccessParam {
  var data: Array[IDocumentData]
}

object IQueryResult {
  @scala.inline
  def apply(data: Array[IDocumentData], errMsg: String): IQueryResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryResult]
  }
}

