package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGetPatchPut extends StObject {
  
  /** **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change. */
  var delete: ParametersPathScimuseridResponses
  
  /** **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change. */
  var get: ParametersPathScimuserid
  
  /**
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * Allows you to change a provisioned user's individual attributes. To change a user's values, you must provide a specific `Operations` JSON format that contains at least one of the `add`, `remove`, or `replace` operations. For examples and more information on the SCIM operations format, see the [SCIM specification](https://tools.ietf.org/html/rfc7644#section-3.5.2).
    *
    * **Note:** Complicated SCIM `path` selectors that include filters are not supported. For example, a `path` selector defined as `"path": "emails[type eq \"work\"]"` will not work.
    *
    * **Warning:** If you set `active:false` using the `replace` operation (as shown in the JSON example below), it removes the user from the enterprise, deletes the external identity, and deletes the associated `:scim_user_id`.
    *
    * ```
    * {
    *   "Operations":[{
    *     "op":"replace",
    *     "value":{
    *       "active":false
    *     }
    *   }]
    * }
    * ```
    */
  var patch: RequestBodyContentApplicationjsonSchemas
  
  /**
    * **Note:** The SCIM API endpoints for enterprise accounts are currently in beta and are subject to change.
    *
    * Replaces an existing provisioned user's information. You must provide all the information required for the user as if you were provisioning them for the first time. Any existing user information that you don't provide will be removed. If you want to only update a specific attribute, use the [Update an attribute for a SCIM user](#update-an-attribute-for-an-enterprise-scim-user) endpoint instead.
    *
    * You must at least provide the required values for the user: `userName`, `name`, and `emails`.
    *
    * **Warning:** Setting `active: false` removes the user from the enterprise, deletes the external identity, and deletes the associated `{scim_user_id}`.
    */
  var put: Responses200Content353
}
object DeleteGetPatchPut {
  
  inline def apply(
    delete: ParametersPathScimuseridResponses,
    get: ParametersPathScimuserid,
    patch: RequestBodyContentApplicationjsonSchemas,
    put: Responses200Content353
  ): DeleteGetPatchPut = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGetPatchPut]
  }
  
  extension [Self <: DeleteGetPatchPut](x: Self) {
    
    inline def setDelete(value: ParametersPathScimuseridResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathScimuserid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonSchemas): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content353): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
