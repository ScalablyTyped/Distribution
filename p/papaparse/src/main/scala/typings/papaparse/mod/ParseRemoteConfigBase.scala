package typings.papaparse.mod

import org.scalablytyped.runtime.StringDictionary
import typings.papaparse.papaparseBooleans.`true`
import typings.std.Blob
import typings.std.BufferSource
import typings.std.FormData
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Remote parsing has options for the backing web request
trait ParseRemoteConfigBase[T]
  extends StObject
     with ParseAsyncConfigBase[T, String] {
  
  /**
    * This indicates that the string you passed as the first argument to `parse()`
    * is actually a URL from which to download a file and parse its contents.
    */
  var download: `true`
  
  /**
    * Use POST request on the URL of the download option. The value passed will be set as the body of the request.
    * @default undefined
    */
  var downloadRequestBody: js.UndefOr[Blob | BufferSource | FormData | URLSearchParams | String] = js.undefined
  
  /**
    * If defined, should be an object that describes the headers.
    * @example { 'Authorization': 'token 123345678901234567890' }
    * @default undefined
    */
  var downloadRequestHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * A boolean value passed directly into XMLHttpRequest's "withCredentials" property.
    * @default undefined
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ParseRemoteConfigBase {
  
  inline def apply[T](): ParseRemoteConfigBase[T] = {
    val __obj = js.Dynamic.literal(download = true)
    __obj.asInstanceOf[ParseRemoteConfigBase[T]]
  }
  
  extension [Self <: ParseRemoteConfigBase[?], T](x: Self & ParseRemoteConfigBase[T]) {
    
    inline def setDownload(value: `true`): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadRequestBody(value: Blob | BufferSource | FormData | URLSearchParams | String): Self = StObject.set(x, "downloadRequestBody", value.asInstanceOf[js.Any])
    
    inline def setDownloadRequestBodyUndefined: Self = StObject.set(x, "downloadRequestBody", js.undefined)
    
    inline def setDownloadRequestHeaders(value: StringDictionary[String]): Self = StObject.set(x, "downloadRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setDownloadRequestHeadersUndefined: Self = StObject.set(x, "downloadRequestHeaders", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
