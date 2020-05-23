package typings.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Ellipse object is used to help draw graphics and can also be used to specify a hit area for displayObjects.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Ellipse")
@js.native
class Ellipse ()
  extends typings.pixiJs.PIXI.Ellipse {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, halfWidth: Double) = this()
  def this(x: Double, y: Double, halfWidth: Double, halfHeight: Double) = this()
  /**
    * @member {number} PIXI.Ellipse#height
    * @default 0
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Ellipse#type
    * @readOnly
    * @default PIXI.SHAPES.ELIP
    * @see PIXI.SHAPES
    */
  /* CompleteClass */
  override val `type`: Double = js.native
  /**
    * @member {number} PIXI.Ellipse#width
    * @default 0
    */
  /* CompleteClass */
  override var width: Double = js.native
  /**
    * @member {number} PIXI.Ellipse#x
    * @default 0
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * @member {number} PIXI.Ellipse#y
    * @default 0
    */
  /* CompleteClass */
  override var y: Double = js.native
  /**
    * Checks whether the x and y coordinates given are contained within this ellipse
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coords are within this ellipse
    */
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
  /**
    * Returns the framing rectangle of the ellipse as a Rectangle object
    *
    * @return {PIXI.Rectangle} the framing rectangle
    */
  /* CompleteClass */
  override def getBounds(): typings.pixiJs.PIXI.Rectangle = js.native
}

