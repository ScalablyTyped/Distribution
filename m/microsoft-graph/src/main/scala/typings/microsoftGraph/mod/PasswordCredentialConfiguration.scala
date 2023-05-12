package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordCredentialConfiguration extends StObject {
  
  var maxLifetime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Enforces the policy for an app created on or after the enforcement date. For existing applications, the enforcement
    * date would be back dated. To apply to all applications, enforcement datetime would be null.
    */
  var restrictForAppsCreatedAfterDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of restriction being applied. The possible values are: passwordAddition, passwordLifetime,
    * symmetricKeyAddition, symmetricKeyLifetime,customPasswordAddition, unknownFutureValue. Each value of restrictionType
    * can be used only once per policy.
    */
  var restrictionType: js.UndefOr[NullableOption[AppCredentialRestrictionType]] = js.undefined
}
object PasswordCredentialConfiguration {
  
  inline def apply(): PasswordCredentialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordCredentialConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PasswordCredentialConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMaxLifetime(value: NullableOption[String]): Self = StObject.set(x, "maxLifetime", value.asInstanceOf[js.Any])
    
    inline def setMaxLifetimeNull: Self = StObject.set(x, "maxLifetime", null)
    
    inline def setMaxLifetimeUndefined: Self = StObject.set(x, "maxLifetime", js.undefined)
    
    inline def setRestrictForAppsCreatedAfterDateTime(value: NullableOption[String]): Self = StObject.set(x, "restrictForAppsCreatedAfterDateTime", value.asInstanceOf[js.Any])
    
    inline def setRestrictForAppsCreatedAfterDateTimeNull: Self = StObject.set(x, "restrictForAppsCreatedAfterDateTime", null)
    
    inline def setRestrictForAppsCreatedAfterDateTimeUndefined: Self = StObject.set(x, "restrictForAppsCreatedAfterDateTime", js.undefined)
    
    inline def setRestrictionType(value: NullableOption[AppCredentialRestrictionType]): Self = StObject.set(x, "restrictionType", value.asInstanceOf[js.Any])
    
    inline def setRestrictionTypeNull: Self = StObject.set(x, "restrictionType", null)
    
    inline def setRestrictionTypeUndefined: Self = StObject.set(x, "restrictionType", js.undefined)
  }
}
