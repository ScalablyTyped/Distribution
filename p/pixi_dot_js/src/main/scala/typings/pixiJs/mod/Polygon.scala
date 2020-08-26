package typings.pixiJs.mod

import typings.pixiJs.PIXI.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class to define a shape via user defined co-orinates.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Polygon")
@js.native
class Polygon protected ()
  extends typings.pixiJs.PIXI.Polygon {
  def this(points: (js.Array[Double | IPoint])*) = this()
}

