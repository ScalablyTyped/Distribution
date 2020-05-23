package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileError extends js.Object {
  var code: Double
}

object FileError {
  @scala.inline
  def apply(code: Double): FileError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileError]
  }
}

