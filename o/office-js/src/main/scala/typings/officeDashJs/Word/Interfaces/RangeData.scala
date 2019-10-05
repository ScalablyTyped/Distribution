package typings.officeDashJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "range.toJSON()". */
trait RangeData extends js.Object {
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
  var hyperlink: js.UndefOr[String] = js.undefined
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
  var isEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the style name for the range. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the range. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets the text of the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.undefined
}

object RangeData {
  @scala.inline
  def apply(
    font: FontData = null,
    hyperlink: String = null,
    inlinePictures: js.Array[InlinePictureData] = null,
    isEmpty: js.UndefOr[Boolean] = js.undefined,
    style: String = null,
    styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any = null,
    text: String = null
  ): RangeData = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (inlinePictures != null) __obj.updateDynamic("inlinePictures")(inlinePictures)
    if (!js.isUndefined(isEmpty)) __obj.updateDynamic("isEmpty")(isEmpty)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[RangeData]
  }
}

