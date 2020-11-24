package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpProvider extends js.Object {
  
  /**
    * Provide help for the signature at the given position and document.
    */
  def provideSignatureHelp(model: ITextModel, position: Position, token: CancellationToken, context: SignatureHelpContext): ProviderResult[SignatureHelpResult] = js.native
  
  val signatureHelpRetriggerCharacters: js.UndefOr[js.Array[String]] = js.native
  
  val signatureHelpTriggerCharacters: js.UndefOr[js.Array[String]] = js.native
}
object SignatureHelpProvider {
  
  @scala.inline
  def apply(
    provideSignatureHelp: (ITextModel, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelpResult]
  ): SignatureHelpProvider = {
    val __obj = js.Dynamic.literal(provideSignatureHelp = js.Any.fromFunction4(provideSignatureHelp))
    __obj.asInstanceOf[SignatureHelpProvider]
  }
  
  @scala.inline
  implicit class SignatureHelpProviderOps[Self <: SignatureHelpProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvideSignatureHelp(
      value: (ITextModel, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelpResult]
    ): Self = this.set("provideSignatureHelp", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSignatureHelpRetriggerCharactersVarargs(value: String*): Self = this.set("signatureHelpRetriggerCharacters", js.Array(value :_*))
    
    @scala.inline
    def setSignatureHelpRetriggerCharacters(value: js.Array[String]): Self = this.set("signatureHelpRetriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureHelpRetriggerCharacters: Self = this.set("signatureHelpRetriggerCharacters", js.undefined)
    
    @scala.inline
    def setSignatureHelpTriggerCharactersVarargs(value: String*): Self = this.set("signatureHelpTriggerCharacters", js.Array(value :_*))
    
    @scala.inline
    def setSignatureHelpTriggerCharacters(value: js.Array[String]): Self = this.set("signatureHelpTriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureHelpTriggerCharacters: Self = this.set("signatureHelpTriggerCharacters", js.undefined)
  }
}
