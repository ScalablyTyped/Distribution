package typings.officeUiFabricReact.detailsListNavigatingFocusExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListNavigatingFocusExampleState extends js.Object {
  var initialFocusedIndex: js.UndefOr[Double] = js.native
  var items: js.Array[String] = js.native
  var key: Double = js.native
}

object IDetailsListNavigatingFocusExampleState {
  @scala.inline
  def apply(items: js.Array[String], key: Double): IDetailsListNavigatingFocusExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListNavigatingFocusExampleState]
  }
  @scala.inline
  implicit class IDetailsListNavigatingFocusExampleStateOps[Self <: IDetailsListNavigatingFocusExampleState] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: String*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[String]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialFocusedIndex(value: Double): Self = this.set("initialFocusedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialFocusedIndex: Self = this.set("initialFocusedIndex", js.undefined)
  }
  
}

