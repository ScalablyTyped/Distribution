package typings.mendixmodelsdk

import org.scalablytyped.runtime.StringDictionary
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportationMod {
  
  @js.native
  trait IRequestFileDownloadOptions extends StObject {
    
    var method: RequestMethod = js.native
    
    var url: String = js.native
  }
  object IRequestFileDownloadOptions {
    
    @scala.inline
    def apply(method: RequestMethod, url: String): IRequestFileDownloadOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestFileDownloadOptions]
    }
    
    @scala.inline
    implicit class IRequestFileDownloadOptionsMutableBuilder[Self <: IRequestFileDownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRequestMultipartBinaryFileUploadOptions extends StObject {
    
    var body: js.UndefOr[js.Object] = js.native
    
    var fileName: String | Blob = js.native
    
    var fileParameterName: String = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var method: RequestMethod = js.native
    
    var url: String = js.native
  }
  object IRequestMultipartBinaryFileUploadOptions {
    
    @scala.inline
    def apply(fileName: String | Blob, fileParameterName: String, method: RequestMethod, url: String): IRequestMultipartBinaryFileUploadOptions = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fileParameterName = fileParameterName.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestMultipartBinaryFileUploadOptions]
    }
    
    @scala.inline
    implicit class IRequestMultipartBinaryFileUploadOptionsMutableBuilder[Self <: IRequestMultipartBinaryFileUploadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setFileName(value: String | Blob): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileParameterName(value: String): Self = StObject.set(x, "fileParameterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRequestOptions extends StObject {
    
    var body: js.UndefOr[js.Object] = js.native
    
    var headers: js.UndefOr[js.Object] = js.native
    
    var longTimeout: js.UndefOr[Boolean] = js.native
    
    var method: RequestMethod = js.native
    
    var url: String = js.native
  }
  object IRequestOptions {
    
    @scala.inline
    def apply(method: RequestMethod, url: String): IRequestOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestOptions]
    }
    
    @scala.inline
    implicit class IRequestOptionsMutableBuilder[Self <: IRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setLongTimeout(value: Boolean): Self = StObject.set(x, "longTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongTimeoutUndefined: Self = StObject.set(x, "longTimeout", js.undefined)
      
      @scala.inline
      def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IResponse extends StObject {
    
    var headers: StringDictionary[js.Any] = js.native
  }
  object IResponse {
    
    @scala.inline
    def apply(headers: StringDictionary[js.Any]): IResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    @scala.inline
    implicit class IResponseMutableBuilder[Self <: IResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  type IResponseCallback[T] = js.Function2[/* data */ T, /* response */ IResponse, Unit]
  
  @js.native
  trait ITransportation extends StObject {
    
    /**
      * Send a HTTP request, with specified method, url, data, success and failure callbacks.
      */
    def request[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
    
    def requestFileDownload[T](options: IRequestFileDownloadOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
    
    def requestMultipartBinaryFileUpload[T](
      options: IRequestMultipartBinaryFileUploadOptions,
      success: IResponseCallback[T],
      failure: IErrorCallback
    ): Unit = js.native
    
    /**
      * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
      */
    def retryableRequest[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
  }
  object ITransportation {
    
    @scala.inline
    def apply(
      request: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
      requestFileDownload: (IRequestFileDownloadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
      requestMultipartBinaryFileUpload: (IRequestMultipartBinaryFileUploadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit,
      retryableRequest: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit
    ): ITransportation = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction3(request), requestFileDownload = js.Any.fromFunction3(requestFileDownload), requestMultipartBinaryFileUpload = js.Any.fromFunction3(requestMultipartBinaryFileUpload), retryableRequest = js.Any.fromFunction3(retryableRequest))
      __obj.asInstanceOf[ITransportation]
    }
    
    @scala.inline
    implicit class ITransportationMutableBuilder[Self <: ITransportation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit): Self = StObject.set(x, "request", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRequestFileDownload(value: (IRequestFileDownloadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit): Self = StObject.set(x, "requestFileDownload", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRequestMultipartBinaryFileUpload(
        value: (IRequestMultipartBinaryFileUploadOptions, IResponseCallback[js.Any], IErrorCallback) => Unit
      ): Self = StObject.set(x, "requestMultipartBinaryFileUpload", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRetryableRequest(value: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Unit): Self = StObject.set(x, "retryableRequest", js.Any.fromFunction3(value))
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
    
    @scala.inline
    def delete: typings.mendixmodelsdk.mendixmodelsdkStrings.delete = "delete".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.delete]
    
    @scala.inline
    def get: typings.mendixmodelsdk.mendixmodelsdkStrings.get = "get".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.get]
    
    @scala.inline
    def post: typings.mendixmodelsdk.mendixmodelsdkStrings.post = "post".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.post]
    
    @scala.inline
    def put: typings.mendixmodelsdk.mendixmodelsdkStrings.put = "put".asInstanceOf[typings.mendixmodelsdk.mendixmodelsdkStrings.put]
  }
}
