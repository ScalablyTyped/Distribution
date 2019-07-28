package typings.node.asyncUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncHook extends js.Object {
  /**
    * Disable the callbacks for a given AsyncHook instance from the global pool of AsyncHook callbacks to be executed. Once a hook has been disabled it will not be called again until enabled.
    */
  def disable(): this.type
  /**
    * Enable the callbacks for a given AsyncHook instance. If no callbacks are provided enabling is a noop.
    */
  def enable(): this.type
}

object AsyncHook {
  @scala.inline
  def apply(disable: () => AsyncHook, enable: () => AsyncHook): AsyncHook = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
  
    __obj.asInstanceOf[AsyncHook]
  }
}

