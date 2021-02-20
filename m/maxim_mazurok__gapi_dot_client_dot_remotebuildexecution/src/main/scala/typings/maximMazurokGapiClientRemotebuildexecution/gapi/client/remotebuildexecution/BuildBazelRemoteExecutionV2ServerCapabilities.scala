package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2ServerCapabilities extends StObject {
  
  /** Capabilities of the remote cache system. */
  var cacheCapabilities: js.UndefOr[BuildBazelRemoteExecutionV2CacheCapabilities] = js.native
  
  /** Earliest RE API version supported, including deprecated versions. */
  var deprecatedApiVersion: js.UndefOr[BuildBazelSemverSemVer] = js.native
  
  /** Capabilities of the remote execution system. */
  var executionCapabilities: js.UndefOr[BuildBazelRemoteExecutionV2ExecutionCapabilities] = js.native
  
  /** Latest RE API version supported. */
  var highApiVersion: js.UndefOr[BuildBazelSemverSemVer] = js.native
  
  /** Earliest non-deprecated RE API version supported. */
  var lowApiVersion: js.UndefOr[BuildBazelSemverSemVer] = js.native
}
object BuildBazelRemoteExecutionV2ServerCapabilities {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2ServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ServerCapabilities]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ServerCapabilitiesMutableBuilder[Self <: BuildBazelRemoteExecutionV2ServerCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheCapabilities(value: BuildBazelRemoteExecutionV2CacheCapabilities): Self = StObject.set(x, "cacheCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheCapabilitiesUndefined: Self = StObject.set(x, "cacheCapabilities", js.undefined)
    
    @scala.inline
    def setDeprecatedApiVersion(value: BuildBazelSemverSemVer): Self = StObject.set(x, "deprecatedApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedApiVersionUndefined: Self = StObject.set(x, "deprecatedApiVersion", js.undefined)
    
    @scala.inline
    def setExecutionCapabilities(value: BuildBazelRemoteExecutionV2ExecutionCapabilities): Self = StObject.set(x, "executionCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionCapabilitiesUndefined: Self = StObject.set(x, "executionCapabilities", js.undefined)
    
    @scala.inline
    def setHighApiVersion(value: BuildBazelSemverSemVer): Self = StObject.set(x, "highApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighApiVersionUndefined: Self = StObject.set(x, "highApiVersion", js.undefined)
    
    @scala.inline
    def setLowApiVersion(value: BuildBazelSemverSemVer): Self = StObject.set(x, "lowApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowApiVersionUndefined: Self = StObject.set(x, "lowApiVersion", js.undefined)
  }
}
