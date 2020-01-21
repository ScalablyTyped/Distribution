package typings.naverWhale.whale.proxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetails extends js.Object {
  /** Additional details about the error such as a JavaScript runtime error. */
  var details: String
  /** The error description. */
  var error: String
  /** If true, the error was fatal and the network transaction was aborted. Otherwise, a direct connection is used instead. */
  var fatal: Boolean
}

object ErrorDetails {
  @scala.inline
  def apply(details: String, error: String, fatal: Boolean): ErrorDetails = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorDetails]
  }
}

