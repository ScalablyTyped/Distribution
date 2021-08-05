package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationMetadata extends StObject {
  
  /** API version. */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /** Specifies if cancellation was requested for the operation. */
  var cancelRequested: js.UndefOr[Boolean] = js.undefined
  
  /** The time the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The time the operation finished running. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Human-readable status of the operation, if any. */
  var statusDetail: js.UndefOr[String] = js.undefined
  
  /** Target of the operation - for example projects/project-1/locations/global/connectivityTests/test-1 */
  var target: js.UndefOr[String] = js.undefined
  
  /** Name of the verb executed by the operation. */
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
    
    inline def setCancelRequested(value: Boolean): Self = StObject.set(x, "cancelRequested", value.asInstanceOf[js.Any])
    
    inline def setCancelRequestedUndefined: Self = StObject.set(x, "cancelRequested", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStatusDetail(value: String): Self = StObject.set(x, "statusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "statusDetail", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
