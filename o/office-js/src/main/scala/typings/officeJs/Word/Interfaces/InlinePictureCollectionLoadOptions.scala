package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains a collection of {@link Word.InlinePicture} objects.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait InlinePictureCollectionLoadOptions extends js.Object {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a string that represents the alternative text associated with the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextDescription: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a string that contains the title for the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a number that describes the height of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var height: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.1]
    */
  var hyperlink: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the parent paragraph that contains the inline image.
    *
    * [Api set: WordApi 1.2]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the inline image. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the content control that contains the inline image. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the inline image. Throws an error if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the inline image. Throws an error if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table cell that contains the inline image. Returns a null object if it is not contained in a table cell.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets the table that contains the inline image. Returns a null object if it is not contained in a table.
    *
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.native
  
  /**
    *
    * For EACH ITEM in the collection: Gets or sets a number that describes the width of the inline image.
    *
    * [Api set: WordApi 1.1]
    */
  var width: js.UndefOr[Boolean] = js.native
}
object InlinePictureCollectionLoadOptions {
  
  @scala.inline
  def apply(): InlinePictureCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlinePictureCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class InlinePictureCollectionLoadOptionsOps[Self <: InlinePictureCollectionLoadOptions] (val x: Self) extends AnyVal {
    
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
    def setAltTextDescription(value: Boolean): Self = this.set("altTextDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltTextDescription: Self = this.set("altTextDescription", js.undefined)
    
    @scala.inline
    def setAltTextTitle(value: Boolean): Self = this.set("altTextTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltTextTitle: Self = this.set("altTextTitle", js.undefined)
    
    @scala.inline
    def setHeight(value: Boolean): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHyperlink(value: Boolean): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlink: Self = this.set("hyperlink", js.undefined)
    
    @scala.inline
    def setLockAspectRatio(value: Boolean): Self = this.set("lockAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockAspectRatio: Self = this.set("lockAspectRatio", js.undefined)
    
    @scala.inline
    def setParagraph(value: ParagraphLoadOptions): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraph: Self = this.set("paragraph", js.undefined)
    
    @scala.inline
    def setParentContentControl(value: ContentControlLoadOptions): Self = this.set("parentContentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentContentControl: Self = this.set("parentContentControl", js.undefined)
    
    @scala.inline
    def setParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = this.set("parentContentControlOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentContentControlOrNullObject: Self = this.set("parentContentControlOrNullObject", js.undefined)
    
    @scala.inline
    def setParentTable(value: TableLoadOptions): Self = this.set("parentTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentTable: Self = this.set("parentTable", js.undefined)
    
    @scala.inline
    def setParentTableCell(value: TableCellLoadOptions): Self = this.set("parentTableCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentTableCell: Self = this.set("parentTableCell", js.undefined)
    
    @scala.inline
    def setParentTableCellOrNullObject(value: TableCellLoadOptions): Self = this.set("parentTableCellOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentTableCellOrNullObject: Self = this.set("parentTableCellOrNullObject", js.undefined)
    
    @scala.inline
    def setParentTableOrNullObject(value: TableLoadOptions): Self = this.set("parentTableOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentTableOrNullObject: Self = this.set("parentTableOrNullObject", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
