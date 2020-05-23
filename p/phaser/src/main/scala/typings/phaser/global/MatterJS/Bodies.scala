package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IBodyDefinition
import typings.phaser.MatterJS.IChamferableBodyDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Bodies` module contains factory methods for creating rigid body models
  * with commonly used body configurations (such as rectangles, circles and other polygons).
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  */
@JSGlobal("MatterJS.Bodies")
@js.native
class Bodies ()
  extends typings.phaser.MatterJS.Bodies

/* static members */
@JSGlobal("MatterJS.Bodies")
@js.native
object Bodies extends js.Object {
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
  def circle(x: Double, y: Double, radius: Double, options: IBodyDefinition): BodyType = js.native
  def circle(x: Double, y: Double, radius: Double, options: IBodyDefinition, maxSides: Double): BodyType = js.native
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
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]]): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Double
  ): BodyType = js.native
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Double,
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

