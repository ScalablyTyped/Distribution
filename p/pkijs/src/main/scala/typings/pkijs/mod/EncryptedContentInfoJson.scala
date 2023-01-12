package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedContentInfoJson extends StObject {
  
  var contentEncryptionAlgorithm: AlgorithmIdentifierJson
  
  var contentType: String
  
  var encryptedContent: js.UndefOr[OctetStringJson] = js.undefined
}
object EncryptedContentInfoJson {
  
  inline def apply(contentEncryptionAlgorithm: AlgorithmIdentifierJson, contentType: String): EncryptedContentInfoJson = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedContentInfoJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptedContentInfoJson] (val x: Self) extends AnyVal {
    
    inline def setContentEncryptionAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "contentEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContent(value: OctetStringJson): Self = StObject.set(x, "encryptedContent", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContentUndefined: Self = StObject.set(x, "encryptedContent", js.undefined)
  }
}
