package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @namespace
  * @name pc.platform
  * @description Global namespace that stores flags regarding platform environment and features support
  * @example
  * if (pc.platform.touch) {
  *     // touch is supported
  * }
  */
@JSImport("playcanvas", "platform")
@js.native
object platform extends js.Object {
  /**
    * @static
    * @readonly
    * @type {Boolean}
    * @name pc.platform.android
    * @description if it is Android
    */
  val android: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {Boolean}
    * @name pc.platform.desktop
    * @description is it a desktop or laptop device
    */
  val desktop: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {Boolean}
    * @name pc.platform.gamepads
    * @description if platform supports gamepads
    */
  val gamepads: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {Boolean}
    * @name pc.platform.ios
    * @description if it is iOS
    */
  val ios: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {Boolean}
    * @name pc.platform.mobile
    * @description is it a mobile or tablet device
    */
  val mobile: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {Boolean}
    * @name pc.platform.touch
    * @description if platform supports touch input
    */
  val touch: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {Boolean}
    * @name pc.platform.windows
    * @description if it is Windows
    */
  val windows: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {Boolean}
    * @name pc.platform.workers
    * @description if the platform supports Web Workers
    */
  val workers: Boolean = js.native
  /**
    * @static
    * @readonly
    * @type {Boolean}
    * @name pc.platform.xbox
    * @description if it is Xbox
    */
  val xbox: Boolean = js.native
}

