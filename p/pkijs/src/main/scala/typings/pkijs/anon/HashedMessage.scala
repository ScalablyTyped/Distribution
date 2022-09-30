package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashedMessage extends StObject {
  
  var hashAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var hashedMessage: js.UndefOr[String] = js.undefined
}
object HashedMessage {
  
  inline def apply(): HashedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashedMessage]
  }
  
  extension [Self <: HashedMessage](x: Self) {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setHashedMessage(value: String): Self = StObject.set(x, "hashedMessage", value.asInstanceOf[js.Any])
    
    inline def setHashedMessageUndefined: Self = StObject.set(x, "hashedMessage", js.undefined)
  }
}
