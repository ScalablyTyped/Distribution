package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Star Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * As the name implies, the Star shape will display a star in your game. You can control several
  * aspects of it including the number of points that constitute the star. The default is 5. If
  * you change it to 4 it will render as a diamond. If you increase them, you'll get a more spiky
  * star shape.
  * 
  * You can also control the inner and outer radius, which is how 'long' each point of the star is.
  * Modify these values to create more interesting shapes.
  */
@JSGlobal("Phaser.GameObjects.Star")
@js.native
class Star protected () extends Shape {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param points The number of points on the star. Default 5.
    * @param innerRadius The inner radius of the star. Default 32.
    * @param outerRadius The outer radius of the star. Default 64.
    * @param fillColor The color the star will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the star will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def this(
    scene: Scene,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    points: js.UndefOr[Double],
    innerRadius: js.UndefOr[Double],
    outerRadius: js.UndefOr[Double],
    fillColor: js.UndefOr[Double],
    fillAlpha: js.UndefOr[Double]
  ) = this()
  /**
    * The inner radius of the Star shape.
    */
  var innerRadius: Double = js.native
  /**
    * The outer radius of the Star shape.
    */
  var outerRadius: Double = js.native
  /**
    * The number of points that make up the Star shape.
    */
  var points: integer = js.native
  /**
    * Sets the inner radius of the Star shape.
    * This call can be chained.
    * @param value The amount to set the inner radius to.
    */
  def setInnerRadius(value: Double): this.type = js.native
  /**
    * Sets the outer radius of the Star shape.
    * This call can be chained.
    * @param value The amount to set the outer radius to.
    */
  def setOuterRadius(value: Double): this.type = js.native
  /**
    * Sets the number of points that make up the Star shape.
    * This call can be chained.
    * @param value The amount of points the Star will have.
    */
  def setPoints(value: integer): this.type = js.native
}

