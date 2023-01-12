package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import typings.pkijs.mod.IssuerAndSerialNumberSchema
import typings.pkijs.mod.SignedAndUnsignedAttributesSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sid extends StObject {
  
  var digestAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var sid: js.UndefOr[String] = js.undefined
  
  var sidSchema: js.UndefOr[IssuerAndSerialNumberSchema] = js.undefined
  
  var signature: js.UndefOr[String] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var signedAttrs: js.UndefOr[SignedAndUnsignedAttributesSchema] = js.undefined
  
  var unsignedAttrs: js.UndefOr[SignedAndUnsignedAttributesSchema] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Sid {
  
  inline def apply(): Sid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sid] (val x: Self) extends AnyVal {
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidSchema(value: IssuerAndSerialNumberSchema): Self = StObject.set(x, "sidSchema", value.asInstanceOf[js.Any])
    
    inline def setSidSchemaUndefined: Self = StObject.set(x, "sidSchema", js.undefined)
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSignedAttrs(value: SignedAndUnsignedAttributesSchema): Self = StObject.set(x, "signedAttrs", value.asInstanceOf[js.Any])
    
    inline def setSignedAttrsUndefined: Self = StObject.set(x, "signedAttrs", js.undefined)
    
    inline def setUnsignedAttrs(value: SignedAndUnsignedAttributesSchema): Self = StObject.set(x, "unsignedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnsignedAttrsUndefined: Self = StObject.set(x, "unsignedAttrs", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
