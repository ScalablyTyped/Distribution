package typings.phantom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCodeErrorString extends js.Object {
  var errorCode: Double
  var errorString: String
}

object Anon_ErrorCodeErrorString {
  @scala.inline
  def apply(errorCode: Double, errorString: String): Anon_ErrorCodeErrorString = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ErrorCodeErrorString]
  }
}

