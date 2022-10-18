package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunnergroupsArray extends StObject {
  
  var runner_groups: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-groups-enterprise'] */ js.Any
  ]
  
  var total_count: Double
}
object RunnergroupsArray {
  
  inline def apply(
    runner_groups: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-groups-enterprise'] */ js.Any
    ],
    total_count: Double
  ): RunnergroupsArray = {
    val __obj = js.Dynamic.literal(runner_groups = runner_groups.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnergroupsArray]
  }
  
  extension [Self <: RunnergroupsArray](x: Self) {
    
    inline def setRunner_groups(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-groups-enterprise'] */ js.Any
        ]
    ): Self = StObject.set(x, "runner_groups", value.asInstanceOf[js.Any])
    
    inline def setRunner_groupsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['runner-groups-enterprise'] */ js.Any)*
    ): Self = StObject.set(x, "runner_groups", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
