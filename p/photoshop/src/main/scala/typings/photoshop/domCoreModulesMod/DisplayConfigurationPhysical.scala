package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayConfigurationPhysical extends StObject {
  
  var horizontal: Double
  
  var vertical: Double
}
object DisplayConfigurationPhysical {
  
  inline def apply(horizontal: Double, vertical: Double): DisplayConfigurationPhysical = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayConfigurationPhysical]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayConfigurationPhysical] (val x: Self) extends AnyVal {
    
    inline def setHorizontal(value: Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: Double): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
