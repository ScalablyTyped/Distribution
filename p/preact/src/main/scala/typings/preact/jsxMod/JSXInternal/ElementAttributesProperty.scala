package typings.preact.jsxMod.JSXInternal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementAttributesProperty extends StObject {
  
  var props: js.Any
}
object ElementAttributesProperty {
  
  @scala.inline
  def apply(props: js.Any): ElementAttributesProperty = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAttributesProperty]
  }
  
  @scala.inline
  implicit class ElementAttributesPropertyMutableBuilder[Self <: ElementAttributesProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
