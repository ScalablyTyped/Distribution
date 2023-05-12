package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.bad_cert
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.bad_email
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.expired_key
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.gpgverify_error
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.gpgverify_unavailable
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.invalid
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.malformed_signature
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.no_user
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.not_signing_key
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.ocsp_pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unknown_key
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unknown_signature_type
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unsigned
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.unverified_email
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReasonSignature extends StObject {
  
  var payload: String | Null
  
  /** @enum {string} */
  var reason: expired_key | not_signing_key | gpgverify_error | gpgverify_unavailable | unsigned | unknown_signature_type | no_user | unverified_email | bad_email | unknown_key | malformed_signature | invalid | valid | bad_cert | ocsp_pending
  
  var signature: String | Null
  
  var verified: Boolean
}
object ReasonSignature {
  
  inline def apply(
    reason: expired_key | not_signing_key | gpgverify_error | gpgverify_unavailable | unsigned | unknown_signature_type | no_user | unverified_email | bad_email | unknown_key | malformed_signature | invalid | valid | bad_cert | ocsp_pending,
    verified: Boolean
  ): ReasonSignature = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], payload = null, signature = null)
    __obj.asInstanceOf[ReasonSignature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReasonSignature] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setReason(
      value: expired_key | not_signing_key | gpgverify_error | gpgverify_unavailable | unsigned | unknown_signature_type | no_user | unverified_email | bad_email | unknown_key | malformed_signature | invalid | valid | bad_cert | ocsp_pending
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
