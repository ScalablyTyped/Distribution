package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a contiguous area in a document.
         *
         * [Api set: WordApi 1.1]
         */

trait RangeLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Gets the text format of the range. Use this to get and set font name, size, color, and other properties.
              *
              * [Api set: WordApi 1.1]
              */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  /**
               *
               * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range. Use a '#' to separate the address part from the optional location part.
               *
               * [Api set: WordApi 1.3]
               */
  var hyperlink: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Checks whether the range length is zero. Read-only.
               *
               * [Api set: WordApi 1.3]
               */
  var isEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Gets the parent body of the range.
              *
              * [Api set: WordApi 1.3]
              */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  /**
              *
              * Gets the content control that contains the range. Throws if there isn't a parent content control.
              *
              * [Api set: WordApi 1.1]
              */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
              *
              * Gets the content control that contains the range. Returns a null object if there isn't a parent content control.
              *
              * [Api set: WordApi 1.3]
              */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
              *
              * Gets the table that contains the range. Throws if it is not contained in a table.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  /**
              *
              * Gets the table cell that contains the range. Throws if it is not contained in a table cell.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
              *
              * Gets the table cell that contains the range. Returns a null object if it is not contained in a table cell.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
              *
              * Gets the table that contains the range. Returns a null object if it is not contained in a table.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  /**
               *
               * Gets or sets the style name for the range. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
               *
               * [Api set: WordApi 1.1]
               */
  var style: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the built-in style name for the range. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
               *
               * [Api set: WordApi 1.3]
               */
  var styleBuiltIn: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets the text of the range. Read-only.
               *
               * [Api set: WordApi 1.1]
               */
  var text: js.UndefOr[scala.Boolean] = js.undefined
}

