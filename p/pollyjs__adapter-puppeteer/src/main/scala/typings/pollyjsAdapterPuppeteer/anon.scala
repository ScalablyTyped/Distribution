package typings.pollyjsAdapterPuppeteer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Page extends StObject {
    
    var page: Any
    
    var requestResourceTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Page {
    
    inline def apply(page: Any): Page = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
      
      inline def setPage(value: Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setRequestResourceTypes(value: js.Array[String]): Self = StObject.set(x, "requestResourceTypes", value.asInstanceOf[js.Any])
      
      inline def setRequestResourceTypesUndefined: Self = StObject.set(x, "requestResourceTypes", js.undefined)
      
      inline def setRequestResourceTypesVarargs(value: String*): Self = StObject.set(x, "requestResourceTypes", js.Array(value*))
    }
  }
}
