package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Point object represents a location in a two-dimensional coordinate system, where x represents
  * the horizontal axis and y represents the vertical axis.
  *
  * @class
  * @memberof PIXI
  * @implements IPoint
  */
@JSImport("pixi.js", "Point")
@js.native
class Point ()
  extends typings.pixiJs.PIXI.Point {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  /**
    * X coord
    * @memberof PIXI.IPointData#
    * @member {number} x
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * Y coord
    * @memberof PIXI.IPointData#
    * @member {number} y
    */
  /* CompleteClass */
  override var y: Double = js.native
}

