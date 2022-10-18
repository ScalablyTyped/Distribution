package typings.openui5.anon

import typings.openui5.sapMViewSettingsFilterItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentFilterItem extends StObject {
  
  /**
    * The filter item for which the details are opened.
    */
  var parentFilterItem: js.UndefOr[default] = js.undefined
}
object ParentFilterItem {
  
  inline def apply(): ParentFilterItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentFilterItem]
  }
  
  extension [Self <: ParentFilterItem](x: Self) {
    
    inline def setParentFilterItem(value: default): Self = StObject.set(x, "parentFilterItem", value.asInstanceOf[js.Any])
    
    inline def setParentFilterItemUndefined: Self = StObject.set(x, "parentFilterItem", js.undefined)
  }
}
