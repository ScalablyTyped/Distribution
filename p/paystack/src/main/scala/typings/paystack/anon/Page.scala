package typings.paystack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  var page: Double
  
  var perPage: Double
}
object Page {
  
  inline def apply(page: Double, perPage: Double): Page = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], perPage = perPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  extension [Self <: Page](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
  }
}
