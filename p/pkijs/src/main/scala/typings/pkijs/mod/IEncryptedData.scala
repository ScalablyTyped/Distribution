package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEncryptedData extends StObject {
  
  /**
    * Encrypted content information
    */
  var encryptedContentInfo: EncryptedContentInfo
  
  /**
    * Collection of attributes that are not encrypted
    */
  var unprotectedAttrs: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  /**
    * Version number.
    *
    * If `unprotectedAttrs` is present, then the version MUST be 2. If `unprotectedAttrs` is absent, then version MUST be 0.
    */
  var version: Double
}
object IEncryptedData {
  
  inline def apply(encryptedContentInfo: EncryptedContentInfo, version: Double): IEncryptedData = {
    val __obj = js.Dynamic.literal(encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncryptedData]
  }
  
  extension [Self <: IEncryptedData](x: Self) {
    
    inline def setEncryptedContentInfo(value: EncryptedContentInfo): Self = StObject.set(x, "encryptedContentInfo", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "unprotectedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnprotectedAttrsUndefined: Self = StObject.set(x, "unprotectedAttrs", js.undefined)
    
    inline def setUnprotectedAttrsVarargs(value: Attribute*): Self = StObject.set(x, "unprotectedAttrs", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
