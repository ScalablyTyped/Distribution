package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpContext extends js.Object {
  val activeSignatureHelp: js.UndefOr[SignatureHelp] = js.undefined
  val isRetrigger: Boolean
  val triggerCharacter: js.UndefOr[String] = js.undefined
  val triggerKind: SignatureHelpTriggerKind
}

object SignatureHelpContext {
  @scala.inline
  def apply(
    isRetrigger: Boolean,
    triggerKind: SignatureHelpTriggerKind,
    activeSignatureHelp: SignatureHelp = null,
    triggerCharacter: String = null
  ): SignatureHelpContext = {
    val __obj = js.Dynamic.literal(isRetrigger = isRetrigger, triggerKind = triggerKind)
    if (activeSignatureHelp != null) __obj.updateDynamic("activeSignatureHelp")(activeSignatureHelp)
    if (triggerCharacter != null) __obj.updateDynamic("triggerCharacter")(triggerCharacter)
    __obj.asInstanceOf[SignatureHelpContext]
  }
}

