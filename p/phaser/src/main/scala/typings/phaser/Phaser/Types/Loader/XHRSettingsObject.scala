package typings.phaser.Phaser.Types.Loader

import typings.phaser.integer
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XHRSettingsObject extends StObject {
  
  /**
    * Should the XHR request use async or not?
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var header: js.UndefOr[String] = js.undefined
  
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var headerValue: js.UndefOr[String] = js.undefined
  
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Provide a custom mime-type to use instead of the default.
    */
  var overrideMimeType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional password for the XHR request.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var requestedWith: js.UndefOr[String] = js.undefined
  
  /**
    * The response type of the XHR request, i.e. `blob`, `text`, etc.
    */
  var responseType: XMLHttpRequestResponseType
  
  /**
    * Optional XHR timeout value.
    */
  var timeout: js.UndefOr[integer] = js.undefined
  
  /**
    * Optional username for the XHR request.
    */
  var user: js.UndefOr[String] = js.undefined
  
  /**
    * The withCredentials property indicates whether or not cross-site Access-Control requests should be made using credentials such as cookies, authorization headers or TLS client certificates. Setting withCredentials has no effect on same-site requests.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object XHRSettingsObject {
  
  @scala.inline
  def apply(responseType: XMLHttpRequestResponseType): XHRSettingsObject = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[XHRSettingsObject]
  }
  
  @scala.inline
  implicit class XHRSettingsObjectMutableBuilder[Self <: XHRSettingsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHeaderValue(value: String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setRequestedWith(value: String): Self = StObject.set(x, "requestedWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedWithUndefined: Self = StObject.set(x, "requestedWith", js.undefined)
    
    @scala.inline
    def setResponseType(value: XMLHttpRequestResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: integer): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
