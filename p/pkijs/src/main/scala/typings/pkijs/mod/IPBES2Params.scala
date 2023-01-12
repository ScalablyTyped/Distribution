package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPBES2Params extends StObject {
  
  var encryptionScheme: AlgorithmIdentifier
  
  var keyDerivationFunc: AlgorithmIdentifier
}
object IPBES2Params {
  
  inline def apply(encryptionScheme: AlgorithmIdentifier, keyDerivationFunc: AlgorithmIdentifier): IPBES2Params = {
    val __obj = js.Dynamic.literal(encryptionScheme = encryptionScheme.asInstanceOf[js.Any], keyDerivationFunc = keyDerivationFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPBES2Params]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPBES2Params] (val x: Self) extends AnyVal {
    
    inline def setEncryptionScheme(value: AlgorithmIdentifier): Self = StObject.set(x, "encryptionScheme", value.asInstanceOf[js.Any])
    
    inline def setKeyDerivationFunc(value: AlgorithmIdentifier): Self = StObject.set(x, "keyDerivationFunc", value.asInstanceOf[js.Any])
  }
}
