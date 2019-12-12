package typings.officeDashJs.Word

import org.scalablytyped.runtime.TopLevel
import typings.officeDashJs.Word.ContentControlType.buildingBlockGallery
import typings.officeDashJs.Word.ContentControlType.checkBox
import typings.officeDashJs.Word.ContentControlType.comboBox
import typings.officeDashJs.Word.ContentControlType.datePicker
import typings.officeDashJs.Word.ContentControlType.dropDownList
import typings.officeDashJs.Word.ContentControlType.picture
import typings.officeDashJs.Word.ContentControlType.plainText
import typings.officeDashJs.Word.ContentControlType.plainTextInline
import typings.officeDashJs.Word.ContentControlType.plainTextParagraph
import typings.officeDashJs.Word.ContentControlType.repeatingSection
import typings.officeDashJs.Word.ContentControlType.richText
import typings.officeDashJs.Word.ContentControlType.richTextInline
import typings.officeDashJs.Word.ContentControlType.richTextParagraphs
import typings.officeDashJs.Word.ContentControlType.richTextTable
import typings.officeDashJs.Word.ContentControlType.richTextTableCell
import typings.officeDashJs.Word.ContentControlType.richTextTableRow
import typings.officeDashJs.Word.ContentControlType.unknown
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ContentControlType with String] = js.native
  /* "BuildingBlockGallery" */ @js.native
  object buildingBlockGallery extends TopLevel[buildingBlockGallery with String]
  
  /* "CheckBox" */ @js.native
  object checkBox extends TopLevel[checkBox with String]
  
  /* "ComboBox" */ @js.native
  object comboBox extends TopLevel[comboBox with String]
  
  /* "DatePicker" */ @js.native
  object datePicker extends TopLevel[datePicker with String]
  
  /* "DropDownList" */ @js.native
  object dropDownList extends TopLevel[dropDownList with String]
  
  /* "Picture" */ @js.native
  object picture extends TopLevel[picture with String]
  
  /* "PlainText" */ @js.native
  object plainText extends TopLevel[plainText with String]
  
  /* "PlainTextInline" */ @js.native
  object plainTextInline extends TopLevel[plainTextInline with String]
  
  /* "PlainTextParagraph" */ @js.native
  object plainTextParagraph extends TopLevel[plainTextParagraph with String]
  
  /* "RepeatingSection" */ @js.native
  object repeatingSection extends TopLevel[repeatingSection with String]
  
  /* "RichText" */ @js.native
  object richText extends TopLevel[richText with String]
  
  /* "RichTextInline" */ @js.native
  object richTextInline extends TopLevel[richTextInline with String]
  
  /* "RichTextParagraphs" */ @js.native
  object richTextParagraphs extends TopLevel[richTextParagraphs with String]
  
  /* "RichTextTable" */ @js.native
  object richTextTable extends TopLevel[richTextTable with String]
  
  /* "RichTextTableCell" */ @js.native
  object richTextTableCell extends TopLevel[richTextTableCell with String]
  
  /* "RichTextTableRow" */ @js.native
  object richTextTableRow extends TopLevel[richTextTableRow with String]
  
  /* "Unknown" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}

