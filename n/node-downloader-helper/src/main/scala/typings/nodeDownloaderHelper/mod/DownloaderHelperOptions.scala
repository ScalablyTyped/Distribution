package typings.nodeDownloaderHelper.mod

import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.DELETE
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.GET
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.OPTIONS
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.POST
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloaderHelperOptions extends StObject {
  
  /** parameter accepted by http.request write function req.write(body) (default(null)) */
  var body: js.UndefOr[Any] = js.undefined
  
  /** Custom filename when saved */
  var fileName: js.UndefOr[String | FilenameCallback | FilenameDefinition] = js.undefined
  
  /** If the server does not return the "accept-ranges" header, can be force if it does support it */
  var forceResume: js.UndefOr[Boolean] = js.undefined
  
  /** Custom HTTP Header ex: Authorization, User-Agent */
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** Override the http request options */
  var httpRequestOptions: js.UndefOr[js.Object] = js.undefined
  
  /** Override the https request options, ex: to add SSL Certs */
  var httpsRequestOptions: js.UndefOr[js.Object] = js.undefined
  
  /* custom metadata for the user retrieve later */
  var metadata: js.UndefOr[js.Object | Null] = js.undefined
  
  /** Request Method Verb */
  var method: js.UndefOr[GET | PUT | POST | DELETE | OPTIONS] = js.undefined
  
  /** Behavior when local file already exists (default:false)*/
  var `override`: js.UndefOr[Boolean | OverrideOptions] = js.undefined
  
  /** interval time of the 'progress.throttled' event will be emitted (default:1000) */
  var progressThrottle: js.UndefOr[Double] = js.undefined
  
  /** remove the file when fail (default:true) */
  var removeOnFail: js.UndefOr[Boolean] = js.undefined
  
  /** remove the file when is stopped (default:true) */
  var removeOnStop: js.UndefOr[Boolean] = js.undefined
  
  /** it will resume if a file already exists and is not completed, you might want to set removeOnStop and removeOnFail to false. If you used pipe for compression it will produce corrupted files */
  var resumeIfFileExists: js.UndefOr[Boolean] = js.undefined
  
  /** Resume download if the file is incomplete */
  var resumeOnIncomplete: js.UndefOr[Boolean] = js.undefined
  
  /** Max retry when resumeOnIncomplete is true */
  var resumeOnIncompleteMaxRetry: js.UndefOr[Double] = js.undefined
  
  var retry: js.UndefOr[Boolean | RetryOptions] = js.undefined
  
  /* Request timeout in milliseconds (-1 use default), is the equivalent of 'httpRequestOptions: { timeout: value }' (also applied to https) */
  var timeout: js.UndefOr[Double] = js.undefined
}
object DownloaderHelperOptions {
  
  inline def apply(): DownloaderHelperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloaderHelperOptions]
  }
  
  extension [Self <: DownloaderHelperOptions](x: Self) {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFileName(value: String | FilenameCallback | FilenameDefinition): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameFunction2(value: (/* fileName */ String, /* filePath */ String) => String): Self = StObject.set(x, "fileName", js.Any.fromFunction2(value))
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setForceResume(value: Boolean): Self = StObject.set(x, "forceResume", value.asInstanceOf[js.Any])
    
    inline def setForceResumeUndefined: Self = StObject.set(x, "forceResume", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHttpRequestOptions(value: js.Object): Self = StObject.set(x, "httpRequestOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestOptionsUndefined: Self = StObject.set(x, "httpRequestOptions", js.undefined)
    
    inline def setHttpsRequestOptions(value: js.Object): Self = StObject.set(x, "httpsRequestOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpsRequestOptionsUndefined: Self = StObject.set(x, "httpsRequestOptions", js.undefined)
    
    inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMethod(value: GET | PUT | POST | DELETE | OPTIONS): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOverride(value: Boolean | OverrideOptions): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setProgressThrottle(value: Double): Self = StObject.set(x, "progressThrottle", value.asInstanceOf[js.Any])
    
    inline def setProgressThrottleUndefined: Self = StObject.set(x, "progressThrottle", js.undefined)
    
    inline def setRemoveOnFail(value: Boolean): Self = StObject.set(x, "removeOnFail", value.asInstanceOf[js.Any])
    
    inline def setRemoveOnFailUndefined: Self = StObject.set(x, "removeOnFail", js.undefined)
    
    inline def setRemoveOnStop(value: Boolean): Self = StObject.set(x, "removeOnStop", value.asInstanceOf[js.Any])
    
    inline def setRemoveOnStopUndefined: Self = StObject.set(x, "removeOnStop", js.undefined)
    
    inline def setResumeIfFileExists(value: Boolean): Self = StObject.set(x, "resumeIfFileExists", value.asInstanceOf[js.Any])
    
    inline def setResumeIfFileExistsUndefined: Self = StObject.set(x, "resumeIfFileExists", js.undefined)
    
    inline def setResumeOnIncomplete(value: Boolean): Self = StObject.set(x, "resumeOnIncomplete", value.asInstanceOf[js.Any])
    
    inline def setResumeOnIncompleteMaxRetry(value: Double): Self = StObject.set(x, "resumeOnIncompleteMaxRetry", value.asInstanceOf[js.Any])
    
    inline def setResumeOnIncompleteMaxRetryUndefined: Self = StObject.set(x, "resumeOnIncompleteMaxRetry", js.undefined)
    
    inline def setResumeOnIncompleteUndefined: Self = StObject.set(x, "resumeOnIncomplete", js.undefined)
    
    inline def setRetry(value: Boolean | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
