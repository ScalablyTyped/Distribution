package typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListBaseSelectedItemsListDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsPickersPickerItemDotTypesMod.IPickerItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectedItemProps[T] extends IPickerItemProps[T] {
  def onCopyItem(item: T): Unit
}

object ISelectedItemProps {
  @scala.inline
  def apply[T](IPickerItemProps: IPickerItemProps[T], onCopyItem: T => Unit): ISelectedItemProps[T] = {
    val __obj = js.Dynamic.literal(onCopyItem = js.Any.fromFunction1(onCopyItem))
    js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
    __obj.asInstanceOf[ISelectedItemProps[T]]
  }
}

