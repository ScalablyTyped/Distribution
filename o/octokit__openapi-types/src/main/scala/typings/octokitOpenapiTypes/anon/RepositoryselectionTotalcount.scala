package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryselectionTotalcount extends StObject {
  
  var repositories: js.Array[Allowmergecommit]
  
  var repository_selection: js.UndefOr[String] = js.undefined
  
  var total_count: Double
}
object RepositoryselectionTotalcount {
  
  inline def apply(repositories: js.Array[Allowmergecommit], total_count: Double): RepositoryselectionTotalcount = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryselectionTotalcount]
  }
  
  extension [Self <: RepositoryselectionTotalcount](x: Self) {
    
    inline def setRepositories(value: js.Array[Allowmergecommit]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Allowmergecommit*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setRepository_selection(value: String): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setRepository_selectionUndefined: Self = StObject.set(x, "repository_selection", js.undefined)
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
