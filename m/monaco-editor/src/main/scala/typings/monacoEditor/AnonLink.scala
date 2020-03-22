package typings.monacoEditor

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLink extends js.Object {
  var link: Uri
  var value: String
}

object AnonLink {
  @scala.inline
  def apply(link: Uri, value: String): AnonLink = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLink]
  }
}

