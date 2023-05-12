package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignInActivity extends StObject {
  
  /**
    * The last non-interactive sign-in date for a specific user. You can use this field to calculate the last time a client
    * attempted to sign into the directory on behalf of a user. Because some users may use clients to access tenant resources
    * rather than signing into your tenant directly, you can use the non-interactive sign-in date to along with
    * lastSignInDateTime to identify inactive users. The timestamp represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is: '2014-01-01T00:00:00Z'. Azure AD maintains
    * non-interactive sign-ins going back to May 2020. For more information about using the value of this property, see
    * Manage inactive user accounts in Azure AD.
    */
  var lastNonInteractiveSignInDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Request identifier of the last non-interactive sign-in performed by this user.
  var lastNonInteractiveSignInRequestId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The last interactive sign-in date and time for a specific user. You can use this field to calculate the last time a
    * user attempted to sign into the directory with an interactive authentication method. This field can be used to build
    * reports, such as inactive users. The timestamp represents date and time information using ISO 8601 format and is always
    * in UTC time. For example, midnight UTC on Jan 1, 2014 is: '2014-01-01T00:00:00Z'. Azure AD maintains interactive
    * sign-ins going back to April 2020. For more information about using the value of this property, see Manage inactive
    * user accounts in Azure AD.
    */
  var lastSignInDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Request identifier of the last interactive sign-in performed by this user.
  var lastSignInRequestId: js.UndefOr[NullableOption[String]] = js.undefined
}
object SignInActivity {
  
  inline def apply(): SignInActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignInActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignInActivity] (val x: Self) extends AnyVal {
    
    inline def setLastNonInteractiveSignInDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastNonInteractiveSignInDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastNonInteractiveSignInDateTimeNull: Self = StObject.set(x, "lastNonInteractiveSignInDateTime", null)
    
    inline def setLastNonInteractiveSignInDateTimeUndefined: Self = StObject.set(x, "lastNonInteractiveSignInDateTime", js.undefined)
    
    inline def setLastNonInteractiveSignInRequestId(value: NullableOption[String]): Self = StObject.set(x, "lastNonInteractiveSignInRequestId", value.asInstanceOf[js.Any])
    
    inline def setLastNonInteractiveSignInRequestIdNull: Self = StObject.set(x, "lastNonInteractiveSignInRequestId", null)
    
    inline def setLastNonInteractiveSignInRequestIdUndefined: Self = StObject.set(x, "lastNonInteractiveSignInRequestId", js.undefined)
    
    inline def setLastSignInDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastSignInDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastSignInDateTimeNull: Self = StObject.set(x, "lastSignInDateTime", null)
    
    inline def setLastSignInDateTimeUndefined: Self = StObject.set(x, "lastSignInDateTime", js.undefined)
    
    inline def setLastSignInRequestId(value: NullableOption[String]): Self = StObject.set(x, "lastSignInRequestId", value.asInstanceOf[js.Any])
    
    inline def setLastSignInRequestIdNull: Self = StObject.set(x, "lastSignInRequestId", null)
    
    inline def setLastSignInRequestIdUndefined: Self = StObject.set(x, "lastSignInRequestId", js.undefined)
  }
}
