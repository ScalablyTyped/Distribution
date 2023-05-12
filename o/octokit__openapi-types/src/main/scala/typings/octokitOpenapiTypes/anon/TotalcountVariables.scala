package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalcountVariables extends StObject {
  
  var total_count: Double
  
  var variables: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-variable'] */ js.Any
  ]
}
object TotalcountVariables {
  
  inline def apply(
    total_count: Double,
    variables: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-variable'] */ js.Any
    ]
  ): TotalcountVariables = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalcountVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TotalcountVariables] (val x: Self) extends AnyVal {
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setVariables(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-variable'] */ js.Any
        ]
    ): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['actions-variable'] */ js.Any)*
    ): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
