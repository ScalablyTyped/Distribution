package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `461` extends StObject {
  
  var secrets: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repo-codespaces-secret'] */ js.Any
  ]
  
  var total_count: Double
}
object `461` {
  
  inline def apply(
    secrets: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repo-codespaces-secret'] */ js.Any
    ],
    total_count: Double
  ): `461` = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`461`]
  }
  
  extension [Self <: `461`](x: Self) {
    
    inline def setSecrets(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repo-codespaces-secret'] */ js.Any
        ]
    ): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repo-codespaces-secret'] */ js.Any)*
    ): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
