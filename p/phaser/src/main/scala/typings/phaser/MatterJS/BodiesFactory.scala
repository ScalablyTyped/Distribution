package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodiesFactory extends StObject {
  
  /**
    * Creates a new rigid body model with a circle hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method circle
    * @param {number} x
    * @param {number} y
    * @param {number} radius
    * @param {object} [options]
    * @param {number} [maxSides]
    * @return {body} A new circle body
    */
  def circle(x: Double, y: Double, radius: Double): BodyType = js.native
  def circle(x: Double, y: Double, radius: Double, options: Unit, maxSides: Double): BodyType = js.native
  def circle(x: Double, y: Double, radius: Double, options: IBodyDefinition): BodyType = js.native
  def circle(x: Double, y: Double, radius: Double, options: IBodyDefinition, maxSides: Double): BodyType = js.native
  
  /**
    * Takes an array of Body objects and flags all internal edges (coincident parts) based on the maxDistance
    * value. The array is changed in-place and returned, so you can pass this function a `Body.parts` property.
    *
    * @method flagCoincidentParts
    * @param {body[]} parts - The Body parts, or array of bodies, to flag.
    * @param {number} [maxDistance=5]
    * @return {body[]} The modified `parts` parameter.
    */
  def flagCoincidentParts(parts: js.Array[BodyType]): js.Array[BodyType] = js.native
  def flagCoincidentParts(parts: js.Array[BodyType], maxDistance: Double): js.Array[BodyType] = js.native
  
  /**
    * Creates a body using the supplied vertices (or an array containing multiple sets of vertices).
    * If the vertices are convex, they will pass through as supplied.
    * Otherwise if the vertices are concave, they will be decomposed if [poly-decomp.js](https://github.com/schteppe/poly-decomp.js) is available.
    * Note that this process is not guaranteed to support complex sets of vertices (e.g. those with holes may fail).
    * By default the decomposition will discard collinear edges (to improve performance).
    * It can also optionally discard any parts that have an area less than `minimumArea`.
    * If the vertices can not be decomposed, the result will fall back to using the convex hull.
    * The options parameter is an object that specifies any `Matter.Body` properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method fromVertices
    * @param {number} x
    * @param {number} y
    * @param [[vector]] vertexSets
    * @param {object} [options]
    * @param {bool} [flagInternal=false]
    * @param {number} [removeCollinear=0.01]
    * @param {number} [minimumArea=10]
    * @return {body}
    */
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[js.Array[Vector]]): BodyType = js.native
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[js.Array[Vector]], options: Unit, flagInternal: Boolean): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Unit,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Unit,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[js.Array[Vector]], options: IBodyDefinition): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Unit,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Unit,
    minimumArea: Double
  ): BodyType = js.native
  
  /**
    * Creates a new rigid body model with a regular polygon hull with the given number of sides.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method polygon
    * @param {number} x
    * @param {number} y
    * @param {number} sides
    * @param {number} radius
    * @param {object} [options]
    * @return {body} A new regular polygon body
    */
  def polygon(x: Double, y: Double, sides: Double, radius: Double): BodyType = js.native
  def polygon(x: Double, y: Double, sides: Double, radius: Double, options: IChamferableBodyDefinition): BodyType = js.native
  
  /**
    * Creates a new rigid body model with a rectangle hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method rectangle
    * @param {number} x
    * @param {number} y
    * @param {number} width
    * @param {number} height
    * @param {object} [options]
    * @return {body} A new rectangle body
    */
  def rectangle(x: Double, y: Double, width: Double, height: Double): BodyType = js.native
  def rectangle(x: Double, y: Double, width: Double, height: Double, options: IChamferableBodyDefinition): BodyType = js.native
  
  /**
    * Creates a new rigid body model with a trapezoid hull.
    * The `slope` is parameterised as a fraction of `width` and must be < 1 to form a valid trapezoid.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method trapezoid
    * @param {number} x
    * @param {number} y
    * @param {number} width
    * @param {number} height
    * @param {number} slope
    * @param {object} [options]
    * @return {body} A new trapezoid body
    */
  def trapezoid(x: Double, y: Double, width: Double, height: Double, slope: Double): BodyType = js.native
  def trapezoid(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    slope: Double,
    options: IChamferableBodyDefinition
  ): BodyType = js.native
}
