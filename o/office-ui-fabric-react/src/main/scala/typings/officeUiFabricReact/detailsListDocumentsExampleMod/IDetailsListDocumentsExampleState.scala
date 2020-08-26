package typings.officeUiFabricReact.detailsListDocumentsExampleMod

import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListDocumentsExampleState extends js.Object {
  var announcedMessage: js.UndefOr[String] = js.native
  var columns: js.Array[IColumn] = js.native
  var isCompactMode: Boolean = js.native
  var isModalSelection: Boolean = js.native
  var items: js.Array[IDocument] = js.native
  var selectionDetails: String = js.native
}

object IDetailsListDocumentsExampleState {
  @scala.inline
  def apply(
    columns: js.Array[IColumn],
    isCompactMode: Boolean,
    isModalSelection: Boolean,
    items: js.Array[IDocument],
    selectionDetails: String
  ): IDetailsListDocumentsExampleState = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], isCompactMode = isCompactMode.asInstanceOf[js.Any], isModalSelection = isModalSelection.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectionDetails = selectionDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListDocumentsExampleState]
  }
  @scala.inline
  implicit class IDetailsListDocumentsExampleStateOps[Self <: IDetailsListDocumentsExampleState] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: IColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[IColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCompactMode(value: Boolean): Self = this.set("isCompactMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsModalSelection(value: Boolean): Self = this.set("isModalSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: IDocument*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[IDocument]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionDetails(value: String): Self = this.set("selectionDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnouncedMessage(value: String): Self = this.set("announcedMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnouncedMessage: Self = this.set("announcedMessage", js.undefined)
  }
  
}

