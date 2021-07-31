package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionItemInsertTextRule extends StObject
@JSImport("monaco-editor", "languages.CompletionItemInsertTextRule")
@js.native
object CompletionItemInsertTextRule extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemInsertTextRule & Double] = js.native
  
  /**
    * `insertText` is a snippet.
    */
  @js.native
  sealed trait InsertAsSnippet
    extends StObject
       with CompletionItemInsertTextRule
  /* 4 */ val InsertAsSnippet: typings.monacoEditor.mod.languages.CompletionItemInsertTextRule.InsertAsSnippet & Double = js.native
  
  /**
    * Adjust whitespace/indentation of multiline insert texts to
    * match the current line indentation.
    */
  @js.native
  sealed trait KeepWhitespace
    extends StObject
       with CompletionItemInsertTextRule
  /* 1 */ val KeepWhitespace: typings.monacoEditor.mod.languages.CompletionItemInsertTextRule.KeepWhitespace & Double = js.native
}
