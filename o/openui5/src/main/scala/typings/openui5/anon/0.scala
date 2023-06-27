package typings.openui5.anon

import typings.openui5.sapUiMdcTableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def addItem(p1: default, p2: String): js.Promise[typings.openui5.sapUiMdcFilterFieldMod.default]
}
object `0` {
  
  inline def apply(addItem: (default, String) => js.Promise[typings.openui5.sapUiMdcFilterFieldMod.default]): `0` = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction2(addItem))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setAddItem(value: (default, String) => js.Promise[typings.openui5.sapUiMdcFilterFieldMod.default]): Self = StObject.set(x, "addItem", js.Any.fromFunction2(value))
  }
}
