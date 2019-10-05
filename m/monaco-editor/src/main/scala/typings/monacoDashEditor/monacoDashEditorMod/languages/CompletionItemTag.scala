package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompletionItemTag extends js.Object

@JSImport("monaco-editor", "languages.CompletionItemTag")
@js.native
object CompletionItemTag extends js.Object {
  @js.native
  sealed trait Deprecated extends CompletionItemTag
  
  /* 1 */ val Deprecated: typings.monacoDashEditor.monacoDashEditorMod.languages.CompletionItemTag.Deprecated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemTag with Double] = js.native
}

