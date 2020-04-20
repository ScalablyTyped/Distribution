package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.pouchdbCoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pouchdbCore.PouchDB.Core.StubAttachment
  - typings.pouchdbCore.PouchDB.Core.FullAttachment
*/
trait Attachment extends js.Object

object Attachment {
  @scala.inline
  def StubAttachment(content_type: String, digest: String, length: Double, stub: `true`): Attachment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stub = stub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  @scala.inline
  def FullAttachment(content_type: String, data: AttachmentData, digest: String = null): Attachment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

