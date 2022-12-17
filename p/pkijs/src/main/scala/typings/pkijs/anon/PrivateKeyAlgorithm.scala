package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKeyAlgorithm extends StObject {
  
  var attributes: js.UndefOr[String] = js.undefined
  
  var privateKey: js.UndefOr[String] = js.undefined
  
  var privateKeyAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object PrivateKeyAlgorithm {
  
  inline def apply(): PrivateKeyAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateKeyAlgorithm]
  }
  
  extension [Self <: PrivateKeyAlgorithm](x: Self) {
    
    inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "privateKeyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyAlgorithmUndefined: Self = StObject.set(x, "privateKeyAlgorithm", js.undefined)
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
