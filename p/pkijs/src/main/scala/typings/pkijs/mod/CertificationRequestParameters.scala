package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICertificationRequest> */
trait CertificationRequestParameters extends StObject {
  
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var signatureValue: js.UndefOr[BitString] = js.undefined
  
  var subject: js.UndefOr[RelativeDistinguishedNames] = js.undefined
  
  var subjectPublicKeyInfo: js.UndefOr[PublicKeyInfo] = js.undefined
  
  var tbs: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object CertificationRequestParameters {
  
  inline def apply(): CertificationRequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationRequestParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificationRequestParameters] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureValue(value: BitString): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSignatureValueUndefined: Self = StObject.set(x, "signatureValue", js.undefined)
    
    inline def setSubject(value: RelativeDistinguishedNames): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfo(value: PublicKeyInfo): Self = StObject.set(x, "subjectPublicKeyInfo", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfoUndefined: Self = StObject.set(x, "subjectPublicKeyInfo", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTbs(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "tbs", value.asInstanceOf[js.Any])
    
    inline def setTbsUndefined: Self = StObject.set(x, "tbs", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
