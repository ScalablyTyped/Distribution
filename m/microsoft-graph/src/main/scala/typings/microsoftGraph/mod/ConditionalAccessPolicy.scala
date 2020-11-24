package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessPolicy extends Entity {
  
  // Specifies the rules that must be met for the policy to apply. Required.
  var conditions: js.UndefOr[ConditionalAccessConditionSet] = js.native
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Readonly.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies a display name for the conditionalAccessPolicy object.
  var displayName: js.UndefOr[String] = js.native
  
  // Specifies the grant controls that must be fulfilled to pass the policy.
  var grantControls: js.UndefOr[NullableOption[ConditionalAccessGrantControls]] = js.native
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Readonly.
    */
  var modifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies the session controls that are enforced after sign-in.
  var sessionControls: js.UndefOr[NullableOption[ConditionalAccessSessionControls]] = js.native
  
  /**
    * Specifies the state of the conditionalAccessPolicy object. Possible values are: enabled, disabled,
    * enabledForReportingButNotEnforced. Required.
    */
  var state: js.UndefOr[ConditionalAccessPolicyState] = js.native
}
object ConditionalAccessPolicy {
  
  @scala.inline
  def apply(): ConditionalAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessPolicy]
  }
  
  @scala.inline
  implicit class ConditionalAccessPolicyOps[Self <: ConditionalAccessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConditions(value: ConditionalAccessConditionSet): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTimeNull: Self = this.set("createdDateTime", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setGrantControls(value: NullableOption[ConditionalAccessGrantControls]): Self = this.set("grantControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantControls: Self = this.set("grantControls", js.undefined)
    
    @scala.inline
    def setGrantControlsNull: Self = this.set("grantControls", null)
    
    @scala.inline
    def setModifiedDateTime(value: NullableOption[String]): Self = this.set("modifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDateTime: Self = this.set("modifiedDateTime", js.undefined)
    
    @scala.inline
    def setModifiedDateTimeNull: Self = this.set("modifiedDateTime", null)
    
    @scala.inline
    def setSessionControls(value: NullableOption[ConditionalAccessSessionControls]): Self = this.set("sessionControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionControls: Self = this.set("sessionControls", js.undefined)
    
    @scala.inline
    def setSessionControlsNull: Self = this.set("sessionControls", null)
    
    @scala.inline
    def setState(value: ConditionalAccessPolicyState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
