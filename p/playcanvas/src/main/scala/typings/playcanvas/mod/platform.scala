package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global namespace that stores flags regarding platform environment and features support.
  * @example
  * if (pc.platform.touch) {
  *     // touch is supported
  * }
  */
object platform {
  
  /**
    * If it is Android.
    */
  @JSImport("playcanvas", "platform.android")
  @js.native
  val android: Boolean = js.native
  
  /**
    * Is it a desktop or laptop device.
    */
  @JSImport("playcanvas", "platform.desktop")
  @js.native
  val desktop: Boolean = js.native
  
  /**
    * If platform supports gamepads.
    */
  @JSImport("playcanvas", "platform.gamepads")
  @js.native
  val gamepads: Boolean = js.native
  
  /**
    * If it is iOS.
    */
  @JSImport("playcanvas", "platform.ios")
  @js.native
  val ios: Boolean = js.native
  
  /**
    * Is it a mobile or tablet device.
    */
  @JSImport("playcanvas", "platform.mobile")
  @js.native
  val mobile: Boolean = js.native
  
  /**
    * If platform supports touch input.
    */
  @JSImport("playcanvas", "platform.touch")
  @js.native
  val touch: Boolean = js.native
  
  /**
    * If it is Windows.
    */
  @JSImport("playcanvas", "platform.windows")
  @js.native
  val windows: Boolean = js.native
  
  /**
    * If the platform supports Web Workers.
    */
  @JSImport("playcanvas", "platform.workers")
  @js.native
  val workers: Boolean = js.native
  
  /**
    * If it is Xbox.
    */
  @JSImport("playcanvas", "platform.xbox")
  @js.native
  val xbox: Boolean = js.native
}
