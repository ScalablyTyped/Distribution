package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2Digest extends StObject {
  
  /** The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long. */
  var hash: js.UndefOr[String] = js.native
  
  /** The size of the blob, in bytes. */
  var sizeBytes: js.UndefOr[String] = js.native
}
object BuildBazelRemoteExecutionV2Digest {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Digest]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2DigestMutableBuilder[Self <: BuildBazelRemoteExecutionV2Digest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
