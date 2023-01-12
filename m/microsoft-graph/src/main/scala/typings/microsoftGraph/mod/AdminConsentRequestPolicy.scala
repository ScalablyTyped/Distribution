package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminConsentRequestPolicy
  extends StObject
     with Entity {
  
  // Specifies whether the admin consent request feature is enabled or disabled. Required.
  var isEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Specifies whether reviewers will receive notifications. Required.
  var notifyReviewers: js.UndefOr[Boolean] = js.undefined
  
  // Specifies whether reviewers will receive reminder emails. Required.
  var remindersEnabled: js.UndefOr[Boolean] = js.undefined
  
  // Specifies the duration the request is active before it automatically expires if no decision is applied.
  var requestDurationInDays: js.UndefOr[Double] = js.undefined
  
  // The list of reviewers for the admin consent. Required.
  var reviewers: js.UndefOr[NullableOption[js.Array[AccessReviewReviewerScope]]] = js.undefined
  
  // Specifies the version of this policy. When the policy is updated, this version is updated. Read-only.
  var version: js.UndefOr[Double] = js.undefined
}
object AdminConsentRequestPolicy {
  
  inline def apply(): AdminConsentRequestPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminConsentRequestPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminConsentRequestPolicy] (val x: Self) extends AnyVal {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
    
    inline def setNotifyReviewers(value: Boolean): Self = StObject.set(x, "notifyReviewers", value.asInstanceOf[js.Any])
    
    inline def setNotifyReviewersUndefined: Self = StObject.set(x, "notifyReviewers", js.undefined)
    
    inline def setRemindersEnabled(value: Boolean): Self = StObject.set(x, "remindersEnabled", value.asInstanceOf[js.Any])
    
    inline def setRemindersEnabledUndefined: Self = StObject.set(x, "remindersEnabled", js.undefined)
    
    inline def setRequestDurationInDays(value: Double): Self = StObject.set(x, "requestDurationInDays", value.asInstanceOf[js.Any])
    
    inline def setRequestDurationInDaysUndefined: Self = StObject.set(x, "requestDurationInDays", js.undefined)
    
    inline def setReviewers(value: NullableOption[js.Array[AccessReviewReviewerScope]]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    inline def setReviewersNull: Self = StObject.set(x, "reviewers", null)
    
    inline def setReviewersUndefined: Self = StObject.set(x, "reviewers", js.undefined)
    
    inline def setReviewersVarargs(value: AccessReviewReviewerScope*): Self = StObject.set(x, "reviewers", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
