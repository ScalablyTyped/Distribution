package typings.preact.srcJsxMod.JSXInternal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementChildrenAttribute extends StObject {
  
  var children: Any
}
object ElementChildrenAttribute {
  
  inline def apply(children: Any): ElementChildrenAttribute = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChildrenAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementChildrenAttribute] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
