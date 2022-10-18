package typings.openui5.anon

import typings.openui5.sapMUploadUploadSetItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  /**
    * Items whose selection status has just been changed.
    */
  var items: js.UndefOr[js.Array[default]] = js.undefined
}
object `25` {
  
  inline def apply(): `25` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`25`]
  }
  
  extension [Self <: `25`](x: Self) {
    
    inline def setItems(value: js.Array[default]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: default*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
