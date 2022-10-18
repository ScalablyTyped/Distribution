package typings.openui5.anon

import typings.openui5.sapMListItemBaseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItem extends StObject {
  
  /**
    * The item which fired the select event.
    */
  var listItem: js.UndefOr[default] = js.undefined
}
object ListItem {
  
  inline def apply(): ListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItem]
  }
  
  extension [Self <: ListItem](x: Self) {
    
    inline def setListItem(value: default): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
  }
}
