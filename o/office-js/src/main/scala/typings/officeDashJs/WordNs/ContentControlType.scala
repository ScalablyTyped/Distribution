package typings.officeDashJs.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentControlType extends js.Object

/**
  *
  * Specifies supported content control types and subtypes.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.ContentControlType")
@js.native
object ContentControlType extends js.Object {
  @js.native
  sealed trait buildingBlockGallery extends ContentControlType
  
  @js.native
  sealed trait checkBox extends ContentControlType
  
  @js.native
  sealed trait comboBox extends ContentControlType
  
  @js.native
  sealed trait datePicker extends ContentControlType
  
  @js.native
  sealed trait dropDownList extends ContentControlType
  
  @js.native
  sealed trait picture extends ContentControlType
  
  @js.native
  sealed trait plainText extends ContentControlType
  
  @js.native
  sealed trait plainTextInline extends ContentControlType
  
  @js.native
  sealed trait plainTextParagraph extends ContentControlType
  
  @js.native
  sealed trait repeatingSection extends ContentControlType
  
  /**
    *
    * Identifies a rich text content control.
    *
    */
  @js.native
  sealed trait richText extends ContentControlType
  
  @js.native
  sealed trait richTextInline extends ContentControlType
  
  @js.native
  sealed trait richTextParagraphs extends ContentControlType
  
  /**
    *
    * Contains a whole table.
    *
    */
  @js.native
  sealed trait richTextTable extends ContentControlType
  
  /**
    *
    * Contains a whole cell.
    *
    */
  @js.native
  sealed trait richTextTableCell extends ContentControlType
  
  /**
    *
    * Contains a whole row.
    *
    */
  @js.native
  sealed trait richTextTableRow extends ContentControlType
  
  @js.native
  sealed trait unknown extends ContentControlType
  
  /* "BuildingBlockGallery" */ val buildingBlockGallery: typings.officeDashJs.WordNs.ContentControlType.buildingBlockGallery with String = js.native
  /* "CheckBox" */ val checkBox: typings.officeDashJs.WordNs.ContentControlType.checkBox with String = js.native
  /* "ComboBox" */ val comboBox: typings.officeDashJs.WordNs.ContentControlType.comboBox with String = js.native
  /* "DatePicker" */ val datePicker: typings.officeDashJs.WordNs.ContentControlType.datePicker with String = js.native
  /* "DropDownList" */ val dropDownList: typings.officeDashJs.WordNs.ContentControlType.dropDownList with String = js.native
  /* "Picture" */ val picture: typings.officeDashJs.WordNs.ContentControlType.picture with String = js.native
  /* "PlainText" */ val plainText: typings.officeDashJs.WordNs.ContentControlType.plainText with String = js.native
  /* "PlainTextInline" */ val plainTextInline: typings.officeDashJs.WordNs.ContentControlType.plainTextInline with String = js.native
  /* "PlainTextParagraph" */ val plainTextParagraph: typings.officeDashJs.WordNs.ContentControlType.plainTextParagraph with String = js.native
  /* "RepeatingSection" */ val repeatingSection: typings.officeDashJs.WordNs.ContentControlType.repeatingSection with String = js.native
  /* "RichText" */ val richText: typings.officeDashJs.WordNs.ContentControlType.richText with String = js.native
  /* "RichTextInline" */ val richTextInline: typings.officeDashJs.WordNs.ContentControlType.richTextInline with String = js.native
  /* "RichTextParagraphs" */ val richTextParagraphs: typings.officeDashJs.WordNs.ContentControlType.richTextParagraphs with String = js.native
  /* "RichTextTable" */ val richTextTable: typings.officeDashJs.WordNs.ContentControlType.richTextTable with String = js.native
  /* "RichTextTableCell" */ val richTextTableCell: typings.officeDashJs.WordNs.ContentControlType.richTextTableCell with String = js.native
  /* "RichTextTableRow" */ val richTextTableRow: typings.officeDashJs.WordNs.ContentControlType.richTextTableRow with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJs.WordNs.ContentControlType.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentControlType with String] = js.native
}

