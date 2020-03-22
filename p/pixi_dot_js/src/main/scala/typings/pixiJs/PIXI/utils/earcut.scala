package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils.earcut")
@js.native
object earcut extends js.Object {
  /**
    * A polygon triangulation library
    *
    * @see {@link https://github.com/mapbox/earcut}
    *
    * @memberof PIXI.utils
    * @function earcut
    * @param {number[]} vertices - A flat array of vertex coordinates
    * @param {number[]} [holes] - An array of hole indices
    * @param {number} [dimensions=2] The number of coordinates per vertex in the input array
    * @return {number[]} Triangulated polygon
    */
  def apply(vertices: js.Array[Double]): js.Array[Double] = js.native
  def apply(vertices: js.Array[Double], holes: js.Array[Double]): js.Array[Double] = js.native
  def apply(vertices: js.Array[Double], holes: js.Array[Double], dimensions: Double): js.Array[Double] = js.native
}

