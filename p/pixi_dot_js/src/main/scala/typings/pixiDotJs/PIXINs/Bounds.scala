package typings.pixiDotJs.PIXINs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * "Builder" pattern for bounds rectangles
  * Axis-Aligned Bounding Box
  * It is not a shape! Its mutable thing, no "EMPTY" or that kind of problems
  */
@JSGlobal("PIXI.Bounds")
@js.native
class Bounds () extends js.Object {
  var maxX: Double = js.native
  var maxY: Double = js.native
  var minX: Double = js.native
  var minY: Double = js.native
  var rect: Rectangle = js.native
  /**
    * Adds other Bounds
    *
    * @param bounds - TODO
    */
  def addBounds(bounds: Bounds): Unit = js.native
  /**
    * Adds other Bounds, masked with Rectangle
    *
    * @param bounds - TODO
    * @param area - TODO
    */
  def addBoundsArea(bounds: Bounds, area: Rectangle): Unit = js.native
  /**
    * Adds other Bounds, masked with Bounds
    *
    * @param bounds - TODO
    * @param mask - TODO
    */
  def addBoundsMask(bounds: Bounds, mask: Bounds): Unit = js.native
  /**
    * Adds sprite frame, transformed.
    *
    * @param transform - TODO
    * @param x0 - TODO
    * @param y0 - TODO
    * @param x1 - TODO
    * @param y1 - TODO
    */
  def addFrame(transform: Transform, x0: Double, y0: Double, x1: Double, y1: Double): Unit = js.native
  /**
    * This function should be inlined when its possible.
    *
    * @param point - The point to add.
    */
  def addPoint(point: Point): Unit = js.native
  /**
    * Adds a quad, not transformed
    *
    * @param vertices - The verts to add.
    */
  def addQuad(vertices: ArrayLike[Double]): js.UndefOr[Bounds] = js.native
  /**
    * Add an array of vertices
    *
    * @param transform - TODO
    * @param vertices - TODO
    * @param beginOffset - TODO
    * @param endOffset - TODO
    */
  def addVertices(transform: Transform, vertices: ArrayLike[Double], beginOffset: Double, endOffset: Double): Unit = js.native
  /**
    * Clears the bounds and resets.
    *
    */
  def clear(): Unit = js.native
  /**
    * Can return Rectangle.EMPTY constant, either construct new rectangle, either use your rectangle
    * It is not guaranteed that it will return tempRect
    *
    * @param rect - temporary object will be used if AABB is not empty
    * @returns A rectangle of the bounds
    */
  def getRectangle(): Rectangle = js.native
  def getRectangle(rect: Rectangle): Rectangle = js.native
  /**
    * Checks if bounds are empty.
    *
    * @return True if empty.
    */
  def isEmpty(): Boolean = js.native
}

