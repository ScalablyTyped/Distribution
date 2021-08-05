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
  
  inline def apply(): GoogleDevtoolsRemoteworkersV1test2Blob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2Blob]
  }
  
  extension [Self <: GoogleDevtoolsRemoteworkersV1test2Blob](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setDigest(value: GoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}
