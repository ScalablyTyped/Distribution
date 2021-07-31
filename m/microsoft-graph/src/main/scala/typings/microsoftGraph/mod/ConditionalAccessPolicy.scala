package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessPolicy
  extends StObject
     with Entity {
  
  // Specifies the rules that must be met for the policy to apply. Required.
  var conditions: js.UndefOr[ConditionalAccessConditionSet] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Readonly.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies a display name for the conditionalAccessPolicy object.
  var displayName: js.UndefOr[String] = js.undefined
  
  // Specifies the grant controls that must be fulfilled to pass the policy.
  var grantControls: js.UndefOr[NullableOption[ConditionalAccessGrantControls]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Readonly.
    */
  var modifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Specifies the session controls that are enforced after sign-in.
  var sessionControls: js.UndefOr[NullableOption[ConditionalAccessSessionControls]] = js.undefined
  
  /**
    * Specifies the state of the conditionalAccessPolicy object. Possible values are: enabled, disabled,
    * enabledForReportingButNotEnforced. Required.
    */
  var state: js.UndefOr[ConditionalAccessPolicyState] = js.undefined
}
object ConditionalAccessPolicy {
  
  @scala.inline
  def apply(): ConditionalAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessPolicy]
  }
  
  @scala.inline
  implicit class ConditionalAccessPolicyMutableBuilder[Self <: ConditionalAccessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: ConditionalAccessConditionSet): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setGrantControls(value: NullableOption[ConditionalAccessGrantControls]): Self = StObject.set(x, "grantControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantControlsNull: Self = StObject.set(x, "grantControls", null)
    
    @scala.inline
    def setGrantControlsUndefined: Self = StObject.set(x, "grantControls", js.undefined)
    
    @scala.inline
    def setModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDateTimeNull: Self = StObject.set(x, "modifiedDateTime", null)
    
    @scala.inline
    def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
    
    @scala.inline
    def setSessionControls(value: NullableOption[ConditionalAccessSessionControls]): Self = StObject.set(x, "sessionControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionControlsNull: Self = StObject.set(x, "sessionControls", null)
    
    @scala.inline
    def setSessionControlsUndefined: Self = StObject.set(x, "sessionControls", js.undefined)
    
    @scala.inline
    def setState(value: ConditionalAccessPolicyState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
