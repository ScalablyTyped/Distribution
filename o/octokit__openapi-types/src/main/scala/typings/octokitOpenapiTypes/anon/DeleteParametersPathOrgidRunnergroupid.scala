package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgidRunnergroupid extends StObject {
  
  /**
    * Removes an organization from the list of selected organizations that can access a self-hosted runner group. The runner group must have `visibility` set to `selected`. For more information, see "[Create a self-hosted runner group for an enterprise](#create-a-self-hosted-runner-group-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var delete: ParametersPathOrgidRunnergroupid
  
  /**
    * Adds an organization to the list of selected organizations that can access a self-hosted runner group. The runner group must have `visibility` set to `selected`. For more information, see "[Create a self-hosted runner group for an enterprise](#create-a-self-hosted-runner-group-for-an-enterprise)."
    *
    * You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.
    */
  var put: ParametersPathOrgidRunnergroupid
}
object DeleteParametersPathOrgidRunnergroupid {
  
  inline def apply(delete: ParametersPathOrgidRunnergroupid, put: ParametersPathOrgidRunnergroupid): DeleteParametersPathOrgidRunnergroupid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgidRunnergroupid]
  }
  
  extension [Self <: DeleteParametersPathOrgidRunnergroupid](x: Self) {
    
    inline def setDelete(value: ParametersPathOrgidRunnergroupid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPathOrgidRunnergroupid): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
