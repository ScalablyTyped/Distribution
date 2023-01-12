package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermsAndConditionsAcceptanceStatus
  extends StObject
     with Entity {
  
  // DateTime when the terms were last accepted by the user.
  var acceptedDateTime: js.UndefOr[String] = js.undefined
  
  // Most recent version number of the T&amp;C accepted by the user.
  var acceptedVersion: js.UndefOr[Double] = js.undefined
  
  // Navigation link to the terms and conditions that are assigned.
  var termsAndConditions: js.UndefOr[NullableOption[TermsAndConditions]] = js.undefined
  
  // Display name of the user whose acceptance the entity represents.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The userPrincipalName of the User that accepted the term.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object TermsAndConditionsAcceptanceStatus {
  
  inline def apply(): TermsAndConditionsAcceptanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsAndConditionsAcceptanceStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TermsAndConditionsAcceptanceStatus] (val x: Self) extends AnyVal {
    
    inline def setAcceptedDateTime(value: String): Self = StObject.set(x, "acceptedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAcceptedDateTimeUndefined: Self = StObject.set(x, "acceptedDateTime", js.undefined)
    
    inline def setAcceptedVersion(value: Double): Self = StObject.set(x, "acceptedVersion", value.asInstanceOf[js.Any])
    
    inline def setAcceptedVersionUndefined: Self = StObject.set(x, "acceptedVersion", js.undefined)
    
    inline def setTermsAndConditions(value: NullableOption[TermsAndConditions]): Self = StObject.set(x, "termsAndConditions", value.asInstanceOf[js.Any])
    
    inline def setTermsAndConditionsNull: Self = StObject.set(x, "termsAndConditions", null)
    
    inline def setTermsAndConditionsUndefined: Self = StObject.set(x, "termsAndConditions", js.undefined)
    
    inline def setUserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    inline def setUserDisplayNameNull: Self = StObject.set(x, "userDisplayName", null)
    
    inline def setUserDisplayNameUndefined: Self = StObject.set(x, "userDisplayName", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
