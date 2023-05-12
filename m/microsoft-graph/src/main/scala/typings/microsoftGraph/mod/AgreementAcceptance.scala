package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgreementAcceptance
  extends StObject
     with Entity {
  
  // The identifier of the agreement file accepted by the user.
  var agreementFileId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identifier of the agreement.
  var agreementId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the device used for accepting the agreement.
  var deviceDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The unique identifier of the device used for accepting the agreement. Supports $filter (eq) and eq for null values.
  var deviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The operating system used to accept the agreement.
  var deviceOSType: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The operating system version of the device used to accept the agreement.
  var deviceOSVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The expiration date time of the acceptance. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter
    * (eq, ge, le) and eq for null values.
    */
  var expirationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var recordedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The state of the agreement acceptance. Possible values are: accepted, declined. Supports $filter (eq).
  var state: js.UndefOr[NullableOption[AgreementAcceptanceState]] = js.undefined
  
  // Display name of the user when the acceptance was recorded.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Email of the user when the acceptance was recorded.
  var userEmail: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The identifier of the user who accepted the agreement. Supports $filter (eq).
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // UPN of the user when the acceptance was recorded.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object AgreementAcceptance {
  
  inline def apply(): AgreementAcceptance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgreementAcceptance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgreementAcceptance] (val x: Self) extends AnyVal {
    
    inline def setAgreementFileId(value: NullableOption[String]): Self = StObject.set(x, "agreementFileId", value.asInstanceOf[js.Any])
    
    inline def setAgreementFileIdNull: Self = StObject.set(x, "agreementFileId", null)
    
    inline def setAgreementFileIdUndefined: Self = StObject.set(x, "agreementFileId", js.undefined)
    
    inline def setAgreementId(value: NullableOption[String]): Self = StObject.set(x, "agreementId", value.asInstanceOf[js.Any])
    
    inline def setAgreementIdNull: Self = StObject.set(x, "agreementId", null)
    
    inline def setAgreementIdUndefined: Self = StObject.set(x, "agreementId", js.undefined)
    
    inline def setDeviceDisplayName(value: NullableOption[String]): Self = StObject.set(x, "deviceDisplayName", value.asInstanceOf[js.Any])
    
    inline def setDeviceDisplayNameNull: Self = StObject.set(x, "deviceDisplayName", null)
    
    inline def setDeviceDisplayNameUndefined: Self = StObject.set(x, "deviceDisplayName", js.undefined)
    
    inline def setDeviceId(value: NullableOption[String]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceOSType(value: NullableOption[String]): Self = StObject.set(x, "deviceOSType", value.asInstanceOf[js.Any])
    
    inline def setDeviceOSTypeNull: Self = StObject.set(x, "deviceOSType", null)
    
    inline def setDeviceOSTypeUndefined: Self = StObject.set(x, "deviceOSType", js.undefined)
    
    inline def setDeviceOSVersion(value: NullableOption[String]): Self = StObject.set(x, "deviceOSVersion", value.asInstanceOf[js.Any])
    
    inline def setDeviceOSVersionNull: Self = StObject.set(x, "deviceOSVersion", null)
    
    inline def setDeviceOSVersionUndefined: Self = StObject.set(x, "deviceOSVersion", js.undefined)
    
    inline def setExpirationDateTime(value: NullableOption[String]): Self = StObject.set(x, "expirationDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateTimeNull: Self = StObject.set(x, "expirationDateTime", null)
    
    inline def setExpirationDateTimeUndefined: Self = StObject.set(x, "expirationDateTime", js.undefined)
    
    inline def setRecordedDateTime(value: NullableOption[String]): Self = StObject.set(x, "recordedDateTime", value.asInstanceOf[js.Any])
    
    inline def setRecordedDateTimeNull: Self = StObject.set(x, "recordedDateTime", null)
    
    inline def setRecordedDateTimeUndefined: Self = StObject.set(x, "recordedDateTime", js.undefined)
    
    inline def setState(value: NullableOption[AgreementAcceptanceState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    inline def setUserDisplayNameNull: Self = StObject.set(x, "userDisplayName", null)
    
    inline def setUserDisplayNameUndefined: Self = StObject.set(x, "userDisplayName", js.undefined)
    
    inline def setUserEmail(value: NullableOption[String]): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailNull: Self = StObject.set(x, "userEmail", null)
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
