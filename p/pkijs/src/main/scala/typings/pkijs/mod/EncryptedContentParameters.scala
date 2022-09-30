package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IEncryptedContentInfo> */
trait EncryptedContentParameters extends StObject {
  
  var contentEncryptionAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var encryptedContent: js.UndefOr[OctetString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object EncryptedContentParameters {
  
  inline def apply(): EncryptedContentParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptedContentParameters]
  }
  
  extension [Self <: EncryptedContentParameters](x: Self) {
    
    inline def setContentEncryptionAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "contentEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setContentEncryptionAlgorithmUndefined: Self = StObject.set(x, "contentEncryptionAlgorithm", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setEncryptedContent(value: OctetString): Self = StObject.set(x, "encryptedContent", value.asInstanceOf[js.Any])
    
    inline def setEncryptedContentUndefined: Self = StObject.set(x, "encryptedContent", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
