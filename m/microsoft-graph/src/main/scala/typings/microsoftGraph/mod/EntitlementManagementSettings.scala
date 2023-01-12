package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitlementManagementSettings
  extends StObject
     with Entity {
  
  /**
    * If externalUserLifecycleAction is blockSignInAndDelete, the duration, typically a number of days, after an external
    * user is blocked from sign in before their account is deleted.
    */
  var durationUntilExternalUserDeletedAfterBlocked: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Automatic action that the service should take when an external user's last access package assignment is removed. The
    * possible values are: none, blockSignIn, blockSignInAndDelete, unknownFutureValue.
    */
  var externalUserLifecycleAction: js.UndefOr[NullableOption[AccessPackageExternalUserLifecycleAction]] = js.undefined
}
object EntitlementManagementSettings {
  
  inline def apply(): EntitlementManagementSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitlementManagementSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntitlementManagementSettings] (val x: Self) extends AnyVal {
    
    inline def setDurationUntilExternalUserDeletedAfterBlocked(value: NullableOption[String]): Self = StObject.set(x, "durationUntilExternalUserDeletedAfterBlocked", value.asInstanceOf[js.Any])
    
    inline def setDurationUntilExternalUserDeletedAfterBlockedNull: Self = StObject.set(x, "durationUntilExternalUserDeletedAfterBlocked", null)
    
    inline def setDurationUntilExternalUserDeletedAfterBlockedUndefined: Self = StObject.set(x, "durationUntilExternalUserDeletedAfterBlocked", js.undefined)
    
    inline def setExternalUserLifecycleAction(value: NullableOption[AccessPackageExternalUserLifecycleAction]): Self = StObject.set(x, "externalUserLifecycleAction", value.asInstanceOf[js.Any])
    
    inline def setExternalUserLifecycleActionNull: Self = StObject.set(x, "externalUserLifecycleAction", null)
    
    inline def setExternalUserLifecycleActionUndefined: Self = StObject.set(x, "externalUserLifecycleAction", js.undefined)
  }
}
