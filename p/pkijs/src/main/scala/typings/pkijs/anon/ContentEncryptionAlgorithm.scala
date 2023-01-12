package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentEncryptionAlgorithm extends StObject {
  
  var contentEncryptionAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var encryptedContent: js.UndefOr[String] = js.undefined
}
object ContentEncryptionAlgorithm {
  
  inline def apply(): ContentEncryptionAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentEncryptionAlgorithm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentEncryptionAlgorithm] (val x: Self) extends AnyVal {
    
    inline def setContentEncryptionAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "contentEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setContentEncryptionAlgorithmUndefined: Self = StObject.set(x, "contentEncryptionAlgorithm", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setEncryptedContent(value: String): Self = StObject.set(x, "encryptedContent", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContentUndefined: Self = StObject.set(x, "encryptedContent", js.undefined)
  }
}
