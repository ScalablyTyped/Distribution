package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Path")
@js.native
/**
  * Creates a new path item and places it at the top of the active layer.
  * @param segments [optional] - An array of segments (or points to be converted to segments) that will be added to the path
  */
class Path ()
  extends typings.paper.paper.Path {
  def this(`object`: js.Any) = this()
  def this(pathData: String) = this()
  def this(segments: js.Array[js.Array[Double] | typings.paper.paper.Point | typings.paper.paper.Segment]) = this()
}

@JSImport("paper", "Path")
@js.native
object Path extends js.Object {
  @js.native
  class Arc protected ()
    extends typings.paper.paper.Path.Arc {
    /**
      * Creates an circular arc path item from the properties described by an object literal.
      * @param object - an object literal containing properties describing the path's attributes
      */
    def this(`object`: js.Any) = this()
    /**
      * Creates a circular arc path item
      * @param from - the starting point of the circular arc
      * @param through - the point the arc passes through
      * @param to - the end point of the arc
      */
    def this(from: typings.paper.paper.Point, through: typings.paper.paper.Point, to: typings.paper.paper.Point) = this()
  }
  
  @js.native
  class Circle protected ()
    extends typings.paper.paper.Path.Circle {
    /**
      * Creates a circular path item from the properties described by an object literal.
      * @param object - an object literal containing properties describing the path's attributes
      */
    def this(`object`: js.Any) = this()
    /**
      * Creates a circular path item.
      * @param center - the center point of the circle
      * @param radius - the radius of the circle
      */
    def this(center: typings.paper.paper.Point, radius: Double) = this()
  }
  
  @js.native
  class Ellipse protected ()
    extends typings.paper.paper.Path.Ellipse {
    /**
      * Creates an elliptical path item from the properties described by an object literal.
      * @param object - an object literal containing properties describing the path's attributes
      */
    def this(`object`: js.Any) = this()
    /**
      * Creates an elliptical path item.
      * @param rectangle - the rectangle circumscribing the ellipse
      */
    def this(rectangle: typings.paper.paper.Rectangle) = this()
  }
  
  @js.native
  class Line protected ()
    extends typings.paper.paper.Path.Line {
    /**
      * Creates a linear path item from the properties described by an object literal.
      * @param object - an object literal containing properties describing the path's attributes
      */
    def this(`object`: js.Any) = this()
    /**
      * Creates a linear path item from two points describing a line.
      * @param from - the line's starting point
      * @param to - the line's ending point
      */
    def this(from: typings.paper.paper.Point, to: typings.paper.paper.Point) = this()
  }
  
  @js.native
  class Rectangle protected ()
    extends typings.paper.paper.Path.Rectangle {
    /**
      * Creates a rectangular path item from the properties described by an object literal.
      * @param object - an object literal containing properties describing the path's attributes
      */
    def this(`object`: js.Any) = this()
    /**
      * Creates a rectangular path item, with optionally rounded corners.
      * @param rectangle - the rectangle object describing the geometry of the rectangular path to be created.
      * @param radius [optional] - the size of the rounded corners default: null
      */
    def this(rectangle: typings.paper.paper.Rectangle) = this()
    /**
      * Creates a rectangular path item from the passed points. These do not necessarily need to be the top left and bottom right corners, the constructor figures out how to fit a rectangle between them.
      * @param from - the first point defining the rectangle
      * @param to - the second point defining the rectangle
      */
    def this(from: typings.paper.paper.Point, to: typings.paper.paper.Point) = this()
    /**
      * Creates a rectangular path item from a point and a size object.
      * @param point - the rectangle's top-left corner.
      * @param size - the rectangle's size.
      */
    def this(point: typings.paper.paper.Point, size: typings.paper.paper.Size) = this()
    def this(rectangle: typings.paper.paper.Rectangle, radius: Double) = this()
  }
  
  @js.native
  class RegularPolygon protected ()
    extends typings.paper.paper.Path.RegularPolygon {
    /**
      * Creates a regular polygon shaped path item from the properties described by an object literal.
      * @param object - an object literal containing properties describing the path's attributes
      */
    def this(`object`: js.Any) = this()
    /**
      * Creates a regular polygon shaped path item.
      * @param center - the center point of the polygon
      * @param sides - the number of sides of the polygon
      * @param radius - the radius of the polygon
      */
    def this(center: typings.paper.paper.Point, sides: Double, radius: Double) = this()
  }
  
  @js.native
  class Star protected ()
    extends typings.paper.paper.Path.Star {
    /**
      * Creates a star shaped path item from the properties described by an object literal.
      * @param object - an object literal containing properties describing the path's attributes
      */
    def this(`object`: js.Any) = this()
    /**
      * Creates a star shaped path item. The largest of radius1 and radius2 will be the outer radius of the star. The smallest of radius1 and radius2 will be the inner radius.
      * @param center - the center point of the star
      * @param points - the number of points of the star
      * @param radius1
      * @param radius2
      */
    def this(center: typings.paper.paper.Point, points: Double, radius1: Double, radius2: Double) = this()
  }
  
}

