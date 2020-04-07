package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the body of a document or a section.
  *
  * [Api set: WordApi 1.1]
  */
trait BodyLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontLoadOptions] = js.undefined
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Throws an error if there isn't a parent body.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Returns a null object if there isn't a parent body.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBodyOrNullObject: js.UndefOr[BodyLoadOptions] = js.undefined
  /**
    *
    * Gets the content control that contains the body. Throws an error if there isn't a parent content control.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
    *
    * Gets the content control that contains the body. Returns a null object if there isn't a parent content control.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  /**
    *
    * Gets the parent section of the body. Throws an error if there isn't a parent section.
    *
    * [Api set: WordApi 1.3]
    */
  var parentSection: js.UndefOr[SectionLoadOptions] = js.undefined
  /**
    *
    * Gets the parent section of the body. Returns a null object if there isn't a parent section.
    *
    * [Api set: WordApi 1.3]
    */
  var parentSectionOrNullObject: js.UndefOr[SectionLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the text of the body. Use the insertText method to insert text. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}

object BodyLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    font: FontLoadOptions = null,
    parentBody: BodyLoadOptions = null,
    parentBodyOrNullObject: BodyLoadOptions = null,
    parentContentControl: ContentControlLoadOptions = null,
    parentContentControlOrNullObject: ContentControlLoadOptions = null,
    parentSection: SectionLoadOptions = null,
    parentSectionOrNullObject: SectionLoadOptions = null,
    style: js.UndefOr[Boolean] = js.undefined,
    styleBuiltIn: js.UndefOr[Boolean] = js.undefined,
    text: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Boolean] = js.undefined
  ): BodyLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (parentBody != null) __obj.updateDynamic("parentBody")(parentBody.asInstanceOf[js.Any])
    if (parentBodyOrNullObject != null) __obj.updateDynamic("parentBodyOrNullObject")(parentBodyOrNullObject.asInstanceOf[js.Any])
    if (parentContentControl != null) __obj.updateDynamic("parentContentControl")(parentContentControl.asInstanceOf[js.Any])
    if (parentContentControlOrNullObject != null) __obj.updateDynamic("parentContentControlOrNullObject")(parentContentControlOrNullObject.asInstanceOf[js.Any])
    if (parentSection != null) __obj.updateDynamic("parentSection")(parentSection.asInstanceOf[js.Any])
    if (parentSectionOrNullObject != null) __obj.updateDynamic("parentSectionOrNullObject")(parentSectionOrNullObject.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(styleBuiltIn)) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyLoadOptions]
  }
}

