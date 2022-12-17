package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoriesArrayTotalcountNumber extends StObject {
  
  var repositories: js.Array[Branchesurl]
  
  var total_count: Double
}
object RepositoriesArrayTotalcountNumber {
  
  inline def apply(repositories: js.Array[Branchesurl], total_count: Double): RepositoriesArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoriesArrayTotalcountNumber]
  }
  
  extension [Self <: RepositoriesArrayTotalcountNumber](x: Self) {
    
    inline def setRepositories(value: js.Array[Branchesurl]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Branchesurl*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
