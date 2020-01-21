package typings.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteFileResult extends js.Object {
  var content: js.Any
  var file: String
}

object WriteFileResult {
  @scala.inline
  def apply(content: js.Any, file: String): WriteFileResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WriteFileResult]
  }
}

