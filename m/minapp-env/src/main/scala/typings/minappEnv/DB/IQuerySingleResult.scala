package typings.minappEnv.DB

import typings.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuerySingleResult extends IAPISuccessParam {
  var data: IDocumentData
}

object IQuerySingleResult {
  @scala.inline
  def apply(data: IDocumentData, errMsg: String): IQuerySingleResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuerySingleResult]
  }
}

