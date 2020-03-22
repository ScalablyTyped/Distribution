package typings.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: String
  var filePath: js.UndefOr[String] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(content: String, filePath: String = null): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

