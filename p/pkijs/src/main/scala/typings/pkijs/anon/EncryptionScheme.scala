package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionScheme extends StObject {
  
  var encryptionScheme: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var keyDerivationFunc: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
}
object EncryptionScheme {
  
  inline def apply(): EncryptionScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionScheme]
  }
  
  extension [Self <: EncryptionScheme](x: Self) {
    
    inline def setEncryptionScheme(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "encryptionScheme", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSchemeUndefined: Self = StObject.set(x, "encryptionScheme", js.undefined)
    
    inline def setKeyDerivationFunc(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "keyDerivationFunc", value.asInstanceOf[js.Any])
    
    inline def setKeyDerivationFuncUndefined: Self = StObject.set(x, "keyDerivationFunc", js.undefined)
  }
}
