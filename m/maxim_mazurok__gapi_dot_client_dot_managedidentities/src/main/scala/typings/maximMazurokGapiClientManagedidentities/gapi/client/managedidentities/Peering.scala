package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Peering extends StObject {
  
  /**
    * Required. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that
    * CIDR subnets do not overlap between networks, else peering creation will fail.
    */
  var authorizedNetwork: js.UndefOr[String] = js.undefined
  
  /** Output only. The time the instance was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form:
    * `projects/{project_id}/locations/global/domains/{domain_name}`
    */
  var domainResource: js.UndefOr[String] = js.undefined
  
  /** Optional. Resource labels to represent user-provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Output only. Unique name of the peering in this scope including projects and location using the form: `projects/{project_id}/locations/global/peerings/{peering_id}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The current state of this Peering. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Additional information about the current status of this peering, if available. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** Output only. Last update time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Peering {
  
  inline def apply(): Peering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Peering]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Peering] (val x: Self) extends AnyVal {
    
    inline def setAuthorizedNetwork(value: String): Self = StObject.set(x, "authorizedNetwork", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedNetworkUndefined: Self = StObject.set(x, "authorizedNetwork", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDomainResource(value: String): Self = StObject.set(x, "domainResource", value.asInstanceOf[js.Any])
    
    inline def setDomainResourceUndefined: Self = StObject.set(x, "domainResource", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
