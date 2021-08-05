package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPagingOptions extends StObject {
  
  /** currentPage: the uhm... current page. */
  var currentPage: js.UndefOr[Double] = js.undefined
  
  /** pageSize: currently selected page size.  */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**  pageSizes: list of available page sizes.  */
  var pageSizes: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** totalServerItems: Total items are on the server.  */
  var totalServerItems: js.UndefOr[Double] = js.undefined
}
object IPagingOptions {
  
  inline def apply(): IPagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPagingOptions]
  }
  
  extension [Self <: IPagingOptions](x: Self) {
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageSizes(value: js.Array[Double]): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
    
    inline def setPageSizesUndefined: Self = StObject.set(x, "pageSizes", js.undefined)
    
    inline def setPageSizesVarargs(value: Double*): Self = StObject.set(x, "pageSizes", js.Array(value :_*))
    
    inline def setTotalServerItems(value: Double): Self = StObject.set(x, "totalServerItems", value.asInstanceOf[js.Any])
    
    inline def setTotalServerItemsUndefined: Self = StObject.set(x, "totalServerItems", js.undefined)
  }
}
