package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full attachments are used to create new attachments or returned when the attachments option
  * is true.
  */
trait FullAttachment extends js.Object {
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

