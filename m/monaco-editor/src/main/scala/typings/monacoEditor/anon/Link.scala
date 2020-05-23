package typings.monacoEditor.anon

import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var link: Uri
  var value: String
}

object Link {
  @scala.inline
  def apply(link: Uri, value: String): Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

