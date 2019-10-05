package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompletionItemInsertTextRule extends js.Object

@JSImport("monaco-editor", "languages.CompletionItemInsertTextRule")
@js.native
object CompletionItemInsertTextRule extends js.Object {
  /**
    * `insertText` is a snippet.
    */
  @js.native
  sealed trait InsertAsSnippet extends CompletionItemInsertTextRule
  
  /**
    * Adjust whitespace/indentation of multiline insert texts to
    * match the current line indentation.
    */
  @js.native
  sealed trait KeepWhitespace extends CompletionItemInsertTextRule
  
  /* 4 */ val InsertAsSnippet: typings.monacoDashEditor.monacoDashEditorMod.languages.CompletionItemInsertTextRule.InsertAsSnippet with Double = js.native
  /* 1 */ val KeepWhitespace: typings.monacoDashEditor.monacoDashEditorMod.languages.CompletionItemInsertTextRule.KeepWhitespace with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemInsertTextRule with Double] = js.native
}

