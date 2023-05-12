package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Rectangle Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * You can change the size of the rectangle by changing the `width` and `height` properties.
  */
@JSGlobal("Phaser.GameObjects.Rectangle")
@js.native
open class Rectangle protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Rectangle {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param width The width of the rectangle. Default 128.
    * @param height The height of the rectangle. Default 128.
    * @param fillColor The color the rectangle will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the rectangle will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Double, height: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Unit, height: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Double, height: Double, fillColor: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Double, height: Unit, fillColor: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Unit, height: Double, fillColor: Double) = this()
  def this(scene: Scene, x: Double, y: Double, width: Unit, height: Unit, fillColor: Double) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    fillColor: Unit,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    width: Double,
    height: Unit,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    width: Double,
    height: Unit,
    fillColor: Unit,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    width: Unit,
    height: Double,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    width: Unit,
    height: Double,
    fillColor: Unit,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    width: Unit,
    height: Unit,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(scene: Scene, x: Double, y: Double, width: Unit, height: Unit, fillColor: Unit, fillAlpha: Double) = this()
  
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
