package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationError extends js.Object {
  var code: scala.Double
  var message: java.lang.String
}

object GeolocationError {
  @scala.inline
  def apply(code: scala.Double, message: java.lang.String): GeolocationError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[GeolocationError]
  }
}

