package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnabledId extends StObject {
  
  var app: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['custom-deployment-rule-app'] */ js.Any
  
  /**
    * @description Whether the deployment protection rule is enabled for the environment.
    * @example true
    */
  var enabled: Boolean
  
  /**
    * @description The unique identifier for the deployment protection rule.
    * @example 3515
    */
  var id: Double
  
  /**
    * @description The node ID for the deployment protection rule.
    * @example MDQ6R2F0ZTM1MTU=
    */
  var node_id: String
}
object EnabledId {
  
  inline def apply(
    app: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['custom-deployment-rule-app'] */ js.Any,
    enabled: Boolean,
    id: Double,
    node_id: String
  ): EnabledId = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnabledId] (val x: Self) extends AnyVal {
    
    inline def setApp(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['custom-deployment-rule-app'] */ js.Any
    ): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
  }
}
