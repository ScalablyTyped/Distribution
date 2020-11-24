package typings.phoenixLiveView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketOptions extends js.Object {
  
  var bindingPrefix: js.UndefOr[String] = js.native
  
  var defaults: js.UndefOr[Defaults] = js.native
  
  var dom: js.UndefOr[DomOptions] = js.native
  
  var hooks: js.UndefOr[js.Object] = js.native
  
  var loaderTimeout: js.UndefOr[Double] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  var viewLogger: js.UndefOr[ViewLogger] = js.native
}
object SocketOptions {
  
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    
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
    def setBindingPrefix(value: String): Self = this.set("bindingPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingPrefix: Self = this.set("bindingPrefix", js.undefined)
    
    @scala.inline
    def setDefaults(value: Defaults): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setDom(value: DomOptions): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDom: Self = this.set("dom", js.undefined)
    
    @scala.inline
    def setHooks(value: js.Object): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setLoaderTimeout(value: Double): Self = this.set("loaderTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaderTimeout: Self = this.set("loaderTimeout", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setViewLogger(value: (/* view */ View, /* kind */ String, /* msg */ js.Any, /* obj */ js.Any) => Unit): Self = this.set("viewLogger", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteViewLogger: Self = this.set("viewLogger", js.undefined)
  }
}
