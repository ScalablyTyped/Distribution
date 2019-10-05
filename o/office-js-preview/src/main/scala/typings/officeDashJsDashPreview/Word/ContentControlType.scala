package typings.officeDashJsDashPreview.Word

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
  
  /* "BuildingBlockGallery" */ val buildingBlockGallery: typings.officeDashJsDashPreview.Word.ContentControlType.buildingBlockGallery with String = js.native
  /* "CheckBox" */ val checkBox: typings.officeDashJsDashPreview.Word.ContentControlType.checkBox with String = js.native
  /* "ComboBox" */ val comboBox: typings.officeDashJsDashPreview.Word.ContentControlType.comboBox with String = js.native
  /* "DatePicker" */ val datePicker: typings.officeDashJsDashPreview.Word.ContentControlType.datePicker with String = js.native
  /* "DropDownList" */ val dropDownList: typings.officeDashJsDashPreview.Word.ContentControlType.dropDownList with String = js.native
  /* "Picture" */ val picture: typings.officeDashJsDashPreview.Word.ContentControlType.picture with String = js.native
  /* "PlainText" */ val plainText: typings.officeDashJsDashPreview.Word.ContentControlType.plainText with String = js.native
  /* "PlainTextInline" */ val plainTextInline: typings.officeDashJsDashPreview.Word.ContentControlType.plainTextInline with String = js.native
  /* "PlainTextParagraph" */ val plainTextParagraph: typings.officeDashJsDashPreview.Word.ContentControlType.plainTextParagraph with String = js.native
  /* "RepeatingSection" */ val repeatingSection: typings.officeDashJsDashPreview.Word.ContentControlType.repeatingSection with String = js.native
  /* "RichText" */ val richText: typings.officeDashJsDashPreview.Word.ContentControlType.richText with String = js.native
  /* "RichTextInline" */ val richTextInline: typings.officeDashJsDashPreview.Word.ContentControlType.richTextInline with String = js.native
  /* "RichTextParagraphs" */ val richTextParagraphs: typings.officeDashJsDashPreview.Word.ContentControlType.richTextParagraphs with String = js.native
  /* "RichTextTable" */ val richTextTable: typings.officeDashJsDashPreview.Word.ContentControlType.richTextTable with String = js.native
  /* "RichTextTableCell" */ val richTextTableCell: typings.officeDashJsDashPreview.Word.ContentControlType.richTextTableCell with String = js.native
  /* "RichTextTableRow" */ val richTextTableRow: typings.officeDashJsDashPreview.Word.ContentControlType.richTextTableRow with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJsDashPreview.Word.ContentControlType.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentControlType with String] = js.native
}

