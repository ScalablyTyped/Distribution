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
  var easeFunctions: MoveToEaseFunctionsObject = js.native
  /**
    * Options
    */
  var options: MoveToOptions = js.native
  /**
    * Adds custom ease function
    * @param name Ease function name
    * @param fn Ease function
    */
  def addEaseFunction(name: java.lang.String, fn: MoveToEaseFunction): scala.Unit = js.native
  def move(target: scala.Double): scala.Unit = js.native
  def move(target: scala.Double, options: MoveToOptions): scala.Unit = js.native
  /**
    * Start scroll animation from current position to the anchor point
    * @param target Target element/position to be scrolled. Target position is the scrolling distance. It must be negative if the upward movement is desired
    * @param options Custom options
    */
  def move(target: stdLib.HTMLElement): scala.Unit = js.native
  def move(target: stdLib.HTMLElement, options: MoveToOptions): scala.Unit = js.native
  /**
    * Register a dom element as trigger
    * @param dom The trigger element for starting to scroll when on click
    * @param callback Callback function to be run after the scroll complete. This will overwrite the callback option
    * @return Unregister function
    */
  def registerTrigger(dom: stdLib.HTMLElement): unregisterTriggerType = js.native
  def registerTrigger(dom: stdLib.HTMLElement, callback: callbackType): unregisterTriggerType = js.native
}

