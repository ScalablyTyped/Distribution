package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoriesRepositoryselectionTotalcount extends StObject {
  
  var repositories: js.Array[Allowupdatebranch]
  
  var repository_selection: js.UndefOr[String] = js.undefined
  
  var total_count: Double
}
object RepositoriesRepositoryselectionTotalcount {
  
  inline def apply(repositories: js.Array[Allowupdatebranch], total_count: Double): RepositoriesRepositoryselectionTotalcount = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoriesRepositoryselectionTotalcount]
  }
  
  extension [Self <: RepositoriesRepositoryselectionTotalcount](x: Self) {
    
    inline def setRepositories(value: js.Array[Allowupdatebranch]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Allowupdatebranch*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setRepository_selection(value: String): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setRepository_selectionUndefined: Self = StObject.set(x, "repository_selection", js.undefined)
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
