package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Release extends js.Object {
  
  /** Time the release was created. Output only. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Resource name for the `Release`. `Release` names may be structured `app1/prod/v2` or flat `app1_prod_v2` which affords developers a great deal of flexibility in mapping the name to
    * the style that best fits their existing development practices. For example, a name could refer to an environment, an app, a version, or some combination of three. In the table
    * below, for the project name `projects/foo`, the following relative release paths show how flat and structured names might be chosen to match a desired development / deployment
    * strategy. Use Case | Flat Name | Structured Name -------------|---------------------|---------------- Environments | releases/qa | releases/qa Apps | releases/app1_qa |
    * releases/app1/qa Versions | releases/app1_v2_qa | releases/app1/v2/qa The delimiter between the release name path elements can be almost anything and it should work equally well
    * with the release name list filter, but in many ways the structured paths provide a clearer picture of the relationship between `Release` instances. Format:
    * `projects/{project_id}/releases/{release_id}`
    */
  var name: js.UndefOr[String] = js.native
  
  /** Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist the `Release` to be created. */
  var rulesetName: js.UndefOr[String] = js.native
  
  /** Time the release was updated. Output only. */
  var updateTime: js.UndefOr[String] = js.native
}
object Release {
  
  @scala.inline
  def apply(): Release = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Release]
  }
  
  @scala.inline
  implicit class ReleaseOps[Self <: Release] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRulesetName(value: String): Self = this.set("rulesetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesetName: Self = this.set("rulesetName", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
