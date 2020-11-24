package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderConfig extends js.Object {
  
  /**
    * Should the XHR request use async or not?
    */
  var async: js.UndefOr[Boolean] = js.native
  
  /**
    * A URL used to resolve paths given to the loader. Example: 'http://labs.phaser.io/assets/'.
    */
  var baseURL: js.UndefOr[String] = js.native
  
  /**
    * 'anonymous', 'use-credentials', or `undefined`. If you're not making cross-origin requests, leave this as `undefined`. See {@link https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes}.
    */
  var crossOrigin: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of resources the loader will start loading at once.
    */
  var maxParallelDownloads: js.UndefOr[integer] = js.native
  
  /**
    * Optional password for all XHR requests.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * A URL path used to resolve relative paths given to the loader. Example: 'images/sprites/'.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The response type of the XHR request, e.g. `blob`, `text`, etc.
    */
  var responseType: js.UndefOr[String] = js.native
  
  /**
    * Optional XHR timeout value, in ms.
    */
  var timeout: js.UndefOr[integer] = js.native
  
  /**
    * Optional username for all XHR requests.
    */
  var user: js.UndefOr[String] = js.native
}
object LoaderConfig {
  
  @scala.inline
  def apply(): LoaderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderConfig]
  }
  
  @scala.inline
  implicit class LoaderConfigOps[Self <: LoaderConfig] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: String): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    
    @scala.inline
    def setMaxParallelDownloads(value: integer): Self = this.set("maxParallelDownloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxParallelDownloads: Self = this.set("maxParallelDownloads", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setTimeout(value: integer): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
