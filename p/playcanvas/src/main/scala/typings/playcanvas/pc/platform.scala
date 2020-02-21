package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @namespace
  * @name pc.platform
  * @description Global namespace that stores flags regarding platform environment and features support.
  * @example
  * if (pc.platform.touch) {
  *     // touch is supported
  * }
  */
@JSGlobal("pc.platform")
@js.native
object platform extends js.Object {
  /**
    * @static
    * @readonly
    * @type {boolean}
    * @name pc.platform.android
    * @description If it is Android.
    */
  val android: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {boolean}
    * @name pc.platform.desktop
    * @description Is it a desktop or laptop device.
    */
  val desktop: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {boolean}
    * @name pc.platform.gamepads
    * @description If platform supports gamepads.
    */
  val gamepads: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {boolean}
    * @name pc.platform.ios
    * @description If it is iOS.
    */
  val ios: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {boolean}
    * @name pc.platform.mobile
    * @description Is it a mobile or tablet device.
    */
  val mobile: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {boolean}
    * @name pc.platform.touch
    * @description If platform supports touch input.
    */
  val touch: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {boolean}
    * @name pc.platform.windows
    * @description If it is Windows.
    */
  val windows: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {boolean}
    * @name pc.platform.workers
    * @description If the platform supports Web Workers.
    */
  val workers: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {boolean}
    * @name pc.platform.xbox
    * @description If it is Xbox.
    */
  val xbox: Boolean = js.native
}

