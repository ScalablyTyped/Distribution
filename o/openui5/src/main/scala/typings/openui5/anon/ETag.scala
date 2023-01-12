package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ETag extends StObject {
  
  /**
    * Whether the request should be done asynchronously. Please be advised that this feature is officially
    * unsupported as using asynchronous requests can lead to data inconsistencies if the application does not
    * make sure that the request was completed before continuing to work with the data.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If specified the sPath has to be relative to the path given with the context.
    */
  var context: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If specified, the If-Match-Header will be set to this Etag.
    */
  var eTag: js.UndefOr[String] = js.undefined
  
  /**
    * a callback function which is called when the request failed. The handler can have the parameter: `oError`
    * which contains additional error information.
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * if specified, this optional variable can be used to pass a payload into the delete function, e.g. if
    * the entry which should be deleted has not been bound to any control, but has been retrieved via read,
    * only.
    */
  var payload: js.UndefOr[js.Object] = js.undefined
  
  /**
    * a callback function which is called when the data has been successfully retrieved. The handler can have
    * the following parameters: `oData` and `response`.
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A map containing the parameters that will be passed as query strings
    */
  var urlParameters: js.UndefOr[Record[String, String]] = js.undefined
}
object ETag {
  
  inline def apply(): ETag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ETag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ETag] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "eTag", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrlParameters(value: Record[String, String]): Self = StObject.set(x, "urlParameters", value.asInstanceOf[js.Any])
    
    inline def setUrlParametersUndefined: Self = StObject.set(x, "urlParameters", js.undefined)
  }
}
