package typings.phaser.Phaser.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Arc Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * When it renders it displays an arc shape. You can control the start and end angles of the arc,
  * as well as if the angles are winding clockwise or anti-clockwise. With the default settings
  * it renders as a complete circle. By changing the angles you can create other arc shapes,
  * such as half-circles.
  * 
  * Arcs also have an `iterations` property and corresponding `setIterations` method. This allows
  * you to control how smooth the shape renders in WebGL, by controlling the number of iterations
  * that take place during construction.
  */
@js.native
trait Arc
  extends StObject
     with Shape {
  
  /**
    * The winding order of the start and end angles.
    */
  var anticlockwise: Boolean = js.native
  
  /**
    * The end angle of the arc, in degrees.
    */
  var endAngle: Double = js.native
  
  /**
    * The number of iterations used when drawing the arc.
    * Increase this value for smoother arcs, at the cost of more polygons being rendered.
    * Modify this value by small amounts, such as 0.01.
    */
  var iterations: Double = js.native
  
  /**
    * The radius of the arc.
    */
  var radius: Double = js.native
  
  /**
    * Sets the ending angle of the arc, in degrees.
    * This call can be chained.
    * @param value The value to set the ending angle to.
    */
  def setEndAngle(value: Double): this.type = js.native
  
  /**
    * Sets the number of iterations used when drawing the arc.
    * Increase this value for smoother arcs, at the cost of more polygons being rendered.
    * Modify this value by small amounts, such as 0.01.
    * This call can be chained.
    * @param value The value to set the iterations to.
    */
  def setIterations(value: Double): this.type = js.native
  
  /**
    * Sets the radius of the arc.
    * This call can be chained.
    * @param value The value to set the radius to.
    */
  def setRadius(value: Double): this.type = js.native
  
  /**
    * Sets the starting angle of the arc, in degrees.
    * This call can be chained.
    * @param value The value to set the starting angle to.
    */
  def setStartAngle(value: Double): this.type = js.native
  
  /**
    * The start angle of the arc, in degrees.
    */
  var startAngle: Double = js.native
}
