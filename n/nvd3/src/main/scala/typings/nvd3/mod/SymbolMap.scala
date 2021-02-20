package typings.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolMap extends StObject {
  
  def set(name: String, func: js.Function1[/* size */ js.Any, Unit]): Unit = js.native
}
object SymbolMap {
  
  @scala.inline
  def apply(set: (String, js.Function1[/* size */ js.Any, Unit]) => Unit): SymbolMap = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[SymbolMap]
  }
  
  @scala.inline
  implicit class SymbolMapMutableBuilder[Self <: SymbolMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSet(value: (String, js.Function1[/* size */ js.Any, Unit]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
