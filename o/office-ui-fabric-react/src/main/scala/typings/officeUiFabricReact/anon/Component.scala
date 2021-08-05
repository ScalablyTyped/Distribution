package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.colorPickerBaseMod.ColorComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  /** Which color component is being edited */
  var component: ColorComponent
  
  /** Currently entered value, which is not valid */
  var value: String
}
object Component {
  
  inline def apply(component: ColorComponent, value: String): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setComponent(value: ColorComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
