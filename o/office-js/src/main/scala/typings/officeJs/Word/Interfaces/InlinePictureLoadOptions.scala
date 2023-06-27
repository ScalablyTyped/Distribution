package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an inline picture.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
trait InlinePictureLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a string that represents the alternative text associated with the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var altTextDescription: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a string that contains the title for the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var altTextTitle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a number that describes the height of the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a hyperlink on the image. Use a '#' to separate the address part from the optional location part.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var hyperlink: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a value that indicates whether the inline image retains its original proportions when you resize it.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var lockAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the parent paragraph that contains the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.2]
    */
  var paragraph: js.UndefOr[ParagraphLoadOptions] = js.undefined
  
  /**
    * Gets the content control that contains the inline image. Throws an `ItemNotFound` error if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    * Gets the content control that contains the inline image. If there isn't a parent content control, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    * Gets the table that contains the inline image. Throws an `ItemNotFound` error if it is not contained in a table.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    * Gets the table cell that contains the inline image. Throws an `ItemNotFound` error if it is not contained in a table cell.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    * Gets the table cell that contains the inline image. If it is not contained in a table cell, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    * Gets the table that contains the inline image. If it is not contained in a table, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    * Specifies a number that describes the width of the inline image.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object InlinePictureLoadOptions {
  
  inline def apply(): InlinePictureLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlinePictureLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlinePictureLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAltTextDescription(value: Boolean): Self = StObject.set(x, "altTextDescription", value.asInstanceOf[js.Any])
    
    inline def setAltTextDescriptionUndefined: Self = StObject.set(x, "altTextDescription", js.undefined)
    
    inline def setAltTextTitle(value: Boolean): Self = StObject.set(x, "altTextTitle", value.asInstanceOf[js.Any])
    
    inline def setAltTextTitleUndefined: Self = StObject.set(x, "altTextTitle", js.undefined)
    
    inline def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHyperlink(value: Boolean): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
    
    inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
    
    inline def setLockAspectRatio(value: Boolean): Self = StObject.set(x, "lockAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setLockAspectRatioUndefined: Self = StObject.set(x, "lockAspectRatio", js.undefined)
    
    inline def setParagraph(value: ParagraphLoadOptions): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    inline def setParentContentControl(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControl", value.asInstanceOf[js.Any])
    
    inline def setParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControlOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentContentControlOrNullObjectUndefined: Self = StObject.set(x, "parentContentControlOrNullObject", js.undefined)
    
    inline def setParentContentControlUndefined: Self = StObject.set(x, "parentContentControl", js.undefined)
    
    inline def setParentTable(value: TableLoadOptions): Self = StObject.set(x, "parentTable", value.asInstanceOf[js.Any])
    
    inline def setParentTableCell(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCell", value.asInstanceOf[js.Any])
    
    inline def setParentTableCellOrNullObject(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCellOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentTableCellOrNullObjectUndefined: Self = StObject.set(x, "parentTableCellOrNullObject", js.undefined)
    
    inline def setParentTableCellUndefined: Self = StObject.set(x, "parentTableCell", js.undefined)
    
    inline def setParentTableOrNullObject(value: TableLoadOptions): Self = StObject.set(x, "parentTableOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentTableOrNullObjectUndefined: Self = StObject.set(x, "parentTableOrNullObject", js.undefined)
    
    inline def setParentTableUndefined: Self = StObject.set(x, "parentTable", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
