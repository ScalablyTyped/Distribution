package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardSelectionListItem extends js.Object {
  val ChildItems: js.Any
  val HasParent: scala.Boolean
  val ParentID: scala.Double
  val Selectable: scala.Boolean
  val Value: js.Any
}

object IMetadataCardSelectionListItem {
  @scala.inline
  def apply(
    ChildItems: js.Any,
    HasParent: scala.Boolean,
    ParentID: scala.Double,
    Selectable: scala.Boolean,
    Value: js.Any
  ): IMetadataCardSelectionListItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChildItems")(ChildItems)
    __obj.updateDynamic("HasParent")(HasParent)
    __obj.updateDynamic("ParentID")(ParentID)
    __obj.updateDynamic("Selectable")(Selectable)
    __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[IMetadataCardSelectionListItem]
  }
}

