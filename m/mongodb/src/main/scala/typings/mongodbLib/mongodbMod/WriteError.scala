package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteError extends js.Object {
  //Write concern error code.
  var code: scala.Double
  //Write concern error message.
  var errmsg: java.lang.String
  //Write concern error original bulk operation index.
  var index: scala.Double
}

object WriteError {
  @scala.inline
  def apply(code: scala.Double, errmsg: java.lang.String, index: scala.Double): WriteError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("errmsg")(errmsg)
    __obj.updateDynamic("index")(index)
    __obj.asInstanceOf[WriteError]
  }
}

