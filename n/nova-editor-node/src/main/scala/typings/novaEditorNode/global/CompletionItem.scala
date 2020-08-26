package typings.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/completion-item/
@JSGlobal("CompletionItem")
@js.native
class CompletionItem protected ()
  extends typings.novaEditorNode.CompletionItem {
  def this(label: String, kind: typings.novaEditorNode.CompletionItemKind) = this()
}

