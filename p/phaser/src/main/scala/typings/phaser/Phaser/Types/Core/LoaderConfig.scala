package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderConfig extends StObject {
  
  /**
    * Should the XHR request use async or not?
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A URL used to resolve paths given to the loader. Example: 'http://labs.phaser.io/assets/'.
    */
  var baseURL: js.UndefOr[String] = js.undefined
  
  /**
    * 'anonymous', 'use-credentials', or `undefined`. If you're not making cross-origin requests, leave this as `undefined`. See {@link https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes}.
    */
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of resources the loader will start loading at once.
    */
  var maxParallelDownloads: js.UndefOr[integer] = js.undefined
  
  /**
    * Optional password for all XHR requests.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * A URL path used to resolve relative paths given to the loader. Example: 'images/sprites/'.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The response type of the XHR request, e.g. `blob`, `text`, etc.
    */
  var responseType: js.UndefOr[String] = js.undefined
  
  /**
    * Optional XHR timeout value, in ms.
    */
  var timeout: js.UndefOr[integer] = js.undefined
  
  /**
    * Optional username for all XHR requests.
    */
  var user: js.UndefOr[String] = js.undefined
}
object LoaderConfig {
  
  @scala.inline
  def apply(): LoaderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderConfig]
  }
  
  @scala.inline
  implicit class LoaderConfigMutableBuilder[Self <: LoaderConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setMaxParallelDownloads(value: integer): Self = StObject.set(x, "maxParallelDownloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxParallelDownloadsUndefined: Self = StObject.set(x, "maxParallelDownloads", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setTimeout(value: integer): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
