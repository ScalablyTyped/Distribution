package typings
package openidLib.openidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenIdError extends js.Object {
  var message: java.lang.String
}

object OpenIdError {
  @scala.inline
  def apply(message: java.lang.String): OpenIdError = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[OpenIdError]
  }
}

