package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Shape")
@js.native
class Shape () extends Item {
  /** 
    * The radius of the shape, as a number if it is a circle, or a size object
    * for ellipses and rounded rectangles.
    */
  var radius: Double | Size | Null = js.native
  /** 
    * The size of the shape.
    */
  var size: Size | Null = js.native
  /** 
    * The type of shape of the item as a string.
    */
  var `type`: String | Null = js.native
  /** 
    * Creates a new path item with same geometry as this shape item, and
    * inherits all settings from it, similar to {@link Item#clone}.
    * 
    * @see Path#toShape(insert)
    * 
    * @param insert - specifies whether the new path should be
    *     inserted into the scene graph. When set to `true`, it is inserted
    *     above the shape item
    * 
    * @return the newly created path item with the same geometry as
    *     this shape item
    */
  def toPath(): Path = js.native
  def toPath(insert: Boolean): Path = js.native
}

@JSGlobal("paper.Shape")
@js.native
object Shape extends js.Object {
  @js.native
  class Circle protected () extends Shape {
    /** 
      * Creates a circular shape item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     shape's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a circular shape item.
      * 
      * @param center - the center point of the circle
      * @param radius - the radius of the circle
      */
    def this(center: Point, radius: Double) = this()
  }
  
  @js.native
  class Ellipse protected () extends Shape {
    /** 
      * Creates an elliptical shape item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     shape's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates an elliptical shape item.
      * 
      * @param rectangle - the rectangle circumscribing the ellipse
      */
    def this(rectangle: typings.paper.paper.Rectangle) = this()
  }
  
  @js.native
  class Rectangle protected () extends Shape {
    /** 
      * Creates a rectangular shape item from the properties described by an
      * object literal.
      * 
      * @param object - an object containing properties describing the
      *     shape's attributes
      */
    def this(`object`: js.Object) = this()
    /** 
      * Creates a rectangular shape item, with optionally rounded corners.
      * 
      * @param rectangle - the rectangle object describing the
      * geometry of the rectangular shape to be created
      * @param radius - the size of the rounded corners
      */
    def this(rectangle: typings.paper.paper.Rectangle) = this()
    /** 
      * Creates a rectangular shape item from the passed points. These do not
      * necessarily need to be the top left and bottom right corners, the
      * constructor figures out how to fit a rectangle between them.
      * 
      * @param from - the first point defining the rectangle
      * @param to - the second point defining the rectangle
      */
    def this(from: Point, to: Point) = this()
    /** 
      * Creates a rectangular shape item from a point and a size object.
      * 
      * @param point - the rectangle's top-left corner.
      * @param size - the rectangle's size.
      */
    def this(point: Point, size: Size) = this()
    def this(rectangle: typings.paper.paper.Rectangle, radius: Size) = this()
  }
  
}

