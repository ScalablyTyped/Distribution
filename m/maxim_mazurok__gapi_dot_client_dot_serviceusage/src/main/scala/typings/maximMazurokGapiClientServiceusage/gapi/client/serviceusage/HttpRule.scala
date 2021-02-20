package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRule extends StObject {
  
  /** Additional HTTP bindings for the selector. Nested bindings must not contain an `additional_bindings` field themselves (that is, the nesting may only be one level deep). */
  var additionalBindings: js.UndefOr[js.Array[HttpRule]] = js.native
  
  /**
    * The name of the request field whose value is mapped to the HTTP request body, or `*` for mapping all request fields not captured by the path pattern to the HTTP body, or omitted for
    * not having any HTTP request body. NOTE: the referred field must be present at the top-level of the request message type.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * The custom pattern is used for specifying an HTTP method that is not included in the `pattern` field, such as HEAD, or "*" to leave the HTTP method unspecified for this rule. The
    * wild-card rule is useful for services that provide content to Web (HTML) clients.
    */
  var custom: js.UndefOr[CustomHttpPattern] = js.native
  
  /** Maps to HTTP DELETE. Used for deleting a resource. */
  var delete: js.UndefOr[String] = js.native
  
  /** Maps to HTTP GET. Used for listing and getting information about resources. */
  var get: js.UndefOr[String] = js.native
  
  /** Maps to HTTP PATCH. Used for updating a resource. */
  var patch: js.UndefOr[String] = js.native
  
  /** Maps to HTTP POST. Used for creating a resource or performing an action. */
  var post: js.UndefOr[String] = js.native
  
  /** Maps to HTTP PUT. Used for replacing a resource. */
  var put: js.UndefOr[String] = js.native
  
  /**
    * Optional. The name of the response field whose value is mapped to the HTTP response body. When omitted, the entire response message will be used as the HTTP response body. NOTE: The
    * referred field must be present at the top-level of the response message type.
    */
  var responseBody: js.UndefOr[String] = js.native
  
  /** Selects a method to which this rule applies. Refer to selector for syntax details. */
  var selector: js.UndefOr[String] = js.native
}
object HttpRule {
  
  @scala.inline
  def apply(): HttpRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRule]
  }
  
  @scala.inline
  implicit class HttpRuleMutableBuilder[Self <: HttpRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalBindings(value: js.Array[HttpRule]): Self = StObject.set(x, "additionalBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalBindingsUndefined: Self = StObject.set(x, "additionalBindings", js.undefined)
    
    @scala.inline
    def setAdditionalBindingsVarargs(value: HttpRule*): Self = StObject.set(x, "additionalBindings", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCustom(value: CustomHttpPattern): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDelete(value: String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    @scala.inline
    def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setPut(value: String): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
    
    @scala.inline
    def setResponseBody(value: String): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
