package typings.nwJs.mod.global.NWJSHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * nw.Window.get().on('navigation') callback policy argument object
  */
@js.native
trait WinNavigationPolicy extends js.Object {
  
  /**
    * Ignore the request, navigation won’t happen.
    */
  def ignore(): Unit = js.native
}
object WinNavigationPolicy {
  
  @scala.inline
  def apply(ignore: () => Unit): WinNavigationPolicy = {
    val __obj = js.Dynamic.literal(ignore = js.Any.fromFunction0(ignore))
    __obj.asInstanceOf[WinNavigationPolicy]
  }
  
  @scala.inline
  implicit class WinNavigationPolicyOps[Self <: WinNavigationPolicy] (val x: Self) extends AnyVal {
    
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
    def setIgnore(value: () => Unit): Self = this.set("ignore", js.Any.fromFunction0(value))
  }
}
