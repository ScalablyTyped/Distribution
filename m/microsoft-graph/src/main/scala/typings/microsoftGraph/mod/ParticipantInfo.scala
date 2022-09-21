package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantInfo extends StObject {
  
  /**
    * The ISO 3166-1 Alpha-2 country code of the participant's best estimated physical location at the start of the call.
    * Read-only.
    */
  var countryCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of endpoint the participant is using. Possible values are: default, voicemail, skypeForBusiness,
    * skypeForBusinessVoipPhone and unknownFutureValue. Read-only.
    */
  var endpointType: js.UndefOr[NullableOption[EndpointType]] = js.undefined
  
  // The identitySet associated with this participant. Read-only.
  var identity: js.UndefOr[IdentitySet] = js.undefined
  
  // The language culture string. Read-only.
  var languageId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The participant ID of the participant. Read-only.
  var participantId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The home region of the participant. This can be a country, a continent, or a larger geographic region. This does not
    * change based on the participant's current physical location. Read-only.
    */
  var region: js.UndefOr[NullableOption[String]] = js.undefined
}
object ParticipantInfo {
  
  inline def apply(): ParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantInfo]
  }
  
  extension [Self <: ParticipantInfo](x: Self) {
    
    inline def setCountryCode(value: NullableOption[String]): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setEndpointType(value: NullableOption[EndpointType]): Self = StObject.set(x, "endpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeNull: Self = StObject.set(x, "endpointType", null)
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "endpointType", js.undefined)
    
    inline def setIdentity(value: IdentitySet): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setLanguageId(value: NullableOption[String]): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    inline def setLanguageIdNull: Self = StObject.set(x, "languageId", null)
    
    inline def setLanguageIdUndefined: Self = StObject.set(x, "languageId", js.undefined)
    
    inline def setParticipantId(value: NullableOption[String]): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdNull: Self = StObject.set(x, "participantId", null)
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
    
    inline def setRegion(value: NullableOption[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
