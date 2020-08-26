package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Polygon Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * The Polygon Shape is created by providing a list of points, which are then used to create an
  * internal Polygon geometry object. The points can be set from a variety of formats:
  * 
  * - A string containing paired values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
  * - An array of Point or Vector2 objects: `[new Phaser.Math.Vector2(x1, y1), ...]`
  * - An array of objects with public x/y properties: `[obj1, obj2, ...]`
  * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
  * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
  * 
  * By default the `x` and `y` coordinates of this Shape refer to the center of it. However, depending
  * on the coordinates of the points provided, the final shape may be rendered offset from its origin.
  */
@JSImport("phaser", "GameObjects.Polygon")
@js.native
class Polygon protected ()
  extends typings.phaser.Phaser.GameObjects.Polygon {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param points The points that make up the polygon.
    * @param fillColor The color the polygon will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the polygon will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, x: Double) = this()
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(scene: Scene, x: Double, y: Double) = this()
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], points: js.Any) = this()
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: Double, points: js.Any) = this()
  def this(scene: Scene, x: Double, y: js.UndefOr[scala.Nothing], points: js.Any) = this()
  def this(scene: Scene, x: Double, y: Double, points: js.Any) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    points: js.UndefOr[scala.Nothing],
    fillColor: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    points: js.Any,
    fillColor: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    points: js.UndefOr[scala.Nothing],
    fillColor: Double
  ) = this()
  def this(scene: Scene, x: js.UndefOr[scala.Nothing], y: Double, points: js.Any, fillColor: Double) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    points: js.UndefOr[scala.Nothing],
    fillColor: Double
  ) = this()
  def this(scene: Scene, x: Double, y: js.UndefOr[scala.Nothing], points: js.Any, fillColor: Double) = this()
  def this(scene: Scene, x: Double, y: Double, points: js.UndefOr[scala.Nothing], fillColor: Double) = this()
  def this(scene: Scene, x: Double, y: Double, points: js.Any, fillColor: Double) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    points: js.UndefOr[scala.Nothing],
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    points: js.UndefOr[scala.Nothing],
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    points: js.Any,
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    points: js.Any,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    points: js.UndefOr[scala.Nothing],
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    points: js.UndefOr[scala.Nothing],
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    points: js.Any,
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: js.UndefOr[scala.Nothing],
    y: Double,
    points: js.Any,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    points: js.UndefOr[scala.Nothing],
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    points: js.UndefOr[scala.Nothing],
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    points: js.Any,
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: js.UndefOr[scala.Nothing],
    points: js.Any,
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    points: js.UndefOr[scala.Nothing],
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    points: js.UndefOr[scala.Nothing],
    fillColor: Double,
    fillAlpha: Double
  ) = this()
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    points: js.Any,
    fillColor: js.UndefOr[scala.Nothing],
    fillAlpha: Double
  ) = this()
  def this(scene: Scene, x: Double, y: Double, points: js.Any, fillColor: Double, fillAlpha: Double) = this()
}

