package typings.mithril.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.mithril.mithrilStrings._empty
import typings.mithril.mithrilStrings.arraybuffer
import typings.mithril.mithrilStrings.blob
import typings.mithril.mithrilStrings.document
import typings.mithril.mithrilStrings.json
import typings.mithril.mithrilStrings.text
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions[T] extends StObject {
  
  /** Whether the request should be asynchronous. Defaults to true. */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /** If false, redraws mounted components upon completion of the request. If true, it does not. */
  var background: js.UndefOr[Boolean] = js.undefined
  
  /** The data to be serialized into the request body. */
  var body: js.UndefOr[Any | (js.Object & StringDictionary[Any])] = js.undefined
  
  /** Exposes the underlying XMLHttpRequest object for low-level configuration. */
  var config: js.UndefOr[
    js.Function2[/* xhr */ XMLHttpRequest, /* options */ this.type, XMLHttpRequest | Unit]
  ] = js.undefined
  
  /** A deserialization method to be applied to the response. Defaults to a small wrapper around JSON.parse that returns null for empty responses. */
  var deserialize: js.UndefOr[js.Function1[/* data */ String, T]] = js.undefined
  
  /** A hook to specify how the XMLHttpRequest response should be read. Useful for reading response headers and cookies. Defaults to a function that returns xhr.responseText */
  var extract: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* options */ this.type, T]] = js.undefined
  
  /** Headers to append to the request before sending it. */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /** The HTTP method to use. */
  var method: js.UndefOr[String] = js.undefined
  
  /** The data to be interpolated into the URL and serialized into the querystring. */
  var params: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /** A password for HTTP authorization. */
  var password: js.UndefOr[String] = js.undefined
  
  /** The expected type of the response, as a legal value of XMLHttpRequest.responseType. */
  var responseType: js.UndefOr[_empty | arraybuffer | blob | document | json | text] = js.undefined
  
  /** A serialization method to be applied to data. Defaults to JSON.stringify, or if options.data is an instance of FormData, defaults to the identity function. */
  var serialize: js.UndefOr[js.Function1[/* data */ Any, Any]] = js.undefined
  
  /** Milliseconds a request can take before automatically being terminated. */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** A constructor to be applied to each object in the response. */
  var `type`: js.UndefOr[Instantiable1[/* o */ Any, Any]] = js.undefined
  
  /**
    * Force the use of the HTTP body section for data in GET requests when set to true,
    * or the use of querystring for other HTTP methods when set to false.
    * Defaults to false for GET requests and true for other methods.
    */
  var useBody: js.UndefOr[Boolean] = js.undefined
  
  /** A username for HTTP authorization. */
  var user: js.UndefOr[String] = js.undefined
  
  /** Whether to send cookies to 3rd party domains. */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object RequestOptions {
  
  inline def apply[T](): RequestOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions[T]]
  }
  
  extension [Self <: RequestOptions[?], T](x: Self & RequestOptions[T]) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBody(value: Any | (js.Object & StringDictionary[Any])): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setConfig(value: (/* xhr */ XMLHttpRequest, RequestOptions[T]) => XMLHttpRequest | Unit): Self = StObject.set(x, "config", js.Any.fromFunction2(value))
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDeserialize(value: /* data */ String => T): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
    
    inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
    
    inline def setExtract(value: (/* xhr */ XMLHttpRequest, RequestOptions[T]) => T): Self = StObject.set(x, "extract", js.Any.fromFunction2(value))
    
    inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setResponseType(value: _empty | arraybuffer | blob | document | json | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSerialize(value: /* data */ Any => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: Instantiable1[/* o */ Any, Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseBody(value: Boolean): Self = StObject.set(x, "useBody", value.asInstanceOf[js.Any])
    
    inline def setUseBodyUndefined: Self = StObject.set(x, "useBody", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
