package typings.phaser.global.MatterJS

import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Svg` module contains methods for converting SVG images into an array of vector points.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Svg
  */
@JSGlobal("MatterJS.Svg")
@js.native
class Svg ()
  extends StObject
     with typings.phaser.MatterJS.Svg
object Svg {
  
  @JSGlobal("MatterJS.Svg")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def pathToVertices(path: SVGPathElement, sampleLength: Double): js.Array[typings.phaser.MatterJS.Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("pathToVertices")(path.asInstanceOf[js.Any], sampleLength.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.MatterJS.Vector]]
}
