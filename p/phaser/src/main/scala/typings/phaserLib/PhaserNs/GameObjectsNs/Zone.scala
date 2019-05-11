package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("Phaser.GameObjects.Zone")
@js.native
class Zone protected ()
  extends GameObject
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Depth
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.GetBounds
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Origin
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Transform
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.ScrollFactor
     with phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Visible {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param width The width of the Game Object. Default 1.
    * @param height The height of the Game Object. Default 1.
    */
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(scene: phaserLib.PhaserNs.Scene, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  /**
    * The Blend Mode of the Game Object.
    * Although a Zone never renders, it still has a blend mode to allow it to fit seamlessly into
    * display lists without causing a batch flush.
    */
  var blendMode: phaserLib.integer = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  override var depth: scala.Double = js.native
  /**
    * The displayed height of this Game Object.
    * This value takes into account the scale factor.
    */
  var displayHeight: scala.Double = js.native
  /**
    * The displayed width of this Game Object.
    * This value takes into account the scale factor.
    */
  var displayWidth: scala.Double = js.native
  /**
    * The native (un-scaled) height of this Game Object.
    */
  var height: scala.Double = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
  /**
    * The native (un-scaled) width of this Game Object.
    */
  var width: scala.Double = js.native
  /**
    * Sets this Zone to be a Circular Drop Zone.
    * The circle is centered on this Zones `x` and `y` coordinates.
    * @param radius The radius of the Circle that will form the Drop Zone.
    */
  def setCircleDropZone(radius: scala.Double): Zone = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: phaserLib.integer): this.type = js.native
  /**
    * Sets the display size of this Game Object.
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  def setDisplaySize(width: scala.Double, height: scala.Double): Zone = js.native
  /**
    * Allows you to define your own Geometry shape to be used as a Drop Zone.
    * @param shape A Geometry shape instance, such as Phaser.Geom.Ellipse, or your own custom shape.
    * @param callback A function that will return `true` if the given x/y coords it is sent are within the shape.
    */
  def setDropZone(shape: js.Object, callback: phaserLib.PhaserNs.TypesNs.InputNs.HitAreaCallback): Zone = js.native
  /**
    * Sets this Zone to be a Rectangle Drop Zone.
    * The rectangle is centered on this Zones `x` and `y` coordinates.
    * @param width The width of the rectangle drop zone.
    * @param height The height of the rectangle drop zone.
    */
  def setRectangleDropZone(width: scala.Double, height: scala.Double): Zone = js.native
  /**
    * Sets the size of this Game Object.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    * @param resizeInput If this Zone has a Rectangle for a hit area this argument will resize the hit area as well. Default true.
    */
  def setSize(width: scala.Double, height: scala.Double): Zone = js.native
  def setSize(width: scala.Double, height: scala.Double, resizeInput: scala.Boolean): Zone = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: scala.Boolean): this.type = js.native
}

