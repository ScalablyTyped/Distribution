package typings.officeUiFabricReact.detailsListCompactExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListCompactExampleState extends js.Object {
  var items: js.Array[IDetailsListCompactExampleItem]
  var selectionDetails: String
}

object IDetailsListCompactExampleState {
  @scala.inline
  def apply(items: js.Array[IDetailsListCompactExampleItem], selectionDetails: String): IDetailsListCompactExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], selectionDetails = selectionDetails.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDetailsListCompactExampleState]
  }
}

