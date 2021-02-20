package typings.pouchdbCore.PouchDB.Core

import typings.pouchdbCore.pouchdbCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stub attachments are returned by PouchDB by default (attachments option set to false)
  */
@js.native
trait StubAttachment extends Attachment {
  
  /**
    * Mime type of the attachment
    */
  var content_type: String = js.native
  
  /**
    * Database digest of the attachment
    */
  var digest: String = js.native
  
  /**
    * Length of the attachment
    */
  var length: Double = js.native
  
  /**
    * Attachment is a stub
    */
  var stub: `true` = js.native
}
object StubAttachment {
  
  @scala.inline
  def apply(content_type: String, digest: String, length: Double, stub: `true`): StubAttachment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], stub = stub.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubAttachment]
  }
  
  @scala.inline
  implicit class StubAttachmentMutableBuilder[Self <: StubAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStub(value: `true`): Self = StObject.set(x, "stub", value.asInstanceOf[js.Any])
  }
}
