package typings.oracleOraclejet.ojmoduleanimationsMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitcherCallBackParam extends js.Object {
  
  var isInitial: Boolean = js.native
  
  var newViewModel: js.Any = js.native
  
  var node: Element = js.native
  
  var oldViewModel: js.Any = js.native
  
  def valueAccessor(): js.Any = js.native
}
object SwitcherCallBackParam {
  
  @scala.inline
  def apply(
    isInitial: Boolean,
    newViewModel: js.Any,
    node: Element,
    oldViewModel: js.Any,
    valueAccessor: () => js.Any
  ): SwitcherCallBackParam = {
    val __obj = js.Dynamic.literal(isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any], valueAccessor = js.Any.fromFunction0(valueAccessor))
    __obj.asInstanceOf[SwitcherCallBackParam]
  }
  
  @scala.inline
  implicit class SwitcherCallBackParamOps[Self <: SwitcherCallBackParam] (val x: Self) extends AnyVal {
    
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
    def setIsInitial(value: Boolean): Self = this.set("isInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewViewModel(value: js.Any): Self = this.set("newViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Element): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldViewModel(value: js.Any): Self = this.set("oldViewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAccessor(value: () => js.Any): Self = this.set("valueAccessor", js.Any.fromFunction0(value))
  }
}
