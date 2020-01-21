package typings.officeUiFabricReact.detailsListBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListBasicExampleState extends js.Object {
  var items: js.Array[IDetailsListBasicExampleItem]
  var selectionDetails: String
}

object IDetailsListBasicExampleState {
  @scala.inline
  def apply(items: js.Array[IDetailsListBasicExampleItem], selectionDetails: String): IDetailsListBasicExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], selectionDetails = selectionDetails.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDetailsListBasicExampleState]
  }
}

