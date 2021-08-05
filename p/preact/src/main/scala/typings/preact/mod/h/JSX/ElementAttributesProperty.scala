package typings.preact.mod.h.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementAttributesProperty extends StObject {
  
  var props: js.Any
}
object ElementAttributesProperty {
  
  inline def apply(props: js.Any): ElementAttributesProperty = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAttributesProperty]
  }
  
  extension [Self <: ElementAttributesProperty](x: Self) {
    
    inline def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
