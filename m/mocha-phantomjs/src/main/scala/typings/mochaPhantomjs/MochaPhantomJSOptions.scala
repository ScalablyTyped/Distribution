package typings.mochaPhantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MochaPhantomJSOptions extends js.Object {
  
  var cookies: js.UndefOr[js.Array[_]] = js.native
  
  var file: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var viewportSize: js.UndefOr[Double] = js.native
}
object MochaPhantomJSOptions {
  
  @scala.inline
  def apply(): MochaPhantomJSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaPhantomJSOptions]
  }
  
  @scala.inline
  implicit class MochaPhantomJSOptionsOps[Self <: MochaPhantomJSOptions] (val x: Self) extends AnyVal {
    
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
    def setCookiesVarargs(value: js.Any*): Self = this.set("cookies", js.Array(value :_*))
    
    @scala.inline
    def setCookies(value: js.Array[_]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setViewportSize(value: Double): Self = this.set("viewportSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportSize: Self = this.set("viewportSize", js.undefined)
  }
}
