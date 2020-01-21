package typings.onsenui.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @modifier android Display an Android style popover
  * @description A component that displays a popover next to an element
  */
@js.native
trait OnsPopoverElement extends HTMLElement {
  /**
    * @description A boolean value that specifies whether the popover is cancelable or not. When the popover is cancelable it can be closed by tapping the background or by pressing the back button on Android devices.
    */
  var cancelable: Boolean = js.native
  /**
    * @description Retrieve the back- button handler.
    */
  var onDeviceBackButton: js.Any = js.native
  /**
    * @description Whether the dialog is visible or not.
    */
  var visible: Boolean = js.native
  /**
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "fade" and "none"
    * @return Resolves to the hidden element
    * @description Close the popover
    */
  def hide(): js.Promise[HTMLElement] = js.native
  def hide(options: PopoverOptions): js.Promise[HTMLElement] = js.native
  /**
    * @param {String|Event|HTMLElement} target Target element. Can be either a CSS selector, an event object or a DOM element
    * @param {Object} [options] Parameter object
    * @param {String} [options.animation] Animation name. Available animations are "fade" and "none"
    * @return Resolves to the displayed element
    * @description Open the popover and point it at a target. The target can be either an event, a css selector or a DOM element
    */
  def show(target: js.Any): js.Promise[HTMLElement] = js.native
  def show(target: js.Any, options: PopoverOptions): js.Promise[HTMLElement] = js.native
}

