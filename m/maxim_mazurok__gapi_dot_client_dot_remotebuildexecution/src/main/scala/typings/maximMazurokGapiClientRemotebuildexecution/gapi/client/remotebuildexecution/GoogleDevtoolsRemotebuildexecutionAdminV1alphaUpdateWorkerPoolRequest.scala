package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest extends StObject {
  
  /**
    * The update mask applies to worker_pool. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask If an empty
    * update_mask is provided, only the non-default valued field in the worker pool field will be updated. Note that in order to update a field to the default value (zero, false, empty
    * string) an explicit update_mask must be provided.
    */
  var updateMask: js.UndefOr[String] = js.undefined
  
  /** Specifies the worker pool to update. */
  var workerPool: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.undefined
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest {
  
  inline def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest]
  }
  
  extension [Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest](x: Self) {
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
    
    inline def setWorkerPool(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool): Self = StObject.set(x, "workerPool", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolUndefined: Self = StObject.set(x, "workerPool", js.undefined)
  }
}
