package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Full attachments are used to create new attachments or returned when the attachments option
  * is true.
  */
@js.native
trait FullAttachment extends Attachment {
  
  /**
    * Mime type of the attachment
    */
  var content_type: String = js.native
  
  /**
    * {string} if `binary` was `false`
    * {Blob|Buffer} if `binary` was `true`
    */
  var data: AttachmentData = js.native
  
  /** MD5 hash, starts with "md5-" prefix; populated by PouchDB for new attachments */
  var digest: js.UndefOr[String] = js.native
}
object FullAttachment {
  
  @scala.inline
  def apply(content_type: String, data: AttachmentData): FullAttachment = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullAttachment]
  }
  
  @scala.inline
  implicit class FullAttachmentMutableBuilder[Self <: FullAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: AttachmentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}
