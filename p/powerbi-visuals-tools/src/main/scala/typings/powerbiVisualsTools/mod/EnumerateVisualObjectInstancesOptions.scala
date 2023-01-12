package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumerateVisualObjectInstancesOptions extends StObject {
  
  var objectName: String
}
object EnumerateVisualObjectInstancesOptions {
  
  inline def apply(objectName: String): EnumerateVisualObjectInstancesOptions = {
    val __obj = js.Dynamic.literal(objectName = objectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerateVisualObjectInstancesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumerateVisualObjectInstancesOptions] (val x: Self) extends AnyVal {
    
    inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
  }
}
