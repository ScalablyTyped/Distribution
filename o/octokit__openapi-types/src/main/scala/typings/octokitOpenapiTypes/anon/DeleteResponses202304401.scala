package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses202304401 extends StObject {
  
  /**
    * Deletes a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var delete: Responses202304401
  
  /**
    * Gets information about a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  var get: ParametersPath622
  
  /**
    * Updates a codespace owned by the authenticated user. Currently only the codespace's machine type and recent folders can be modified using this endpoint.
    *
    * If you specify a new machine type it will be applied the next time your codespace is started.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var patch: Responses200Content343
}
object DeleteResponses202304401 {
  
  inline def apply(delete: Responses202304401, get: ParametersPath622, patch: Responses200Content343): DeleteResponses202304401 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses202304401]
  }
  
  extension [Self <: DeleteResponses202304401](x: Self) {
    
    inline def setDelete(value: Responses202304401): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath622): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content343): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
