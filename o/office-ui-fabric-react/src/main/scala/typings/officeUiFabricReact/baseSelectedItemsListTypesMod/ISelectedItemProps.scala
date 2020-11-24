package typings.officeUiFabricReact.baseSelectedItemsListTypesMod

import typings.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectedItemProps[T] extends IPickerItemProps[T] {
  
  def onCopyItem(item: T): Unit = js.native
}
object ISelectedItemProps {
  
  @scala.inline
  def apply[T](IPickerItemProps: IPickerItemProps[T], onCopyItem: T => Unit): ISelectedItemProps[T] = {
    val __obj = js.Dynamic.literal(onCopyItem = js.Any.fromFunction1(onCopyItem))
    js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
    __obj.asInstanceOf[ISelectedItemProps[T]]
  }
  
  @scala.inline
  implicit class ISelectedItemPropsOps[Self <: ISelectedItemProps[_], T] (val x: Self with ISelectedItemProps[T]) extends AnyVal {
    
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
    def setOnCopyItem(value: T => Unit): Self = this.set("onCopyItem", js.Any.fromFunction1(value))
  }
}
