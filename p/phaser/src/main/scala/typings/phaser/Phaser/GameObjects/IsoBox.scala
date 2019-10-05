package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The IsoBox Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports only fill colors and cannot be stroked.
  * 
  * An IsoBox is an 'isometric' rectangle. Each face of it has a different fill color. You can set
  * the color of the top, left and right faces of the rectangle respectively. You can also choose
  * which of the faces are rendered via the `showTop`, `showLeft` and `showRight` properties.
  * 
  * You cannot view an IsoBox from under-neath, however you can change the 'angle' by setting
  * the `projection` property.
  */
@JSGlobal("Phaser.GameObjects.IsoBox")
@js.native
class IsoBox protected () extends Shape {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param size The width of the iso box in pixels. The left and right faces will be exactly half this value. Default 48.
    * @param height The height of the iso box. The left and right faces will be this tall. The overall height of the isobox will be this value plus half the `size` value. Default 32.
    * @param fillTop The fill color of the top face of the iso box. Default 0xeeeeee.
    * @param fillLeft The fill color of the left face of the iso box. Default 0x999999.
    * @param fillRight The fill color of the right face of the iso box. Default 0xcccccc.
    */
  def this(
    scene: Scene,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    size: js.UndefOr[Double],
    height: js.UndefOr[Double],
    fillTop: js.UndefOr[Double],
    fillLeft: js.UndefOr[Double],
    fillRight: js.UndefOr[Double]
  ) = this()
  /**
    * The color used to fill in the left-facing side of the iso box.
    */
  var fillLeft: Double = js.native
  /**
    * The color used to fill in the right-facing side of the iso box.
    */
  var fillRight: Double = js.native
  /**
    * The color used to fill in the top of the iso box.
    */
  var fillTop: Double = js.native
  /**
    * The projection level of the iso box. Change this to change the 'angle' at which you are looking at the box.
    */
  var projection: integer = js.native
  /**
    * Controls if the left-face of the iso box be rendered.
    */
  var showLeft: Boolean = js.native
  /**
    * Controls if the right-face of the iso box be rendered.
    */
  var showRight: Boolean = js.native
  /**
    * Controls if the top-face of the iso box be rendered.
    */
  var showTop: Boolean = js.native
  /**
    * Sets which faces of the iso box will be rendered.
    * This call can be chained.
    * @param showTop Show the top-face of the iso box. Default true.
    * @param showLeft Show the left-face of the iso box. Default true.
    * @param showRight Show the right-face of the iso box. Default true.
    */
  def setFaces(): this.type = js.native
  def setFaces(showTop: Boolean): this.type = js.native
  def setFaces(showTop: Boolean, showLeft: Boolean): this.type = js.native
  def setFaces(showTop: Boolean, showLeft: Boolean, showRight: Boolean): this.type = js.native
  def setFillStyle(fillTop: Double, fillLeft: Double, fillRight: Double): this.type = js.native
  /**
    * Sets the projection level of the iso box. Change this to change the 'angle' at which you are looking at the box.
    * This call can be chained.
    * @param value The value to set the projection to.
    */
  def setProjection(value: integer): this.type = js.native
}

