package typings.node.asyncHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncHook extends js.Object {
  
  /**
    * Disable the callbacks for a given AsyncHook instance from the global pool of AsyncHook callbacks to be executed. Once a hook has been disabled it will not be called again until enabled.
    */
  def disable(): this.type = js.native
  
  /**
    * Enable the callbacks for a given AsyncHook instance. If no callbacks are provided enabling is a noop.
    */
  def enable(): this.type = js.native
}
object AsyncHook {
  
  @scala.inline
  def apply(disable: () => AsyncHook, enable: () => AsyncHook): AsyncHook = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[AsyncHook]
  }
  
  @scala.inline
  implicit class AsyncHookOps[Self <: AsyncHook] (val x: Self) extends AnyVal {
    
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
    def setDisable(value: () => AsyncHook): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => AsyncHook): Self = this.set("enable", js.Any.fromFunction0(value))
  }
}
