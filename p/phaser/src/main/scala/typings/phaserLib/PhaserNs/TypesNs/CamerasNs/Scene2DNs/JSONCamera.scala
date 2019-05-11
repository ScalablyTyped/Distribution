package typings
package phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONCamera extends js.Object {
  /**
    * The background color of camera
    */
  var backgroundColor: java.lang.String
  /**
    * The bounds of camera
    */
  var bounds: js.UndefOr[JSONCameraBounds] = js.undefined
  /**
    * The height size of camera
    */
  var height: scala.Double
  /**
    * The name of the camera
    */
  var name: java.lang.String
  /**
    * The rotation of camera
    */
  var rotation: scala.Double
  /**
    * The round pixels st status of camera
    */
  var roundPixels: scala.Boolean
  /**
    * The horizontal scroll of camera
    */
  var scrollX: scala.Double
  /**
    * The vertical scroll of camera
    */
  var scrollY: scala.Double
  /**
    * The width size of camera
    */
  var width: scala.Double
  /**
    * The horizontal position of camera
    */
  var x: scala.Double
  /**
    * The vertical position of camera
    */
  var y: scala.Double
  /**
    * The zoom of camera
    */
  var zoom: scala.Double
}

object JSONCamera {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    height: scala.Double,
    name: java.lang.String,
    rotation: scala.Double,
    roundPixels: scala.Boolean,
    scrollX: scala.Double,
    scrollY: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    zoom: scala.Double,
    bounds: JSONCameraBounds = null
  ): JSONCamera = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, height = height, name = name, rotation = rotation, roundPixels = roundPixels, scrollX = scrollX, scrollY = scrollY, width = width, x = x, y = y, zoom = zoom)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    __obj.asInstanceOf[JSONCamera]
  }
}

