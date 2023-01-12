package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignaturePromptInfo extends StObject {
  
  def Clone(): ISignaturePromptInfo
  
  var Meaning: String
  
  var Reason: String
}
object ISignaturePromptInfo {
  
  inline def apply(Clone: () => ISignaturePromptInfo, Meaning: String, Reason: String): ISignaturePromptInfo = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Meaning = Meaning.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignaturePromptInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISignaturePromptInfo] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => ISignaturePromptInfo): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setMeaning(value: String): Self = StObject.set(x, "Meaning", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
