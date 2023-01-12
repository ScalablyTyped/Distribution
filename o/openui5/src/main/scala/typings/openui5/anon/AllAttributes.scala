package typings.openui5.anon

import typings.openui5.sapUiUx3ExactAttributeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllAttributes extends StObject {
  
  /**
    * Array of all ExactAttributes
    */
  var allAttributes: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The attribute which was selected/unselected recently
    */
  var attribute: js.UndefOr[default] = js.undefined
}
object AllAttributes {
  
  inline def apply(): AllAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllAttributes] (val x: Self) extends AnyVal {
    
    inline def setAllAttributes(value: js.Object): Self = StObject.set(x, "allAttributes", value.asInstanceOf[js.Any])
    
    inline def setAllAttributesUndefined: Self = StObject.set(x, "allAttributes", js.undefined)
    
    inline def setAttribute(value: default): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
  }
}
