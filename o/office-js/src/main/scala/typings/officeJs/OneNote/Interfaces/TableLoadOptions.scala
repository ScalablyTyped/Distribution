package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a table in a OneNote page.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait TableLoadOptions extends js.Object {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets whether the borders are visible or not. True if they are visible, false if they are hidden.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var borderVisible: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the number of columns in the table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var columnCount: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the ID of the table. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets the Paragraph object that contains the Table object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.native
  
  /**
    *
    * Gets the number of rows in the table.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rowCount: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets all of the table rows.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var rows: js.UndefOr[TableRowCollectionLoadOptions] = js.native
}
object TableLoadOptions {
  
  @scala.inline
  def apply(): TableLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableLoadOptions]
  }
  
  @scala.inline
  implicit class TableLoadOptionsOps[Self <: TableLoadOptions] (val x: Self) extends AnyVal {
    
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    
    @scala.inline
    def setBorderVisible(value: Boolean): Self = this.set("borderVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderVisible: Self = this.set("borderVisible", js.undefined)
    
    @scala.inline
    def setColumnCount(value: Boolean): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setParagraph(value: ParagraphLoadOptions): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    
    @scala.inline
    def setRowCount(value: Boolean): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    
    @scala.inline
    def setRows(value: TableRowCollectionLoadOptions): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
