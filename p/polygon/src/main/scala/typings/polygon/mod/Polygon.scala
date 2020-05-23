package typings.polygon.mod

import typings.polygon.anon.H
import typings.polygon.anon.Height
import typings.polygon.anon.Position
import typings.polygon.anon.X1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new polygon:
  *
  * ```javascript
  * var p = new Polygon([
  * Vec2(0, 0),
  * Vec2(10, 0),
  * Vec2(0, 10)
  * ]);
  *
  * ```
  *
  * You can pass an array of `Vec2`s, arrays `[x, y]`, or objects `{ x: 10, y: 20 }`
  *
  * **Stuff to Note**: most of the Vec2's methods take a `returnNew` as the last parameter.
  * If passed a truthy value, a new vector will be returned to you.
  * Otherwise the operation will be applied to `this` and `this` will be returned.
  */
@js.native
trait Polygon extends js.Object {
  /**
    * Returns the number of points in this polygon
    */
  val length: Double = js.native
  val points: js.Array[typings.vec2.mod.^] = js.native
  /**
    * Returns an object `{x:_, y:_, w:_, h:_}` representing the axis-aligned bounding box of this polygyon
    */
  def aabb(): H = js.native
  /**
    * Computes the area of the polygon
    */
  def area(): Double = js.native
  /**
    * Returns a `Vec2` at the center of the AABB
    */
  def center(): typings.vec2.mod.^ = js.native
  /**
    * Removes contiguous points that are the same
    */
  def clean(): Polygon = js.native
  def clean(returnNew: Boolean): Polygon = js.native
  /**
    * Finds the closest point in this polygon to `vec2`
    */
  def closestPointTo(vec2: typings.vec2.mod.^): typings.vec2.mod.^ = js.native
  /**
    * Works with an array of vec2's,
    * an object containing a `.position` and `.radius`,
    * an object populated with x1,y1,x2,y2,
    * an object populated with x,y,w,h,
    * and an object populated with x,y,width,height.
    * See the tests for more info
    */
  def contains(thing: js.Array[typings.vec2.mod.^]): Boolean = js.native
  def contains(thing: H): Boolean = js.native
  def contains(thing: Height): Boolean = js.native
  def contains(thing: Position): Boolean = js.native
  def contains(thing: X1): Boolean = js.native
  /**
    * Returns true if `vec2` is inside the polygon
    */
  def containsPoint(vec2: typings.vec2.mod.^): Boolean = js.native
  /**
    * Returns true if `poly` is completely contained in this polygon
    */
  def containsPolygon(poly: Polygon): Boolean = js.native
  /**
    * Returns a new polygon representing the boolean cut of `polygon` from `this`
    */
  def cut(polygon: Polygon): Polygon = js.native
  /**
    * Ensure all of the points are unique
    */
  def dedupe(): Polygon = js.native
  def dedupe(returnNew: Boolean): Polygon = js.native
  /**
    * Something like Array.forEach on points
    */
  def each(
    fn: js.Function4[
      /* prev */ typings.vec2.mod.^, 
      /* current */ typings.vec2.mod.^, 
      /* next */ typings.vec2.mod.^, 
      /* idx */ Double, 
      _
    ]
  ): Polygon = js.native
  /**
    * Return true if this polygon has the same components and the incoming `poly`
    */
  def equal(poly: Polygon): Boolean = js.native
  /**
    * Insert `vec2` at the specified index
    */
  def insert(vec2: typings.vec2.mod.^, index: Double): Unit = js.native
  /**
    * Return an array `[startpoint, endpoint]` representing the line at the specified `index`
    */
  def line(index: Double): js.Tuple2[typings.vec2.mod.^, typings.vec2.mod.^] = js.native
  /**
    * Iterate over the lines in this polygon
    */
  def lines(
    fn: js.Function3[/* start */ typings.vec2.mod.^, /* end */ typings.vec2.mod.^, /* index */ Double, _]
  ): Polygon = js.native
  /**
    * Performs an offset/buffering operation on this polygon and returns a new one
    */
  def offset(amount: Double): Polygon = js.native
  /**
    * Returns the point at index `idx`. note: this will wrap in both directions
    */
  def point(idx: Double): typings.vec2.mod.^ = js.native
  /**
    * Remove self intersections from this polygon.  returns an array of polygons
    */
  def pruneSelfIntersections(): js.Array[Polygon] = js.native
  def remove(vecOrIndex: Double): Polygon = js.native
  /**
    * Remove the specified `vec2` or numeric index from this polygon
    */
  def remove(vecOrIndex: typings.vec2.mod.^): Polygon = js.native
  /**
    * Rewinds the polygon in the specified direction (true === clockwise)
    */
  def rewind(cw: Boolean): Polygon = js.native
  /**
    * Rotate by origin `vec2` (default `this.center()`) by radians `rads` and return a clone if `returnNew` is specified
    */
  def rotate(rads: Double, vec2: typings.vec2.mod.^): Polygon = js.native
  def rotate(rads: Double, vec2: typings.vec2.mod.^, returnNew: Boolean): Polygon = js.native
  /**
    * Scales this polygon around `origin` (default is `this.center()`) and will return a new polygon if requested with `returnNew`
    */
  def scale(amount: Double, origin: typings.vec2.mod.^): Polygon = js.native
  def scale(amount: Double, origin: typings.vec2.mod.^, returnNew: Boolean): Polygon = js.native
  /**
    * Find self-intersections and return them as a new polygon
    */
  def selfIntersections(): Polygon = js.native
  /**
    * Convert this polygon into an array of arrays (`[[x, y]]`)
    */
  def toArray(): js.Array[js.Array[Double]] = js.native
  /**
    * Translate by `vec2` and return a clone if `returnNew` is specified
    */
  def translate(vec2: typings.vec2.mod.^): Polygon = js.native
  def translate(vec2: typings.vec2.mod.^, returnNew: Boolean): Polygon = js.native
  /**
    * Returns a new polygon representing the boolean union of `this` and the incoming `polygon`
    */
  def union(polygon: Polygon): Polygon = js.native
  /**
    * Returns the direction in which a polygon is wound (true === clockwise)
    */
  def winding(): Boolean = js.native
}

