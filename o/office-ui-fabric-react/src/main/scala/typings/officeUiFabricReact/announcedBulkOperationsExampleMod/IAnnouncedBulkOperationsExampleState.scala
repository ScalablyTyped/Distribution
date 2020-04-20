package typings.officeUiFabricReact.announcedBulkOperationsExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnouncedBulkOperationsExampleState extends js.Object {
  var items: js.Array[IFileExampleItem]
  var numberOfItems: Double
}

object IAnnouncedBulkOperationsExampleState {
  @scala.inline
  def apply(items: js.Array[IFileExampleItem], numberOfItems: Double): IAnnouncedBulkOperationsExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], numberOfItems = numberOfItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedBulkOperationsExampleState]
  }
}

