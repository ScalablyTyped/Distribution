package typings.phaser.PhaserNs.TypesNs.CamerasNs.Scene2DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONCamera extends js.Object {
  /**
    * The background color of camera
    */
  var backgroundColor: String
  /**
    * The bounds of camera
    */
  var bounds: js.UndefOr[JSONCameraBounds] = js.undefined
  /**
    * The height size of camera
    */
  var height: Double
  /**
    * The name of the camera
    */
  var name: String
  /**
    * The rotation of camera
    */
  var rotation: Double
  /**
    * The round pixels st status of camera
    */
  var roundPixels: Boolean
  /**
    * The horizontal scroll of camera
    */
  var scrollX: Double
  /**
    * The vertical scroll of camera
    */
  var scrollY: Double
  /**
    * The width size of camera
    */
  var width: Double
  /**
    * The horizontal position of camera
    */
  var x: Double
  /**
    * The vertical position of camera
    */
  var y: Double
  /**
    * The zoom of camera
    */
  var zoom: Double
}

object JSONCamera {
  @scala.inline
  def apply(
    backgroundColor: String,
    height: Double,
    name: String,
    rotation: Double,
    roundPixels: Boolean,
    scrollX: Double,
    scrollY: Double,
    width: Double,
    x: Double,
    y: Double,
    zoom: Double,
    bounds: JSONCameraBounds = null
  ): JSONCamera = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, height = height, name = name, rotation = rotation, roundPixels = roundPixels, scrollX = scrollX, scrollY = scrollY, width = width, x = x, y = y, zoom = zoom)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    __obj.asInstanceOf[JSONCamera]
  }
}

