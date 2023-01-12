package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyCredential extends StObject {
  
  // Custom key identifier
  var customKeyIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Friendly name for the key. Optional.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The date and time at which the credential expires. The DateTimeOffset type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The certificate's raw data in byte array converted to Base64 string. Returned only on $select for a single object, that
    * is, GET applications/{applicationId}?$select=keyCredentials or GET
    * servicePrincipals/{servicePrincipalId}?$select=keyCredentials; otherwise, it is always null.
    */
  var key: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier (GUID) for the key.
  var keyId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The date and time at which the credential becomes valid.The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of key credential; for example, Symmetric, AsymmetricX509Cert.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A string that describes the purpose for which the key can be used; for example, Verify.
  var usage: js.UndefOr[NullableOption[String]] = js.undefined
}
object KeyCredential {
  
  inline def apply(): KeyCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyCredential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyCredential] (val x: Self) extends AnyVal {
    
    inline def setCustomKeyIdentifier(value: NullableOption[String]): Self = StObject.set(x, "customKeyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyIdentifierNull: Self = StObject.set(x, "customKeyIdentifier", null)
    
    inline def setCustomKeyIdentifierUndefined: Self = StObject.set(x, "customKeyIdentifier", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setKey(value: NullableOption[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: NullableOption[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUsage(value: NullableOption[String]): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageNull: Self = StObject.set(x, "usage", null)
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
