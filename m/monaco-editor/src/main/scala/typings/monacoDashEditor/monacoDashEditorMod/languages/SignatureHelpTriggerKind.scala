package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SignatureHelpTriggerKind extends js.Object

@JSImport("monaco-editor", "languages.SignatureHelpTriggerKind")
@js.native
object SignatureHelpTriggerKind extends js.Object {
  @js.native
  sealed trait ContentChange extends SignatureHelpTriggerKind
  
  @js.native
  sealed trait Invoke extends SignatureHelpTriggerKind
  
  @js.native
  sealed trait TriggerCharacter extends SignatureHelpTriggerKind
  
  /* 3 */ val ContentChange: typings.monacoDashEditor.monacoDashEditorMod.languages.SignatureHelpTriggerKind.ContentChange with Double = js.native
  /* 1 */ val Invoke: typings.monacoDashEditor.monacoDashEditorMod.languages.SignatureHelpTriggerKind.Invoke with Double = js.native
  /* 2 */ val TriggerCharacter: typings.monacoDashEditor.monacoDashEditorMod.languages.SignatureHelpTriggerKind.TriggerCharacter with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureHelpTriggerKind with Double] = js.native
}

