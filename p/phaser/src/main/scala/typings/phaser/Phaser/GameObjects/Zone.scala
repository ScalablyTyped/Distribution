package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Zone Game Object.
  * 
  * A Zone is a non-rendering rectangular Game Object that has a position and size.
  * It has no texture and never displays, but does live on the display list and
  * can be moved, scaled and rotated like any other Game Object.
  * 
  * Its primary use is for creating Drop Zones and Input Hit Areas and it has a couple of helper methods
  * specifically for this. It is also useful for object overlap checks, or as a base for your own
  * non-displaying Game Objects.
  * The default origin is 0.5, the center of the Zone, the same as with Game Objects.
  */
@js.native
trait Zone
  extends GameObject
     with Depth
     with GetBounds
     with Origin
     with Transform
     with ScrollFactor
     with Visible {
  
  /**
    * The Blend Mode of the Game Object.
    * Although a Zone never renders, it still has a blend mode to allow it to fit seamlessly into
    * display lists without causing a batch flush.
    */
  var blendMode: integer = js.native
  
  /**
    * The displayed height of this Game Object.
    * This value takes into account the scale factor.
    */
  var displayHeight: Double = js.native
  
  /**
    * The displayed width of this Game Object.
    * This value takes into account the scale factor.
    */
  var displayWidth: Double = js.native
  
  /**
    * The native (un-scaled) height of this Game Object.
    */
  var height: Double = js.native
  
  /**
    * Sets this Zone to be a Circular Drop Zone.
    * The circle is centered on this Zones `x` and `y` coordinates.
    * @param radius The radius of the Circle that will form the Drop Zone.
    */
  def setCircleDropZone(radius: Double): this.type = js.native
  
  /**
    * Sets the display size of this Game Object.
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  def setDisplaySize(width: Double, height: Double): this.type = js.native
  
  /**
    * Allows you to define your own Geometry shape to be used as a Drop Zone.
    * @param shape A Geometry shape instance, such as Phaser.Geom.Ellipse, or your own custom shape.
    * @param callback A function that will return `true` if the given x/y coords it is sent are within the shape.
    */
  def setDropZone(shape: js.Object, callback: HitAreaCallback): this.type = js.native
  
  /**
    * Sets this Zone to be a Rectangle Drop Zone.
    * The rectangle is centered on this Zones `x` and `y` coordinates.
    * @param width The width of the rectangle drop zone.
    * @param height The height of the rectangle drop zone.
    */
  def setRectangleDropZone(width: Double, height: Double): this.type = js.native
  
  /**
    * Sets the size of this Game Object.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    * @param resizeInput If this Zone has a Rectangle for a hit area this argument will resize the hit area as well. Default true.
    */
  def setSize(width: Double, height: Double): this.type = js.native
  def setSize(width: Double, height: Double, resizeInput: Boolean): this.type = js.native
  
  /**
    * The native (un-scaled) width of this Game Object.
    */
  var width: Double = js.native
}
