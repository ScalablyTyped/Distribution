package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2Action extends StObject {
  
  /** The digest of the Command to run, which MUST be present in the ContentAddressableStorage. */
  var commandDigest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
  
  /** If true, then the `Action`'s result cannot be cached, and in-flight requests for the same `Action` may not be merged. */
  var doNotCache: js.UndefOr[Boolean] = js.native
  
  /**
    * The digest of the root Directory for the input files. The files in the directory tree are available in the correct location on the build machine before the command is executed. The
    * root directory, as well as every subdirectory and content blob referred to, MUST be in the ContentAddressableStorage.
    */
  var inputRootDigest: js.UndefOr[BuildBazelRemoteExecutionV2Digest] = js.native
  
  /**
    * List of required supported NodeProperty keys. In order to ensure that equivalent `Action`s always hash to the same value, the supported node properties MUST be lexicographically
    * sorted by name. Sorting of strings is done by code point, equivalently, by the UTF-8 bytes. The interpretation of these properties is server-dependent. If a property is not
    * recognized by the server, the server will return an `INVALID_ARGUMENT` error.
    */
  var outputNodeProperties: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A timeout after which the execution should be killed. If the timeout is absent, then the client is specifying that the execution should continue as long as the server will let it.
    * The server SHOULD impose a timeout if the client does not specify one, however, if the client does specify a timeout that is longer than the server's maximum timeout, the server
    * MUST reject the request. The timeout is a part of the Action message, and therefore two `Actions` with different timeouts are different, even if they are otherwise identical. This
    * is because, if they were not, running an `Action` with a lower timeout than is required might result in a cache hit from an execution run with a longer timeout, hiding the fact that
    * the timeout is too short. By encoding it directly in the `Action`, a lower timeout will result in a cache miss and the execution timeout will fail immediately, rather than whenever
    * the cache entry gets evicted.
    */
  var timeout: js.UndefOr[String] = js.native
}
object BuildBazelRemoteExecutionV2Action {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2Action]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ActionMutableBuilder[Self <: BuildBazelRemoteExecutionV2Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "commandDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandDigestUndefined: Self = StObject.set(x, "commandDigest", js.undefined)
    
    @scala.inline
    def setDoNotCache(value: Boolean): Self = StObject.set(x, "doNotCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotCacheUndefined: Self = StObject.set(x, "doNotCache", js.undefined)
    
    @scala.inline
    def setInputRootDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "inputRootDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputRootDigestUndefined: Self = StObject.set(x, "inputRootDigest", js.undefined)
    
    @scala.inline
    def setOutputNodeProperties(value: js.Array[String]): Self = StObject.set(x, "outputNodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputNodePropertiesUndefined: Self = StObject.set(x, "outputNodeProperties", js.undefined)
    
    @scala.inline
    def setOutputNodePropertiesVarargs(value: String*): Self = StObject.set(x, "outputNodeProperties", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
