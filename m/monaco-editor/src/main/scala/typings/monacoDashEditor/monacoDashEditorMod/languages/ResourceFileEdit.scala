package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.Anon_IgnoreIfExists
import typings.monacoDashEditor.monacoDashEditorMod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceFileEdit extends js.Object {
  var newUri: Uri
  var oldUri: Uri
  var options: Anon_IgnoreIfExists
}

object ResourceFileEdit {
  @scala.inline
  def apply(newUri: Uri, oldUri: Uri, options: Anon_IgnoreIfExists): ResourceFileEdit = {
    val __obj = js.Dynamic.literal(newUri = newUri, oldUri = oldUri, options = options)
  
    __obj.asInstanceOf[ResourceFileEdit]
  }
}

