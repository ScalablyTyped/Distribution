package typings.mendixmodelsdk

import org.scalablytyped.runtime.StringDictionary
import typings.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typings.mendixmodelsdk.srcSdkConfigurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.srcSdkInternalTransportationMod.IRequestFileDownloadOptions
import typings.mendixmodelsdk.srcSdkInternalTransportationMod.IRequestMultipartBinaryFileUploadOptions
import typings.mendixmodelsdk.srcSdkInternalTransportationMod.IRequestOptions
import typings.mendixmodelsdk.srcSdkInternalTransportationMod.IResponseCallback
import typings.mendixmodelsdk.srcSdkInternalTransportationMod.ITransportation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalRestTransportationMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/RestTransportation", "RestTransportation")
  @js.native
  open class RestTransportation protected ()
    extends StObject
       with ITransportation {
    def this(config: ISdkConfig) = this()
    
    /* private */ var config: Any = js.native
    
    /* private */ var generateStandardOptions: Any = js.native
    
    /* private */ var got: Any = js.native
    
    /* private */ var handleRequest: Any = js.native
    
    /* private */ var prepareRequestOptions: Any = js.native
    
    /**
      * Send a HTTP request, with specified method, url, data, success and failure callbacks.
      */
    /* CompleteClass */
    override def request[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
    
    /* CompleteClass */
    override def requestFileDownload[T](options: IRequestFileDownloadOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
    
    /* CompleteClass */
    override def requestMultipartBinaryFileUpload[T](
      options: IRequestMultipartBinaryFileUploadOptions,
      success: IResponseCallback[T],
      failure: IErrorCallback
    ): Unit = js.native
    
    /* private */ var retryRequest: Any = js.native
    
    /**
      * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
      */
    /* CompleteClass */
    override def retryableRequest[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
    
    /* private */ var sanitizedMethod: Any = js.native
  }
  
  trait IRequestResult extends StObject {
    
    var body: Any
    
    var headers: StringDictionary[Any]
    
    var statusCode: Double
  }
  object IRequestResult {
    
    inline def apply(body: Any, headers: StringDictionary[Any], statusCode: Double): IRequestResult = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestResult]
    }
    
    extension [Self <: IRequestResult](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
