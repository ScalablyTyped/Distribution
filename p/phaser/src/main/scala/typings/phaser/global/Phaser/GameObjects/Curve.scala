package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
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
@JSGlobal("Phaser.GameObjects.Curve")
@js.native
class Curve protected ()
  extends typings.phaser.Phaser.GameObjects.Curve {
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
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    curve: typings.phaser.Phaser.Curves.Curve
  ) = this()
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: Double, curve: typings.phaser.Phaser.Curves.Curve) = this()
  def this(scene: Scene, x: Double, y: js.UndefOr[scala.Nothing], curve: typings.phaser.Phaser.Curves.Curve) = this()
  def this(scene: Scene, x: Double, y: Double, curve: typings.phaser.Phaser.Curves.Curve) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    curve: js.UndefOr[scala.Nothing],
    fillColor: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    curve: js.UndefOr[scala.Nothing],
    fillColor: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    curve: js.UndefOr[scala.Nothing],
    fillColor: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double
  ) = this()
  def this(scene: Scene, x: Double, y: Double, curve: js.UndefOr[scala.Nothing], fillColor: Double) = this()
  def this(scene: Scene, x: Double, y: Double, curve: typings.phaser.Phaser.Curves.Curve, fillColor: Double) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    curve: js.UndefOr[scala.Nothing],
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    curve: js.UndefOr[scala.Nothing],
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    curve: js.UndefOr[scala.Nothing],
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    curve: js.UndefOr[scala.Nothing],
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    curve: js.UndefOr[scala.Nothing],
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    curve: js.UndefOr[scala.Nothing],
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    curve: js.UndefOr[scala.Nothing],
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    curve: js.UndefOr[scala.Nothing],
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    curve: typings.phaser.Phaser.Curves.Curve,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
}
