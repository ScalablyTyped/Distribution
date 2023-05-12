package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyCredentialConfiguration extends StObject {
  
  var maxLifetime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Timestamp when the policy is enforced for all apps created on or after the specified date. For existing applications,
    * the enforcement date would be back dated. To apply to all applications regardless of their creation date, this property
    * would be null. Nullable.
    */
  var restrictForAppsCreatedAfterDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of restriction being applied. Possible values are asymmetricKeyLifetime, unknownFutureValue. Each value of
    * restrictionType can be used only once per policy.
    */
  var restrictionType: js.UndefOr[NullableOption[AppKeyCredentialRestrictionType]] = js.undefined
}
object KeyCredentialConfiguration {
  
  inline def apply(): KeyCredentialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyCredentialConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyCredentialConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMaxLifetime(value: NullableOption[String]): Self = StObject.set(x, "maxLifetime", value.asInstanceOf[js.Any])
    
    inline def setMaxLifetimeNull: Self = StObject.set(x, "maxLifetime", null)
    
    inline def setMaxLifetimeUndefined: Self = StObject.set(x, "maxLifetime", js.undefined)
    
    inline def setRestrictForAppsCreatedAfterDateTime(value: NullableOption[String]): Self = StObject.set(x, "restrictForAppsCreatedAfterDateTime", value.asInstanceOf[js.Any])
    
    inline def setRestrictForAppsCreatedAfterDateTimeNull: Self = StObject.set(x, "restrictForAppsCreatedAfterDateTime", null)
    
    inline def setRestrictForAppsCreatedAfterDateTimeUndefined: Self = StObject.set(x, "restrictForAppsCreatedAfterDateTime", js.undefined)
    
    inline def setRestrictionType(value: NullableOption[AppKeyCredentialRestrictionType]): Self = StObject.set(x, "restrictionType", value.asInstanceOf[js.Any])
    
    inline def setRestrictionTypeNull: Self = StObject.set(x, "restrictionType", null)
    
    inline def setRestrictionTypeUndefined: Self = StObject.set(x, "restrictionType", js.undefined)
  }
}
