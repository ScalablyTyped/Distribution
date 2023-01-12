package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneBindings extends StObject {
  
  /**
    * Whether bindings will be cloned
    */
  var cloneBindings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether associations and aggregations will be cloned
    */
  var cloneChildren: js.UndefOr[Boolean] = js.undefined
}
object CloneBindings {
  
  inline def apply(): CloneBindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneBindings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloneBindings] (val x: Self) extends AnyVal {
    
    inline def setCloneBindings(value: Boolean): Self = StObject.set(x, "cloneBindings", value.asInstanceOf[js.Any])
    
    inline def setCloneBindingsUndefined: Self = StObject.set(x, "cloneBindings", js.undefined)
    
    inline def setCloneChildren(value: Boolean): Self = StObject.set(x, "cloneChildren", value.asInstanceOf[js.Any])
    
    inline def setCloneChildrenUndefined: Self = StObject.set(x, "cloneChildren", js.undefined)
  }
}
