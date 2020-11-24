package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyCredential extends js.Object {
  
  // Custom key identifier
  var customKeyIdentifier: js.UndefOr[NullableOption[Double]] = js.native
  
  // Friendly name for the key. Optional.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The date and time at which the credential expires.The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The certificate's raw data in byte array converted to Base64 string; for example,
    * [System.Convert]::ToBase64String($Cert.GetRawCertData()).
    */
  var key: js.UndefOr[NullableOption[Double]] = js.native
  
  // The unique identifier (GUID) for the key.
  var keyId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The date and time at which the credential becomes valid.The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The type of key credential; for example, 'Symmetric'.
  var `type`: js.UndefOr[NullableOption[String]] = js.native
  
  // A string that describes the purpose for which the key can be used; for example, 'Verify'.
  var usage: js.UndefOr[NullableOption[String]] = js.native
}
object KeyCredential {
  
  @scala.inline
  def apply(): KeyCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyCredential]
  }
  
  @scala.inline
  implicit class KeyCredentialOps[Self <: KeyCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomKeyIdentifier(value: NullableOption[Double]): Self = this.set("customKeyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomKeyIdentifier: Self = this.set("customKeyIdentifier", js.undefined)
    
    @scala.inline
    def setCustomKeyIdentifierNull: Self = this.set("customKeyIdentifier", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setEndDateTime(value: NullableOption[String]): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    
    @scala.inline
    def setEndDateTimeNull: Self = this.set("endDateTime", null)
    
    @scala.inline
    def setKey(value: NullableOption[Double]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setKeyId(value: NullableOption[String]): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    
    @scala.inline
    def setKeyIdNull: Self = this.set("keyId", null)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTimeNull: Self = this.set("startDateTime", null)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
    
    @scala.inline
    def setUsage(value: NullableOption[String]): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    
    @scala.inline
    def setUsageNull: Self = this.set("usage", null)
  }
}
