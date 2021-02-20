package typings.ngTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSettingsMod {
  
  @js.native
  trait IDataSettings extends StObject {
    
    var applyFilter: js.UndefOr[Boolean] = js.native
    
    var applyPaging: js.UndefOr[Boolean] = js.native
    
    var applySort: js.UndefOr[Boolean] = js.native
  }
  object IDataSettings {
    
    @scala.inline
    def apply(): IDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDataSettings]
    }
    
    @scala.inline
    implicit class IDataSettingsMutableBuilder[Self <: IDataSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplyFilter(value: Boolean): Self = StObject.set(x, "applyFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyFilterUndefined: Self = StObject.set(x, "applyFilter", js.undefined)
      
      @scala.inline
      def setApplyPaging(value: Boolean): Self = StObject.set(x, "applyPaging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplyPagingUndefined: Self = StObject.set(x, "applyPaging", js.undefined)
      
      @scala.inline
      def setApplySort(value: Boolean): Self = StObject.set(x, "applySort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplySortUndefined: Self = StObject.set(x, "applySort", js.undefined)
    }
  }
}
