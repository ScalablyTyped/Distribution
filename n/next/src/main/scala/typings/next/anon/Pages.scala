package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pages extends StObject {
  
  var app: js.UndefOr[js.Array[String]] = js.undefined
  
  var pages: js.Array[String]
}
object Pages {
  
  inline def apply(pages: js.Array[String]): Pages = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pages]
  }
  
  extension [Self <: Pages](x: Self) {
    
    inline def setApp(value: js.Array[String]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setAppVarargs(value: String*): Self = StObject.set(x, "app", js.Array(value*))
    
    inline def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value*))
  }
}
