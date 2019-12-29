package typings.officeDashJsDashPreview.Word.Interfaces

import typings.officeDashJsDashPreview.Word.BodyType
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Footer
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Header
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MainDoc
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Section
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.TableCell
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Unknown_
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
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
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
  var text: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[BodyType | Unknown_ | MainDoc | Section | Header | Footer | TableCell] = js.undefined
}

object BodyData {
  @scala.inline
  def apply(
    contentControls: js.Array[ContentControlData] = null,
    font: FontData = null,
    inlinePictures: js.Array[InlinePictureData] = null,
    lists: js.Array[ListData] = null,
    paragraphs: js.Array[ParagraphData] = null,
    style: String = null,
    styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any = null,
    tables: js.Array[TableData] = null,
    text: String = null,
    `type`: BodyType | Unknown_ | MainDoc | Section | Header | Footer | TableCell = null
  ): BodyData = {
    val __obj = js.Dynamic.literal()
    if (contentControls != null) __obj.updateDynamic("contentControls")(contentControls.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (inlinePictures != null) __obj.updateDynamic("inlinePictures")(inlinePictures.asInstanceOf[js.Any])
    if (lists != null) __obj.updateDynamic("lists")(lists.asInstanceOf[js.Any])
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyData]
  }
}

