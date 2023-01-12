package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridName extends StObject {
  
  var gridName: String
  
  var interactionName: String
  
  var processKey: Double
}
object GridName {
  
  inline def apply(gridName: String, interactionName: String, processKey: Double): GridName = {
    val __obj = js.Dynamic.literal(gridName = gridName.asInstanceOf[js.Any], interactionName = interactionName.asInstanceOf[js.Any], processKey = processKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridName] (val x: Self) extends AnyVal {
    
    inline def setGridName(value: String): Self = StObject.set(x, "gridName", value.asInstanceOf[js.Any])
    
    inline def setInteractionName(value: String): Self = StObject.set(x, "interactionName", value.asInstanceOf[js.Any])
    
    inline def setProcessKey(value: Double): Self = StObject.set(x, "processKey", value.asInstanceOf[js.Any])
  }
}
