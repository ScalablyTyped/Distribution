package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteConcernError extends js.Object {
  //Write concern error code.
  var code: scala.Double
  //Write concern error message.
  var errmsg: java.lang.String
}

object WriteConcernError {
  @scala.inline
  def apply(code: scala.Double, errmsg: java.lang.String): WriteConcernError = {
    val __obj = js.Dynamic.literal(code = code, errmsg = errmsg)
  
    __obj.asInstanceOf[WriteConcernError]
  }
}

