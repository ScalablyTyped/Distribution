package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoriesArray extends StObject {
  
  var repositories: js.Array[Allowupdatebranch]
  
  var total_count: Double
}
object RepositoriesArray {
  
  inline def apply(repositories: js.Array[Allowupdatebranch], total_count: Double): RepositoriesArray = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoriesArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepositoriesArray] (val x: Self) extends AnyVal {
    
    inline def setRepositories(value: js.Array[Allowupdatebranch]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Allowupdatebranch*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
