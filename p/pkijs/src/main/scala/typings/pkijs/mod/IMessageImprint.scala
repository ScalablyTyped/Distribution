package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMessageImprint extends StObject {
  
  var hashAlgorithm: AlgorithmIdentifier
  
  var hashedMessage: OctetString
}
object IMessageImprint {
  
  inline def apply(hashAlgorithm: AlgorithmIdentifier, hashedMessage: OctetString): IMessageImprint = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], hashedMessage = hashedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageImprint]
  }
  
  extension [Self <: IMessageImprint](x: Self) {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashedMessage(value: OctetString): Self = StObject.set(x, "hashedMessage", value.asInstanceOf[js.Any])
  }
}
