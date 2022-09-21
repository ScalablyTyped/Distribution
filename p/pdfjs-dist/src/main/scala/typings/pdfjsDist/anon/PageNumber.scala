package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageNumber extends StObject {
  
  var pageNumber: Any
}
object PageNumber {
  
  inline def apply(pageNumber: Any): PageNumber = {
    val __obj = js.Dynamic.literal(pageNumber = pageNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageNumber]
  }
  
  extension [Self <: PageNumber](x: Self) {
    
    inline def setPageNumber(value: Any): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
  }
}
