package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagesArray extends StObject {
  
  var pages: js.Array[String]
}
object PagesArray {
  
  inline def apply(pages: js.Array[String]): PagesArray = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagesArray]
  }
  
  extension [Self <: PagesArray](x: Self) {
    
    inline def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value*))
  }
}
