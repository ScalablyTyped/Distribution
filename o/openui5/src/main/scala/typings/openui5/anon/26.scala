package typings.openui5.anon

import typings.openui5.sapMSegmentedButtonItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  /**
    * Reference to the item, that has been selected.
    */
  var item: js.UndefOr[default] = js.undefined
}
object `26` {
  
  inline def apply(): `26` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `26`] (val x: Self) extends AnyVal {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
