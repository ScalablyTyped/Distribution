package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monaco-editor", "languages.SelectedSuggestionInfo")
@js.native
open class SelectedSuggestionInfo protected () extends StObject {
  def this(range: IRange, text: String, completionKind: CompletionItemKind, isSnippetText: Boolean) = this()
  
  val completionKind: CompletionItemKind = js.native
  
  def equals(other: SelectedSuggestionInfo): Boolean = js.native
  
  val isSnippetText: Boolean = js.native
  
  val range: IRange = js.native
  
  val text: String = js.native
}
