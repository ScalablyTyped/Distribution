package typings.pixiJs.PIXI.utils

import typings.pixiJs.AnonDevice
import typings.pixiJs.AnonPhone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple JS library that detects mobile devices.
  *
  * @see {@link https://github.com/kaimallea/isMobile}
  *
  * @memberof PIXI.utils
  * @name isMobile
  * @type {Object}
  * @property {boolean} any - `true` if current platform is tablet or phone device
  * @property {boolean} tablet - `true` if current platform large-screen tablet device
  * @property {boolean} phone - `true` if current platform small-screen phone device
  * @property {object} apple
  * @property {boolean} apple.device - `true` if any Apple device
  * @property {boolean} apple.tablet - `true` if any Apple iPad
  * @property {boolean} apple.phone - `true` if any Apple iPhone
  * @property {boolean} apple.ipod - `true` if any iPod
  * @property {object} android
  * @property {boolean} android.device - `true` if any Android device
  * @property {boolean} android.tablet - `true` if any Android tablet
  * @property {boolean} android.phone - `true` if any Android phone
  * @property {object} amazon
  * @property {boolean} amazon.device - `true` if any Silk device
  * @property {boolean} amazon.tablet - `true` if any Silk tablet
  * @property {boolean} amazon.phone - `true` if any Silk phone
  * @property {object} windows
  * @property {boolean} windows.device - `true` if any Windows device
  * @property {boolean} windows.tablet - `true` if any Windows tablet
  * @property {boolean} windows.phone - `true` if any Windows phone
  */
@JSGlobal("PIXI.utils.isMobile")
@js.native
object isMobile extends js.Object {
  var amazon: AnonPhone = js.native
  var android: AnonPhone = js.native
  var any: Boolean = js.native
  var apple: AnonDevice = js.native
  var phone: Boolean = js.native
  var tablet: Boolean = js.native
  var windows: AnonPhone = js.native
}

