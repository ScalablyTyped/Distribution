package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionItemInsertTextRule extends js.Object
@JSImport("monaco-editor", "languages.CompletionItemInsertTextRule")
@js.native
object CompletionItemInsertTextRule extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemInsertTextRule with Double] = js.native
  
  /**
    * `insertText` is a snippet.
    */
  @js.native
  sealed trait InsertAsSnippet extends CompletionItemInsertTextRule
  /* 4 */ @js.native
  object InsertAsSnippet extends TopLevel[InsertAsSnippet with Double]
  
  /**
    * Adjust whitespace/indentation of multiline insert texts to
    * match the current line indentation.
    */
  @js.native
  sealed trait KeepWhitespace extends CompletionItemInsertTextRule
  /* 1 */ @js.native
  object KeepWhitespace extends TopLevel[KeepWhitespace with Double]
}
