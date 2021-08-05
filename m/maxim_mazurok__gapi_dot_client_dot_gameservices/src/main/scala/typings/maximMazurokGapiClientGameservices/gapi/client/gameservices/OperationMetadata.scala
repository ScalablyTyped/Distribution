package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationMetadata extends StObject {
  
  /** Output only. API version used to start the operation. */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /** Output only. The time the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time the operation finished running. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Operation status for Game Services API operations. Operation status is in the form of key-value pairs where keys are resource IDs and the values show the status of the
    * operation. In case of failures, the value includes an error code and error message.
    */
  var operationStatus: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.gameservices.gapi.client.gameservices.OperationStatus}
    */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.OperationMetadata & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * Output only. Identifies whether the user has requested cancellation of the operation. Operations that have successfully been cancelled have Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  var requestedCancellation: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Human-readable status of the operation, if any. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** Output only. Server-defined resource path for the target of the operation. */
  var target: js.UndefOr[String] = js.undefined
  
  /** Output only. List of Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Name of the verb executed by the operation. */
  var verb: js.UndefOr[String] = js.undefined
}
object OperationMetadata {
  
  inline def apply(): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadata]
  }
  
  extension [Self <: OperationMetadata](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setOperationStatus(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.gameservices.gapi.client.gameservices.OperationStatus}
      */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.OperationMetadata & TopLevel[js.Any]
    ): Self = StObject.set(x, "operationStatus", value.asInstanceOf[js.Any])
    
    inline def setOperationStatusUndefined: Self = StObject.set(x, "operationStatus", js.undefined)
    
    inline def setRequestedCancellation(value: Boolean): Self = StObject.set(x, "requestedCancellation", value.asInstanceOf[js.Any])
    
    inline def setRequestedCancellationUndefined: Self = StObject.set(x, "requestedCancellation", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
