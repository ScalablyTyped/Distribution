package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2Digest extends StObject {
  
  /** The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long. */
  var hash: js.UndefOr[String] = js.undefined
  
  /** The size of the blob, in bytes. */
  var sizeBytes: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2Digest {
  
  inline def apply(): BuildBazelRemoteExecutionV2Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Digest]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2Digest](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
  }
}
