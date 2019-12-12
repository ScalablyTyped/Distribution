package typings.monacoDashEditor.monacoDashEditorMod.languages

import org.scalablytyped.runtime.TopLevel
import typings.monacoDashEditor.monacoDashEditorMod.languages.CompletionTriggerKind.Invoke
import typings.monacoDashEditor.monacoDashEditorMod.languages.CompletionTriggerKind.TriggerCharacter
import typings.monacoDashEditor.monacoDashEditorMod.languages.CompletionTriggerKind.TriggerForIncompleteCompletions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompletionTriggerKind extends js.Object

@JSImport("monaco-editor", "languages.CompletionTriggerKind")
@js.native
object CompletionTriggerKind extends js.Object {
  @js.native
  sealed trait Invoke extends CompletionTriggerKind
  
  @js.native
  sealed trait TriggerCharacter extends CompletionTriggerKind
  
  @js.native
  sealed trait TriggerForIncompleteCompletions extends CompletionTriggerKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionTriggerKind with Double] = js.native
  /* 0 */ @js.native
  object Invoke extends TopLevel[Invoke with Double]
  
  /* 1 */ @js.native
  object TriggerCharacter extends TopLevel[TriggerCharacter with Double]
  
  /* 2 */ @js.native
  object TriggerForIncompleteCompletions extends TopLevel[TriggerForIncompleteCompletions with Double]
  
}

