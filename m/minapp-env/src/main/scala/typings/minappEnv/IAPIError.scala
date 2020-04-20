package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////
///// WX Cloud Apis
/////////////////////
/**
  * Common interfaces and types
  */
trait IAPIError extends IAPICompleteParam {
  var errMsg: java.lang.String
}

object IAPIError {
  @scala.inline
  def apply(errMsg: java.lang.String): IAPIError = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAPIError]
  }
}

