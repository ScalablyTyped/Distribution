package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyName extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * For Cloud IAM: The location of the Policy. Must be empty or "global" for Policies owned by global IAM. Must name a region from prodspec/cloud-iam-cloudspec for Regional IAM
    * Policies, see go/iam-faq#where-is-iam-currently-deployed. For Local IAM: This field should be set to "local".
    */
  var region: js.UndefOr[String] = js.undefined
  
  /** Valid values for type might be 'gce', 'gcs', 'project', 'account' etc. */
  var `type`: js.UndefOr[String] = js.undefined
}
object PolicyName {
  
  @scala.inline
  def apply(): PolicyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyName]
  }
  
  @scala.inline
  implicit class PolicyNameMutableBuilder[Self <: PolicyName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
