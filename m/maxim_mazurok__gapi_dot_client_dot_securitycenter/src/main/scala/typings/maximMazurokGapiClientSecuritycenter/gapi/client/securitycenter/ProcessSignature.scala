package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessSignature extends StObject {
  
  /** Signature indicating that a binary family was matched. */
  var memoryHashSignature: js.UndefOr[MemoryHashSignature] = js.undefined
  
  /** Signature indicating that a YARA rule was matched. */
  var yaraRuleSignature: js.UndefOr[YaraRuleSignature] = js.undefined
}
object ProcessSignature {
  
  inline def apply(): ProcessSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessSignature]
  }
  
  extension [Self <: ProcessSignature](x: Self) {
    
    inline def setMemoryHashSignature(value: MemoryHashSignature): Self = StObject.set(x, "memoryHashSignature", value.asInstanceOf[js.Any])
    
    inline def setMemoryHashSignatureUndefined: Self = StObject.set(x, "memoryHashSignature", js.undefined)
    
    inline def setYaraRuleSignature(value: YaraRuleSignature): Self = StObject.set(x, "yaraRuleSignature", value.asInstanceOf[js.Any])
    
    inline def setYaraRuleSignatureUndefined: Self = StObject.set(x, "yaraRuleSignature", js.undefined)
  }
}
