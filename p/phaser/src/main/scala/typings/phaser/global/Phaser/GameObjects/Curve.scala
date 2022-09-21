package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
@JSGlobal("Phaser.GameObjects.Curve")
@js.native
open class Curve protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Curve {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param curve The Curve object to use to create the Shape.
    * @param fillColor The color the curve will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the curve will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, x: Double) = this()
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: Unit, y: Double) = this()
  def this(scene: Scene, x: Double, y: Double, curve: typings.phaser.Phaser.Curves.Curve) = this()
  def this(scene: Scene, x: Double, y: Unit, curve: typings.phaser.Phaser.Curves.Curve) = this()
  def this(scene: Scene, x: Unit, y: Double, curve: typings.phaser.Phaser.Curves.Curve) = this()
  def this(scene: Scene, x: Unit, y: Unit, curve: typings.phaser.Phaser.Curves.Curve) = this()
  def this(scene: Scene, x: Double, y: Double, curve: Unit, fillColor: Double) = this()
  def this(scene: Scene, x: Double, y: Double, curve: typings.phaser.Phaser.Curves.Curve, fillColor: Double) = this()
  def this(scene: Scene, x: Double, y: Unit, curve: Unit, fillColor: Double) = this()
  def this(scene: Scene, x: Double, y: Unit, curve: typings.phaser.Phaser.Curves.Curve, fillColor: Double) = this()
  def this(scene: Scene, x: Unit, y: Double, curve: Unit, fillColor: Double) = this()
  def this(scene: Scene, x: Unit, y: Double, curve: typings.phaser.Phaser.Curves.Curve, fillColor: Double) = this()
  def this(scene: Scene, x: Unit, y: Unit, curve: Unit, fillColor: Double) = this()
  def this(scene: Scene, x: Unit, y: Unit, curve: typings.phaser.Phaser.Curves.Curve, fillColor: Double) = this()
  def this(scene: Scene, x: Double, y: Double, curve: Unit, fillColor: Double, fillAlpha: Double) = this()
  def this(scene: Scene, x: Double, y: Double, curve: Unit, fillColor: Unit, fillAlpha: Double) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Unit,
    fillAlpha: Double
  ) = this()
  def this(scene: Scene, x: Double, y: Unit, curve: Unit, fillColor: Double, fillAlpha: Double) = this()
  def this(scene: Scene, x: Double, y: Unit, curve: Unit, fillColor: Unit, fillAlpha: Double) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Unit,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Unit,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Unit,
    fillAlpha: Double
  ) = this()
  def this(scene: Scene, x: Unit, y: Double, curve: Unit, fillColor: Double, fillAlpha: Double) = this()
  def this(scene: Scene, x: Unit, y: Double, curve: Unit, fillColor: Unit, fillAlpha: Double) = this()
  def this(
    scene: Scene,
    x: Unit,
    y: Double,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Unit,
    y: Double,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Unit,
    fillAlpha: Double
  ) = this()
  def this(scene: Scene, x: Unit, y: Unit, curve: Unit, fillColor: Double, fillAlpha: Double) = this()
  def this(scene: Scene, x: Unit, y: Unit, curve: Unit, fillColor: Unit, fillAlpha: Double) = this()
  def this(
    scene: Scene,
    x: Unit,
    y: Unit,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Unit,
    y: Unit,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Unit,
    fillAlpha: Double
  ) = this()
  
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
    * @param value The depth of this Game Object.
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
