package typings.msRest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestPrepareOptions extends js.Object {
  
  var baseUrl: js.UndefOr[String] = js.native
  
  var body: js.UndefOr[js.Any] = js.native
  
  var bodyIsStream: js.UndefOr[Boolean] = js.native
  
  var deserializationMapper: Mapper = js.native
  
  var disableClientRequestId: js.UndefOr[Boolean] = js.native
  
  var disableJsonStringifyOnBody: js.UndefOr[Boolean] = js.native
  
  var formData: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var method: String = js.native
  
  var pathParameters: js.UndefOr[StringDictionary[js.Any | UrlParameterValue]] = js.native
  
  var queryParameters: js.UndefOr[StringDictionary[js.Any | UrlParameterValue]] = js.native
  
  var serializationMapper: Mapper = js.native
}
object RequestPrepareOptions {
  
  @scala.inline
  def apply(deserializationMapper: Mapper, method: String, serializationMapper: Mapper): RequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPrepareOptions]
  }
  
  @scala.inline
  implicit class RequestPrepareOptionsOps[Self <: RequestPrepareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeserializationMapper(value: Mapper): Self = this.set("deserializationMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializationMapper(value: Mapper): Self = this.set("serializationMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyIsStream(value: Boolean): Self = this.set("bodyIsStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyIsStream: Self = this.set("bodyIsStream", js.undefined)
    
    @scala.inline
    def setDisableClientRequestId(value: Boolean): Self = this.set("disableClientRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableClientRequestId: Self = this.set("disableClientRequestId", js.undefined)
    
    @scala.inline
    def setDisableJsonStringifyOnBody(value: Boolean): Self = this.set("disableJsonStringifyOnBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableJsonStringifyOnBody: Self = this.set("disableJsonStringifyOnBody", js.undefined)
    
    @scala.inline
    def setFormData(value: StringDictionary[js.Any]): Self = this.set("formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setPathParameters(value: StringDictionary[js.Any | UrlParameterValue]): Self = this.set("pathParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathParameters: Self = this.set("pathParameters", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: StringDictionary[js.Any | UrlParameterValue]): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParameters: Self = this.set("queryParameters", js.undefined)
  }
}
