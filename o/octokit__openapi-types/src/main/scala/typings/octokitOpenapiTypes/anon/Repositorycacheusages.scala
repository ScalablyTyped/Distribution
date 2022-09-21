package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repositorycacheusages extends StObject {
  
  var repository_cache_usages: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-cache-usage-by-repository'] */ js.Any
  ]
  
  var total_count: Double
}
object Repositorycacheusages {
  
  inline def apply(
    repository_cache_usages: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-cache-usage-by-repository'] */ js.Any
    ],
    total_count: Double
  ): Repositorycacheusages = {
    val __obj = js.Dynamic.literal(repository_cache_usages = repository_cache_usages.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repositorycacheusages]
  }
  
  extension [Self <: Repositorycacheusages](x: Self) {
    
    inline def setRepository_cache_usages(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-cache-usage-by-repository'] */ js.Any
        ]
    ): Self = StObject.set(x, "repository_cache_usages", value.asInstanceOf[js.Any])
    
    inline def setRepository_cache_usagesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-cache-usage-by-repository'] */ js.Any)*
    ): Self = StObject.set(x, "repository_cache_usages", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
