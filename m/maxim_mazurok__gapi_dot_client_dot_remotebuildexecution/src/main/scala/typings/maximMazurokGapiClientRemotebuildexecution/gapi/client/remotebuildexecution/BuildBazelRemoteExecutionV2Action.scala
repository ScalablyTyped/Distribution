package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2Action extends StObject {
  
  /** The digest of the Command to run, which MUST be present in the ContentAddressableStorage. */
  var commandDigest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /** If true, then the `Action`'s result cannot be cached, and in-flight requests for the same `Action` may not be merged. */
  var doNotCache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The digest of the root Directory for the input files. The files in the directory tree are available in the correct location on the build machine before the command is executed. The
    * root directory, as well as every subdirectory and content blob referred to, MUST be in the ContentAddressableStorage.
    */
  var inputRootDigest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /**
    * List of required supported NodeProperty keys. In order to ensure that equivalent `Action`s always hash to the same value, the supported node properties MUST be lexicographically
    * sorted by name. Sorting of strings is done by code point, equivalently, by the UTF-8 bytes. The interpretation of these properties is server-dependent. If a property is not
    * recognized by the server, the server will return an `INVALID_ARGUMENT` error.
    */
  var outputNodeProperties: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A timeout after which the execution should be killed. If the timeout is absent, then the client is specifying that the execution should continue as long as the server will let it.
    * The server SHOULD impose a timeout if the client does not specify one, however, if the client does specify a timeout that is longer than the server's maximum timeout, the server
    * MUST reject the request. The timeout is a part of the Action message, and therefore two `Actions` with different timeouts are different, even if they are otherwise identical. This
    * is because, if they were not, running an `Action` with a lower timeout than is required might result in a cache hit from an execution run with a longer timeout, hiding the fact that
    * the timeout is too short. By encoding it directly in the `Action`, a lower timeout will result in a cache miss and the execution timeout will fail immediately, rather than whenever
    * the cache entry gets evicted.
    */
  var timeout: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2Action {
  
  inline def apply(): BuildBazelRemoteExecutionV2Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Action]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2Action](x: Self) {
    
    inline def setCommandDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "commandDigest", value.asInstanceOf[js.Any])
    
    inline def setCommandDigestUndefined: Self = StObject.set(x, "commandDigest", js.undefined)
    
    inline def setDoNotCache(value: Boolean): Self = StObject.set(x, "doNotCache", value.asInstanceOf[js.Any])
    
    inline def setDoNotCacheUndefined: Self = StObject.set(x, "doNotCache", js.undefined)
    
    inline def setInputRootDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "inputRootDigest", value.asInstanceOf[js.Any])
    
    inline def setInputRootDigestUndefined: Self = StObject.set(x, "inputRootDigest", js.undefined)
    
    inline def setOutputNodeProperties(value: js.Array[String]): Self = StObject.set(x, "outputNodeProperties", value.asInstanceOf[js.Any])
    
    inline def setOutputNodePropertiesUndefined: Self = StObject.set(x, "outputNodeProperties", js.undefined)
    
    inline def setOutputNodePropertiesVarargs(value: String*): Self = StObject.set(x, "outputNodeProperties", js.Array(value :_*))
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
