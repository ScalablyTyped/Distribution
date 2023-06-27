package typings.openui5.anon

import typings.openui5.sapUiMdcChartMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddItem extends StObject {
  
  def addItem(p1: default, p2: String): js.Promise[typings.openui5.sapUiMdcFilterFieldMod.default]
}
object AddItem {
  
  inline def apply(addItem: (default, String) => js.Promise[typings.openui5.sapUiMdcFilterFieldMod.default]): AddItem = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction2(addItem))
    __obj.asInstanceOf[AddItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddItem] (val x: Self) extends AnyVal {
    
    inline def setAddItem(value: (default, String) => js.Promise[typings.openui5.sapUiMdcFilterFieldMod.default]): Self = StObject.set(x, "addItem", js.Any.fromFunction2(value))
  }
}
