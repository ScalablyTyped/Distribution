package typings.mongodb.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteConcernError extends js.Object {
  //Write concern error code.
  var code: scala.Double
  //Write concern error message.
  var errmsg: String
}

object WriteConcernError {
  @scala.inline
  def apply(code: scala.Double, errmsg: String): WriteConcernError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WriteConcernError]
  }
}

