package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISignature> */
trait SignatureParameters extends StObject {
  
  var certs: js.UndefOr[js.Array[Certificate]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var signature: js.UndefOr[BitString] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
}
object SignatureParameters {
  
  inline def apply(): SignatureParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignatureParameters] (val x: Self) extends AnyVal {
    
    inline def setCerts(value: js.Array[Certificate]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCertsVarargs(value: Certificate*): Self = StObject.set(x, "certs", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSignature(value: BitString): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
