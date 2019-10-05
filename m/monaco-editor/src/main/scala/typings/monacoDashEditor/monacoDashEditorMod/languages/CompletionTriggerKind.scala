package typings.monacoDashEditor.monacoDashEditorMod.languages

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
  
  /* 0 */ val Invoke: typings.monacoDashEditor.monacoDashEditorMod.languages.CompletionTriggerKind.Invoke with Double = js.native
  /* 1 */ val TriggerCharacter: typings.monacoDashEditor.monacoDashEditorMod.languages.CompletionTriggerKind.TriggerCharacter with Double = js.native
  /* 2 */ val TriggerForIncompleteCompletions: typings.monacoDashEditor.monacoDashEditorMod.languages.CompletionTriggerKind.TriggerForIncompleteCompletions with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionTriggerKind with Double] = js.native
}

