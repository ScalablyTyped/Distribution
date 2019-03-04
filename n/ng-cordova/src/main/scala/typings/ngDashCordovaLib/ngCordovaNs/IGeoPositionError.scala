package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoPositionError extends js.Object {
  var code: scala.Double
  var message: java.lang.String
}

object IGeoPositionError {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String): IGeoPositionError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[IGeoPositionError]
  }
}

