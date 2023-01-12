package typings.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolMap extends StObject {
  
  def set(name: String, func: js.Function1[/* size */ Any, Unit]): Unit
}
object SymbolMap {
  
  inline def apply(set: (String, js.Function1[/* size */ Any, Unit]) => Unit): SymbolMap = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[SymbolMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SymbolMap] (val x: Self) extends AnyVal {
    
    inline def setSet(value: (String, js.Function1[/* size */ Any, Unit]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
