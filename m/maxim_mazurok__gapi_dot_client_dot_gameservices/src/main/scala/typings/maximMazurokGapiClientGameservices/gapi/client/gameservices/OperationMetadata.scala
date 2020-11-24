package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationMetadata extends js.Object {
  
  /** Output only. API version used to start the operation. */
  var apiVersion: js.UndefOr[String] = js.native
  
  /** Output only. The time the operation was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The time the operation finished running. */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. Operation status for Game Services API operations. Operation status is in the form of key-value pairs where keys are resource IDs and the values show the status of the
    * operation. In case of failures, the value includes an error code and error message.
    */
  var operationStatus: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.gameservices.gapi.client.gameservices.OperationStatus}
    */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.OperationMetadata with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Output only. Identifies whether the user has requested cancellation of the operation. Operations that have successfully been cancelled have Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  var requestedCancellation: js.UndefOr[Boolean] = js.native
  
  /** Output only. Human-readable status of the operation, if any. */
  var statusMessage: js.UndefOr[String] = js.native
  
  /** Output only. Server-defined resource path for the target of the operation. */
  var target: js.UndefOr[String] = js.native
  
  /** Output only. List of Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
  
  /** Output only. Name of the verb executed by the operation. */
  var verb: js.UndefOr[String] = js.native
}
object OperationMetadata {
  
  @scala.inline
  def apply(): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadata]
  }
  
  @scala.inline
  implicit class OperationMetadataOps[Self <: OperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setOperationStatus(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.gameservices.gapi.client.gameservices.OperationStatus}
      */ typings.maximMazurokGapiClientGameservices.maximMazurokGapiClientGameservicesStrings.OperationMetadata with TopLevel[js.Any]
    ): Self = this.set("operationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationStatus: Self = this.set("operationStatus", js.undefined)
    
    @scala.inline
    def setRequestedCancellation(value: Boolean): Self = this.set("requestedCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedCancellation: Self = this.set("requestedCancellation", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
    
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
  }
}
