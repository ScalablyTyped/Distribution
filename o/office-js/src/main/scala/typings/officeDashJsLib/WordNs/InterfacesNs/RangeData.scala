package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "range.toJSON()". */

trait RangeData extends js.Object {
  /**
              *
              * Gets the collection of content control objects in the range. Read-only.
              *
              * [Api set: WordApi 1.1]
              */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.undefined
  /**
              *
              * Gets the text format of the range. Use this to get and set font name, size, color, and other properties. Read-only.
              *
              * [Api set: WordApi 1.1]
              */
  var font: js.UndefOr[FontData] = js.undefined
  /**
               *
               * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range. Use a '#' to separate the address part from the optional location part.
               *
               * [Api set: WordApi 1.3]
               */
  var hyperlink: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * Gets the collection of inline picture objects in the range. Read-only.
              *
              * [Api set: WordApi 1.2]
              */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
  /**
               *
               * Checks whether the range length is zero. Read-only.
               *
               * [Api set: WordApi 1.3]
               */
  var isEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Gets the collection of list objects in the range. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var lists: js.UndefOr[js.Array[ListData]] = js.undefined
  /**
              *
              * Gets the collection of paragraph objects in the range. Read-only.
              *
              * [Api set: WordApi 1.1]
              */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
  /**
              *
              * Gets the parent body of the range. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var parentBody: js.UndefOr[BodyData] = js.undefined
  /**
              *
              * Gets the content control that contains the range. Throws if there isn't a parent content control. Read-only.
              *
              * [Api set: WordApi 1.1]
              */
  var parentContentControl: js.UndefOr[ContentControlData] = js.undefined
  /**
              *
              * Gets the content control that contains the range. Returns a null object if there isn't a parent content control. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlData] = js.undefined
  /**
              *
              * Gets the table that contains the range. Throws if it is not contained in a table. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTable: js.UndefOr[TableData] = js.undefined
  /**
              *
              * Gets the table cell that contains the range. Throws if it is not contained in a table cell. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTableCell: js.UndefOr[TableCellData] = js.undefined
  /**
              *
              * Gets the table cell that contains the range. Returns a null object if it is not contained in a table cell. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTableCellOrNullObject: js.UndefOr[TableCellData] = js.undefined
  /**
              *
              * Gets the table that contains the range. Returns a null object if it is not contained in a table. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTableOrNullObject: js.UndefOr[TableData] = js.undefined
  /**
               *
               * Gets or sets the style name for the range. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
               *
               * [Api set: WordApi 1.1]
               */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets or sets the built-in style name for the range. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
               *
               * [Api set: WordApi 1.3]
               */
  var styleBuiltIn: js.UndefOr[/* LimitUnionLength: was union type with length 149 */js.Any] = js.undefined
  /**
              *
              * Gets the collection of table objects in the range. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  /**
               *
               * Gets the text of the range. Read-only.
               *
               * [Api set: WordApi 1.1]
               */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

