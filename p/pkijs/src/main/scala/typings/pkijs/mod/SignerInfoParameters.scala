package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISignerInfo> */
trait SignerInfoParameters extends StObject {
  
  var digestAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var sid: js.UndefOr[SchemaType] = js.undefined
  
  var signature: js.UndefOr[OctetString] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var signedAttrs: js.UndefOr[SignedAndUnsignedAttributes] = js.undefined
  
  var unsignedAttrs: js.UndefOr[SignedAndUnsignedAttributes] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object SignerInfoParameters {
  
  inline def apply(): SignerInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignerInfoParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignerInfoParameters] (val x: Self) extends AnyVal {
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSid(value: SchemaType): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    
    inline def setSignature(value: OctetString): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setSignedAttrs(value: SignedAndUnsignedAttributes): Self = StObject.set(x, "signedAttrs", value.asInstanceOf[js.Any])
    
    inline def setSignedAttrsUndefined: Self = StObject.set(x, "signedAttrs", js.undefined)
    
    inline def setUnsignedAttrs(value: SignedAndUnsignedAttributes): Self = StObject.set(x, "unsignedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnsignedAttrsUndefined: Self = StObject.set(x, "unsignedAttrs", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
