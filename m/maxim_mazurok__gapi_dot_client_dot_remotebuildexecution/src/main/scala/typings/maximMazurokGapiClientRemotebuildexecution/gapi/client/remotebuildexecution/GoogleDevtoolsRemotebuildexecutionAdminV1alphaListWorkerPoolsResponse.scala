package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse extends StObject {
  
  /** The list of worker pools in a given instance. */
  var workerPools: js.UndefOr[js.Array[GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]] = js.undefined
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse {
  
  inline def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  }
  
  extension [Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse](x: Self) {
    
    inline def setWorkerPools(value: js.Array[GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]): Self = StObject.set(x, "workerPools", value.asInstanceOf[js.Any])
    
    inline def setWorkerPoolsUndefined: Self = StObject.set(x, "workerPools", js.undefined)
    
    inline def setWorkerPoolsVarargs(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool*): Self = StObject.set(x, "workerPools", js.Array(value :_*))
  }
}
