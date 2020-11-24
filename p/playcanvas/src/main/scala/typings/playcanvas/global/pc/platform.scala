package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global namespace that stores flags regarding platform environment and features support.
  * @example
  * if (pc.platform.touch) {
  *     // touch is supported
  * }
  */
@JSGlobal("pc.platform")
@js.native
object platform extends js.Object {
  
  /**
    * If it is Android.
    */
  val android: Boolean = js.native
  
  /**
    * Is it a desktop or laptop device.
    */
  val desktop: Boolean = js.native
  
  /**
    * If platform supports gamepads.
    */
  val gamepads: Boolean = js.native
  
  /**
    * If it is iOS.
    */
  val ios: Boolean = js.native
  
  /**
    * Is it a mobile or tablet device.
    */
  val mobile: Boolean = js.native
  
  /**
    * If platform supports touch input.
    */
  val touch: Boolean = js.native
  
  /**
    * If it is Windows.
    */
  val windows: Boolean = js.native
  
  /**
    * If the platform supports Web Workers.
    */
  val workers: Boolean = js.native
  
  /**
    * If it is Xbox.
    */
  val xbox: Boolean = js.native
}
