package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoriesTotalcount extends StObject {
  
  var repositories: js.Array[Blobsurl]
  
  var total_count: Double
}
object RepositoriesTotalcount {
  
  inline def apply(repositories: js.Array[Blobsurl], total_count: Double): RepositoriesTotalcount = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoriesTotalcount]
  }
  
  extension [Self <: RepositoriesTotalcount](x: Self) {
    
    inline def setRepositories(value: js.Array[Blobsurl]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Blobsurl*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
