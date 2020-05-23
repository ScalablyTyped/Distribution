package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Circle object is used to help draw graphics and can also be used to specify a hit area for displayObjects.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Circle")
@js.native
class Circle ()
  extends typings.pixiJs.PIXI.Circle {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, radius: Double) = this()
  /**
    * @member {number} PIXI.Circle#radius
    * @default 0
    */
  /* CompleteClass */
  override var radius: Double = js.native
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Circle#type
    * @readOnly
    * @default PIXI.SHAPES.CIRC
    * @see PIXI.SHAPES
    */
  /* CompleteClass */
  override val `type`: Double = js.native
  /**
    * @member {number} PIXI.Circle#x
    * @default 0
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * @member {number} PIXI.Circle#y
    * @default 0
    */
  /* CompleteClass */
  override var y: Double = js.native
  /**
    * Checks whether the x and y coordinates given are contained within this circle
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this Circle
    */
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
  /**
    * Returns the framing rectangle of the circle as a Rectangle object
    *
    * @return {PIXI.Rectangle} the framing rectangle
    */
  /* CompleteClass */
  override def getBounds(): typings.pixiJs.PIXI.Rectangle = js.native
}

