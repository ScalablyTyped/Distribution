package typings.openfin.GoldenLayout

import typings.openfin.anon.Content
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserWindow extends js.Object {
  /**
    * True if the window has been opened and its GoldenLayout instance initialised.
    */
  var isInitialised: Boolean = js.native
  /**
    * Closes the popout
    */
  def close(): Unit = js.native
  /**
    * Returns the GoldenLayout instance from the child window
    */
  def getGlInstance(): typings.openfin.GoldenLayout.GoldenLayout = js.native
  /**
    * Returns the native Window object
    */
  def getWindow(): Window = js.native
  /**
    * Returns the popout to its original position as specified in parentId and indexInParent
    */
  def popIn(): Unit = js.native
  /**
    * Creates a window configuration object from the Popout.
    */
  def toConfig(): Content = js.native
}

object BrowserWindow {
  @scala.inline
  def apply(
    close: () => Unit,
    getGlInstance: () => typings.openfin.GoldenLayout.GoldenLayout,
    getWindow: () => Window,
    isInitialised: Boolean,
    popIn: () => Unit,
    toConfig: () => Content
  ): BrowserWindow = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getGlInstance = js.Any.fromFunction0(getGlInstance), getWindow = js.Any.fromFunction0(getWindow), isInitialised = isInitialised.asInstanceOf[js.Any], popIn = js.Any.fromFunction0(popIn), toConfig = js.Any.fromFunction0(toConfig))
    __obj.asInstanceOf[BrowserWindow]
  }
  @scala.inline
  implicit class BrowserWindowOps[Self <: BrowserWindow] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGlInstance(value: () => typings.openfin.GoldenLayout.GoldenLayout): Self = this.set("getGlInstance", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWindow(value: () => Window): Self = this.set("getWindow", js.Any.fromFunction0(value))
    @scala.inline
    def setIsInitialised(value: Boolean): Self = this.set("isInitialised", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopIn(value: () => Unit): Self = this.set("popIn", js.Any.fromFunction0(value))
    @scala.inline
    def setToConfig(value: () => Content): Self = this.set("toConfig", js.Any.fromFunction0(value))
  }
  
}

