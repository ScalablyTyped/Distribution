package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalPolicy extends StObject {
  
  var assignments: js.UndefOr[js.Array[SasPortalAssignment]] = js.undefined
  
  /**
    * The [etag] is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems
    * make use of the [etag] in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An [etag] is returned in the response to [GetPolicy], and systems
    * are expected to put that etag in the request to [SetPolicy] to ensure that their change will be applied to the same version of the policy. If no [etag] is provided in the call to
    * [SetPolicy], then the existing policy is overwritten blindly.
    */
  var etag: js.UndefOr[String] = js.undefined
}
object SasPortalPolicy {
  
  @scala.inline
  def apply(): SasPortalPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalPolicy]
  }
  
  @scala.inline
  implicit class SasPortalPolicyMutableBuilder[Self <: SasPortalPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignments(value: js.Array[SasPortalAssignment]): Self = StObject.set(x, "assignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentsUndefined: Self = StObject.set(x, "assignments", js.undefined)
    
    @scala.inline
    def setAssignmentsVarargs(value: SasPortalAssignment*): Self = StObject.set(x, "assignments", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
