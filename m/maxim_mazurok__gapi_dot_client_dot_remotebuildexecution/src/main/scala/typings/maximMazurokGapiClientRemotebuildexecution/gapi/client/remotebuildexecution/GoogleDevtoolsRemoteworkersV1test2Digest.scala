package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleDevtoolsRemoteworkersV1test2Digest extends js.Object {
  
  /** A string-encoded hash (eg "1a2b3c", not the byte array [0x1a, 0x2b, 0x3c]) using an implementation-defined hash algorithm (eg SHA-256). */
  var hash: js.UndefOr[String] = js.native
  
  /**
    * The size of the contents. While this is not strictly required as part of an identifier (after all, any given hash will have exactly one canonical size), it's useful in almost all
    * cases when one might want to send or retrieve blobs of content and is included here for this reason.
    */
  var sizeBytes: js.UndefOr[String] = js.native
}
object GoogleDevtoolsRemoteworkersV1test2Digest {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemoteworkersV1test2Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2Digest]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemoteworkersV1test2DigestOps[Self <: GoogleDevtoolsRemoteworkersV1test2Digest] (val x: Self) extends AnyVal {
    
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: String): Self = this.set("sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeBytes: Self = this.set("sizeBytes", js.undefined)
  }
}
