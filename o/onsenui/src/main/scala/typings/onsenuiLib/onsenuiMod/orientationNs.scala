package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description Utility methods for orientation detection
  */
@JSImport("onsenui", "orientation")
@js.native
object orientationNs extends js.Object {
  /**
    * @return {Boolean} Will be true if the current orientation is landscape mode
    * @description Returns whether the current screen orientation is landscape or not
    */
  def isLandscape(): scala.Boolean = js.native
  /**
    * @return {Boolean} Will be true if the current orientation is portrait mode
    * @description Returns whether the current screen orientation is portrait or not
    */
  def isPortrait(): scala.Boolean = js.native
  /**
    * @description Remove an event listener. If the listener is not specified all listeners for the event type will be removed.
    */
  def off(eventName: java.lang.String): scala.Unit = js.native
  def off(eventName: java.lang.String, listener: coreDashJsLib.Function): scala.Unit = js.native
  /**
    * @description Add an event listener.
    */
  def on(eventName: java.lang.String, listener: coreDashJsLib.Function): scala.Unit = js.native
  /**
    * @description Add an event listener that's only triggered once.
    */
  def once(eventName: java.lang.String, listener: coreDashJsLib.Function): scala.Unit = js.native
}

