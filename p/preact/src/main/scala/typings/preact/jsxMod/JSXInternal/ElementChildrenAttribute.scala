package typings.preact.jsxMod.JSXInternal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementChildrenAttribute extends StObject {
  
  var children: js.Any
}
object ElementChildrenAttribute {
  
  inline def apply(children: js.Any): ElementChildrenAttribute = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChildrenAttribute]
  }
  
  extension [Self <: ElementChildrenAttribute](x: Self) {
    
    inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
