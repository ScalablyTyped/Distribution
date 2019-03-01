package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stub attachments are returned by PouchDB by default (attachments option set to false)
  */
trait StubAttachment extends Attachment {
  /**
    * Mime type of the attachment
    */
  var content_type: java.lang.String
  /**
    * Database digest of the attachment
    */
  var digest: java.lang.String
  /**
    * Length of the attachment
    */
  var length: scala.Double
  /**
    * Attachment is a stub
    */
  var stub: pouchdbDashCoreLib.pouchdbDashCoreLibNumbers.`true`
}

object StubAttachment {
  @scala.inline
  def apply(
    content_type: java.lang.String,
    digest: java.lang.String,
    length: scala.Double,
    stub: pouchdbDashCoreLib.pouchdbDashCoreLibNumbers.`true`
  ): StubAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content_type")(content_type)
    __obj.updateDynamic("digest")(digest)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("stub")(stub)
    __obj.asInstanceOf[StubAttachment]
  }
}

