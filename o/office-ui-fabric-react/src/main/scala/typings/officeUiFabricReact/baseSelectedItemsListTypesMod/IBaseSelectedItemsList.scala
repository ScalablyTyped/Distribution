package typings.officeUiFabricReact.baseSelectedItemsListTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseSelectedItemsList[T] extends js.Object {
  /** Gets the current value of the input. */
  var items: js.UndefOr[js.Array[T]] = js.native
  def addItems(items: js.Array[T]): Unit = js.native
}

object IBaseSelectedItemsList {
  @scala.inline
  def apply[T](addItems: js.Array[T] => Unit): IBaseSelectedItemsList[T] = {
    val __obj = js.Dynamic.literal(addItems = js.Any.fromFunction1(addItems))
    __obj.asInstanceOf[IBaseSelectedItemsList[T]]
  }
  @scala.inline
  implicit class IBaseSelectedItemsListOps[Self <: IBaseSelectedItemsList[_], T] (val x: Self with IBaseSelectedItemsList[T]) extends AnyVal {
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
    def setAddItems(value: js.Array[T] => Unit): Self = this.set("addItems", js.Any.fromFunction1(value))
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

