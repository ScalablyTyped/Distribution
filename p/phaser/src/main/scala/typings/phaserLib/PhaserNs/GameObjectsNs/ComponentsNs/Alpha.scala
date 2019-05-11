package typings
package phaserLib.PhaserNs.GameObjectsNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the alpha properties of a Game Object.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait Alpha extends js.Object {
  /**
    * The alpha value of the Game Object.
    * 
    * This is a global value, impacting the entire Game Object, not just a region of it.
    */
  var alpha: scala.Double = js.native
  /**
    * The alpha value starting from the bottom-left of the Game Object.
    * This value is interpolated from the corner to the center of the Game Object.
    */
  var alphaBottomLeft: scala.Double = js.native
  /**
    * The alpha value starting from the bottom-right of the Game Object.
    * This value is interpolated from the corner to the center of the Game Object.
    */
  var alphaBottomRight: scala.Double = js.native
  /**
    * The alpha value starting from the top-left of the Game Object.
    * This value is interpolated from the corner to the center of the Game Object.
    */
  var alphaTopLeft: scala.Double = js.native
  /**
    * The alpha value starting from the top-right of the Game Object.
    * This value is interpolated from the corner to the center of the Game Object.
    */
  var alphaTopRight: scala.Double = js.native
  /**
    * Clears all alpha values associated with this Game Object.
    * 
    * Immediately sets the alpha levels back to 1 (fully opaque).
    */
  def clearAlpha(): this.type = js.native
  /**
    * Set the Alpha level of this Game Object. The alpha controls the opacity of the Game Object as it renders.
    * Alpha values are provided as a float between 0, fully transparent, and 1, fully opaque.
    * 
    * If your game is running under WebGL you can optionally specify four different alpha values, each of which
    * correspond to the four corners of the Game Object. Under Canvas only the `topLeft` value given is used.
    * @param topLeft The alpha value used for the top-left of the Game Object. If this is the only value given it's applied across the whole Game Object. Default 1.
    * @param topRight The alpha value used for the top-right of the Game Object. WebGL only.
    * @param bottomLeft The alpha value used for the bottom-left of the Game Object. WebGL only.
    * @param bottomRight The alpha value used for the bottom-right of the Game Object. WebGL only.
    */
  def setAlpha(): this.type = js.native
  def setAlpha(topLeft: scala.Double): this.type = js.native
  def setAlpha(topLeft: scala.Double, topRight: scala.Double): this.type = js.native
  def setAlpha(topLeft: scala.Double, topRight: scala.Double, bottomLeft: scala.Double): this.type = js.native
  def setAlpha(topLeft: scala.Double, topRight: scala.Double, bottomLeft: scala.Double, bottomRight: scala.Double): this.type = js.native
}

