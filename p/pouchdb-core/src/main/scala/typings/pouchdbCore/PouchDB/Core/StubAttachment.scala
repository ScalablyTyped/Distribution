package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.pouchdbCoreBooleans.`true`
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
  var content_type: String
  /**
    * Database digest of the attachment
    */
  var digest: String
  /**
    * Length of the attachment
    */
  var length: Double
  /**
    * Attachment is a stub
    */
  var stub: `true`
}

object StubAttachment {
  @scala.inline
  def apply(content_type: String, digest: String, length: Double, stub: `true`): StubAttachment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stub = stub.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StubAttachment]
  }
}

