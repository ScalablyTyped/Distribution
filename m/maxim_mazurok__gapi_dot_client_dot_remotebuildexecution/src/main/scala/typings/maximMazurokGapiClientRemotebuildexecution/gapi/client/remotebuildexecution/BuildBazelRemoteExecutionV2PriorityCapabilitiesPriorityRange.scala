package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange extends StObject {
  
  var maxPriority: js.UndefOr[Double] = js.native
  
  var minPriority: js.UndefOr[Double] = js.native
}
object BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRangeMutableBuilder[Self <: BuildBazelRemoteExecutionV2PriorityCapabilitiesPriorityRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxPriority(value: Double): Self = StObject.set(x, "maxPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPriorityUndefined: Self = StObject.set(x, "maxPriority", js.undefined)
    
    @scala.inline
    def setMinPriority(value: Double): Self = StObject.set(x, "minPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPriorityUndefined: Self = StObject.set(x, "minPriority", js.undefined)
  }
}
