package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool extends StObject {
  
  /** The autoscale policy to apply on a pool. */
  var autoscale: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscale] = js.undefined
  
  /** Channel specifies the release channel of the pool. */
  var channel: js.UndefOr[String] = js.undefined
  
  /**
    * WorkerPool resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`. name should not be populated when creating a worker pool since it is
    * provided in the `poolId` field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. State of the worker pool. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Specifies the properties, such as machine type and disk size, used for creating workers in a worker pool. */
  var workerConfig: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig] = js.undefined
  
  /** The desired number of workers in the worker pool. Must be a value between 0 and 15000. */
  var workerCount: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool {
  
  inline def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]
  }
  
  extension [Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool](x: Self) {
    
    inline def setAutoscale(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscale): Self = StObject.set(x, "autoscale", value.asInstanceOf[js.Any])
    
    inline def setAutoscaleUndefined: Self = StObject.set(x, "autoscale", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWorkerConfig(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig): Self = StObject.set(x, "workerConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigUndefined: Self = StObject.set(x, "workerConfig", js.undefined)
    
    inline def setWorkerCount(value: String): Self = StObject.set(x, "workerCount", value.asInstanceOf[js.Any])
    
    inline def setWorkerCountUndefined: Self = StObject.set(x, "workerCount", js.undefined)
  }
}
