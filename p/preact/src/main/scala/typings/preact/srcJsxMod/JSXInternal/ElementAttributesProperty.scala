package typings.preact.srcJsxMod.JSXInternal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementAttributesProperty extends StObject {
  
  var props: Any
}
object ElementAttributesProperty {
  
  inline def apply(props: Any): ElementAttributesProperty = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAttributesProperty]
  }
  
  extension [Self <: ElementAttributesProperty](x: Self) {
    
    inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
