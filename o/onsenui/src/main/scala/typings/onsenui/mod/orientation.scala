package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Utility methods for orientation detection
  */
@JSImport("onsenui", "orientation")
@js.native
object orientation extends js.Object {
  /**
    * @return {Boolean} Will be true if the current orientation is landscape mode
    * @description Returns whether the current screen orientation is landscape or not
    */
  def isLandscape(): Boolean = js.native
  /**
    * @return {Boolean} Will be true if the current orientation is portrait mode
    * @description Returns whether the current screen orientation is portrait or not
    */
  def isPortrait(): Boolean = js.native
  /**
    * @description Remove an event listener. If the listener is not specified all listeners for the event type will be removed.
    */
  def off(eventName: String): Unit = js.native
  def off(eventName: String, listener: js.Function): Unit = js.native
  /**
    * @description Add an event listener.
    */
  def on(eventName: String, listener: js.Function): Unit = js.native
  /**
    * @description Add an event listener that's only triggered once.
    */
  def once(eventName: String, listener: js.Function): Unit = js.native
}

