package typings.nvd3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolMap extends js.Object {
  
  def set(name: String, func: js.Function1[/* size */ js.Any, Unit]): Unit = js.native
}
object SymbolMap {
  
  @scala.inline
  def apply(set: (String, js.Function1[/* size */ js.Any, Unit]) => Unit): SymbolMap = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[SymbolMap]
  }
  
  @scala.inline
  implicit class SymbolMapOps[Self <: SymbolMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSet(value: (String, js.Function1[/* size */ js.Any, Unit]) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
