package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyCredential extends StObject {
  
  // Custom key identifier
  var customKeyIdentifier: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Friendly name for the key. Optional.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The date and time at which the credential expires.The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The certificate's raw data in byte array converted to Base64 string; for example,
    * [System.Convert]::ToBase64String($Cert.GetRawCertData()).
    */
  var key: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The unique identifier (GUID) for the key.
  var keyId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The date and time at which the credential becomes valid.The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of key credential; for example, 'Symmetric'.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A string that describes the purpose for which the key can be used; for example, 'Verify'.
  var usage: js.UndefOr[NullableOption[String]] = js.undefined
}
object KeyCredential {
  
  @scala.inline
  def apply(): KeyCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyCredential]
  }
  
  @scala.inline
  implicit class KeyCredentialMutableBuilder[Self <: KeyCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomKeyIdentifier(value: NullableOption[Double]): Self = StObject.set(x, "customKeyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeyIdentifierNull: Self = StObject.set(x, "customKeyIdentifier", null)
    
    @scala.inline
    def setCustomKeyIdentifierUndefined: Self = StObject.set(x, "customKeyIdentifier", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setKey(value: NullableOption[Double]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: NullableOption[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUsage(value: NullableOption[String]): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageNull: Self = StObject.set(x, "usage", null)
    
    @scala.inline
    def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
