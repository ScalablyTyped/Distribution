package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathNameOwner extends StObject {
  
  /**
    * Remove a custom label from a self-hosted runner for a repository
    * @description Remove a custom label from a self-hosted runner configured
    * in a repository. Returns the remaining labels from the runner.
    *
    * This endpoint returns a `404 Not Found` status if the custom label is not
    * present on the runner.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  var delete: ParametersPathNameOwner
}
object DeleteParametersPathNameOwner {
  
  inline def apply(delete: ParametersPathNameOwner): DeleteParametersPathNameOwner = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathNameOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathNameOwner] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathNameOwner): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
