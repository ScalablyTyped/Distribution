package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAPISuccessParam extends IAPICompleteParam {
  var errMsg: java.lang.String
}

object IAPISuccessParam {
  @scala.inline
  def apply(errMsg: java.lang.String): IAPISuccessParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAPISuccessParam]
  }
}

