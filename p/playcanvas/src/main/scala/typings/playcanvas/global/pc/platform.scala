package typings.playcanvas.global.pc

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
  @JSGlobal("pc.platform.android")
  @js.native
  val android: Boolean = js.native
  
  /**
    * Is it a desktop or laptop device.
    */
  @JSGlobal("pc.platform.desktop")
  @js.native
  val desktop: Boolean = js.native
  
  /**
    * If platform supports gamepads.
    */
  @JSGlobal("pc.platform.gamepads")
  @js.native
  val gamepads: Boolean = js.native
  
  /**
    * If it is iOS.
    */
  @JSGlobal("pc.platform.ios")
  @js.native
  val ios: Boolean = js.native
  
  /**
    * Is it a mobile or tablet device.
    */
  @JSGlobal("pc.platform.mobile")
  @js.native
  val mobile: Boolean = js.native
  
  /**
    * If platform supports touch input.
    */
  @JSGlobal("pc.platform.touch")
  @js.native
  val touch: Boolean = js.native
  
  /**
    * If it is Windows.
    */
  @JSGlobal("pc.platform.windows")
  @js.native
  val windows: Boolean = js.native
  
  /**
    * If the platform supports Web Workers.
    */
  @JSGlobal("pc.platform.workers")
  @js.native
  val workers: Boolean = js.native
  
  /**
    * If it is Xbox.
    */
  @JSGlobal("pc.platform.xbox")
  @js.native
  val xbox: Boolean = js.native
}
