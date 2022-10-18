package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactsTotalcount extends StObject {
  
  var artifacts: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['artifact'] */ js.Any
  ]
  
  var total_count: Double
}
object ArtifactsTotalcount {
  
  inline def apply(
    artifacts: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['artifact'] */ js.Any
    ],
    total_count: Double
  ): ArtifactsTotalcount = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactsTotalcount]
  }
  
  extension [Self <: ArtifactsTotalcount](x: Self) {
    
    inline def setArtifacts(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['artifact'] */ js.Any
        ]
    ): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['artifact'] */ js.Any)*
    ): Self = StObject.set(x, "artifacts", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
