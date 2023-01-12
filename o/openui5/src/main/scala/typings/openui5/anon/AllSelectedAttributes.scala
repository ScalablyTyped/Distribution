package typings.openui5.anon

import typings.openui5.sapUiUx3ExactAttributeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllSelectedAttributes extends StObject {
  
  /**
    * Array of all selected ExcatAttribute.
    */
  var allSelectedAttributes: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The attribute which was selected or unselected recently
    */
  var changedAttribute: js.UndefOr[default] = js.undefined
  
  /**
    * The query string which was entered in the search field
    */
  var query: js.UndefOr[String] = js.undefined
}
object AllSelectedAttributes {
  
  inline def apply(): AllSelectedAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllSelectedAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllSelectedAttributes] (val x: Self) extends AnyVal {
    
    inline def setAllSelectedAttributes(value: js.Object): Self = StObject.set(x, "allSelectedAttributes", value.asInstanceOf[js.Any])
    
    inline def setAllSelectedAttributesUndefined: Self = StObject.set(x, "allSelectedAttributes", js.undefined)
    
    inline def setChangedAttribute(value: default): Self = StObject.set(x, "changedAttribute", value.asInstanceOf[js.Any])
    
    inline def setChangedAttributeUndefined: Self = StObject.set(x, "changedAttribute", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
