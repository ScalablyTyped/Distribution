package typings.maximMazurokGapiClientFirebaseml

import org.scalablytyped.runtime.TopLevel
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebaseml.anon.Accesstoken
import typings.maximMazurokGapiClientFirebaseml.anon.Alt
import typings.maximMazurokGapiClientFirebaseml.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object firebaseml {
      
      // tslint:disable-next-line:no-empty-interface
      trait CancelOperationRequest extends StObject
      
      // tslint:disable-next-line:no-empty-interface
      trait Empty extends StObject
      
      trait ListOperationsResponse extends StObject {
        
        /** The standard List next-page token. */
        var nextPageToken: js.UndefOr[String] = js.undefined
        
        /** A list of operations that matches the specified filter in the request. */
        var operations: js.UndefOr[js.Array[Operation]] = js.undefined
      }
      object ListOperationsResponse {
        
        inline def apply(): ListOperationsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListOperationsResponse]
        }
        
        extension [Self <: ListOperationsResponse](x: Self) {
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          inline def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
          
          inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
          
          inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
        }
      }
      
      trait ModelOperationMetadata extends StObject {
        
        var basicOperationStatus: js.UndefOr[String] = js.undefined
        
        /** The name of the model we are creating/updating The name must have the form `projects/{project_id}/models/{model_id}` */
        var name: js.UndefOr[String] = js.undefined
      }
      object ModelOperationMetadata {
        
        inline def apply(): ModelOperationMetadata = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ModelOperationMetadata]
        }
        
        extension [Self <: ModelOperationMetadata](x: Self) {
          
          inline def setBasicOperationStatus(value: String): Self = StObject.set(x, "basicOperationStatus", value.asInstanceOf[js.Any])
          
          inline def setBasicOperationStatusUndefined: Self = StObject.set(x, "basicOperationStatus", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        }
      }
      
      trait Operation extends StObject {
        
        /** If the value is `false`, it means the operation is still in progress. If `true`, the operation is completed, and either `error` or `response` is available. */
        var done: js.UndefOr[Boolean] = js.undefined
        
        /** The error result of the operation in case of failure or cancellation. */
        var error: js.UndefOr[Status] = js.undefined
        
        /**
          * Service-specific metadata associated with the operation. It typically contains progress information and common metadata such as create time. Some services might not provide such
          * metadata. Any method that returns a long-running operation should document the metadata type, if any.
          */
        var metadata: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.Operation & TopLevel[js.Any]
              ] = js.undefined
        
        /**
          * The server-assigned name, which is only unique within the same service that originally returns it. If you use the default HTTP mapping, the `name` should be a resource name ending
          * with `operations/{unique_id}`.
          */
        var name: js.UndefOr[String] = js.undefined
        
        /**
          * The normal response of the operation in case of success. If the original method returns no data on success, such as `Delete`, the response is `google.protobuf.Empty`. If the
          * original method is standard `Get`/`Create`/`Update`, the response should be the resource. For other methods, the response should have the type `XxxResponse`, where `Xxx` is the
          * original method name. For example, if the original method name is `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
          */
        var response: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.Operation & TopLevel[js.Any]
              ] = js.undefined
      }
      object Operation {
        
        inline def apply(): Operation = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Operation]
        }
        
        extension [Self <: Operation](x: Self) {
          
          inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
          
          inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
          
          inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
          
          inline def setMetadata(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.Operation & TopLevel[js.Any]
          ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
          
          inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setResponse(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.Operation & TopLevel[js.Any]
          ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
          
          inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
        }
      }
      
      @js.native
      trait OperationsResource extends StObject {
        
        /**
          * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed. If the server doesn't support
          * this method, it returns `google.rpc.Code.UNIMPLEMENTED`. Clients can use Operations.GetOperation or other methods to check whether the cancellation succeeded or whether the
          * operation completed despite cancellation. On successful cancellation, the operation is not deleted; instead, it becomes an operation with an Operation.error value with a
          * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
          */
        def cancel(request: Accesstoken): Request[js.Object] = js.native
        def cancel(request: Alt, body: CancelOperationRequest): Request[js.Object] = js.native
        
        /**
          * Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't
          * support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
          */
        def delete(): Request[js.Object] = js.native
        def delete(request: Alt): Request[js.Object] = js.native
        
        /**
          * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE: the `name` binding allows API services
          * to override the binding to use different resource name schemes, such as `users/∗/operations`. To override the binding, API services can add a binding such as
          * `"/v1/{name=users/ *}/operations"` to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must
          * ensure the name binding is the parent resource, without the operations collection id.
          */
        def list(): Request[ListOperationsResponse] = js.native
        def list(request: Callback): Request[ListOperationsResponse] = js.native
      }
      
      trait Status extends StObject {
        
        /** The status code, which should be an enum value of google.rpc.Code. */
        var code: js.UndefOr[Double] = js.undefined
        
        /** A list of messages that carry the error details. There is a common set of message types for APIs to use. */
        var details: js.UndefOr[
                js.Array[
                  /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.Status & TopLevel[js.Any]
                ]
              ] = js.undefined
        
        /**
          * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the
          * client.
          */
        var message: js.UndefOr[String] = js.undefined
      }
      object Status {
        
        inline def apply(): Status = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Status]
        }
        
        extension [Self <: Status](x: Self) {
          
          inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
          
          inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
          
          inline def setDetails(
            value: js.Array[
                      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.Status & TopLevel[js.Any]
                    ]
          ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
          
          inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
          
          inline def setDetailsVarargs(
            value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.Status & TopLevel[js.Any])*
          ): Self = StObject.set(x, "details", js.Array(value :_*))
          
          inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
          
          inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        }
      }
    }
  }
}
