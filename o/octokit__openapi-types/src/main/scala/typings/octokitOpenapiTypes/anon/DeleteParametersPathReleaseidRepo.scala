package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathReleaseidRepo extends StObject {
  
  /**
    * **Note:** You can also specify a repository by `repository_id` using the route `DELETE delete /repositories/:repository_id/releases/:release_id/reactions/:reaction_id`.
    *
    * Delete a reaction to a [release](https://docs.github.com/rest/reference/repos#releases).
    */
  var delete: ParametersPathReleaseidRepo
}
object DeleteParametersPathReleaseidRepo {
  
  inline def apply(delete: ParametersPathReleaseidRepo): DeleteParametersPathReleaseidRepo = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathReleaseidRepo]
  }
  
  extension [Self <: DeleteParametersPathReleaseidRepo](x: Self) {
    
    inline def setDelete(value: ParametersPathReleaseidRepo): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
