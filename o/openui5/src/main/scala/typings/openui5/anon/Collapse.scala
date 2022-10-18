package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collapse extends StObject {
  
  /**
    * If the tab will collapse, this is true.
    */
  var collapse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the tab will expand, this is true.
    */
  var expand: js.UndefOr[Boolean] = js.undefined
}
object Collapse {
  
  inline def apply(): Collapse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collapse]
  }
  
  extension [Self <: Collapse](x: Self) {
    
    inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
  }
}
