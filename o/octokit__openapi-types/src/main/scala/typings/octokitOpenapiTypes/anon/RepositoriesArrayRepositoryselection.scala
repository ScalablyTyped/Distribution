package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoriesArrayRepositoryselection extends StObject {
  
  var repositories: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any
  ]
  
  var repository_selection: js.UndefOr[String] = js.undefined
  
  var total_count: Double
}
object RepositoriesArrayRepositoryselection {
  
  inline def apply(
    repositories: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any
    ],
    total_count: Double
  ): RepositoriesArrayRepositoryselection = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoriesArrayRepositoryselection]
  }
  
  extension [Self <: RepositoriesArrayRepositoryselection](x: Self) {
    
    inline def setRepositories(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any
        ]
    ): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any)*
    ): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setRepository_selection(value: String): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    inline def setRepository_selectionUndefined: Self = StObject.set(x, "repository_selection", js.undefined)
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
