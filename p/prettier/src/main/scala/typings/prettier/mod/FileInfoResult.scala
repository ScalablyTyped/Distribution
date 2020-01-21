package typings.prettier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfoResult extends js.Object {
  var ignored: Boolean
  var inferredParser: String | Null
}

object FileInfoResult {
  @scala.inline
  def apply(ignored: Boolean, inferredParser: String = null): FileInfoResult = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any])
    if (inferredParser != null) __obj.updateDynamic("inferredParser")(inferredParser.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfoResult]
  }
}

