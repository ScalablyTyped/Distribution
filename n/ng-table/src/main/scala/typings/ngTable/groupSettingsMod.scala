package typings.ngTable

import typings.ngTable.sortingMod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupSettingsMod {
  
  trait IGroupSettings extends StObject {
    
    /**
      * The default sort direction that will be used whenever a group is supplied that
      * does not define its own sort direction
      */
    var defaultSort: js.UndefOr[SortDirection] = js.undefined
    
    /**
      * Determines whether groups should be displayed expanded to show their items. Defaults to true
      */
    var isExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object IGroupSettings {
    
    @scala.inline
    def apply(): IGroupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupSettings]
    }
    
    @scala.inline
    implicit class IGroupSettingsMutableBuilder[Self <: IGroupSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSort(value: SortDirection): Self = StObject.set(x, "defaultSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSortUndefined: Self = StObject.set(x, "defaultSort", js.undefined)
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    }
  }
}
