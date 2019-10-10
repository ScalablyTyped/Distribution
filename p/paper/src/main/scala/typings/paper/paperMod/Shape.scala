package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Shape")
@js.native
class Shape ()
  extends typings.paper.paper.Shape

@JSImport("paper", "Shape")
@js.native
object Shape extends js.Object {
  @js.native
  class Circle protected ()
    extends typings.paper.paper.Shape.Circle {
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
    def this(center: typings.paper.paper.Point, radius: Double) = this()
  }
  
  @js.native
  class Ellipse protected ()
    extends typings.paper.paper.Shape.Ellipse {
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
  class Rectangle protected ()
    extends typings.paper.paper.Shape.Rectangle {
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
    def this(from: typings.paper.paper.Point, to: typings.paper.paper.Point) = this()
    /** 
      * Creates a rectangular shape item from a point and a size object.
      * 
      * @param point - the rectangle's top-left corner.
      * @param size - the rectangle's size.
      */
    def this(point: typings.paper.paper.Point, size: typings.paper.paper.Size) = this()
    def this(rectangle: typings.paper.paper.Rectangle, radius: typings.paper.paper.Size) = this()
  }
  
}

