package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2ServerCapabilities extends StObject {
  
  /** Capabilities of the remote cache system. */
  var cacheCapabilities: js.UndefOr[BuildBazelRemoteExecutionV2CacheCapabilities] = js.undefined
  
  /** Earliest RE API version supported, including deprecated versions. */
  var deprecatedApiVersion: js.UndefOr[BuildBazelSemverSemVer] = js.undefined
  
  /** Capabilities of the remote execution system. */
  var executionCapabilities: js.UndefOr[BuildBazelRemoteExecutionV2ExecutionCapabilities] = js.undefined
  
  /** Latest RE API version supported. */
  var highApiVersion: js.UndefOr[BuildBazelSemverSemVer] = js.undefined
  
  /** Earliest non-deprecated RE API version supported. */
  var lowApiVersion: js.UndefOr[BuildBazelSemverSemVer] = js.undefined
}
object BuildBazelRemoteExecutionV2ServerCapabilities {
  
  inline def apply(): BuildBazelRemoteExecutionV2ServerCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ServerCapabilities]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2ServerCapabilities](x: Self) {
    
    inline def setCacheCapabilities(value: BuildBazelRemoteExecutionV2CacheCapabilities): Self = StObject.set(x, "cacheCapabilities", value.asInstanceOf[js.Any])
    
    inline def setCacheCapabilitiesUndefined: Self = StObject.set(x, "cacheCapabilities", js.undefined)
    
    inline def setDeprecatedApiVersion(value: BuildBazelSemverSemVer): Self = StObject.set(x, "deprecatedApiVersion", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedApiVersionUndefined: Self = StObject.set(x, "deprecatedApiVersion", js.undefined)
    
    inline def setExecutionCapabilities(value: BuildBazelRemoteExecutionV2ExecutionCapabilities): Self = StObject.set(x, "executionCapabilities", value.asInstanceOf[js.Any])
    
    inline def setExecutionCapabilitiesUndefined: Self = StObject.set(x, "executionCapabilities", js.undefined)
    
    inline def setHighApiVersion(value: BuildBazelSemverSemVer): Self = StObject.set(x, "highApiVersion", value.asInstanceOf[js.Any])
    
    inline def setHighApiVersionUndefined: Self = StObject.set(x, "highApiVersion", js.undefined)
    
    inline def setLowApiVersion(value: BuildBazelSemverSemVer): Self = StObject.set(x, "lowApiVersion", value.asInstanceOf[js.Any])
    
    inline def setLowApiVersionUndefined: Self = StObject.set(x, "lowApiVersion", js.undefined)
  }
}
