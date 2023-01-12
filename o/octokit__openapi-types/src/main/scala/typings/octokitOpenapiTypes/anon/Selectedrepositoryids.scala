package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectedrepositoryids extends StObject {
  
  /** @description An array of repository ids for which a codespace can access the secret. You can manage the list of selected repositories using the [List selected repositories for a user secret](https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-a-user-secret), [Add a selected repository to a user secret](https://docs.github.com/rest/reference/codespaces#add-a-selected-repository-to-a-user-secret), and [Remove a selected repository from a user secret](https://docs.github.com/rest/reference/codespaces#remove-a-selected-repository-from-a-user-secret) endpoints. */
  var selected_repository_ids: js.Array[Double]
}
object Selectedrepositoryids {
  
  inline def apply(selected_repository_ids: js.Array[Double]): Selectedrepositoryids = {
    val __obj = js.Dynamic.literal(selected_repository_ids = selected_repository_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setSelected_repository_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_repository_ids", value.asInstanceOf[js.Any])
    
    inline def setSelected_repository_idsVarargs(value: Double*): Self = StObject.set(x, "selected_repository_ids", js.Array(value*))
  }
}
