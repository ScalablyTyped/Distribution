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
    val __obj = js.Dynamic.literal(ChildItems = ChildItems, HasParent = HasParent, ParentID = ParentID, Selectable = Selectable, Value = Value)
  
    __obj.asInstanceOf[IMetadataCardSelectionListItem]
  }
}

