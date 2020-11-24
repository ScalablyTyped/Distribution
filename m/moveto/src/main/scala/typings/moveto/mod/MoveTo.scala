package typings.moveto.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveTo extends js.Object {
  
  /**
    * Adds custom ease function
    * @param name Ease function name
    * @param fn Ease function
    */
  def addEaseFunction(name: String, fn: MoveToEaseFunction): Unit = js.native
  
  /**
    * Custom ease functions
    */
  var easeFunctions: MoveToEaseFunctionsObject = js.native
  
  def move(target: Double): Unit = js.native
  def move(target: Double, options: MoveToOptions): Unit = js.native
  /**
    * Start scroll animation from current position to the anchor point
    * @param target Target element/position to be scrolled. Target position is the scrolling distance. It must be negative if the upward movement is desired
    * @param options Custom options
    */
  def move(target: HTMLElement): Unit = js.native
  def move(target: HTMLElement, options: MoveToOptions): Unit = js.native
  
  /**
    * Options
    */
  var options: MoveToOptions = js.native
  
  /**
    * Register a dom element as trigger
    * @param dom The trigger element for starting to scroll when on click
    * @param callback Callback function to be run after the scroll complete. This will overwrite the callback option
    * @return Unregister function
    */
  def registerTrigger(dom: HTMLElement): unregisterTriggerType = js.native
  def registerTrigger(dom: HTMLElement, callback: callbackType): unregisterTriggerType = js.native
}
