package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ContentControl object, for use in "contentControl.set({ ... })". */

trait ContentControlUpdateData extends js.Object {
  /**
               *
               * Gets or sets the appearance of the content control. The value can be 'BoundingBox', 'Tags', or 'Hidden'.
               *
               * [Api set: WordApi 1.1]
               */
  var appearance: js.UndefOr[
    officeDashJsLib.WordNs.ContentControlAppearance | officeDashJsLib.officeDashJsLibStrings.BoundingBox | officeDashJsLib.officeDashJsLibStrings.Tags | officeDashJsLib.officeDashJsLibStrings.Hidden
  ] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether the user can delete the content control. Mutually exclusive with removeWhenEdited.
               *
               * [Api set: WordApi 1.1]
               */
  var cannotDelete: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether the user can edit the contents of the content control.
               *
               * [Api set: WordApi 1.1]
               */
  var cannotEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the color of the content control. Color is specified in '#RRGGBB' format or by using the color name.
               *
               * [Api set: WordApi 1.1]
               */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * Gets the text format of the content control. Use this to get and set font name, size, color, and other properties.
              *
              * [Api set: WordApi 1.1]
              */
  var font: js.UndefOr[FontUpdateData] = js.undefined
  /**
               *
               * Gets or sets the placeholder text of the content control. Dimmed text will be displayed when the content control is empty.
               *
               * [Api set: WordApi 1.1]
               */
  var placeholderText: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets or sets a value that indicates whether the content control is removed after it is edited. Mutually exclusive with cannotDelete.
               *
               * [Api set: WordApi 1.1]
               */
  var removeWhenEdited: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the style name for the content control. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
               *
               * [Api set: WordApi 1.1]
               */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets or sets the built-in style name for the content control. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
               *
               * [Api set: WordApi 1.3]
               */
  var styleBuiltIn: js.UndefOr[/* LimitUnionLength: was union type with length 149 */js.Any] = js.undefined
  /**
               *
               * Gets or sets a tag to identify a content control.
               *
               * [Api set: WordApi 1.1]
               */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets or sets the title for a content control.
               *
               * [Api set: WordApi 1.1]
               */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

