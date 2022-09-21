package typings.powerbiVisualsTools.mod.extensibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVisualHost extends StObject {
  
  var instanceId: String
}
object IVisualHost {
  
  inline def apply(instanceId: String): IVisualHost = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVisualHost]
  }
  
  extension [Self <: IVisualHost](x: Self) {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
  }
}
