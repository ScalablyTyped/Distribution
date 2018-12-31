package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.platform
  * @namespace
  * @description global namespace that stores flags regarding platform environment and features support
  * @example
  * if (pc.platform.touch) {
  *     // touch is supported
  * }
  */
@JSGlobal("pc.platform")
@js.native
object platformNs extends js.Object {
  /**
    * @name pc.platform.android
    * @description if it is Android
    */
  val android: scala.Boolean = js.native
  /**
    * @name pc.platform.cocoonjs
    * @description if it is CocoonJS
    */
  val cocoonjs: scala.Boolean = js.native
  /**
    * @name pc.platform.desktop
    * @description is it a desktop or laptop device
    */
  val desktop: scala.Boolean = js.native
  /**
    * @name pc.platform.gamepads
    * @description if platform supports gamepads
    */
  val gamepads: scala.Boolean = js.native
  /**
    * @name pc.platform.ios
    * @description if it is iOS
    */
  val ios: scala.Boolean = js.native
  /**
    * @name pc.platform.mobile
    * @description is it a mobile or tablet device
    */
  val mobile: scala.Boolean = js.native
  /**
    * @name pc.platform.touch
    * @description if platform supports touch input
    */
  val touch: scala.Boolean = js.native
  /**
    * @name pc.platform.windows
    * @description if it is Windows
    */
  val windows: scala.Boolean = js.native
  /**
    * @name pc.platform.xbox
    * @description if it is Xbox
    */
  val xbox: scala.Boolean = js.native
}

