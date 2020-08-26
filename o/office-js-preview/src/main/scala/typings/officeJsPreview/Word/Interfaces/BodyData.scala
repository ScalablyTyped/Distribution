package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.BodyType
import typings.officeJsPreview.officeJsPreviewStrings.Footer
import typings.officeJsPreview.officeJsPreviewStrings.Header
import typings.officeJsPreview.officeJsPreviewStrings.MainDoc
import typings.officeJsPreview.officeJsPreviewStrings.Section
import typings.officeJsPreview.officeJsPreviewStrings.TableCell
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `body.toJSON()`. */
@js.native
trait BodyData extends js.Object {
  /**
    *
    * Gets the collection of rich text content control objects in the body. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.native
  /**
    *
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontData] = js.native
  /**
    *
    * Gets the collection of InlinePicture objects in the body. The collection does not include floating images. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var inlinePictures: js.UndefOr[js.Array[InlinePictureData]] = js.native
  /**
    *
    * Gets the collection of list objects in the body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var lists: js.UndefOr[js.Array[ListData]] = js.native
  /**
    *
    * Gets the collection of paragraph objects in the body. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.native
  /**
    *
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.native
  /**
    *
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.native
  /**
    *
    * Gets the collection of table objects in the body. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.native
  /**
    *
    * Gets the text of the body. Use the insertText method to insert text. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var text: js.UndefOr[String] = js.native
  /**
    *
    * Gets the type of the body. The type can be 'MainDoc', 'Section', 'Header', 'Footer', or 'TableCell'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[BodyType | Unknown_ | MainDoc | Section | Header | Footer | TableCell] = js.native
}

object BodyData {
  @scala.inline
  def apply(): BodyData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyData]
  }
  @scala.inline
  implicit class BodyDataOps[Self <: BodyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentControlsVarargs(value: ContentControlData*): Self = this.set("contentControls", js.Array(value :_*))
    @scala.inline
    def setContentControls(value: js.Array[ContentControlData]): Self = this.set("contentControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentControls: Self = this.set("contentControls", js.undefined)
    @scala.inline
    def setFont(value: FontData): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setInlinePicturesVarargs(value: InlinePictureData*): Self = this.set("inlinePictures", js.Array(value :_*))
    @scala.inline
    def setInlinePictures(value: js.Array[InlinePictureData]): Self = this.set("inlinePictures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlinePictures: Self = this.set("inlinePictures", js.undefined)
    @scala.inline
    def setListsVarargs(value: ListData*): Self = this.set("lists", js.Array(value :_*))
    @scala.inline
    def setLists(value: js.Array[ListData]): Self = this.set("lists", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    @scala.inline
    def setParagraphsVarargs(value: ParagraphData*): Self = this.set("paragraphs", js.Array(value :_*))
    @scala.inline
    def setParagraphs(value: js.Array[ParagraphData]): Self = this.set("paragraphs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphs: Self = this.set("paragraphs", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleBuiltIn(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any): Self = this.set("styleBuiltIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleBuiltIn: Self = this.set("styleBuiltIn", js.undefined)
    @scala.inline
    def setTablesVarargs(value: TableData*): Self = this.set("tables", js.Array(value :_*))
    @scala.inline
    def setTables(value: js.Array[TableData]): Self = this.set("tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: BodyType | Unknown_ | MainDoc | Section | Header | Footer | TableCell): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

