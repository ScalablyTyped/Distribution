package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredworkflowsTotalcount extends StObject {
  
  var required_workflows: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repo-required-workflow'] */ js.Any
  ]
  
  var total_count: Double
}
object RequiredworkflowsTotalcount {
  
  inline def apply(
    required_workflows: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repo-required-workflow'] */ js.Any
    ],
    total_count: Double
  ): RequiredworkflowsTotalcount = {
    val __obj = js.Dynamic.literal(required_workflows = required_workflows.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredworkflowsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredworkflowsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setRequired_workflows(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repo-required-workflow'] */ js.Any
        ]
    ): Self = StObject.set(x, "required_workflows", value.asInstanceOf[js.Any])
    
    inline def setRequired_workflowsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repo-required-workflow'] */ js.Any)*
    ): Self = StObject.set(x, "required_workflows", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
