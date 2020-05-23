package typings.phantom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCode extends js.Object {
  var errorCode: Double
  var errorString: String
  var id: String
  var url: String
}

object ErrorCode {
  @scala.inline
  def apply(errorCode: Double, errorString: String, id: String, url: String): ErrorCode = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorString = errorString.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCode]
  }
}

