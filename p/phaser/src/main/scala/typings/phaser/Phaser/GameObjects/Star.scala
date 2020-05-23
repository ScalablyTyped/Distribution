package typings.phaser.Phaser.GameObjects

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
@js.native
trait Star extends Shape {
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

