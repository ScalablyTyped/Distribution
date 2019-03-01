package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

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
  var content_type: java.lang.String
  /**
    * {string} if `binary` was `false`
    * {Blob|Buffer} if `binary` was `true`
    */
  var data: AttachmentData
  /** MD5 hash, starts with "md5-" prefix; populated by PouchDB for new attachments */
  var digest: js.UndefOr[java.lang.String] = js.undefined
}

object FullAttachment {
  @scala.inline
  def apply(content_type: java.lang.String, data: AttachmentData, digest: java.lang.String = null): FullAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content_type")(content_type)
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest)
    __obj.asInstanceOf[FullAttachment]
  }
}

