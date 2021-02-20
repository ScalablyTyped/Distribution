package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpContext extends StObject {
  
  val activeSignatureHelp: js.UndefOr[SignatureHelp] = js.native
  
  val isRetrigger: Boolean = js.native
  
  val triggerCharacter: js.UndefOr[String] = js.native
  
  val triggerKind: SignatureHelpTriggerKind = js.native
}
object SignatureHelpContext {
  
  @scala.inline
  def apply(isRetrigger: Boolean, triggerKind: SignatureHelpTriggerKind): SignatureHelpContext = {
    val __obj = js.Dynamic.literal(isRetrigger = isRetrigger.asInstanceOf[js.Any], triggerKind = triggerKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpContext]
  }
  
  @scala.inline
  implicit class SignatureHelpContextMutableBuilder[Self <: SignatureHelpContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveSignatureHelp(value: SignatureHelp): Self = StObject.set(x, "activeSignatureHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSignatureHelpUndefined: Self = StObject.set(x, "activeSignatureHelp", js.undefined)
    
    @scala.inline
    def setIsRetrigger(value: Boolean): Self = StObject.set(x, "isRetrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharacter(value: String): Self = StObject.set(x, "triggerCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerCharacterUndefined: Self = StObject.set(x, "triggerCharacter", js.undefined)
    
    @scala.inline
    def setTriggerKind(value: SignatureHelpTriggerKind): Self = StObject.set(x, "triggerKind", value.asInstanceOf[js.Any])
  }
}
