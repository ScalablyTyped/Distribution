package typings
package officeDashJsDashPreviewLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Contains a collection of {@link Word.ContentControl} objects. Content controls are bounded and potentially labeled regions in a document that serve as containers for specific types of content. Individual content controls may contain contents such as images, tables, or paragraphs of formatted text. Currently, only rich text content controls are supported.
         *
         * [Api set: WordApi 1.1]
         */

trait ContentControlCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
               *
               * [Api set: WordApi 1.1]
               */
  var appearance: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
               *
               * [Api set: WordApi 1.1]
               */
  var cannotDelete: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets a value that indicates whether the user can edit the contents of the content control.
               *
               * [Api set: WordApi 1.1]
               */
  var cannotEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
               *
               * [Api set: WordApi 1.1]
               */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the text format of the content control. Use this to get and set font name, size, color, and other properties.
              *
              * [Api set: WordApi 1.1]
              */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets an integer that represents the content control identifier. Read-only.
               *
               * [Api set: WordApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the parent body of the content control.
              *
              * [Api set: WordApi 1.3]
              */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the content control that contains the content control. Throws if there isn't a parent content control.
              *
              * [Api set: WordApi 1.1]
              */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the content control that contains the content control. Returns a null object if there isn't a parent content control.
              *
              * [Api set: WordApi 1.3]
              */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the table that contains the content control. Throws if it is not contained in a table.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the table cell that contains the content control. Throws if it is not contained in a table cell.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the table cell that contains the content control. Returns a null object if it is not contained in a table cell.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the table that contains the content control. Returns a null object if it is not contained in a table.
              *
              * [Api set: WordApi 1.3]
              */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
               *
               * [Api set: WordApi 1.1]
               */
  var placeholderText: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
               *
               * [Api set: WordApi 1.1]
               */
  var removeWhenEdited: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
               *
               * [Api set: WordApi 1.1]
               */
  var style: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
               *
               * [Api set: WordApi 1.3]
               */
  var styleBuiltIn: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the content control subtype. The subtype can be 'RichTextInline', 'RichTextParagraphs', 'RichTextTableCell', 'RichTextTableRow' and 'RichTextTable' for rich text content controls. Read-only.
               *
               * [Api set: WordApi 1.3]
               */
  var subtype: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets a tag to identify a content control.
               *
               * [Api set: WordApi 1.1]
               */
  var tag: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the text of the content control. Read-only.
               *
               * [Api set: WordApi 1.1]
               */
  var text: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets the title for a content control.
               *
               * [Api set: WordApi 1.1]
               */
  var title: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the content control type. Only rich text content controls are supported currently. Read-only.
               *
               * [Api set: WordApi 1.1]
               */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
}

