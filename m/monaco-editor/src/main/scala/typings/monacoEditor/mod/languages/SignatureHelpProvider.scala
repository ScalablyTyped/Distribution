package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpProvider extends StObject {
  
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
  implicit class SignatureHelpProviderMutableBuilder[Self <: SignatureHelpProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideSignatureHelp(
      value: (ITextModel, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelpResult]
    ): Self = StObject.set(x, "provideSignatureHelp", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSignatureHelpRetriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "signatureHelpRetriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureHelpRetriggerCharactersUndefined: Self = StObject.set(x, "signatureHelpRetriggerCharacters", js.undefined)
    
    @scala.inline
    def setSignatureHelpRetriggerCharactersVarargs(value: String*): Self = StObject.set(x, "signatureHelpRetriggerCharacters", js.Array(value :_*))
    
    @scala.inline
    def setSignatureHelpTriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "signatureHelpTriggerCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureHelpTriggerCharactersUndefined: Self = StObject.set(x, "signatureHelpTriggerCharacters", js.undefined)
    
    @scala.inline
    def setSignatureHelpTriggerCharactersVarargs(value: String*): Self = StObject.set(x, "signatureHelpTriggerCharacters", js.Array(value :_*))
  }
}
