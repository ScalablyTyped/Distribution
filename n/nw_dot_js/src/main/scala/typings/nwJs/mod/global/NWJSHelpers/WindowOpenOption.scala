package typings.nwJs.mod.global.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOpenOption extends WindowOption {
  
  /**
    * (Optional) The script to be injected before document unloaded.
    */
  var inject_js_end: js.UndefOr[String] = js.native
  
  /**
    * (Optional) The script to be injected before document loaded.
    */
  var inject_js_start: js.UndefOr[String] = js.native
  
  /**
    * (Optional) Whether to open a new window in a separate render process.
    */
  var new_instance: js.UndefOr[Boolean] = js.native
}
object WindowOpenOption {
  
  @scala.inline
  def apply(): WindowOpenOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowOpenOption]
  }
  
  @scala.inline
  implicit class WindowOpenOptionOps[Self <: WindowOpenOption] (val x: Self) extends AnyVal {
    
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
    def setInject_js_end(value: String): Self = this.set("inject_js_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInject_js_end: Self = this.set("inject_js_end", js.undefined)
    
    @scala.inline
    def setInject_js_start(value: String): Self = this.set("inject_js_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInject_js_start: Self = this.set("inject_js_start", js.undefined)
    
    @scala.inline
    def setNew_instance(value: Boolean): Self = this.set("new_instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_instance: Self = this.set("new_instance", js.undefined)
  }
}
