package typings
package officeDashJsDashPreviewLib.WordNs

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
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait checkBox
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait comboBox
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait datePicker
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait dropDownList
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait picture
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait plainText
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait plainTextInline
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait plainTextParagraph
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait repeatingSection
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  /**
           *
           * Identifies a rich text content control.
           *
           */
  @js.native
  sealed trait richText
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait richTextInline
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait richTextParagraphs
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  /**
           *
           * Contains a whole table.
           *
           */
  @js.native
  sealed trait richTextTable
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  /**
           *
           * Contains a whole cell.
           *
           */
  @js.native
  sealed trait richTextTableCell
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  /**
           *
           * Contains a whole row.
           *
           */
  @js.native
  sealed trait richTextTableRow
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
  @js.native
  sealed trait unknown
    extends officeDashJsDashPreviewLib.WordNs.ContentControlType
  
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
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.ContentControlType with java.lang.String] = js.native
}

