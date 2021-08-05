package typings.onsenui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Utility methods for orientation detection
  */
object orientation {
  
  @JSImport("onsenui", "orientation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return {Boolean} Will be true if the current orientation is landscape mode
    * @description Returns whether the current screen orientation is landscape or not
    */
  inline def isLandscape(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLandscape")().asInstanceOf[Boolean]
  
  /**
    * @return {Boolean} Will be true if the current orientation is portrait mode
    * @description Returns whether the current screen orientation is portrait or not
    */
  inline def isPortrait(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPortrait")().asInstanceOf[Boolean]
  
  /**
    * @description Remove an event listener. If the listener is not specified all listeners for the event type will be removed.
    */
  inline def off(eventName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(eventName: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @description Add an event listener.
    */
  inline def on(eventName: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @description Add an event listener that's only triggered once.
    */
  inline def once(eventName: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(eventName.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
