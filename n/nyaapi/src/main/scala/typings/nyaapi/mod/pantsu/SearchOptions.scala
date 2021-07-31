package typings.nyaapi.mod.pantsu

import typings.nyaapi.nyaapiStrings.b
import typings.nyaapi.nyaapiStrings.g
import typings.nyaapi.nyaapiStrings.k
import typings.nyaapi.nyaapiStrings.m
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOptions extends StObject {
  
  var c: js.UndefOr[Category] = js.undefined
  
  var dateType: js.UndefOr[String] = js.undefined
  
  var fromDate: js.UndefOr[String] = js.undefined
  
  var fromID: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxSize: js.UndefOr[String] = js.undefined
  
  var maxage: js.UndefOr[String] = js.undefined
  
  var minSize: js.UndefOr[String] = js.undefined
  
  var n: js.UndefOr[Double] = js.undefined
  
  var order: js.UndefOr[Boolean] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var s: js.UndefOr[String] = js.undefined
  
  var sizeType: js.UndefOr[b | k | m | g] = js.undefined
  
  var sort: js.UndefOr[SortType] = js.undefined
  
  var term: js.UndefOr[String] = js.undefined
  
  var toDate: js.UndefOr[String] = js.undefined
  
  var userID: js.UndefOr[String] = js.undefined
}
object SearchOptions {
  
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  
  @scala.inline
  implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: Category): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    @scala.inline
    def setDateType(value: String): Self = StObject.set(x, "dateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTypeUndefined: Self = StObject.set(x, "dateType", js.undefined)
    
    @scala.inline
    def setFromDate(value: String): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
    
    @scala.inline
    def setFromID(value: String): Self = StObject.set(x, "fromID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromIDUndefined: Self = StObject.set(x, "fromID", js.undefined)
    
    @scala.inline
    def setLang(value: js.Array[String]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLangVarargs(value: String*): Self = StObject.set(x, "lang", js.Array(value :_*))
    
    @scala.inline
    def setMaxSize(value: String): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMaxage(value: String): Self = StObject.set(x, "maxage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxageUndefined: Self = StObject.set(x, "maxage", js.undefined)
    
    @scala.inline
    def setMinSize(value: String): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    @scala.inline
    def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    @scala.inline
    def setSizeType(value: b | k | m | g): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setSort(value: SortType): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    @scala.inline
    def setToDate(value: String): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
    
    @scala.inline
    def setUserID(value: String): Self = StObject.set(x, "userID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIDUndefined: Self = StObject.set(x, "userID", js.undefined)
  }
}
