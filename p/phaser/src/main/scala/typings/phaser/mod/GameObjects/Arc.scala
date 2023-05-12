package typings.phaser.mod.GameObjects

import typings.phaser.Phaser.Scene
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
@JSImport("phaser", "GameObjects.Arc")
@js.native
open class Arc protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Arc {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param radius The radius of the arc. Default 128.
    * @param startAngle The start angle of the arc, in degrees. Default 0.
    * @param endAngle The end angle of the arc, in degrees. Default 360.
    * @param anticlockwise The winding order of the start and end angles. Default false.
    * @param fillColor The color the arc will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the arc will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def this(
    scene: Scene,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    radius: js.UndefOr[Double],
    startAngle: js.UndefOr[Double],
    endAngle: js.UndefOr[Double],
    anticlockwise: js.UndefOr[Boolean],
    fillColor: js.UndefOr[Double],
    fillAlpha: js.UndefOr[Double]
  ) = this()
  
  /**
    * The depth of this Game Object within the Scene. Ensure this value is only ever set to a number data-type.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  var depth: Double = js.native
  
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object. Ensure this value is only ever a number data-type.
    */
  /* CompleteClass */
  override def setDepth(value: Double): this.type = js.native
  
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
