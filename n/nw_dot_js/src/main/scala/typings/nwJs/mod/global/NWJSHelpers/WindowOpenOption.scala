package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
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
  implicit class WindowOpenOptionMutableBuilder[Self <: WindowOpenOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInject_js_end(value: String): Self = StObject.set(x, "inject_js_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInject_js_endUndefined: Self = StObject.set(x, "inject_js_end", js.undefined)
    
    @scala.inline
    def setInject_js_start(value: String): Self = StObject.set(x, "inject_js_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInject_js_startUndefined: Self = StObject.set(x, "inject_js_start", js.undefined)
    
    @scala.inline
    def setNew_instance(value: Boolean): Self = StObject.set(x, "new_instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_instanceUndefined: Self = StObject.set(x, "new_instance", js.undefined)
  }
}
