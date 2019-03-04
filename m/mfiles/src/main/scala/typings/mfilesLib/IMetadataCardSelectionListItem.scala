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
    val __obj = js.Dynamic.literal(ChildItems = ChildItems, HasParent = HasParent, ParentID = ParentID, Selectable = Selectable, Value = Value)
  
    __obj.asInstanceOf[IMetadataCardSelectionListItem]
  }
}

