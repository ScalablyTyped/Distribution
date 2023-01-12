package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange extends StObject {
  
  /** The maximum numeric value for this priority range, which represents the least urgent task or shortest retained item. */
  var maxPriority: js.UndefOr[Double] = js.undefined
  
  /** The minimum numeric value for this priority range, which represents the most urgent task or longest retained item. */
  var minPriority: js.UndefOr[Double] = js.undefined
}
object BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange {
  
  inline def apply(): BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange] (val x: Self) extends AnyVal {
    
    inline def setMaxPriority(value: Double): Self = StObject.set(x, "maxPriority", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityUndefined: Self = StObject.set(x, "maxPriority", js.undefined)
    
    inline def setMinPriority(value: Double): Self = StObject.set(x, "minPriority", value.asInstanceOf[js.Any])
    
    inline def setMinPriorityUndefined: Self = StObject.set(x, "minPriority", js.undefined)
  }
}
