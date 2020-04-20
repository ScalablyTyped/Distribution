package typings.officeUiFabricReact.detailsListGroupedExampleMod

import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListGroupedExampleState extends js.Object {
  var groups: js.Array[IGroup]
  var isCompactMode: Boolean
  var items: js.Array[IDetailsListGroupedExampleItem]
  var showItemIndexInView: Boolean
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
}

