package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata extends StObject {
  
  /** A pointer to the contents of the directory, in the form of a marshalled Directory message. */
  var digest: js.UndefOr[GoogleDevtoolsRemoteworkersV1test2Digest] = js.undefined
  
  /** The path of the directory, as in FileMetadata.path. */
  var path: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata {
  
  inline def apply(): GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata] (val x: Self) extends AnyVal {
    
    inline def setDigest(value: GoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
