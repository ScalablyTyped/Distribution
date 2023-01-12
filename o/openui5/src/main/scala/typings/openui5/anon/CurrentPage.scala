package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentPage extends StObject {
  
  /**
    * The value of the currentPage property after the change.
    */
  var currentPage: js.UndefOr[int] = js.undefined
  
  /**
    * The value of the currentPage property before the change.
    */
  var previousPage: js.UndefOr[int] = js.undefined
}
object CurrentPage {
  
  inline def apply(): CurrentPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentPage] (val x: Self) extends AnyVal {
    
    inline def setCurrentPage(value: int): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setPreviousPage(value: int): Self = StObject.set(x, "previousPage", value.asInstanceOf[js.Any])
    
    inline def setPreviousPageUndefined: Self = StObject.set(x, "previousPage", js.undefined)
  }
}
