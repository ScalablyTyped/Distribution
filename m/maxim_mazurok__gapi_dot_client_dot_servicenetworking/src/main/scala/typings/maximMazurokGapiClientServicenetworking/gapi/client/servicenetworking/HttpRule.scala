package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRule extends js.Object {
  
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
  implicit class HttpRuleOps[Self <: HttpRule] (val x: Self) extends AnyVal {
    
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
    def setAdditionalBindingsVarargs(value: HttpRule*): Self = this.set("additionalBindings", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalBindings(value: js.Array[HttpRule]): Self = this.set("additionalBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalBindings: Self = this.set("additionalBindings", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCustom(value: CustomHttpPattern): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDelete(value: String): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setGet(value: String): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setPatch(value: String): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    
    @scala.inline
    def setPost(value: String): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setPut(value: String): Self = this.set("put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePut: Self = this.set("put", js.undefined)
    
    @scala.inline
    def setResponseBody(value: String): Self = this.set("responseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseBody: Self = this.set("responseBody", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
}
