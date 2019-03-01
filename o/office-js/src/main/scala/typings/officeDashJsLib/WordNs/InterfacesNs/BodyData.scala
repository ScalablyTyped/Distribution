package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "body.toJSON()". */
trait BodyData extends js.Object {
  /**
    *
    * Gets the collection of rich text content control objects in the body. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.undefined
  /**
    *
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.undefined
  /**
    *
    * Gets the collection of InlinePicture objects in the body. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
  /**
    *
    * Gets the collection of list objects in the body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var lists: js.UndefOr[js.Array[ListData]] = js.undefined
  /**
    *
    * Gets the collection of paragraph objects in the body. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Throws if there isn't a parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBody: js.UndefOr[BodyData] = js.undefined
  /**
    *
    * Gets the parent body of the body. For example, a table cell body's parent body could be a header. Returns a null object if there isn't a parent body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentBodyOrNullObject: js.UndefOr[BodyData] = js.undefined
  /**
    *
    * Gets the content control that contains the body. Throws if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var parentContentControl: js.UndefOr[ContentControlData] = js.undefined
  /**
    *
    * Gets the content control that contains the body. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlData] = js.undefined
  /**
    *
    * Gets the parent section of the body. Throws if there isn't a parent section. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentSection: js.UndefOr[SectionData] = js.undefined
  /**
    *
    * Gets the parent section of the body. Returns a null object if there isn't a parent section. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var parentSectionOrNullObject: js.UndefOr[SectionData] = js.undefined
  /**
    *
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any
  ] = js.undefined
  /**
    *
    * Gets the collection of table objects in the body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  /**
    *
    * Gets the text of the body. Use the insertText method to insert text. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    officeDashJsLib.WordNs.BodyType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.MainDoc | officeDashJsLib.officeDashJsLibStrings.Section | officeDashJsLib.officeDashJsLibStrings.Header | officeDashJsLib.officeDashJsLibStrings.Footer | officeDashJsLib.officeDashJsLibStrings.TableCell
  ] = js.undefined
}

object BodyData {
  @scala.inline
  def apply(
    contentControls: js.Array[ContentControlData] = null,
    font: FontData = null,
    inlinePictures: js.Array[InlinePictureData] = null,
    lists: js.Array[ListData] = null,
    paragraphs: js.Array[ParagraphData] = null,
    parentBody: BodyData = null,
    parentBodyOrNullObject: BodyData = null,
    parentContentControl: ContentControlData = null,
    parentContentControlOrNullObject: ContentControlData = null,
    parentSection: SectionData = null,
    parentSectionOrNullObject: SectionData = null,
    style: java.lang.String = null,
    styleBuiltIn: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any = null,
    tables: js.Array[TableData] = null,
    text: java.lang.String = null,
    `type`: officeDashJsLib.WordNs.BodyType | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.MainDoc | officeDashJsLib.officeDashJsLibStrings.Section | officeDashJsLib.officeDashJsLibStrings.Header | officeDashJsLib.officeDashJsLibStrings.Footer | officeDashJsLib.officeDashJsLibStrings.TableCell = null
  ): BodyData = {
    val __obj = js.Dynamic.literal()
    if (contentControls != null) __obj.updateDynamic("contentControls")(contentControls)
    if (font != null) __obj.updateDynamic("font")(font)
    if (inlinePictures != null) __obj.updateDynamic("inlinePictures")(inlinePictures)
    if (lists != null) __obj.updateDynamic("lists")(lists)
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs)
    if (parentBody != null) __obj.updateDynamic("parentBody")(parentBody)
    if (parentBodyOrNullObject != null) __obj.updateDynamic("parentBodyOrNullObject")(parentBodyOrNullObject)
    if (parentContentControl != null) __obj.updateDynamic("parentContentControl")(parentContentControl)
    if (parentContentControlOrNullObject != null) __obj.updateDynamic("parentContentControlOrNullObject")(parentContentControlOrNullObject)
    if (parentSection != null) __obj.updateDynamic("parentSection")(parentSection)
    if (parentSectionOrNullObject != null) __obj.updateDynamic("parentSectionOrNullObject")(parentSectionOrNullObject)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyData]
  }
}

