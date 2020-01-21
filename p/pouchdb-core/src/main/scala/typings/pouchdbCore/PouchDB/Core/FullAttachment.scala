package typings.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full attachments are used to create new attachments or returned when the attachments option
  * is true.
  */
trait FullAttachment extends Attachment {
  /**
    * Mime type of the attachment
    */
  var content_type: String
  /**
    * {string} if `binary` was `false`
    * {Blob|Buffer} if `binary` was `true`
    */
  var data: AttachmentData
  /** MD5 hash, starts with "md5-" prefix; populated by PouchDB for new attachments */
  var digest: js.UndefOr[String] = js.undefined
}

object FullAttachment {
  @scala.inline
  def apply(content_type: String, data: AttachmentData, digest: String = null): FullAttachment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullAttachment]
  }
}

