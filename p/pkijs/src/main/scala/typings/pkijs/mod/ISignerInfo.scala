package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISignerInfo extends StObject {
  
  var digestAlgorithm: AlgorithmIdentifier
  
  var sid: SchemaType
  
  var signature: OctetString
  
  var signatureAlgorithm: AlgorithmIdentifier
  
  var signedAttrs: js.UndefOr[SignedAndUnsignedAttributes] = js.undefined
  
  var unsignedAttrs: js.UndefOr[SignedAndUnsignedAttributes] = js.undefined
  
  var version: Double
}
object ISignerInfo {
  
  inline def apply(
    digestAlgorithm: AlgorithmIdentifier,
    sid: SchemaType,
    signature: OctetString,
    signatureAlgorithm: AlgorithmIdentifier,
    version: Double
  ): ISignerInfo = {
    val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISignerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISignerInfo] (val x: Self) extends AnyVal {
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSid(value: SchemaType): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: OctetString): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignedAttrs(value: SignedAndUnsignedAttributes): Self = StObject.set(x, "signedAttrs", value.asInstanceOf[js.Any])
    
    inline def setSignedAttrsUndefined: Self = StObject.set(x, "signedAttrs", js.undefined)
    
    inline def setUnsignedAttrs(value: SignedAndUnsignedAttributes): Self = StObject.set(x, "unsignedAttrs", value.asInstanceOf[js.Any])
    
    inline def setUnsignedAttrsUndefined: Self = StObject.set(x, "unsignedAttrs", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
