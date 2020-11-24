package typings.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/text-edit/
@JSGlobal("TextEdit")
@js.native
class TextEdit protected ()
  extends typings.novaEditorNode.TextEdit {
  def this(range: typings.novaEditorNode.Range, newText: String) = this()
}
/* static members */
@JSGlobal("TextEdit")
@js.native
object TextEdit extends js.Object {
  
  def delete(range: typings.novaEditorNode.Range): typings.novaEditorNode.TextEdit = js.native
  
  def insert(position: Double, newText: String): typings.novaEditorNode.TextEdit = js.native
  
  def replace(range: typings.novaEditorNode.Range, newText: String): typings.novaEditorNode.TextEdit = js.native
}
