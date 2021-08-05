package typings.mendixmodelsdk

import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.transportationMod.IRequestFileDownloadOptions
import typings.mendixmodelsdk.transportationMod.IRequestMultipartBinaryFileUploadOptions
import typings.mendixmodelsdk.transportationMod.IRequestOptions
import typings.mendixmodelsdk.transportationMod.IResponseCallback
import typings.mendixmodelsdk.transportationMod.ITransportation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restTransportationMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/RestTransportation", "RestTransportation")
  @js.native
  class RestTransportation protected ()
    extends StObject
       with ITransportation {
    def this(config: ISdkConfig) = this()
    
    /* private */ var config: js.Any = js.native
    
    /* private */ var generateStandardOptions: js.Any = js.native
    
    /* private */ var handleRequest: js.Any = js.native
    
    /* private */ var prepareRequestOptions: js.Any = js.native
    
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
    
    /* private */ var retryRequest: js.Any = js.native
    
    /**
      * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
      */
    /* CompleteClass */
    override def retryableRequest[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit = js.native
    
    /* private */ var sanitizedMethod: js.Any = js.native
    
    /* private */ var url: js.Any = js.native
  }
}
