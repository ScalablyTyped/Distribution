package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `289` extends StObject {
  
  /** The unique identifier of the plan. */
  var plan_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['plan-id'] */ js.Any
}
object `289` {
  
  inline def apply(
    plan_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['plan-id'] */ js.Any
  ): `289` = {
    val __obj = js.Dynamic.literal(plan_id = plan_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`289`]
  }
  
  extension [Self <: `289`](x: Self) {
    
    inline def setPlan_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['plan-id'] */ js.Any
    ): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
  }
}
