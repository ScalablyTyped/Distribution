package typings.mendixmodelsdk

import org.scalablytyped.runtime.StringDictionary
import typings.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalTransportationMod {
  
  trait IRequestFileDownloadOptions extends StObject {
    
    var method: RequestMethod
    
    var url: String
  }
  object IRequestFileDownloadOptions {
    
    inline def apply(method: RequestMethod, url: String): IRequestFileDownloadOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestFileDownloadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRequestFileDownloadOptions] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRequestMultipartBinaryFileUploadOptions extends StObject {
    
    var body: js.UndefOr[js.Object] = js.undefined
    
    var fileName: String | Blob
    
    var fileParameterName: String
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var method: RequestMethod
    
    var url: String
  }
  object IRequestMultipartBinaryFileUploadOptions {
    
    inline def apply(fileName: String | Blob, fileParameterName: String, method: RequestMethod, url: String): IRequestMultipartBinaryFileUploadOptions = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fileParameterName = fileParameterName.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestMultipartBinaryFileUploadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRequestMultipartBinaryFileUploadOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setFileName(value: String | Blob): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileParameterName(value: String): Self = StObject.set(x, "fileParameterName", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRequestOptions extends StObject {
    
    var body: js.UndefOr[js.Object] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var longTimeout: js.UndefOr[Boolean] = js.undefined
    
    var method: RequestMethod
    
    var url: String
  }
  object IRequestOptions {
    
    inline def apply(method: RequestMethod, url: String): IRequestOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setLongTimeout(value: Boolean): Self = StObject.set(x, "longTimeout", value.asInstanceOf[js.Any])
      
      inline def setLongTimeoutUndefined: Self = StObject.set(x, "longTimeout", js.undefined)
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResponse extends StObject {
    
    var headers: StringDictionary[Any]
  }
  object IResponse {
    
    inline def apply(headers: StringDictionary[Any]): IResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResponse] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  type IResponseCallback[T] = js.Function2[/* data */ T, /* response */ IResponse, Unit]
  
  trait ITransportation extends StObject {
    
    /**
      * Send a HTTP request, with specified method, url, data, success and failure callbacks.
      */
    def request[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
    
    def requestFileDownload[T](options: IRequestFileDownloadOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
    
    def requestMultipartBinaryFileUpload[T](
      options: IRequestMultipartBinaryFileUploadOptions,
      success: IResponseCallback[T],
      failure: IErrorCallback
    ): Unit
    
    /**
      * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
      */
    def retryableRequest[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
  }
  object ITransportation {
    
    inline def apply(
      request: (IRequestOptions, IResponseCallback[Any], IErrorCallback) => Unit,
      requestFileDownload: (IRequestFileDownloadOptions, IResponseCallback[Any], IErrorCallback) => Unit,
      requestMultipartBinaryFileUpload: (IRequestMultipartBinaryFileUploadOptions, IResponseCallback[Any], IErrorCallback) => Unit,
      retryableRequest: (IRequestOptions, IResponseCallback[Any], IErrorCallback) => Unit
    ): ITransportation = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction3(request), requestFileDownload = js.Any.fromFunction3(requestFileDownload), requestMultipartBinaryFileUpload = js.Any.fromFunction3(requestMultipartBinaryFileUpload), retryableRequest = js.Any.fromFunction3(retryableRequest))
      __obj.asInstanceOf[ITransportation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITransportation] (val x: Self) extends AnyVal {
      
      inline def setRequest(value: (IRequestOptions, IResponseCallback[Any], IErrorCallback) => Unit): Self = StObject.set(x, "request", js.Any.fromFunction3(value))
      
      inline def setRequestFileDownload(value: (IRequestFileDownloadOptions, IResponseCallback[Any], IErrorCallback) => Unit): Self = StObject.set(x, "requestFileDownload", js.Any.fromFunction3(value))
      
      inline def setRequestMultipartBinaryFileUpload(value: (IRequestMultipartBinaryFileUploadOptions, IResponseCallback[Any], IErrorCallback) => Unit): Self = StObject.set(x, "requestMultipartBinaryFileUpload", js.Any.fromFunction3(value))
      
      inline def setRetryableRequest(value: (IRequestOptions, IResponseCallback[Any], IErrorCallback) => Unit): Self = StObject.set(x, "retryableRequest", js.Any.fromFunction3(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.mendixmodelsdkStrings.get
    - typings.mendixmodelsdk.mendixmodelsdkStrings.put
    - typings.mendixmodelsdk.mendixmodelsdkStrings.post
    - typings.mendixmodelsdk.mendixmodelsdkStrings.delete
  */
  trait RequestMethod extends StObject
  object RequestMethod {
    
    inline def delete: typings.mendixmodelsdk.mendixmodelsdkStrings.delete = "delete".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.delete]
    
    inline def get: typings.mendixmodelsdk.mendixmodelsdkStrings.get = "get".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.get]
    
    inline def post: typings.mendixmodelsdk.mendixmodelsdkStrings.post = "post".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.post]
    
    inline def put: typings.mendixmodelsdk.mendixmodelsdkStrings.put = "put".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.put]
  }
}
