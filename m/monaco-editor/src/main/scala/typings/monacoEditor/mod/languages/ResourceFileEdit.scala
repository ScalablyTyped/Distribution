package typings.monacoEditor.mod.languages

import typings.monacoEditor.AnonIgnoreIfExists
import typings.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceFileEdit extends js.Object {
  var newUri: Uri
  var oldUri: Uri
  var options: AnonIgnoreIfExists
}

object ResourceFileEdit {
  @scala.inline
  def apply(newUri: Uri, oldUri: Uri, options: AnonIgnoreIfExists): ResourceFileEdit = {
    val __obj = js.Dynamic.literal(newUri = newUri.asInstanceOf[js.Any], oldUri = oldUri.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceFileEdit]
  }
}

