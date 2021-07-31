package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2Blob extends StObject {
  
  /** The contents of the blob. */
  var contents: js.UndefOr[String] = js.undefined
  
  /** The digest of the blob. This should be verified by the receiver. */
  var digest: js.UndefOr[GoogleDevtoolsRemoteworkersV1test2Digest] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2Blob {
  
  @scala.inline
  def apply(): GoogleDevtoolsRemoteworkersV1test2Blob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2Blob]
  }
  
  @scala.inline
  implicit class GoogleDevtoolsRemoteworkersV1test2BlobMutableBuilder[Self <: GoogleDevtoolsRemoteworkersV1test2Blob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setDigest(value: GoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}
