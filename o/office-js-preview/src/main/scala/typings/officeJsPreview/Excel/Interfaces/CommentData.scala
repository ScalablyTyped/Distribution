package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.CommentMention
import typings.officeJsPreview.Excel.ContentType
import typings.officeJsPreview.officeJsPreviewStrings.Mention
import typings.officeJsPreview.officeJsPreviewStrings.Plain
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `comment.toJSON()`. */
@js.native
trait CommentData extends js.Object {
  /**
    *
    * Gets the email of the comment's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorEmail: js.UndefOr[String] = js.native
  /**
    *
    * Gets the name of the comment's author.
    *
    * [Api set: ExcelApi 1.10]
    */
  var authorName: js.UndefOr[String] = js.native
  /**
    *
    * The comment's content. The string is plain text.
    *
    * [Api set: ExcelApi 1.10]
    */
  var content: js.UndefOr[String] = js.native
  /**
    *
    * Gets the content type of the comment.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var contentType: js.UndefOr[ContentType | Plain | Mention] = js.native
  /**
    *
    * Gets the creation time of the comment. Returns null if the comment was converted from a note, since the comment does not have a creation date.
    *
    * [Api set: ExcelApi 1.10]
    */
  var creationDate: js.UndefOr[Date] = js.native
  /**
    *
    * Specifies the comment identifier.
    *
    * [Api set: ExcelApi 1.10]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Gets the entities (e.g., people) that are mentioned in comments.
    *
    * [Api set: ExcelApi 1.11]
    */
  var mentions: js.UndefOr[js.Array[CommentMention]] = js.native
  /**
    *
    * Represents a collection of reply objects associated with the comment.
    *
    * [Api set: ExcelApi 1.10]
    */
  var replies: js.UndefOr[js.Array[CommentReplyData]] = js.native
  /**
    *
    * The comment thread status. A value of "true" means the comment thread is resolved.
    *
    * [Api set: ExcelApi 1.11]
    */
  var resolved: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the rich comment content (e.g., mentions in comments). This string is not meant to be displayed to end-users. Your add-in should only use this to parse rich comment content.
    *
    * [Api set: ExcelApi 1.11]
    */
  var richContent: js.UndefOr[String] = js.native
}

object CommentData {
  @scala.inline
  def apply(): CommentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentData]
  }
  @scala.inline
  implicit class CommentDataOps[Self <: CommentData] (val x: Self) extends AnyVal {
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
    def setAuthorEmail(value: String): Self = this.set("authorEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorEmail: Self = this.set("authorEmail", js.undefined)
    @scala.inline
    def setAuthorName(value: String): Self = this.set("authorName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorName: Self = this.set("authorName", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentType(value: ContentType | Plain | Mention): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setCreationDate(value: Date): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMentionsVarargs(value: CommentMention*): Self = this.set("mentions", js.Array(value :_*))
    @scala.inline
    def setMentions(value: js.Array[CommentMention]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    @scala.inline
    def setRepliesVarargs(value: CommentReplyData*): Self = this.set("replies", js.Array(value :_*))
    @scala.inline
    def setReplies(value: js.Array[CommentReplyData]): Self = this.set("replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    @scala.inline
    def setResolved(value: Boolean): Self = this.set("resolved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolved: Self = this.set("resolved", js.undefined)
    @scala.inline
    def setRichContent(value: String): Self = this.set("richContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRichContent: Self = this.set("richContent", js.undefined)
  }
  
}

