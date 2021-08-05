package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowrebasemerge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsListReposAccessibleToInstallationResponseData extends StObject {
  
  var repositories: js.Array[Allowrebasemerge]
  
  var total_count: Double
}
object AppsListReposAccessibleToInstallationResponseData {
  
  inline def apply(repositories: js.Array[Allowrebasemerge], total_count: Double): AppsListReposAccessibleToInstallationResponseData = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsListReposAccessibleToInstallationResponseData]
  }
  
  extension [Self <: AppsListReposAccessibleToInstallationResponseData](x: Self) {
    
    inline def setRepositories(value: js.Array[Allowrebasemerge]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Allowrebasemerge*): Self = StObject.set(x, "repositories", js.Array(value :_*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
