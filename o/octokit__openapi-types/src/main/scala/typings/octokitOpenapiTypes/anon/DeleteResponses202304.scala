package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses202304 extends StObject {
  
  /**
    * Deletes a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var delete: Responses202304
  
  /**
    * Gets information about a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  var get: ParametersPath356
  
  /**
    * Updates a codespace owned by the authenticated user. Currently only the codespace's machine type and recent folders can be modified using this endpoint.
    *
    * If you specify a new machine type it will be applied the next time your codespace is started.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  var patch: RequestBodyContentApplicationjsonRecentfolders
}
object DeleteResponses202304 {
  
  inline def apply(
    delete: Responses202304,
    get: ParametersPath356,
    patch: RequestBodyContentApplicationjsonRecentfolders
  ): DeleteResponses202304 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses202304]
  }
  
  extension [Self <: DeleteResponses202304](x: Self) {
    
    inline def setDelete(value: Responses202304): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath356): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonRecentfolders): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
