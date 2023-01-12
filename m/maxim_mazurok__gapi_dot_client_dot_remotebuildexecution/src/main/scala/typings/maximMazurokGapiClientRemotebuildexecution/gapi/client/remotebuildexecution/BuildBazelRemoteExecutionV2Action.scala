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
    * The optional platform requirements for the execution environment. The server MAY choose to execute the action on any worker satisfying the requirements, so the client SHOULD ensure
    * that running the action on any such worker will have the same result. A detailed lexicon for this can be found in the accompanying platform.md. New in version 2.2: clients SHOULD
    * set these platform properties as well as those in the Command. Servers SHOULD prefer those set here.
    */
  var platform: js.UndefOr[BuildBazelRemoteExecutionV2Platform] = js.undefined
  
  /**
    * An optional additional salt value used to place this `Action` into a separate cache namespace from other instances having the same field contents. This salt typically comes from
    * operational configuration specific to sources such as repo and service configuration, and allows disowning an entire set of ActionResults that might have been poisoned by buggy
    * software or tool failures.
    */
  var salt: js.UndefOr[String] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildBazelRemoteExecutionV2Action] (val x: Self) extends AnyVal {
    
    inline def setCommandDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "commandDigest", value.asInstanceOf[js.Any])
    
    inline def setCommandDigestUndefined: Self = StObject.set(x, "commandDigest", js.undefined)
    
    inline def setDoNotCache(value: Boolean): Self = StObject.set(x, "doNotCache", value.asInstanceOf[js.Any])
    
    inline def setDoNotCacheUndefined: Self = StObject.set(x, "doNotCache", js.undefined)
    
    inline def setInputRootDigest(value: BuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "inputRootDigest", value.asInstanceOf[js.Any])
    
    inline def setInputRootDigestUndefined: Self = StObject.set(x, "inputRootDigest", js.undefined)
    
    inline def setPlatform(value: BuildBazelRemoteExecutionV2Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
