package typings.pkijs.anon

import typings.pkijs.mod.EncryptedContentInfoSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedContentInfo extends StObject {
  
  var encryptedContentInfo: js.UndefOr[EncryptedContentInfoSchema] = js.undefined
  
  var unprotectedAttrs: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object EncryptedContentInfo {
  
  inline def apply(): EncryptedContentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptedContentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedContentInfo] (val x: Self) extends AnyVal {
    
    inline def setEncryptedContentInfo(value: EncryptedContentInfoSchema): Self = StObject.set(x, "encryptedContentInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContentInfoUndefined: Self = StObject.set(x, "encryptedContentInfo", js.undefined)
    
    inline def setUnprotectedAttrs(value: String): Self = StObject.set(x, "unprotectedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedAttrsUndefined: Self = StObject.set(x, "unprotectedAttrs", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
