package typings.naverDashWhale.whale.extension

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastError extends js.Object {
  /** Description of the error that has taken place. */
  var message: String
}

object LastError {
  @scala.inline
  def apply(message: String): LastError = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[LastError]
  }
}

@JSGlobal("chrome.extension.lastError")
@js.native
object lastError
  extends TopLevel[typings.chrome.chrome.extension.LastError]

