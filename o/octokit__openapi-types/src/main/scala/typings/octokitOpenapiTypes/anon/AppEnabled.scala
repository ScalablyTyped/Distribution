package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppEnabled extends StObject {
  
  var app: Integrationurl
  
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
object AppEnabled {
  
  inline def apply(app: Integrationurl, enabled: Boolean, id: Double, node_id: String): AppEnabled = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppEnabled] (val x: Self) extends AnyVal {
    
    inline def setApp(value: Integrationurl): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
  }
}
