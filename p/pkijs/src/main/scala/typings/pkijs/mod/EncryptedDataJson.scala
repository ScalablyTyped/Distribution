package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedDataJson extends StObject {
  
  var encryptedContentInfo: EncryptedContentInfoJson
  
  var unprotectedAttrs: js.UndefOr[js.Array[AttributeJson]] = js.undefined
  
  var version: Double
}
object EncryptedDataJson {
  
  inline def apply(encryptedContentInfo: EncryptedContentInfoJson, version: Double): EncryptedDataJson = {
    val __obj = js.Dynamic.literal(encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedDataJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedDataJson] (val x: Self) extends AnyVal {
    
    inline def setEncryptedContentInfo(value: EncryptedContentInfoJson): Self = StObject.set(x, "encryptedContentInfo", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedAttrs(value: js.Array[AttributeJson]): Self = StObject.set(x, "unprotectedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedAttrsUndefined: Self = StObject.set(x, "unprotectedAttrs", js.undefined)
    
    inline def setUnprotectedAttrsVarargs(value: AttributeJson*): Self = StObject.set(x, "unprotectedAttrs", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
