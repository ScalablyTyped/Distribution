package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneBindings extends StObject {
  
  var cloneBindings: Boolean
  
  var cloneChildren: Boolean
}
object CloneBindings {
  
  inline def apply(cloneBindings: Boolean, cloneChildren: Boolean): CloneBindings = {
    val __obj = js.Dynamic.literal(cloneBindings = cloneBindings.asInstanceOf[js.Any], cloneChildren = cloneChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneBindings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloneBindings] (val x: Self) extends AnyVal {
    
    inline def setCloneBindings(value: Boolean): Self = StObject.set(x, "cloneBindings", value.asInstanceOf[js.Any])
    
    inline def setCloneChildren(value: Boolean): Self = StObject.set(x, "cloneChildren", value.asInstanceOf[js.Any])
  }
}
