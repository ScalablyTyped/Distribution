package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Utility methods for orientation detection
  */
object orientation {
  
  /**
    * @return {Boolean} Will be true if the current orientation is landscape mode
    * @description Returns whether the current screen orientation is landscape or not
    */
  @JSImport("onsenui", "orientation.isLandscape")
  @js.native
  def isLandscape(): Boolean = js.native
  
  /**
    * @return {Boolean} Will be true if the current orientation is portrait mode
    * @description Returns whether the current screen orientation is portrait or not
    */
  @JSImport("onsenui", "orientation.isPortrait")
  @js.native
  def isPortrait(): Boolean = js.native
  
  /**
    * @description Remove an event listener. If the listener is not specified all listeners for the event type will be removed.
    */
  @JSImport("onsenui", "orientation.off")
  @js.native
  def off(eventName: String): Unit = js.native
  @JSImport("onsenui", "orientation.off")
  @js.native
  def off(eventName: String, listener: js.Function): Unit = js.native
  
  /**
    * @description Add an event listener.
    */
  @JSImport("onsenui", "orientation.on")
  @js.native
  def on(eventName: String, listener: js.Function): Unit = js.native
  
  /**
    * @description Add an event listener that's only triggered once.
    */
  @JSImport("onsenui", "orientation.once")
  @js.native
  def once(eventName: String, listener: js.Function): Unit = js.native
}
