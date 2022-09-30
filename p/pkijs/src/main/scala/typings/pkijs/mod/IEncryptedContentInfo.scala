package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEncryptedContentInfo extends StObject {
  
  var contentEncryptionAlgorithm: AlgorithmIdentifier
  
  var contentType: String
  
  var encryptedContent: js.UndefOr[OctetString] = js.undefined
}
object IEncryptedContentInfo {
  
  inline def apply(contentEncryptionAlgorithm: AlgorithmIdentifier, contentType: String): IEncryptedContentInfo = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEncryptedContentInfo]
  }
  
  extension [Self <: IEncryptedContentInfo](x: Self) {
    
    inline def setContentEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "contentEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContent(value: OctetString): Self = StObject.set(x, "encryptedContent", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContentUndefined: Self = StObject.set(x, "encryptedContent", js.undefined)
  }
}
