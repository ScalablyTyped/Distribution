package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2ExecutionCapabilities extends StObject {
  
  /** Remote execution may only support a single digest function. */
  var digestFunction: js.UndefOr[String] = js.undefined
  
  /** Whether remote execution is enabled for the particular server/instance. */
  var execEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Supported execution priority range. */
  var executionPriorityCapabilities: js.UndefOr[BuildBazelRemoteExecutionV2PriorityCapabilities] = js.undefined
  
  /** Supported node properties. */
  var supportedNodeProperties: js.UndefOr[js.Array[String]] = js.undefined
}
object BuildBazelRemoteExecutionV2ExecutionCapabilities {
  
  @scala.inline
  def apply(): BuildBazelRemoteExecutionV2ExecutionCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ExecutionCapabilities]
  }
  
  @scala.inline
  implicit class BuildBazelRemoteExecutionV2ExecutionCapabilitiesMutableBuilder[Self <: BuildBazelRemoteExecutionV2ExecutionCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigestFunction(value: String): Self = StObject.set(x, "digestFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestFunctionUndefined: Self = StObject.set(x, "digestFunction", js.undefined)
    
    @scala.inline
    def setExecEnabled(value: Boolean): Self = StObject.set(x, "execEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecEnabledUndefined: Self = StObject.set(x, "execEnabled", js.undefined)
    
    @scala.inline
    def setExecutionPriorityCapabilities(value: BuildBazelRemoteExecutionV2PriorityCapabilities): Self = StObject.set(x, "executionPriorityCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionPriorityCapabilitiesUndefined: Self = StObject.set(x, "executionPriorityCapabilities", js.undefined)
    
    @scala.inline
    def setSupportedNodeProperties(value: js.Array[String]): Self = StObject.set(x, "supportedNodeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedNodePropertiesUndefined: Self = StObject.set(x, "supportedNodeProperties", js.undefined)
    
    @scala.inline
    def setSupportedNodePropertiesVarargs(value: String*): Self = StObject.set(x, "supportedNodeProperties", js.Array(value :_*))
  }
}
