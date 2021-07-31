package typings.phaser.Phaser.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Line Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports only stroke colors and cannot be filled.
  * 
  * A Line Shape allows you to draw a line between two points in your game. You can control the
  * stroke color and thickness of the line. In WebGL only you can also specify a different
  * thickness for the start and end of the line, allowing you to render lines that taper-off.
  * 
  * If you need to draw multiple lines in a sequence you may wish to use the Polygon Shape instead.
  * 
  * Be aware that as with all Game Objects the default origin is 0.5. If you need to draw a Line
  * between two points and want the x1/y1 values to match the x/y values, then set the origin to 0.
  */
@js.native
trait Line
  extends StObject
     with Shape {
  
  /**
    * Sets the width of the line.
    * 
    * When using the WebGL renderer you can have different start and end widths.
    * When using the Canvas renderer only the `startWidth` value is used. The `endWidth` is ignored.
    * 
    * This call can be chained.
    * @param startWidth The start width of the line.
    * @param endWidth The end width of the line. Only used in WebGL.
    */
  def setLineWidth(startWidth: Double): this.type = js.native
  def setLineWidth(startWidth: Double, endWidth: Double): this.type = js.native
  
  /**
    * Sets the start and end coordinates of this Line.
    * @param x1 The horizontal position of the start of the line. Default 0.
    * @param y1 The vertical position of the start of the line. Default 0.
    * @param x2 The horizontal position of the end of the line. Default 0.
    * @param y2 The vertical position of the end of the line. Default 0.
    */
  def setTo(): this.type = js.native
  def setTo(x1: Double): this.type = js.native
  def setTo(x1: Double, y1: Double): this.type = js.native
  def setTo(x1: Double, y1: Double, x2: Double): this.type = js.native
  def setTo(x1: Double, y1: Double, x2: Double, y2: Double): this.type = js.native
  def setTo(x1: Double, y1: Double, x2: Unit, y2: Double): this.type = js.native
  def setTo(x1: Double, y1: Unit, x2: Double): this.type = js.native
  def setTo(x1: Double, y1: Unit, x2: Double, y2: Double): this.type = js.native
  def setTo(x1: Double, y1: Unit, x2: Unit, y2: Double): this.type = js.native
  def setTo(x1: Unit, y1: Double): this.type = js.native
  def setTo(x1: Unit, y1: Double, x2: Double): this.type = js.native
  def setTo(x1: Unit, y1: Double, x2: Double, y2: Double): this.type = js.native
  def setTo(x1: Unit, y1: Double, x2: Unit, y2: Double): this.type = js.native
  def setTo(x1: Unit, y1: Unit, x2: Double): this.type = js.native
  def setTo(x1: Unit, y1: Unit, x2: Double, y2: Double): this.type = js.native
  def setTo(x1: Unit, y1: Unit, x2: Unit, y2: Double): this.type = js.native
}
