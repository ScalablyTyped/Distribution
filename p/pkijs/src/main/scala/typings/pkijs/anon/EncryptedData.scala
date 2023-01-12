package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedData extends StObject {
  
  var encryptedData: js.UndefOr[String] = js.undefined
  
  var encryptionAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
}
object EncryptedData {
  
  inline def apply(): EncryptedData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedData] (val x: Self) extends AnyVal {
    
    inline def setEncryptedData(value: String): Self = StObject.set(x, "encryptedData", value.asInstanceOf[js.Any])
    
    inline def setEncryptedDataUndefined: Self = StObject.set(x, "encryptedData", js.undefined)
    
    inline def setEncryptionAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
  }
}
