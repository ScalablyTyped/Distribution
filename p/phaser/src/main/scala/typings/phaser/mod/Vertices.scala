package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
@JSImport("matter", "Vertices")
@js.native
class Vertices ()
  extends StObject
     with typings.phaser.MatterJS.Vertices
object Vertices {
  
  @JSImport("matter", "Vertices")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the area of the set of vertices.
    * @method area
    * @param {vertices} vertices
    * @param {bool} signed
    * @return {number} The area
    */
  /* static member */
  @scala.inline
  def area(vertices: js.Array[typings.phaser.MatterJS.Vector], signed: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("area")(vertices.asInstanceOf[js.Any], signed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the centre (centroid) of the set of vertices.
    * @method centre
    * @param {vertices} vertices
    * @return {vector} The centre point
    */
  /* static member */
  @scala.inline
  def centre(vertices: js.Array[typings.phaser.MatterJS.Vector]): typings.phaser.MatterJS.Vector = ^.asInstanceOf[js.Dynamic].applyDynamic("centre")(vertices.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.MatterJS.Vector]
  
  @scala.inline
  def chamfer(
    vertices: js.Array[typings.phaser.MatterJS.Vector],
    radius: js.Array[Double],
    quality: Double,
    qualityMin: Double,
    qualityMax: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chamfer")(vertices.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], quality.asInstanceOf[js.Any], qualityMin.asInstanceOf[js.Any], qualityMax.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  @scala.inline
  def chamfer(
    vertices: js.Array[typings.phaser.MatterJS.Vector],
    radius: Double,
    quality: Double,
    qualityMin: Double,
    qualityMax: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chamfer")(vertices.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], quality.asInstanceOf[js.Any], qualityMin.asInstanceOf[js.Any], qualityMax.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sorts the input vertices into clockwise order in place.
    * @method clockwiseSort
    * @param {vertices} vertices
    * @return {vertices} vertices
    */
  /* static member */
  @scala.inline
  def clockwiseSort(vertices: js.Array[typings.phaser.MatterJS.Vector]): js.Array[typings.phaser.MatterJS.Vector] = ^.asInstanceOf[js.Dynamic].applyDynamic("clockwiseSort")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.phaser.MatterJS.Vector]]
  
  /**
    * Returns `true` if the `point` is inside the set of `vertices`.
    * @method contains
    * @param {vertices} vertices
    * @param {vector} point
    * @return {boolean} True if the vertices contains point, otherwise false
    */
  /* static member */
  @scala.inline
  def contains(vertices: js.Array[typings.phaser.MatterJS.Vector], point: typings.phaser.MatterJS.Vector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(vertices.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  @scala.inline
  def create(points: js.Array[typings.phaser.MatterJS.Vector], body: BodyType): js.Array[typings.phaser.MatterJS.Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(points.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.MatterJS.Vector]]
  
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
  @scala.inline
  def fromPath(path: String, body: BodyType): js.Array[typings.phaser.MatterJS.Vector] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(path.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.phaser.MatterJS.Vector]]
  
  /**
    * Returns the convex hull of the input vertices as a new array of points.
    * @method hull
    * @param {vertices} vertices
    * @return [vertex] vertices
    */
  /* static member */
  @scala.inline
  def hull(vertices: js.Array[typings.phaser.MatterJS.Vector]): js.Array[typings.phaser.MatterJS.Vector] = ^.asInstanceOf[js.Dynamic].applyDynamic("hull")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.phaser.MatterJS.Vector]]
  
  /**
    * Returns the moment of inertia (second moment of area) of the set of vertices given the total mass.
    * @method inertia
    * @param {vertices} vertices
    * @param {number} mass
    * @return {number} The polygon's moment of inertia
    */
  /* static member */
  @scala.inline
  def inertia(vertices: js.Array[typings.phaser.MatterJS.Vector], mass: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inertia")(vertices.asInstanceOf[js.Any], mass.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns true if the vertices form a convex shape (vertices must be in clockwise order).
    * @method isConvex
    * @param {vertices} vertices
    * @return {bool} `true` if the `vertices` are convex, `false` if not (or `null` if not computable).
    */
  /* static member */
  @scala.inline
  def isConvex(vertices: js.Array[typings.phaser.MatterJS.Vector]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConvex")(vertices.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns the average (mean) of the set of vertices.
    * @method mean
    * @param {vertices} vertices
    * @return {vector} The average point
    */
  /* static member */
  @scala.inline
  def mean(vertices: js.Array[typings.phaser.MatterJS.Vector]): js.Array[typings.phaser.MatterJS.Vector] = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(vertices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.phaser.MatterJS.Vector]]
  
  /**
    * Rotates the set of vertices in-place.
    * @method rotate
    * @param {vertices} vertices
    * @param {number} angle
    * @param {vector} point
    */
  /* static member */
  @scala.inline
  def rotate(
    vertices: js.Array[typings.phaser.MatterJS.Vector],
    angle: Double,
    point: typings.phaser.MatterJS.Vector
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(vertices.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Scales the vertices from a point (default is centre) in-place.
    * @method scale
    * @param {vertices} vertices
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {vector} point
    */
  /* static member */
  @scala.inline
  def scale(
    vertices: js.Array[typings.phaser.MatterJS.Vector],
    scaleX: Double,
    scaleY: Double,
    point: typings.phaser.MatterJS.Vector
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(vertices.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Translates the set of vertices in-place.
    * @method translate
    * @param {vertices} vertices
    * @param {vector} vector
    * @param {number} scalar
    */
  /* static member */
  @scala.inline
  def translate(
    vertices: js.Array[typings.phaser.MatterJS.Vector],
    vector: typings.phaser.MatterJS.Vector,
    scalar: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(vertices.asInstanceOf[js.Any], vector.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
