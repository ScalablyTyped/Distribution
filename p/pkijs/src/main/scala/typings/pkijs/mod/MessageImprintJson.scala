package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageImprintJson extends StObject {
  
  var hashAlgorithm: AlgorithmIdentifierJson
  
  var hashedMessage: OctetStringJson
}
object MessageImprintJson {
  
  inline def apply(hashAlgorithm: AlgorithmIdentifierJson, hashedMessage: OctetStringJson): MessageImprintJson = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], hashedMessage = hashedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageImprintJson]
  }
  
  extension [Self <: MessageImprintJson](x: Self) {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashedMessage(value: OctetStringJson): Self = StObject.set(x, "hashedMessage", value.asInstanceOf[js.Any])
  }
}
