package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListExamplesDetailsListDotDocumentsDotExampleMod

import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListDocumentsExampleState extends js.Object {
  var announcedMessage: js.UndefOr[String] = js.undefined
  var columns: js.Array[IColumn]
  var isCompactMode: Boolean
  var isModalSelection: Boolean
  var items: js.Array[IDocument]
  var selectionDetails: String
}

object IDetailsListDocumentsExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    isCompactMode: Boolean,
    isModalSelection: Boolean,
    items: js.Array[IDocument],
    selectionDetails: String,
    announcedMessage: String = null
  ): IDetailsListDocumentsExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], isCompactMode = isCompactMode.asInstanceOf[js.Any], isModalSelection = isModalSelection.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectionDetails = selectionDetails.asInstanceOf[js.Any])
    if (announcedMessage != null) __obj.updateDynamic("announcedMessage")(announcedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListDocumentsExampleState]
  }
}

