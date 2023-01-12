package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlugin extends StObject {
  
  def init(childScope: IGridScope, gridInstance: IGridInstance, services: Any): Unit
}
object IPlugin {
  
  inline def apply(init: (IGridScope, IGridInstance, Any) => Unit): IPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3(init))
    __obj.asInstanceOf[IPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlugin] (val x: Self) extends AnyVal {
    
    inline def setInit(value: (IGridScope, IGridInstance, Any) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
  }
}
