package typings.phantom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorCodeErrorString extends js.Object {
  var errorCode: Double
  var errorString: String
}

object AnonErrorCodeErrorString {
  @scala.inline
  def apply(errorCode: Double, errorString: String): AnonErrorCodeErrorString = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorCodeErrorString]
  }
}

