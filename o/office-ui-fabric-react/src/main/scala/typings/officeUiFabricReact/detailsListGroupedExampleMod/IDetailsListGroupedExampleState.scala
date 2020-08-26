package typings.officeUiFabricReact.detailsListGroupedExampleMod

import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListGroupedExampleState extends js.Object {
  var groups: js.Array[IGroup] = js.native
  var isCompactMode: Boolean = js.native
  var items: js.Array[IDetailsListGroupedExampleItem] = js.native
  var showItemIndexInView: Boolean = js.native
}

object IDetailsListGroupedExampleState {
  @scala.inline
  def apply(
    groups: js.Array[IGroup],
    isCompactMode: Boolean,
    items: js.Array[IDetailsListGroupedExampleItem],
    showItemIndexInView: Boolean
  ): IDetailsListGroupedExampleState = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], isCompactMode = isCompactMode.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], showItemIndexInView = showItemIndexInView.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListGroupedExampleState]
  }
  @scala.inline
  implicit class IDetailsListGroupedExampleStateOps[Self <: IDetailsListGroupedExampleState] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: IGroup*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[IGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCompactMode(value: Boolean): Self = this.set("isCompactMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: IDetailsListGroupedExampleItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[IDetailsListGroupedExampleItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowItemIndexInView(value: Boolean): Self = this.set("showItemIndexInView", value.asInstanceOf[js.Any])
  }
  
}

