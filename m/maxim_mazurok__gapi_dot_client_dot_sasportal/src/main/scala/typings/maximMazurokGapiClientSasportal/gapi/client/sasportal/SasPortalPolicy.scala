package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SasPortalPolicy extends js.Object {
  
  var assignments: js.UndefOr[js.Array[SasPortalAssignment]] = js.native
  
  /**
    * The [etag] is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems
    * make use of the [etag] in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An [etag] is returned in the response to [GetPolicy], and systems
    * are expected to put that etag in the request to [SetPolicy] to ensure that their change will be applied to the same version of the policy. If no [etag] is provided in the call to
    * [SetPolicy], then the existing policy is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.native
}
object SasPortalPolicy {
  
  @scala.inline
  def apply(): SasPortalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalPolicy]
  }
  
  @scala.inline
  implicit class SasPortalPolicyOps[Self <: SasPortalPolicy] (val x: Self) extends AnyVal {
    
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
    def setAssignmentsVarargs(value: SasPortalAssignment*): Self = this.set("assignments", js.Array(value :_*))
    
    @scala.inline
    def setAssignments(value: js.Array[SasPortalAssignment]): Self = this.set("assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignments: Self = this.set("assignments", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
  }
}
