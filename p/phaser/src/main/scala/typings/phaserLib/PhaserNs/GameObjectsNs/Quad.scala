package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Quad Game Object.
  * 
  * A Quad is a Mesh Game Object pre-configured with two triangles arranged into a rectangle, with a single
  * texture spread across them.
  * 
  * You can manipulate the corner points of the quad via the getters and setters such as `topLeftX`, and also
  * change their alpha and color values. The quad itself can be moved by adjusting the `x` and `y` properties.
  */
@JSGlobal("Phaser.GameObjects.Quad")
@js.native
class Quad protected () extends Mesh {
  /**
    * 
    * @param scene The Scene to which this Quad belongs.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer) = this()
  /**
    * The bottom-left alpha value of this Quad.
    */
  var bottomLeftAlpha: scala.Double = js.native
  /**
    * The bottom-left color value of this Quad.
    */
  var bottomLeftColor: scala.Double = js.native
  /**
    * The bottom-left x vertex of this Quad.
    */
  var bottomLeftX: scala.Double = js.native
  /**
    * The bottom-left y vertex of this Quad.
    */
  var bottomLeftY: scala.Double = js.native
  /**
    * The bottom-right alpha value of this Quad.
    */
  var bottomRightAlpha: scala.Double = js.native
  /**
    * The bottom-right color value of this Quad.
    */
  var bottomRightColor: scala.Double = js.native
  /**
    * The bottom-right x vertex of this Quad.
    */
  var bottomRightX: scala.Double = js.native
  /**
    * The bottom-right y vertex of this Quad.
    */
  var bottomRightY: scala.Double = js.native
  /**
    * The top-left alpha value of this Quad.
    */
  var topLeftAlpha: scala.Double = js.native
  /**
    * The top-left color value of this Quad.
    */
  var topLeftColor: scala.Double = js.native
  /**
    * The top-left x vertex of this Quad.
    */
  var topLeftX: scala.Double = js.native
  /**
    * The top-left y vertex of this Quad.
    */
  var topLeftY: scala.Double = js.native
  /**
    * The top-right alpha value of this Quad.
    */
  var topRightAlpha: scala.Double = js.native
  /**
    * The top-right color value of this Quad.
    */
  var topRightColor: scala.Double = js.native
  /**
    * The top-right x vertex of this Quad.
    */
  var topRightX: scala.Double = js.native
  /**
    * The top-right y vertex of this Quad.
    */
  var topRightY: scala.Double = js.native
  /**
    * Resets the position, alpha and color values used by this Quad.
    */
  def reset(): Quad = js.native
  /**
    * Resets the alpha values used by this Quad back to 1.
    */
  def resetAlpha(): Quad = js.native
  /**
    * Resets the color values used by this Quad back to 0xffffff.
    */
  def resetColors(): Quad = js.native
  /**
    * Resets the positions of the four corner vertices of this Quad.
    */
  def resetPosition(): Quad = js.native
  /**
    * Sets the bottom-left vertex position of this Quad.
    * @param x The horizontal coordinate of the vertex.
    * @param y The vertical coordinate of the vertex.
    */
  def setBottomLeft(x: scala.Double, y: scala.Double): Quad = js.native
  /**
    * Sets the bottom-right vertex position of this Quad.
    * @param x The horizontal coordinate of the vertex.
    * @param y The vertical coordinate of the vertex.
    */
  def setBottomRight(x: scala.Double, y: scala.Double): Quad = js.native
  /**
    * Sets the top-left vertex position of this Quad.
    * @param x The horizontal coordinate of the vertex.
    * @param y The vertical coordinate of the vertex.
    */
  def setTopLeft(x: scala.Double, y: scala.Double): Quad = js.native
  /**
    * Sets the top-right vertex position of this Quad.
    * @param x The horizontal coordinate of the vertex.
    * @param y The vertical coordinate of the vertex.
    */
  def setTopRight(x: scala.Double, y: scala.Double): Quad = js.native
}

