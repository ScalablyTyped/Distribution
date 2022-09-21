package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentPage extends StObject {
  
  var calculatedWidth: Double
  
  var currentPage: Double
  
  var filters: js.UndefOr[js.Array[Group]] = js.undefined
  
  var leftMargin: Double
}
object CurrentPage {
  
  inline def apply(calculatedWidth: Double, currentPage: Double, leftMargin: Double): CurrentPage = {
    val __obj = js.Dynamic.literal(calculatedWidth = calculatedWidth.asInstanceOf[js.Any], currentPage = currentPage.asInstanceOf[js.Any], leftMargin = leftMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentPage]
  }
  
  extension [Self <: CurrentPage](x: Self) {
    
    inline def setCalculatedWidth(value: Double): Self = StObject.set(x, "calculatedWidth", value.asInstanceOf[js.Any])
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: js.Array[Group]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Group*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "leftMargin", value.asInstanceOf[js.Any])
  }
}
