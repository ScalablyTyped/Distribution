package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpProvider extends js.Object {
  val signatureHelpRetriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
  val signatureHelpTriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Provide help for the signature at the given position and document.
    */
  def provideSignatureHelp(model: ITextModel, position: Position, token: CancellationToken, context: SignatureHelpContext): ProviderResult[SignatureHelpResult]
}

object SignatureHelpProvider {
  @scala.inline
  def apply(
    provideSignatureHelp: (ITextModel, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelpResult],
    signatureHelpRetriggerCharacters: js.Array[String] = null,
    signatureHelpTriggerCharacters: js.Array[String] = null
  ): SignatureHelpProvider = {
    val __obj = js.Dynamic.literal(provideSignatureHelp = js.Any.fromFunction4(provideSignatureHelp))
    if (signatureHelpRetriggerCharacters != null) __obj.updateDynamic("signatureHelpRetriggerCharacters")(signatureHelpRetriggerCharacters.asInstanceOf[js.Any])
    if (signatureHelpTriggerCharacters != null) __obj.updateDynamic("signatureHelpTriggerCharacters")(signatureHelpTriggerCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpProvider]
  }
}

