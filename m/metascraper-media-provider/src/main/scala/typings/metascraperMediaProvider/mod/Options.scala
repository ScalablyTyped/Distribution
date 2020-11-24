package typings.metascraperMediaProvider.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * It specifies cache based on file system to be used by
    * [youtube-dl](https://github.com/microlinkhq/metascraper/blob/master/packages/metascraper-media-provider/youtube-dl).
    */
  var cacheDir: js.UndefOr[String] = js.native
  
  /**
    * It will be called to determinate if a proxy should be used for
    * resolving the next request URL.
    */
  var getProxy: js.UndefOr[GetProxyFunction] = js.native
  
  /** A function to be called when something wrong happens. */
  var onError: js.UndefOr[OnErrorFunction] = js.native
  
  /**
    * The maximum time allowed to wait until considering the request as
    * timed out. Default is `30000`.
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /** It specifies a custom user agent. */
  var userAgent: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCacheDir(value: String): Self = this.set("cacheDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDir: Self = this.set("cacheDir", js.undefined)
    
    @scala.inline
    def setGetProxy(value: /* data */ GetProxyData => String): Self = this.set("getProxy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetProxy: Self = this.set("getProxy", js.undefined)
    
    @scala.inline
    def setOnError(value: (/* url */ String, /* error */ Error) => Unit): Self = this.set("onError", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
