package typings.phaser.Phaser.GameObjects

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Curve Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * To render a Curve Shape you must first create a `Phaser.Curves.Curve` object, then pass it to
  * the Curve Shape in the constructor.
  * 
  * The Curve shape also has a `smoothness` property and corresponding `setSmoothness` method.
  * This allows you to control how smooth the shape renders in WebGL, by controlling the number of iterations
  * that take place during construction. Increase and decrease the default value for smoother, or more
  * jagged, shapes.
  */
@js.native
trait Curve extends Shape {
  
  /**
    * Sets the smoothness of the curve. The number of points used when rendering it.
    * Increase this value for smoother curves, at the cost of more polygons being rendered.
    * This call can be chained.
    * @param value The value to set the smoothness to.
    */
  def setSmoothness(value: integer): this.type = js.native
  
  /**
    * The smoothness of the curve. The number of points used when rendering it.
    * Increase this value for smoother curves, at the cost of more polygons being rendered.
    */
  var smoothness: integer = js.native
}
