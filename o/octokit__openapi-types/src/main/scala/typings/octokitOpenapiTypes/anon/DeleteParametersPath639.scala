package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath639 extends StObject {
  
  /** Unlocks a repository. You can lock repositories when you [start a user migration](https://docs.github.com/rest/reference/migrations#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://docs.github.com/rest/reference/repos#delete-a-repository) if you no longer need the source data. Returns a status of `404 Not Found` if the repository is not locked. */
  var delete: ParametersPath639
}
object DeleteParametersPath639 {
  
  inline def apply(delete: ParametersPath639): DeleteParametersPath639 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath639]
  }
  
  extension [Self <: DeleteParametersPath639](x: Self) {
    
    inline def setDelete(value: ParametersPath639): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
