package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2PriorityCapabilities extends StObject {
  
  var priorities: js.UndefOr[js.Array[BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]] = js.undefined
}
object BuildBazelRemoteExecutionV2PriorityCapabilities {
  
  inline def apply(): BuildBazelRemoteExecutionV2PriorityCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2PriorityCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildBazelRemoteExecutionV2PriorityCapabilities] (val x: Self) extends AnyVal {
    
    inline def setPriorities(value: js.Array[BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]): Self = StObject.set(x, "priorities", value.asInstanceOf[js.Any])
    
    inline def setPrioritiesUndefined: Self = StObject.set(x, "priorities", js.undefined)
    
    inline def setPrioritiesVarargs(value: BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange*): Self = StObject.set(x, "priorities", js.Array(value*))
  }
}
