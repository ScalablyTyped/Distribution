package typings.phaser.Phaser.GameObjects

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
@js.native
trait Quad extends Mesh {
  /**
    * The bottom-left alpha value of this Quad.
    */
  var bottomLeftAlpha: Double = js.native
  /**
    * The bottom-left color value of this Quad.
    */
  var bottomLeftColor: Double = js.native
  /**
    * The bottom-left x vertex of this Quad.
    */
  var bottomLeftX: Double = js.native
  /**
    * The bottom-left y vertex of this Quad.
    */
  var bottomLeftY: Double = js.native
  /**
    * The bottom-right alpha value of this Quad.
    */
  var bottomRightAlpha: Double = js.native
  /**
    * The bottom-right color value of this Quad.
    */
  var bottomRightColor: Double = js.native
  /**
    * The bottom-right x vertex of this Quad.
    */
  var bottomRightX: Double = js.native
  /**
    * The bottom-right y vertex of this Quad.
    */
  var bottomRightY: Double = js.native
  /**
    * The top-left alpha value of this Quad.
    */
  var topLeftAlpha: Double = js.native
  /**
    * The top-left color value of this Quad.
    */
  var topLeftColor: Double = js.native
  /**
    * The top-left x vertex of this Quad.
    */
  var topLeftX: Double = js.native
  /**
    * The top-left y vertex of this Quad.
    */
  var topLeftY: Double = js.native
  /**
    * The top-right alpha value of this Quad.
    */
  var topRightAlpha: Double = js.native
  /**
    * The top-right color value of this Quad.
    */
  var topRightColor: Double = js.native
  /**
    * The top-right x vertex of this Quad.
    */
  var topRightX: Double = js.native
  /**
    * The top-right y vertex of this Quad.
    */
  var topRightY: Double = js.native
  /**
    * Resets the position, alpha and color values used by this Quad.
    */
  def reset(): this.type = js.native
  /**
    * Resets the alpha values used by this Quad back to 1.
    */
  def resetAlpha(): this.type = js.native
  /**
    * Resets the color values used by this Quad back to 0xffffff.
    */
  def resetColors(): this.type = js.native
  /**
    * Resets the positions of the four corner vertices of this Quad.
    */
  def resetPosition(): this.type = js.native
  /**
    * Sets the bottom-left vertex position of this Quad.
    * @param x The horizontal coordinate of the vertex.
    * @param y The vertical coordinate of the vertex.
    */
  def setBottomLeft(x: Double, y: Double): this.type = js.native
  /**
    * Sets the bottom-right vertex position of this Quad.
    * @param x The horizontal coordinate of the vertex.
    * @param y The vertical coordinate of the vertex.
    */
  def setBottomRight(x: Double, y: Double): this.type = js.native
  /**
    * Sets the top-left vertex position of this Quad.
    * @param x The horizontal coordinate of the vertex.
    * @param y The vertical coordinate of the vertex.
    */
  def setTopLeft(x: Double, y: Double): this.type = js.native
  /**
    * Sets the top-right vertex position of this Quad.
    * @param x The horizontal coordinate of the vertex.
    * @param y The vertical coordinate of the vertex.
    */
  def setTopRight(x: Double, y: Double): this.type = js.native
}

