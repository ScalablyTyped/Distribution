package typings.officeUiFabricReact.baseExtendedPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseExtendedPicker[T] extends js.Object {
  
  /** Sets focus to the input. */
  def focus(): Unit = js.native
  
  /** Forces the picker to resolve */
  var forceResolve: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]] = js.native
}
object IBaseExtendedPicker {
  
  @scala.inline
  def apply[T](focus: () => Unit): IBaseExtendedPicker[T] = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[IBaseExtendedPicker[T]]
  }
  
  @scala.inline
  implicit class IBaseExtendedPickerOps[Self <: IBaseExtendedPicker[_], T] (val x: Self with IBaseExtendedPicker[T]) extends AnyVal {
    
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
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setForceResolve(value: () => Unit): Self = this.set("forceResolve", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteForceResolve: Self = this.set("forceResolve", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
