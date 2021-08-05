package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities extends StObject {
  
  var updateEnabled: js.UndefOr[Boolean] = js.undefined
}
object BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities {
  
  inline def apply(): BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2ActionCacheUpdateCapabilities](x: Self) {
    
    inline def setUpdateEnabled(value: Boolean): Self = StObject.set(x, "updateEnabled", value.asInstanceOf[js.Any])
    
    inline def setUpdateEnabledUndefined: Self = StObject.set(x, "updateEnabled", js.undefined)
  }
}
