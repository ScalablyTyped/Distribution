package typings.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPrepareOptions extends StObject {
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var body: js.UndefOr[Any] = js.undefined
  
  var bodyIsStream: js.UndefOr[Boolean] = js.undefined
  
  var deserializationMapper: Mapper
  
  var disableClientRequestId: js.UndefOr[Boolean] = js.undefined
  
  var disableJsonStringifyOnBody: js.UndefOr[Boolean] = js.undefined
  
  var formData: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var method: String
  
  var pathParameters: js.UndefOr[StringDictionary[Any | UrlParameterValue]] = js.undefined
  
  var queryParameters: js.UndefOr[StringDictionary[Any | UrlParameterValue]] = js.undefined
  
  var serializationMapper: Mapper
}
object RequestPrepareOptions {
  
  inline def apply(deserializationMapper: Mapper, method: String, serializationMapper: Mapper): RequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPrepareOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestPrepareOptions] (val x: Self) extends AnyVal {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyIsStream(value: Boolean): Self = StObject.set(x, "bodyIsStream", value.asInstanceOf[js.Any])
    
    inline def setBodyIsStreamUndefined: Self = StObject.set(x, "bodyIsStream", js.undefined)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setDeserializationMapper(value: Mapper): Self = StObject.set(x, "deserializationMapper", value.asInstanceOf[js.Any])
    
    inline def setDisableClientRequestId(value: Boolean): Self = StObject.set(x, "disableClientRequestId", value.asInstanceOf[js.Any])
    
    inline def setDisableClientRequestIdUndefined: Self = StObject.set(x, "disableClientRequestId", js.undefined)
    
    inline def setDisableJsonStringifyOnBody(value: Boolean): Self = StObject.set(x, "disableJsonStringifyOnBody", value.asInstanceOf[js.Any])
    
    inline def setDisableJsonStringifyOnBodyUndefined: Self = StObject.set(x, "disableJsonStringifyOnBody", js.undefined)
    
    inline def setFormData(value: StringDictionary[Any]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPathParameters(value: StringDictionary[Any | UrlParameterValue]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
    
    inline def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
    
    inline def setQueryParameters(value: StringDictionary[Any | UrlParameterValue]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setSerializationMapper(value: Mapper): Self = StObject.set(x, "serializationMapper", value.asInstanceOf[js.Any])
  }
}
