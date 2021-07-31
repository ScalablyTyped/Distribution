package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.GoogleCloudMlV1__OperationMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1OperationMetadata extends StObject {
  
  /** The time the operation was submitted. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The time operation processing completed. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Indicates whether a request to cancel this operation has been made. */
  var isCancellationRequested: js.UndefOr[Boolean] = js.undefined
  
  /** The user labels, inherited from the model or the model version being operated on. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ GoogleCloudMlV1__OperationMetadata & TopLevel[js.Any]
  ] = js.undefined
  
  /** Contains the name of the model associated with the operation. */
  var modelName: js.UndefOr[String] = js.undefined
  
  /** The operation type. */
  var operationType: js.UndefOr[String] = js.undefined
  
  /** Contains the project number associated with the operation. */
  var projectNumber: js.UndefOr[String] = js.undefined
  
  /** The time operation processing started. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Contains the version associated with the operation. */
  var version: js.UndefOr[GoogleCloudMlV1Version] = js.undefined
}
object GoogleCloudMlV1OperationMetadata {
  
  @scala.inline
  def apply(): GoogleCloudMlV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1OperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1OperationMetadataMutableBuilder[Self <: GoogleCloudMlV1OperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setIsCancellationRequested(value: Boolean): Self = StObject.set(x, "isCancellationRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCancellationRequestedUndefined: Self = StObject.set(x, "isCancellationRequested", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ GoogleCloudMlV1__OperationMetadata & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setVersion(value: GoogleCloudMlV1Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
