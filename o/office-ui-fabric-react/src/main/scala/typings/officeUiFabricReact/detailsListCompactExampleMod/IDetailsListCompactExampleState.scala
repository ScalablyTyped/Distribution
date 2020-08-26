package typings.officeUiFabricReact.detailsListCompactExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListCompactExampleState extends js.Object {
  var items: js.Array[IDetailsListCompactExampleItem] = js.native
  var selectionDetails: String = js.native
}

object IDetailsListCompactExampleState {
  @scala.inline
  def apply(items: js.Array[IDetailsListCompactExampleItem], selectionDetails: String): IDetailsListCompactExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], selectionDetails = selectionDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListCompactExampleState]
  }
  @scala.inline
  implicit class IDetailsListCompactExampleStateOps[Self <: IDetailsListCompactExampleState] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: IDetailsListCompactExampleItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[IDetailsListCompactExampleItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionDetails(value: String): Self = this.set("selectionDetails", value.asInstanceOf[js.Any])
  }
  
}

