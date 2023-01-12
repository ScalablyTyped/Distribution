package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskyUser
  extends StObject
     with Entity {
  
  // The activity related to user risk level change
  var history: js.UndefOr[NullableOption[js.Array[RiskyUserHistoryItem]]] = js.undefined
  
  // Indicates whether the user is deleted. Possible values are: true, false.
  var isDeleted: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether a user's risky state is being processed by the backend.
  var isProcessing: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Details of the detected risk. Possible values are: none, adminGeneratedTemporaryPassword,
    * userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe,
    * userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden,
    * adminConfirmedUserCompromised, unknownFutureValue.
    */
  var riskDetail: js.UndefOr[NullableOption[RiskDetail]] = js.undefined
  
  /**
    * The date and time that the risky user was last updated. The DateTimeOffset type represents date and time information
    * using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var riskLastUpdatedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Level of the detected risky user. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
  var riskLevel: js.UndefOr[NullableOption[RiskLevel]] = js.undefined
  
  /**
    * State of the user's risk. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk,
    * confirmedCompromised, unknownFutureValue.
    */
  var riskState: js.UndefOr[NullableOption[RiskState]] = js.undefined
  
  // Risky user display name.
  var userDisplayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Risky user principal name.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object RiskyUser {
  
  inline def apply(): RiskyUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskyUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskyUser] (val x: Self) extends AnyVal {
    
    inline def setHistory(value: NullableOption[js.Array[RiskyUserHistoryItem]]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryNull: Self = StObject.set(x, "history", null)
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: RiskyUserHistoryItem*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setIsDeleted(value: NullableOption[Boolean]): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    inline def setIsDeletedNull: Self = StObject.set(x, "isDeleted", null)
    
    inline def setIsDeletedUndefined: Self = StObject.set(x, "isDeleted", js.undefined)
    
    inline def setIsProcessing(value: NullableOption[Boolean]): Self = StObject.set(x, "isProcessing", value.asInstanceOf[js.Any])
    
    inline def setIsProcessingNull: Self = StObject.set(x, "isProcessing", null)
    
    inline def setIsProcessingUndefined: Self = StObject.set(x, "isProcessing", js.undefined)
    
    inline def setRiskDetail(value: NullableOption[RiskDetail]): Self = StObject.set(x, "riskDetail", value.asInstanceOf[js.Any])
    
    inline def setRiskDetailNull: Self = StObject.set(x, "riskDetail", null)
    
    inline def setRiskDetailUndefined: Self = StObject.set(x, "riskDetail", js.undefined)
    
    inline def setRiskLastUpdatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "riskLastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setRiskLastUpdatedDateTimeNull: Self = StObject.set(x, "riskLastUpdatedDateTime", null)
    
    inline def setRiskLastUpdatedDateTimeUndefined: Self = StObject.set(x, "riskLastUpdatedDateTime", js.undefined)
    
    inline def setRiskLevel(value: NullableOption[RiskLevel]): Self = StObject.set(x, "riskLevel", value.asInstanceOf[js.Any])
    
    inline def setRiskLevelNull: Self = StObject.set(x, "riskLevel", null)
    
    inline def setRiskLevelUndefined: Self = StObject.set(x, "riskLevel", js.undefined)
    
    inline def setRiskState(value: NullableOption[RiskState]): Self = StObject.set(x, "riskState", value.asInstanceOf[js.Any])
    
    inline def setRiskStateNull: Self = StObject.set(x, "riskState", null)
    
    inline def setRiskStateUndefined: Self = StObject.set(x, "riskState", js.undefined)
    
    inline def setUserDisplayName(value: NullableOption[String]): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    inline def setUserDisplayNameNull: Self = StObject.set(x, "userDisplayName", null)
    
    inline def setUserDisplayNameUndefined: Self = StObject.set(x, "userDisplayName", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
