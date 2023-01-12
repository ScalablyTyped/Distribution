package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureRolloutPolicy
  extends StObject
     with Entity {
  
  // Nullable. Specifies a list of directoryObjects that feature is enabled for.
  var appliesTo: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.undefined
  
  // A description for this feature rollout policy.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name for this feature rollout policy.
  var displayName: js.UndefOr[String] = js.undefined
  
  // Possible values are: passthroughAuthentication, seamlessSso, passwordHashSync, emailAsAlternateId, unknownFutureValue.
  var feature: js.UndefOr[StagedFeatureName] = js.undefined
  
  // Indicates whether this feature rollout policy should be applied to the entire organization.
  var isAppliedToOrganization: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether the feature rollout is enabled.
  var isEnabled: js.UndefOr[Boolean] = js.undefined
}
object FeatureRolloutPolicy {
  
  inline def apply(): FeatureRolloutPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureRolloutPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureRolloutPolicy] (val x: Self) extends AnyVal {
    
    inline def setAppliesTo(value: NullableOption[js.Array[DirectoryObject]]): Self = StObject.set(x, "appliesTo", value.asInstanceOf[js.Any])
    
    inline def setAppliesToNull: Self = StObject.set(x, "appliesTo", null)
    
    inline def setAppliesToUndefined: Self = StObject.set(x, "appliesTo", js.undefined)
    
    inline def setAppliesToVarargs(value: DirectoryObject*): Self = StObject.set(x, "appliesTo", js.Array(value*))
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFeature(value: StagedFeatureName): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setIsAppliedToOrganization(value: Boolean): Self = StObject.set(x, "isAppliedToOrganization", value.asInstanceOf[js.Any])
    
    inline def setIsAppliedToOrganizationUndefined: Self = StObject.set(x, "isAppliedToOrganization", js.undefined)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
  }
}
