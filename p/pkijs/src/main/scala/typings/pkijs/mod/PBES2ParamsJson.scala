package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PBES2ParamsJson extends StObject {
  
  var encryptionScheme: AlgorithmIdentifierJson
  
  var keyDerivationFunc: AlgorithmIdentifierJson
}
object PBES2ParamsJson {
  
  inline def apply(encryptionScheme: AlgorithmIdentifierJson, keyDerivationFunc: AlgorithmIdentifierJson): PBES2ParamsJson = {
    val __obj = js.Dynamic.literal(encryptionScheme = encryptionScheme.asInstanceOf[js.Any], keyDerivationFunc = keyDerivationFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[PBES2ParamsJson]
  }
  
  extension [Self <: PBES2ParamsJson](x: Self) {
    
    inline def setEncryptionScheme(value: AlgorithmIdentifierJson): Self = StObject.set(x, "encryptionScheme", value.asInstanceOf[js.Any])
    
    inline def setKeyDerivationFunc(value: AlgorithmIdentifierJson): Self = StObject.set(x, "keyDerivationFunc", value.asInstanceOf[js.Any])
  }
}
