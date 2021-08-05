package typings.phaser.MatterJS

import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvgFactory extends StObject {
  
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
  
  inline def apply(pathToVertices: (SVGPathElement, Double) => js.Array[Vector]): SvgFactory = {
    val __obj = js.Dynamic.literal(pathToVertices = js.Any.fromFunction2(pathToVertices))
    __obj.asInstanceOf[SvgFactory]
  }
  
  extension [Self <: SvgFactory](x: Self) {
    
    inline def setPathToVertices(value: (SVGPathElement, Double) => js.Array[Vector]): Self = StObject.set(x, "pathToVertices", js.Any.fromFunction2(value))
  }
}
