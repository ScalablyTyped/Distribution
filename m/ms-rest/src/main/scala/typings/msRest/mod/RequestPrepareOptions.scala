package typings.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPrepareOptions extends StObject {
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var body: js.UndefOr[js.Any] = js.undefined
  
  var bodyIsStream: js.UndefOr[Boolean] = js.undefined
  
  var deserializationMapper: Mapper
  
  var disableClientRequestId: js.UndefOr[Boolean] = js.undefined
  
  var disableJsonStringifyOnBody: js.UndefOr[Boolean] = js.undefined
  
  var formData: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var method: String
  
  var pathParameters: js.UndefOr[StringDictionary[js.Any | UrlParameterValue]] = js.undefined
  
  var queryParameters: js.UndefOr[StringDictionary[js.Any | UrlParameterValue]] = js.undefined
  
  var serializationMapper: Mapper
}
object RequestPrepareOptions {
  
  @scala.inline
  def apply(deserializationMapper: Mapper, method: String, serializationMapper: Mapper): RequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPrepareOptions]
  }
  
  @scala.inline
  implicit class RequestPrepareOptionsMutableBuilder[Self <: RequestPrepareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyIsStream(value: Boolean): Self = StObject.set(x, "bodyIsStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyIsStreamUndefined: Self = StObject.set(x, "bodyIsStream", js.undefined)
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDeserializationMapper(value: Mapper): Self = StObject.set(x, "deserializationMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableClientRequestId(value: Boolean): Self = StObject.set(x, "disableClientRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableClientRequestIdUndefined: Self = StObject.set(x, "disableClientRequestId", js.undefined)
    
    @scala.inline
    def setDisableJsonStringifyOnBody(value: Boolean): Self = StObject.set(x, "disableJsonStringifyOnBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableJsonStringifyOnBodyUndefined: Self = StObject.set(x, "disableJsonStringifyOnBody", js.undefined)
    
    @scala.inline
    def setFormData(value: StringDictionary[js.Any]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathParameters(value: StringDictionary[js.Any | UrlParameterValue]): Self = StObject.set(x, "pathParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathParametersUndefined: Self = StObject.set(x, "pathParameters", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: StringDictionary[js.Any | UrlParameterValue]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    @scala.inline
    def setSerializationMapper(value: Mapper): Self = StObject.set(x, "serializationMapper", value.asInstanceOf[js.Any])
  }
}
