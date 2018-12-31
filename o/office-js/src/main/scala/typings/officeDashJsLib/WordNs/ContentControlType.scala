package typings
package officeDashJsLib.WordNs

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
  sealed trait buildingBlockGallery
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait checkBox
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait comboBox
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait datePicker
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait dropDownList
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait picture
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait plainText
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait plainTextInline
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait plainTextParagraph
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait repeatingSection
    extends officeDashJsLib.WordNs.ContentControlType
  
  /**
    *
    * Identifies a rich text content control.
    *
    */
  @js.native
  sealed trait richText
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait richTextInline
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait richTextParagraphs
    extends officeDashJsLib.WordNs.ContentControlType
  
  /**
    *
    * Contains a whole table.
    *
    */
  @js.native
  sealed trait richTextTable
    extends officeDashJsLib.WordNs.ContentControlType
  
  /**
    *
    * Contains a whole cell.
    *
    */
  @js.native
  sealed trait richTextTableCell
    extends officeDashJsLib.WordNs.ContentControlType
  
  /**
    *
    * Contains a whole row.
    *
    */
  @js.native
  sealed trait richTextTableRow
    extends officeDashJsLib.WordNs.ContentControlType
  
  @js.native
  sealed trait unknown
    extends officeDashJsLib.WordNs.ContentControlType
  
  /* "BuildingBlockGallery" */ val buildingBlockGallery: buildingBlockGallery with java.lang.String = js.native
  /* "CheckBox" */ val checkBox: checkBox with java.lang.String = js.native
  /* "ComboBox" */ val comboBox: comboBox with java.lang.String = js.native
  /* "DatePicker" */ val datePicker: datePicker with java.lang.String = js.native
  /* "DropDownList" */ val dropDownList: dropDownList with java.lang.String = js.native
  /* "Picture" */ val picture: picture with java.lang.String = js.native
  /* "PlainText" */ val plainText: plainText with java.lang.String = js.native
  /* "PlainTextInline" */ val plainTextInline: plainTextInline with java.lang.String = js.native
  /* "PlainTextParagraph" */ val plainTextParagraph: plainTextParagraph with java.lang.String = js.native
  /* "RepeatingSection" */ val repeatingSection: repeatingSection with java.lang.String = js.native
  /* "RichText" */ val richText: richText with java.lang.String = js.native
  /* "RichTextInline" */ val richTextInline: richTextInline with java.lang.String = js.native
  /* "RichTextParagraphs" */ val richTextParagraphs: richTextParagraphs with java.lang.String = js.native
  /* "RichTextTable" */ val richTextTable: richTextTable with java.lang.String = js.native
  /* "RichTextTableCell" */ val richTextTableCell: richTextTableCell with java.lang.String = js.native
  /* "RichTextTableRow" */ val richTextTableRow: richTextTableRow with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.ContentControlType with java.lang.String] = js.native
}

