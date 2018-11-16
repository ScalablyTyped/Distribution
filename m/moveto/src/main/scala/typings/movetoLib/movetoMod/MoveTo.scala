package typings
package movetoLib.movetoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveTo extends js.Object {
  /**
       * Custom ease functions
       */
  var easeFunctions: movetoLib.movetoMod.MoveToNs.MoveToEaseFunctionsObject = js.native
  /**
       * Options
       */
  var options: movetoLib.movetoMod.MoveToNs.MoveToOptions = js.native
  /**
       * Adds custom ease function
       * @param name Ease function name
       * @param fn Ease function
       */
  def addEaseFunction(name: java.lang.String, fn: movetoLib.movetoMod.MoveToNs.MoveToEaseFunction): scala.Unit = js.native
  /**
       * Start scroll animation from current position to the anchor point
       * @param target Target element/position to be scrolled. Target position is the scrolling distance. It must be negative if the upward movement is desired
       * @param options Custom options
       */
  def move(target: scala.Double): scala.Unit = js.native
  /**
       * Start scroll animation from current position to the anchor point
       * @param target Target element/position to be scrolled. Target position is the scrolling distance. It must be negative if the upward movement is desired
       * @param options Custom options
       */
  def move(target: scala.Double, options: movetoLib.movetoMod.MoveToNs.MoveToOptions): scala.Unit = js.native
  /**
       * Start scroll animation from current position to the anchor point
       * @param target Target element/position to be scrolled. Target position is the scrolling distance. It must be negative if the upward movement is desired
       * @param options Custom options
       */
  def move(target: stdLib.HTMLElement): scala.Unit = js.native
  /**
       * Start scroll animation from current position to the anchor point
       * @param target Target element/position to be scrolled. Target position is the scrolling distance. It must be negative if the upward movement is desired
       * @param options Custom options
       */
  def move(target: stdLib.HTMLElement, options: movetoLib.movetoMod.MoveToNs.MoveToOptions): scala.Unit = js.native
  /**
       * Register a dom element as trigger
       * @param dom The trigger element for starting to scroll when on click
       * @param callback Callback function to be run after the scroll complete. This will overwrite the callback option
       * @return Unregister function
       */
  def registerTrigger(dom: stdLib.HTMLElement): movetoLib.movetoMod.MoveToNs.unregisterTriggerType = js.native
  /**
       * Register a dom element as trigger
       * @param dom The trigger element for starting to scroll when on click
       * @param callback Callback function to be run after the scroll complete. This will overwrite the callback option
       * @return Unregister function
       */
  def registerTrigger(dom: stdLib.HTMLElement, callback: movetoLib.movetoMod.MoveToNs.callbackType): movetoLib.movetoMod.MoveToNs.unregisterTriggerType = js.native
}

