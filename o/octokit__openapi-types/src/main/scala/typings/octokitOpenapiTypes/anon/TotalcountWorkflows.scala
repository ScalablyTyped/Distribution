package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalcountWorkflows extends StObject {
  
  var total_count: Double
  
  var workflows: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['workflow'] */ js.Any
  ]
}
object TotalcountWorkflows {
  
  inline def apply(
    total_count: Double,
    workflows: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['workflow'] */ js.Any
    ]
  ): TotalcountWorkflows = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflows = workflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalcountWorkflows]
  }
  
  extension [Self <: TotalcountWorkflows](x: Self) {
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setWorkflows(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['workflow'] */ js.Any
        ]
    ): Self = StObject.set(x, "workflows", value.asInstanceOf[js.Any])
    
    inline def setWorkflowsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['workflow'] */ js.Any)*
    ): Self = StObject.set(x, "workflows", js.Array(value*))
  }
}
