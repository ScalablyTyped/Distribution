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
    val __obj = js.Dynamic.literal(isRetrigger = isRetrigger.asInstanceOf[js.Any], triggerKind = triggerKind.asInstanceOf[js.Any])
    if (activeSignatureHelp != null) __obj.updateDynamic("activeSignatureHelp")(activeSignatureHelp.asInstanceOf[js.Any])
    if (triggerCharacter != null) __obj.updateDynamic("triggerCharacter")(triggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpContext]
  }
}

