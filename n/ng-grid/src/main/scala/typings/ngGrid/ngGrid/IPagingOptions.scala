package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPagingOptions extends StObject {
  
  /** currentPage: the uhm... current page. */
  var currentPage: js.UndefOr[Double] = js.native
  
  /** pageSize: currently selected page size.  */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**  pageSizes: list of available page sizes.  */
  var pageSizes: js.UndefOr[js.Array[Double]] = js.native
  
  /** totalServerItems: Total items are on the server.  */
  var totalServerItems: js.UndefOr[Double] = js.native
}
object IPagingOptions {
  
  @scala.inline
  def apply(): IPagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPagingOptions]
  }
  
  @scala.inline
  implicit class IPagingOptionsMutableBuilder[Self <: IPagingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageSizes(value: js.Array[Double]): Self = StObject.set(x, "pageSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizesUndefined: Self = StObject.set(x, "pageSizes", js.undefined)
    
    @scala.inline
    def setPageSizesVarargs(value: Double*): Self = StObject.set(x, "pageSizes", js.Array(value :_*))
    
    @scala.inline
    def setTotalServerItems(value: Double): Self = StObject.set(x, "totalServerItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalServerItemsUndefined: Self = StObject.set(x, "totalServerItems", js.undefined)
  }
}
