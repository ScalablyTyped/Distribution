package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPatchPut extends StObject {
  
  /** **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change. */
  var delete: Parameters351Responses
  
  /** **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change. */
  var get: ParametersPathScimgroupid
  
  /**
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * Allows you to change a provisioned group’s individual attributes. To change a group’s values, you must provide a specific Operations JSON format that contains at least one of the add, remove, or replace operations. For examples and more information on the SCIM operations format, see the [SCIM specification](https://tools.ietf.org/html/rfc7644#section-3.5.2).
    */
  var patch: RequestBodyContentApplicationjsonOperations
  
  /**
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * Replaces an existing provisioned group’s information. You must provide all the information required for the group as if you were provisioning it for the first time. Any existing group information that you don't provide will be removed, including group membership. If you want to only update a specific attribute, use the [Update an attribute for a SCIM enterprise group](#update-an-attribute-for-a-scim-enterprise-group) endpoint instead.
    */
  var put: Parameters351
}
object GetPatchPut {
  
  inline def apply(
    delete: Parameters351Responses,
    get: ParametersPathScimgroupid,
    patch: RequestBodyContentApplicationjsonOperations,
    put: Parameters351
  ): GetPatchPut = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchPut]
  }
  
  extension [Self <: GetPatchPut](x: Self) {
    
    inline def setDelete(value: Parameters351Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathScimgroupid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonOperations): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters351): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
