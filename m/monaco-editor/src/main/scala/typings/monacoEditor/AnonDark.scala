package typings.monacoEditor

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDark extends js.Object {
  var dark: Uri
  var light: Uri
}

object AnonDark {
  @scala.inline
  def apply(dark: Uri, light: Uri): AnonDark = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDark]
  }
}

