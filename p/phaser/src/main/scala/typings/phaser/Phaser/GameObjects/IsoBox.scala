package typings.phaser.Phaser.GameObjects

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait IsoBox extends Shape {
  
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
    * Sets which faces of the iso box will be rendered.
    * This call can be chained.
    * @param showTop Show the top-face of the iso box. Default true.
    * @param showLeft Show the left-face of the iso box. Default true.
    * @param showRight Show the right-face of the iso box. Default true.
    */
  def setFaces(): this.type = js.native
  def setFaces(showTop: js.UndefOr[scala.Nothing], showLeft: js.UndefOr[scala.Nothing], showRight: Boolean): this.type = js.native
  def setFaces(showTop: js.UndefOr[scala.Nothing], showLeft: Boolean): this.type = js.native
  def setFaces(showTop: js.UndefOr[scala.Nothing], showLeft: Boolean, showRight: Boolean): this.type = js.native
  def setFaces(showTop: Boolean): this.type = js.native
  def setFaces(showTop: Boolean, showLeft: js.UndefOr[scala.Nothing], showRight: Boolean): this.type = js.native
  def setFaces(showTop: Boolean, showLeft: Boolean): this.type = js.native
  def setFaces(showTop: Boolean, showLeft: Boolean, showRight: Boolean): this.type = js.native
  
  def setFillStyle(fillTop: js.UndefOr[scala.Nothing], fillLeft: js.UndefOr[scala.Nothing], fillRight: Double): this.type = js.native
  def setFillStyle(fillTop: js.UndefOr[scala.Nothing], fillLeft: Double, fillRight: Double): this.type = js.native
  def setFillStyle(fillTop: Double, fillLeft: js.UndefOr[scala.Nothing], fillRight: Double): this.type = js.native
  def setFillStyle(fillTop: Double, fillLeft: Double, fillRight: Double): this.type = js.native
  
  /**
    * Sets the projection level of the iso box. Change this to change the 'angle' at which you are looking at the box.
    * This call can be chained.
    * @param value The value to set the projection to.
    */
  def setProjection(value: integer): this.type = js.native
  
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
}
