package typings.preact.mod.h.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementChildrenAttribute extends StObject {
  
  var children: js.Any
}
object ElementChildrenAttribute {
  
  @scala.inline
  def apply(children: js.Any): ElementChildrenAttribute = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementChildrenAttribute]
  }
  
  @scala.inline
  implicit class ElementChildrenAttributeMutableBuilder[Self <: ElementChildrenAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
