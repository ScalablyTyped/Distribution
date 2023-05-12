package typings.openui5.anon

import typings.openui5.sapUiCoreElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  /**
    * The element for which the menu is opened. If it is an `HTMLElement`, the closest control is passed for
    * this event (if it exists).
    */
  var openBy: js.UndefOr[default] = js.undefined
}
object `29` {
  
  inline def apply(): `29` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `29`] (val x: Self) extends AnyVal {
    
    inline def setOpenBy(value: default): Self = StObject.set(x, "openBy", value.asInstanceOf[js.Any])
    
    inline def setOpenByUndefined: Self = StObject.set(x, "openBy", js.undefined)
  }
}
