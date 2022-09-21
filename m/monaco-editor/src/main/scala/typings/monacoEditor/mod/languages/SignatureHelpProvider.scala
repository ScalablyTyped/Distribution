package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureHelpProvider extends StObject {
  
  /**
    * Provide help for the signature at the given position and document.
    */
  def provideSignatureHelp(model: ITextModel, position: Position, token: CancellationToken, context: SignatureHelpContext): ProviderResult[SignatureHelpResult]
  
  val signatureHelpRetriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
  
  val signatureHelpTriggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
}
object SignatureHelpProvider {
  
  inline def apply(
    provideSignatureHelp: (ITextModel, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelpResult]
  ): SignatureHelpProvider = {
    val __obj = js.Dynamic.literal(provideSignatureHelp = js.Any.fromFunction4(provideSignatureHelp))
    __obj.asInstanceOf[SignatureHelpProvider]
  }
  
  extension [Self <: SignatureHelpProvider](x: Self) {
    
    inline def setProvideSignatureHelp(
      value: (ITextModel, Position, CancellationToken, SignatureHelpContext) => ProviderResult[SignatureHelpResult]
    ): Self = StObject.set(x, "provideSignatureHelp", js.Any.fromFunction4(value))
    
    inline def setSignatureHelpRetriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "signatureHelpRetriggerCharacters", value.asInstanceOf[js.Any])
    
    inline def setSignatureHelpRetriggerCharactersUndefined: Self = StObject.set(x, "signatureHelpRetriggerCharacters", js.undefined)
    
    inline def setSignatureHelpRetriggerCharactersVarargs(value: String*): Self = StObject.set(x, "signatureHelpRetriggerCharacters", js.Array(value*))
    
    inline def setSignatureHelpTriggerCharacters(value: js.Array[String]): Self = StObject.set(x, "signatureHelpTriggerCharacters", value.asInstanceOf[js.Any])
    
    inline def setSignatureHelpTriggerCharactersUndefined: Self = StObject.set(x, "signatureHelpTriggerCharacters", js.undefined)
    
    inline def setSignatureHelpTriggerCharactersVarargs(value: String*): Self = StObject.set(x, "signatureHelpTriggerCharacters", js.Array(value*))
  }
}
