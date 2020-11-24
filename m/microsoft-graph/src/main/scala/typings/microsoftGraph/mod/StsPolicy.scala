package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StsPolicy extends PolicyBase {
  
  var appliesTo: js.UndefOr[NullableOption[js.Array[DirectoryObject]]] = js.native
  
  /**
    * A string collection containing a JSON string that defines the rules and settings for a policy. The syntax for the
    * definition differs for each derived policy type. Required.
    */
  var definition: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If set to true, activates this policy. There can be many policies for the same policy type, but only one can be
    * activated as the organization default. Optional, default value is false.
    */
  var isOrganizationDefault: js.UndefOr[NullableOption[Boolean]] = js.native
}
object StsPolicy {
  
  @scala.inline
  def apply(): StsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StsPolicy]
  }
  
  @scala.inline
  implicit class StsPolicyOps[Self <: StsPolicy] (val x: Self) extends AnyVal {
    
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
    def setAppliesToVarargs(value: DirectoryObject*): Self = this.set("appliesTo", js.Array(value :_*))
    
    @scala.inline
    def setAppliesTo(value: NullableOption[js.Array[DirectoryObject]]): Self = this.set("appliesTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliesTo: Self = this.set("appliesTo", js.undefined)
    
    @scala.inline
    def setAppliesToNull: Self = this.set("appliesTo", null)
    
    @scala.inline
    def setDefinitionVarargs(value: String*): Self = this.set("definition", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(value: js.Array[String]): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setIsOrganizationDefault(value: NullableOption[Boolean]): Self = this.set("isOrganizationDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOrganizationDefault: Self = this.set("isOrganizationDefault", js.undefined)
    
    @scala.inline
    def setIsOrganizationDefaultNull: Self = this.set("isOrganizationDefault", null)
  }
}
