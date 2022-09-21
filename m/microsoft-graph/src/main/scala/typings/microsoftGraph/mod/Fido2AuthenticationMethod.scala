package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fido2AuthenticationMethod
  extends StObject
     with Entity {
  
  // Authenticator Attestation GUID, an identifier that indicates the type (e.g. make and model) of the authenticator.
  var aaGuid: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The attestation certificate(s) attached to this security key.
  var attestationCertificates: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // The attestation level of this FIDO2 security key. Possible values are: attested, or notAttested.
  var attestationLevel: js.UndefOr[NullableOption[AttestationLevel]] = js.undefined
  
  // The timestamp when this key was registered to the user.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the key as given by the user.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The manufacturer-assigned model of the FIDO2 security key.
  var model: js.UndefOr[NullableOption[String]] = js.undefined
}
object Fido2AuthenticationMethod {
  
  inline def apply(): Fido2AuthenticationMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fido2AuthenticationMethod]
  }
  
  extension [Self <: Fido2AuthenticationMethod](x: Self) {
    
    inline def setAaGuid(value: NullableOption[String]): Self = StObject.set(x, "aaGuid", value.asInstanceOf[js.Any])
    
    inline def setAaGuidNull: Self = StObject.set(x, "aaGuid", null)
    
    inline def setAaGuidUndefined: Self = StObject.set(x, "aaGuid", js.undefined)
    
    inline def setAttestationCertificates(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "attestationCertificates", value.asInstanceOf[js.Any])
    
    inline def setAttestationCertificatesNull: Self = StObject.set(x, "attestationCertificates", null)
    
    inline def setAttestationCertificatesUndefined: Self = StObject.set(x, "attestationCertificates", js.undefined)
    
    inline def setAttestationCertificatesVarargs(value: String*): Self = StObject.set(x, "attestationCertificates", js.Array(value*))
    
    inline def setAttestationLevel(value: NullableOption[AttestationLevel]): Self = StObject.set(x, "attestationLevel", value.asInstanceOf[js.Any])
    
    inline def setAttestationLevelNull: Self = StObject.set(x, "attestationLevel", null)
    
    inline def setAttestationLevelUndefined: Self = StObject.set(x, "attestationLevel", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setModel(value: NullableOption[String]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
