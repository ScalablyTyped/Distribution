package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange extends StObject {
  
  var maxPriority: js.UndefOr[Double] = js.undefined
  
  var minPriority: js.UndefOr[Double] = js.undefined
}
object BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange {
  
  inline def apply(): BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange](x: Self) {
    
    inline def setMaxPriority(value: Double): Self = StObject.set(x, "maxPriority", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityUndefined: Self = StObject.set(x, "maxPriority", js.undefined)
    
    inline def setMinPriority(value: Double): Self = StObject.set(x, "minPriority", value.asInstanceOf[js.Any])
    
    inline def setMinPriorityUndefined: Self = StObject.set(x, "minPriority", js.undefined)
  }
}
