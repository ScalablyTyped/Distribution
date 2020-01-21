package typings.nodeSass

import typings.nodeSass.mod._ImporterReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContents extends _ImporterReturnType {
  var contents: String
  var file: js.UndefOr[String] = js.undefined
}

object AnonContents {
  @scala.inline
  def apply(contents: String, file: String = null): AnonContents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContents]
  }
}

