package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.pouchdbCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pouchdbCore.PouchDB.Core.StubAttachment
  - typings.pouchdbCore.PouchDB.Core.FullAttachment
*/
trait Attachment extends StObject
object Attachment {
  
  @scala.inline
  def FullAttachment(content_type: String, data: AttachmentData): typings.pouchdbCore.PouchDB.Core.FullAttachment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pouchdbCore.PouchDB.Core.FullAttachment]
  }
  
  @scala.inline
  def StubAttachment(content_type: String, digest: String, length: Double, stub: `true`): typings.pouchdbCore.PouchDB.Core.StubAttachment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stub = stub.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pouchdbCore.PouchDB.Core.StubAttachment]
  }
}
