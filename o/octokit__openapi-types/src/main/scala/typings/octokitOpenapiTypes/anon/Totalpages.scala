package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Totalpages extends StObject {
  
  var total_pages: js.UndefOr[Double] = js.undefined
}
object Totalpages {
  
  inline def apply(): Totalpages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Totalpages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Totalpages] (val x: Self) extends AnyVal {
    
    inline def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
    
    inline def setTotal_pagesUndefined: Self = StObject.set(x, "total_pages", js.undefined)
  }
}
