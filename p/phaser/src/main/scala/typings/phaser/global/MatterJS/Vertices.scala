package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Vertices` module contains methods for creating and manipulating sets of vertices.
  * A set of vertices is an array of `Matter.Vector` with additional indexing properties inserted by `Vertices.create`.
  * A `Matter.Body` maintains a set of vertices to represent the shape of the object (its convex hull).
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Vertices
  */
@JSGlobal("MatterJS.Vertices")
@js.native
class Vertices ()
  extends typings.phaser.MatterJS.Vertices
object Vertices {
  
  /**
    * Returns the area of the set of vertices.
    * @method area
    * @param {vertices} vertices
    * @param {bool} signed
    * @return {number} The area
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.area")
  @js.native
  def area(vertices: js.Array[typings.phaser.MatterJS.Vector], signed: Boolean): Double = js.native
  
  /**
    * Returns the centre (centroid) of the set of vertices.
    * @method centre
    * @param {vertices} vertices
    * @return {vector} The centre point
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.centre")
  @js.native
  def centre(vertices: js.Array[typings.phaser.MatterJS.Vector]): typings.phaser.MatterJS.Vector = js.native
  
  @JSGlobal("MatterJS.Vertices.chamfer")
  @js.native
  def chamfer(
    vertices: js.Array[typings.phaser.MatterJS.Vector],
    radius: js.Array[Double],
    quality: Double,
    qualityMin: Double,
    qualityMax: Double
  ): Unit = js.native
  /**
    * Chamfers a set of vertices by giving them rounded corners, returns a new set of vertices.
    * The radius parameter is a single number or an array to specify the radius for each vertex.
    * @method chamfer
    * @param {vertices} vertices
    * @param {number[]} radius
    * @param {number} quality
    * @param {number} qualityMin
    * @param {number} qualityMax
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.chamfer")
  @js.native
  def chamfer(
    vertices: js.Array[typings.phaser.MatterJS.Vector],
    radius: Double,
    quality: Double,
    qualityMin: Double,
    qualityMax: Double
  ): Unit = js.native
  
  /**
    * Sorts the input vertices into clockwise order in place.
    * @method clockwiseSort
    * @param {vertices} vertices
    * @return {vertices} vertices
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.clockwiseSort")
  @js.native
  def clockwiseSort(vertices: js.Array[typings.phaser.MatterJS.Vector]): js.Array[typings.phaser.MatterJS.Vector] = js.native
  
  /**
    * Returns `true` if the `point` is inside the set of `vertices`.
    * @method contains
    * @param {vertices} vertices
    * @param {vector} point
    * @return {boolean} True if the vertices contains point, otherwise false
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.contains")
  @js.native
  def contains(vertices: js.Array[typings.phaser.MatterJS.Vector], point: typings.phaser.MatterJS.Vector): Boolean = js.native
  
  /**
    * Creates a new set of `Matter.Body` compatible vertices.
    * The `points` argument accepts an array of `Matter.Vector` points orientated around the origin `(0, 0)`, for example:
    *
    *     [{ x: 0, y: 0 }, { x: 25, y: 50 }, { x: 50, y: 0 }]
    *
    * The `Vertices.create` method returns a new array of vertices, which are similar to Matter.Vector objects,
    * but with some additional references required for efficient collision detection routines.
    *
    * Note that the `body` argument is not optional, a `Matter.Body` reference must be provided.
    *
    * @method create
    * @param {vector[]} points
    * @param {body} body
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.create")
  @js.native
  def create(points: js.Array[typings.phaser.MatterJS.Vector], body: BodyType): js.Array[typings.phaser.MatterJS.Vector] = js.native
  
  /**
    * Parses a string containing ordered x y pairs separated by spaces (and optionally commas),
    * into a `Matter.Vertices` object for the given `Matter.Body`.
    * For parsing SVG paths, see `Svg.pathToVertices`.
    * @method fromPath
    * @param {string} path
    * @param {body} body
    * @return {vertices} vertices
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.fromPath")
  @js.native
  def fromPath(path: String, body: BodyType): js.Array[typings.phaser.MatterJS.Vector] = js.native
  
  /**
    * Returns the convex hull of the input vertices as a new array of points.
    * @method hull
    * @param {vertices} vertices
    * @return [vertex] vertices
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.hull")
  @js.native
  def hull(vertices: js.Array[typings.phaser.MatterJS.Vector]): js.Array[typings.phaser.MatterJS.Vector] = js.native
  
  /**
    * Returns the moment of inertia (second moment of area) of the set of vertices given the total mass.
    * @method inertia
    * @param {vertices} vertices
    * @param {number} mass
    * @return {number} The polygon's moment of inertia
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.inertia")
  @js.native
  def inertia(vertices: js.Array[typings.phaser.MatterJS.Vector], mass: Double): Double = js.native
  
  /**
    * Returns true if the vertices form a convex shape (vertices must be in clockwise order).
    * @method isConvex
    * @param {vertices} vertices
    * @return {bool} `true` if the `vertices` are convex, `false` if not (or `null` if not computable).
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.isConvex")
  @js.native
  def isConvex(vertices: js.Array[typings.phaser.MatterJS.Vector]): Boolean = js.native
  
  /**
    * Returns the average (mean) of the set of vertices.
    * @method mean
    * @param {vertices} vertices
    * @return {vector} The average point
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.mean")
  @js.native
  def mean(vertices: js.Array[typings.phaser.MatterJS.Vector]): js.Array[typings.phaser.MatterJS.Vector] = js.native
  
  /**
    * Rotates the set of vertices in-place.
    * @method rotate
    * @param {vertices} vertices
    * @param {number} angle
    * @param {vector} point
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.rotate")
  @js.native
  def rotate(
    vertices: js.Array[typings.phaser.MatterJS.Vector],
    angle: Double,
    point: typings.phaser.MatterJS.Vector
  ): Unit = js.native
  
  /**
    * Scales the vertices from a point (default is centre) in-place.
    * @method scale
    * @param {vertices} vertices
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {vector} point
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.scale")
  @js.native
  def scale(
    vertices: js.Array[typings.phaser.MatterJS.Vector],
    scaleX: Double,
    scaleY: Double,
    point: typings.phaser.MatterJS.Vector
  ): Unit = js.native
  
  /**
    * Translates the set of vertices in-place.
    * @method translate
    * @param {vertices} vertices
    * @param {vector} vector
    * @param {number} scalar
    */
  /* static member */
  @JSGlobal("MatterJS.Vertices.translate")
  @js.native
  def translate(
    vertices: js.Array[typings.phaser.MatterJS.Vector],
    vector: typings.phaser.MatterJS.Vector,
    scalar: Double
  ): Unit = js.native
}
