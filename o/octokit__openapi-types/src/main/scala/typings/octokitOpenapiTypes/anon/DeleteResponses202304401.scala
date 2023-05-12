package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses202304401 extends StObject {
  
  /**
    * Delete a codespace for the authenticated user
    * @description Deletes a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var delete: Responses202304401
  
  /**
    * Get a codespace for the authenticated user
    * @description Gets information about a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  var get: ParametersPath378
  
  /**
    * Update a codespace for the authenticated user
    * @description Updates a codespace owned by the authenticated user. Currently only the codespace's machine type and recent folders can be modified using this endpoint.
    *
    * If you specify a new machine type it will be applied the next time your codespace is started.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var patch: Responses200Content89
}
object DeleteResponses202304401 {
  
  inline def apply(delete: Responses202304401, get: ParametersPath378, patch: Responses200Content89): DeleteResponses202304401 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses202304401]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses202304401] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses202304401): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath378): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content89): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
