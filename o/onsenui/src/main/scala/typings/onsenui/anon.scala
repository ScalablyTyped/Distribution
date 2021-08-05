package typings.onsenui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Page extends StObject {
    
    var page: js.Any
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var parent: Element
  }
  object Page {
    
    inline def apply(page: js.Any, parent: Element): Page = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    extension [Self <: Page](x: Self) {
      
      inline def setPage(value: js.Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
}
