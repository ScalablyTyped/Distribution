package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenFinExternalWindowStatic extends js.Object {
  /**
    * Returns an External Window object that wraps an existing window.
    */
  def wrap(appUuid: String, windowName: String): js.Promise[OpenFinExternalWindow]
  /**
    * Synchronously returns an External Window object that wraps an existing window.
    */
  def wrapSync(appUuid: String, windowName: String): OpenFinExternalWindow
}

object OpenFinExternalWindowStatic {
  @scala.inline
  def apply(
    wrap: (String, String) => js.Promise[OpenFinExternalWindow],
    wrapSync: (String, String) => OpenFinExternalWindow
  ): OpenFinExternalWindowStatic = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction2(wrap), wrapSync = js.Any.fromFunction2(wrapSync))
    __obj.asInstanceOf[OpenFinExternalWindowStatic]
  }
}

