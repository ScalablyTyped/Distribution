package typings.pkijs.anon

import typings.pkijs.mod.EncryptedContentInfoSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginatorInfo extends StObject {
  
  var encryptedContentInfo: js.UndefOr[EncryptedContentInfoSchema] = js.undefined
  
  var originatorInfo: js.UndefOr[String] = js.undefined
  
  var recipientInfos: js.UndefOr[String] = js.undefined
  
  var unprotectedAttrs: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object OriginatorInfo {
  
  inline def apply(): OriginatorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginatorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginatorInfo] (val x: Self) extends AnyVal {
    
    inline def setEncryptedContentInfo(value: EncryptedContentInfoSchema): Self = StObject.set(x, "encryptedContentInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContentInfoUndefined: Self = StObject.set(x, "encryptedContentInfo", js.undefined)
    
    inline def setOriginatorInfo(value: String): Self = StObject.set(x, "originatorInfo", value.asInstanceOf[js.Any])
    
    inline def setOriginatorInfoUndefined: Self = StObject.set(x, "originatorInfo", js.undefined)
    
    inline def setRecipientInfos(value: String): Self = StObject.set(x, "recipientInfos", value.asInstanceOf[js.Any])
    
    inline def setRecipientInfosUndefined: Self = StObject.set(x, "recipientInfos", js.undefined)
    
    inline def setUnprotectedAttrs(value: String): Self = StObject.set(x, "unprotectedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedAttrsUndefined: Self = StObject.set(x, "unprotectedAttrs", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
