package typings.phaser.MatterJS

import typings.std.SVGPathElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgFactory extends js.Object {
  /**
    * Converts an SVG path into an array of vector points.
    * If the input path forms a concave shape, you must decompose the result into convex parts before use.
    * See `Bodies.fromVertices` which provides support for this.
    * Note that this function is not guaranteed to support complex paths (such as those with holes).
    * @method pathToVertices
    * @param {SVGPathElement} path
    * @param {Number} [sampleLength=15]
    * @return {Vector[]} points
    */
  def pathToVertices(path: SVGPathElement, sampleLength: Double): js.Array[Vector]
}

object SvgFactory {
  @scala.inline
  def apply(pathToVertices: (SVGPathElement, Double) => js.Array[Vector]): SvgFactory = {
    val __obj = js.Dynamic.literal(pathToVertices = js.Any.fromFunction2(pathToVertices))
    __obj.asInstanceOf[SvgFactory]
  }
}

