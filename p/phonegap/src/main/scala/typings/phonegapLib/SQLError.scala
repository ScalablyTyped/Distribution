package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQLError extends js.Object {
  var code: scala.Double
  var message: java.lang.String
}

object SQLError {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String): SQLError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[SQLError]
  }
}

