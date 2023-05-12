package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentId extends StObject {
  
  /**
    * List of IDs of the components to be analyzed. Use only when the scope type is `components`.
    */
  var components: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * ID of the root element that forms a subtree. Use when the scope type is `subtree`.
    */
  var parentId: js.UndefOr[String] = js.undefined
  
  /**
    * Possible values are `global`, `subtree` or `components`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParentId {
  
  inline def apply(): ParentId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentId] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
