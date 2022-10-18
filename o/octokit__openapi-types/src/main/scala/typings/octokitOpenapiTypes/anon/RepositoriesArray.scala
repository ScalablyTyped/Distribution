package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoriesArray extends StObject {
  
  var repositories: js.Array[Allowmergecommit]
  
  var total_count: Double
}
object RepositoriesArray {
  
  inline def apply(repositories: js.Array[Allowmergecommit], total_count: Double): RepositoriesArray = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoriesArray]
  }
  
  extension [Self <: RepositoriesArray](x: Self) {
    
    inline def setRepositories(value: js.Array[Allowmergecommit]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Allowmergecommit*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
