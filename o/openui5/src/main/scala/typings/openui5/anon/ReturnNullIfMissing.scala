package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnNullIfMissing extends StObject {
  
  /**
    * Whether the .properties file should be loaded asynchronously or not
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A map of additional header key/value pairs to send along with the request (see `headers` option of `jQuery.ajax`)
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Whether `null` should be returned for a missing properties file; by default an empty collection is returned
    */
  var returnNullIfMissing: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The URL to the .properties file which should be loaded
    */
  var url: js.UndefOr[String] = js.undefined
}
object ReturnNullIfMissing {
  
  inline def apply(): ReturnNullIfMissing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnNullIfMissing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnNullIfMissing] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturnNullIfMissing(value: js.Object): Self = StObject.set(x, "returnNullIfMissing", value.asInstanceOf[js.Any])
    
    inline def setReturnNullIfMissingUndefined: Self = StObject.set(x, "returnNullIfMissing", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
