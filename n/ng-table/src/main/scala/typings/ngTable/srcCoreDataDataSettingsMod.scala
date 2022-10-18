package typings.ngTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreDataDataSettingsMod {
  
  trait IDataSettings extends StObject {
    
    var applyFilter: js.UndefOr[Boolean] = js.undefined
    
    var applyPaging: js.UndefOr[Boolean] = js.undefined
    
    var applySort: js.UndefOr[Boolean] = js.undefined
  }
  object IDataSettings {
    
    inline def apply(): IDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDataSettings]
    }
    
    extension [Self <: IDataSettings](x: Self) {
      
      inline def setApplyFilter(value: Boolean): Self = StObject.set(x, "applyFilter", value.asInstanceOf[js.Any])
      
      inline def setApplyFilterUndefined: Self = StObject.set(x, "applyFilter", js.undefined)
      
      inline def setApplyPaging(value: Boolean): Self = StObject.set(x, "applyPaging", value.asInstanceOf[js.Any])
      
      inline def setApplyPagingUndefined: Self = StObject.set(x, "applyPaging", js.undefined)
      
      inline def setApplySort(value: Boolean): Self = StObject.set(x, "applySort", value.asInstanceOf[js.Any])
      
      inline def setApplySortUndefined: Self = StObject.set(x, "applySort", js.undefined)
    }
  }
}
