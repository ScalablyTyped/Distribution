package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardSelectionListItem extends js.Object {
  val ChildItems: js.Any
  val HasParent: Boolean
  val ParentID: Double
  val Selectable: Boolean
  val Value: js.Any
}

object IMetadataCardSelectionListItem {
  @scala.inline
  def apply(ChildItems: js.Any, HasParent: Boolean, ParentID: Double, Selectable: Boolean, Value: js.Any): IMetadataCardSelectionListItem = {
    val __obj = js.Dynamic.literal(ChildItems = ChildItems.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ParentID = ParentID.asInstanceOf[js.Any], Selectable = Selectable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMetadataCardSelectionListItem]
  }
}

