package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common interface for points. Both Point and ObservablePoint implement it
  * @memberof PIXI
  * @interface IPointData
  */
trait IPointData extends js.Object {
  /**
    * X coord
    * @memberof PIXI.IPointData#
    * @member {number} x
    */
  var x: Double
  /**
    * Y coord
    * @memberof PIXI.IPointData#
    * @member {number} y
    */
  var y: Double
}

object IPointData {
  @scala.inline
  def apply(x: Double, y: Double): IPointData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointData]
  }
}

