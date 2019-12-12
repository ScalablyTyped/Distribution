package typings.monacoDashEditor.monacoDashEditorMod.languages

import org.scalablytyped.runtime.TopLevel
import typings.monacoDashEditor.monacoDashEditorMod.languages.CompletionItemTag.Deprecated
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemTag with Double] = js.native
  /* 1 */ @js.native
  object Deprecated extends TopLevel[Deprecated with Double]
  
}

