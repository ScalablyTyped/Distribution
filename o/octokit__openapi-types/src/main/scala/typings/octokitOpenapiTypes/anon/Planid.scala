package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Planid extends StObject {
  
  var plan_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['plan-id'] */ js.Any
}
object Planid {
  
  inline def apply(
    plan_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['plan-id'] */ js.Any
  ): Planid = {
    val __obj = js.Dynamic.literal(plan_id = plan_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Planid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Planid] (val x: Self) extends AnyVal {
    
    inline def setPlan_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['plan-id'] */ js.Any
    ): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
  }
}
