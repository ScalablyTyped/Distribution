package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignerInfoJson extends StObject {
  
  var digestAlgorithm: AlgorithmIdentifierJson
  
  var sid: js.UndefOr[SchemaType] = js.undefined
  
  var signature: OctetStringJson
  
  var signatureAlgorithm: AlgorithmIdentifierJson
  
  var signedAttrs: js.UndefOr[SignedAndUnsignedAttributesJson] = js.undefined
  
  var unsignedAttrs: js.UndefOr[SignedAndUnsignedAttributesJson] = js.undefined
  
  var version: Double
}
object SignerInfoJson {
  
  inline def apply(
    digestAlgorithm: AlgorithmIdentifierJson,
    signature: OctetStringJson,
    signatureAlgorithm: AlgorithmIdentifierJson,
    version: Double
  ): SignerInfoJson = {
    val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerInfoJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignerInfoJson] (val x: Self) extends AnyVal {
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSid(value: SchemaType): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "sid", js.undefined)
    
    inline def setSignature(value: OctetStringJson): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignedAttrs(value: SignedAndUnsignedAttributesJson): Self = StObject.set(x, "signedAttrs", value.asInstanceOf[js.Any])
    
    inline def setSignedAttrsUndefined: Self = StObject.set(x, "signedAttrs", js.undefined)
    
    inline def setUnsignedAttrs(value: SignedAndUnsignedAttributesJson): Self = StObject.set(x, "unsignedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnsignedAttrsUndefined: Self = StObject.set(x, "unsignedAttrs", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
