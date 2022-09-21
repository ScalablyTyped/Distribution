package typings.phaser.Phaser.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Ellipse Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * When it renders it displays an ellipse shape. You can control the width and height of the ellipse.
  * If the width and height match it will render as a circle. If the width is less than the height,
  * it will look more like an egg shape.
  * 
  * The Ellipse shape also has a `smoothness` property and corresponding `setSmoothness` method.
  * This allows you to control how smooth the shape renders in WebGL, by controlling the number of iterations
  * that take place during construction. Increase and decrease the default value for smoother, or more
  * jagged, shapes.
  */
@js.native
trait Ellipse
  extends StObject
     with Shape {
  
  /**
    * Sets the size of the ellipse by changing the underlying geometry data, rather than scaling the object.
    * This call can be chained.
    * @param width The width of the ellipse.
    * @param height The height of the ellipse.
    */
  def setSize(width: Double, height: Double): this.type = js.native
  
  /**
    * Sets the smoothness of the ellipse. The number of points used when rendering it.
    * Increase this value for a smoother ellipse, at the cost of more polygons being rendered.
    * This call can be chained.
    * @param value The value to set the smoothness to.
    */
  def setSmoothness(value: Double): this.type = js.native
  
  /**
    * The smoothness of the ellipse. The number of points used when rendering it.
    * Increase this value for a smoother ellipse, at the cost of more polygons being rendered.
    */
  var smoothness: Double = js.native
}
