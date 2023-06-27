package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.BodyType
import typings.officeJs.officeJsStrings.Endnote
import typings.officeJs.officeJsStrings.Footer
import typings.officeJs.officeJsStrings.Footnote
import typings.officeJs.officeJsStrings.Header
import typings.officeJs.officeJsStrings.MainDoc
import typings.officeJs.officeJsStrings.NoteItem
import typings.officeJs.officeJsStrings.Section
import typings.officeJs.officeJsStrings.TableCell
import typings.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `body.toJSON()`. */
trait BodyData extends StObject {
  
  /**
    * Gets the collection of rich text content control objects in the body.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.undefined
  
  /**
    * Gets the collection of field objects in the body.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var fields: js.UndefOr[js.Array[FieldData]] = js.undefined
  
  /**
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.undefined
  
  /**
    * Gets the collection of InlinePicture objects in the body. The collection does not include floating images.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
  
  /**
    * Gets the collection of list objects in the body.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var lists: js.UndefOr[js.Array[ListData]] = js.undefined
  
  /**
    * Gets the collection of paragraph objects in the body. **Important**: Paragraphs in tables are not returned for requirement sets 1.1 and 1.2. From requirement set 1.3, paragraphs in tables are also returned.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
  
  /**
    * Specifies the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJs.Word.BuiltInStyleName, typings.officeJs.officeJsStrings.Other, typings.officeJs.officeJsStrings.Normal */ Any
  ] = js.undefined
  
  /**
    * Gets the collection of table objects in the body.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  
  /**
    * Gets the text of the body. Use the insertText method to insert text.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Additional types ‘Footnote’, ‘Endnote’, and ‘NoteItem’ are supported in WordApiOnline 1.1 and later.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    BodyType | Unknown_ | MainDoc | Section | Header | Footer | TableCell | Footnote | Endnote | NoteItem
  ] = js.undefined
}
object BodyData {
  
  inline def apply(): BodyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyData] (val x: Self) extends AnyVal {
    
    inline def setContentControls(value: js.Array[ContentControlData]): Self = StObject.set(x, "contentControls", value.asInstanceOf[js.Any])
    
    inline def setContentControlsUndefined: Self = StObject.set(x, "contentControls", js.undefined)
    
    inline def setContentControlsVarargs(value: ContentControlData*): Self = StObject.set(x, "contentControls", js.Array(value*))
    
    inline def setFields(value: js.Array[FieldData]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldData*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFont(value: FontData): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setInlinePictures(value: js.Array[InlinePictureData]): Self = StObject.set(x, "inlinePictures", value.asInstanceOf[js.Any])
    
    inline def setInlinePicturesUndefined: Self = StObject.set(x, "inlinePictures", js.undefined)
    
    inline def setInlinePicturesVarargs(value: InlinePictureData*): Self = StObject.set(x, "inlinePictures", js.Array(value*))
    
    inline def setLists(value: js.Array[ListData]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    inline def setListsVarargs(value: ListData*): Self = StObject.set(x, "lists", js.Array(value*))
    
    inline def setParagraphs(value: js.Array[ParagraphData]): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    inline def setParagraphsVarargs(value: ParagraphData*): Self = StObject.set(x, "paragraphs", js.Array(value*))
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltIn(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150, starting with typings.officeJs.Word.BuiltInStyleName, typings.officeJs.officeJsStrings.Other, typings.officeJs.officeJsStrings.Normal */ Any
    ): Self = StObject.set(x, "styleBuiltIn", value.asInstanceOf[js.Any])
    
    inline def setStyleBuiltInUndefined: Self = StObject.set(x, "styleBuiltIn", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTables(value: js.Array[TableData]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: TableData*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(
      value: BodyType | Unknown_ | MainDoc | Section | Header | Footer | TableCell | Footnote | Endnote | NoteItem
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
