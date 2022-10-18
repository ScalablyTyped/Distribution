package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationsTotalcount extends StObject {
  
  var installations: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['installation'] */ js.Any
  ]
  
  var total_count: Double
}
object InstallationsTotalcount {
  
  inline def apply(
    installations: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['installation'] */ js.Any
    ],
    total_count: Double
  ): InstallationsTotalcount = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationsTotalcount]
  }
  
  extension [Self <: InstallationsTotalcount](x: Self) {
    
    inline def setInstallations(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['installation'] */ js.Any
        ]
    ): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    
    inline def setInstallationsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['installation'] */ js.Any)*
    ): Self = StObject.set(x, "installations", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
