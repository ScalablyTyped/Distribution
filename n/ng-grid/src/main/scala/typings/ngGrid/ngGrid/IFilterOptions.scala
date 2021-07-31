package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFilterOptions extends StObject {
  
  var filterText: js.UndefOr[String] = js.undefined
  
  var useExternalFilter: js.UndefOr[Boolean] = js.undefined
}
object IFilterOptions {
  
  @scala.inline
  def apply(): IFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterOptions]
  }
  
  @scala.inline
  implicit class IFilterOptionsMutableBuilder[Self <: IFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterText(value: String): Self = StObject.set(x, "filterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTextUndefined: Self = StObject.set(x, "filterText", js.undefined)
    
    @scala.inline
    def setUseExternalFilter(value: Boolean): Self = StObject.set(x, "useExternalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseExternalFilterUndefined: Self = StObject.set(x, "useExternalFilter", js.undefined)
  }
}
