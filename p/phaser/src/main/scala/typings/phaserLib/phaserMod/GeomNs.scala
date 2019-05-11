package typings
package phaserLib.phaserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Geom")
@js.native
object GeomNs extends js.Object {
  /**
    * A Circle object.
    * 
    * This is a geometry object, containing numerical values and related methods to inspect and modify them.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render a Circle you should look at the capabilities of the Graphics class.
    */
  @js.native
  /**
    * 
    * @param x The x position of the center of the circle. Default 0.
    * @param y The y position of the center of the circle. Default 0.
    * @param radius The radius of the circle. Default 0.
    */
  class Circle ()
    extends phaserLib.PhaserNs.GeomNs.Circle {
    def this(x: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double, radius: scala.Double) = this()
  }
  
  /**
    * An Ellipse object.
    * 
    * This is a geometry object, containing numerical values and related methods to inspect and modify them.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render an Ellipse you should look at the capabilities of the Graphics class.
    */
  @js.native
  /**
    * 
    * @param x The x position of the center of the ellipse. Default 0.
    * @param y The y position of the center of the ellipse. Default 0.
    * @param width The width of the ellipse. Default 0.
    * @param height The height of the ellipse. Default 0.
    */
  class Ellipse ()
    extends phaserLib.PhaserNs.GeomNs.Ellipse {
    def this(x: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  }
  
  /**
    * Defines a Line segment, a part of a line between two endpoints.
    */
  @js.native
  /**
    * 
    * @param x1 The x coordinate of the lines starting point. Default 0.
    * @param y1 The y coordinate of the lines starting point. Default 0.
    * @param x2 The x coordinate of the lines ending point. Default 0.
    * @param y2 The y coordinate of the lines ending point. Default 0.
    */
  class Line ()
    extends phaserLib.PhaserNs.GeomNs.Line {
    def this(x1: scala.Double) = this()
    def this(x1: scala.Double, y1: scala.Double) = this()
    def this(x1: scala.Double, y1: scala.Double, x2: scala.Double) = this()
    def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double) = this()
  }
  
  /**
    * Defines a Point in 2D space, with an x and y component.
    */
  @js.native
  /**
    * 
    * @param x The x coordinate of this Point. Default 0.
    * @param y The y coordinate of this Point. Default x.
    */
  class Point ()
    extends phaserLib.PhaserNs.GeomNs.Point {
    def this(x: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double) = this()
  }
  
  /**
    * A Polygon object
    * 
    * The polygon is a closed shape consists of a series of connected straight lines defined by list of ordered points.
    * Several formats are supported to define the list of points, check the setTo method for details. 
    * This is a geometry object allowing you to define and inspect the shape.
    * It is not a Game Object, in that you cannot add it to the display list, and it has no texture.
    * To render a Polygon you should look at the capabilities of the Graphics class.
    */
  @js.native
  /**
    * 
    * @param points List of points defining the perimeter of this Polygon. Several formats are supported: 
    * - A string containing paired x y values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
    * - An array of Point objects: `[new Phaser.Point(x1, y1), ...]`
    * - An array of objects with public x y properties: `[obj1, obj2, ...]`
    * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
    * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
    */
  class Polygon ()
    extends phaserLib.PhaserNs.GeomNs.Polygon {
    def this(points: js.Array[phaserLib.PhaserNs.GeomNs.Point]) = this()
  }
  
  /**
    * Encapsulates a 2D rectangle defined by its corner point in the top-left and its extends in x (width) and y (height)
    */
  @js.native
  /**
    * 
    * @param x The X coordinate of the top left corner of the Rectangle. Default 0.
    * @param y The Y coordinate of the top left corner of the Rectangle. Default 0.
    * @param width The width of the Rectangle. Default 0.
    * @param height The height of the Rectangle. Default 0.
    */
  class Rectangle ()
    extends phaserLib.PhaserNs.GeomNs.Rectangle {
    def this(x: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
    def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  }
  
  /**
    * A triangle is a plane created by connecting three points.
    * The first two arguments specify the first point, the middle two arguments
    * specify the second point, and the last two arguments specify the third point.
    */
  @js.native
  class Triangle protected ()
    extends phaserLib.PhaserNs.GeomNs.Triangle {
    /**
      * 
      * @param x1 `x` coordinate of the first point. Default 0.
      * @param y1 `y` coordinate of the first point. Default 0.
      * @param x2 `x` coordinate of the second point. Default 0.
      * @param y2 `y` coordinate of the second point. Default 0.
      * @param x3 `x` coordinate of the third point. Default 0.
      * @param y3 `y` coordinate of the third point. Default 0.
      */
    def this(x1: js.UndefOr[scala.Double], y1: js.UndefOr[scala.Double], x2: js.UndefOr[scala.Double], y2: js.UndefOr[scala.Double], x3: js.UndefOr[scala.Double], y3: js.UndefOr[scala.Double]) = this()
  }
  
  /* static members */
  @js.native
  object Circle extends js.Object {
    /**
      * Calculates the area of the circle.
      * @param circle The Circle to get the area of.
      */
    def Area(circle: phaserLib.PhaserNs.GeomNs.Circle): scala.Double = js.native
    /**
      * Returns the circumference of the given Circle.
      * @param circle The Circle to get the circumference of.
      */
    def Circumference(circle: phaserLib.PhaserNs.GeomNs.Circle): scala.Double = js.native
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle based on the given angle.
      * @param circle The Circle to get the circumference point on.
      * @param angle The angle from the center of the Circle to the circumference to return the point from. Given in radians.
      * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
      */
    def CircumferencePoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle, angle: scala.Double): O = js.native
    def CircumferencePoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle, angle: scala.Double, out: O): O = js.native
    def Clone(source: js.Object): phaserLib.PhaserNs.GeomNs.Circle = js.native
    /**
      * Creates a new Circle instance based on the values contained in the given source.
      * @param source The Circle to be cloned. Can be an instance of a Circle or a circle-like object, with x, y and radius properties.
      */
    def Clone(source: phaserLib.PhaserNs.GeomNs.Circle): phaserLib.PhaserNs.GeomNs.Circle = js.native
    /**
      * Check to see if the Circle contains the given x / y coordinates.
      * @param circle The Circle to check.
      * @param x The x coordinate to check within the circle.
      * @param y The y coordinate to check within the circle.
      */
    def Contains(circle: phaserLib.PhaserNs.GeomNs.Circle, x: scala.Double, y: scala.Double): scala.Boolean = js.native
    def ContainsPoint(circle: phaserLib.PhaserNs.GeomNs.Circle, point: js.Object): scala.Boolean = js.native
    /**
      * Check to see if the Circle contains the given Point object.
      * @param circle The Circle to check.
      * @param point The Point object to check if it's within the Circle or not.
      */
    def ContainsPoint(circle: phaserLib.PhaserNs.GeomNs.Circle, point: phaserLib.PhaserNs.GeomNs.Point): scala.Boolean = js.native
    def ContainsRect(circle: phaserLib.PhaserNs.GeomNs.Circle, rect: js.Object): scala.Boolean = js.native
    /**
      * Check to see if the Circle contains all four points of the given Rectangle object.
      * @param circle The Circle to check.
      * @param rect The Rectangle object to check if it's within the Circle or not.
      */
    def ContainsRect(circle: phaserLib.PhaserNs.GeomNs.Circle, rect: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Boolean = js.native
    /**
      * Copies the `x`, `y` and `radius` properties from the `source` Circle
      * into the given `dest` Circle, then returns the `dest` Circle.
      * @param source The source Circle to copy the values from.
      * @param dest The destination Circle to copy the values to.
      */
    def CopyFrom[O /* <: phaserLib.PhaserNs.GeomNs.Circle */](source: phaserLib.PhaserNs.GeomNs.Circle, dest: O): O = js.native
    /**
      * Compares the `x`, `y` and `radius` properties of the two given Circles.
      * Returns `true` if they all match, otherwise returns `false`.
      * @param circle The first Circle to compare.
      * @param toCompare The second Circle to compare.
      */
    def Equals(circle: phaserLib.PhaserNs.GeomNs.Circle, toCompare: phaserLib.PhaserNs.GeomNs.Circle): scala.Boolean = js.native
    /**
      * Returns the bounds of the Circle object.
      * @param circle The Circle to get the bounds from.
      * @param out A Rectangle, or rectangle-like object, to store the circle bounds in. If not given a new Rectangle will be created.
      */
    def GetBounds[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](circle: phaserLib.PhaserNs.GeomNs.Circle): O = js.native
    def GetBounds[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](circle: phaserLib.PhaserNs.GeomNs.Circle, out: O): O = js.native
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param circle The Circle to get the circumference point on.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the circle.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle, position: scala.Double): O = js.native
    def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle, position: scala.Double, out: O): O = js.native
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Circle,
      * based on the given quantity or stepRate values.
      * @param circle The Circle to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the circle and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def GetPoints(circle: phaserLib.PhaserNs.GeomNs.Circle, quantity: phaserLib.integer): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
    def GetPoints(circle: phaserLib.PhaserNs.GeomNs.Circle, quantity: phaserLib.integer, stepRate: scala.Double): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
    def GetPoints(
      circle: phaserLib.PhaserNs.GeomNs.Circle,
      quantity: phaserLib.integer,
      stepRate: scala.Double,
      output: js.Array[_]
    ): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
    /**
      * Offsets the Circle by the values given.
      * @param circle The Circle to be offset (translated.)
      * @param x The amount to horizontally offset the Circle by.
      * @param y The amount to vertically offset the Circle by.
      */
    def Offset[O /* <: phaserLib.PhaserNs.GeomNs.Circle */](circle: O, x: scala.Double, y: scala.Double): O = js.native
    def OffsetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Circle */](circle: O, point: js.Object): O = js.native
    /**
      * Offsets the Circle by the values given in the `x` and `y` properties of the Point object.
      * @param circle The Circle to be offset (translated.)
      * @param point The Point object containing the values to offset the Circle by.
      */
    def OffsetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Circle */](circle: O, point: phaserLib.PhaserNs.GeomNs.Point): O = js.native
    /**
      * Returns a uniformly distributed random point from anywhere within the given Circle.
      * @param circle The Circle to get a random point from.
      * @param out A Point or point-like object to set the random `x` and `y` values in.
      */
    def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle): O = js.native
    def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](circle: phaserLib.PhaserNs.GeomNs.Circle, out: O): O = js.native
  }
  
  /* static members */
  @js.native
  object Ellipse extends js.Object {
    /**
      * Calculates the area of the Ellipse.
      * @param ellipse The Ellipse to get the area of.
      */
    def Area(ellipse: phaserLib.PhaserNs.GeomNs.Ellipse): scala.Double = js.native
    /**
      * Returns the circumference of the given Ellipse.
      * @param ellipse The Ellipse to get the circumference of.
      */
    def Circumference(ellipse: phaserLib.PhaserNs.GeomNs.Ellipse): scala.Double = js.native
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse based on the given angle.
      * @param ellipse The Ellipse to get the circumference point on.
      * @param angle The angle from the center of the Ellipse to the circumference to return the point from. Given in radians.
      * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
      */
    def CircumferencePoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, angle: scala.Double): O = js.native
    def CircumferencePoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, angle: scala.Double, out: O): O = js.native
    /**
      * Creates a new Ellipse instance based on the values contained in the given source.
      * @param source The Ellipse to be cloned. Can be an instance of an Ellipse or a ellipse-like object, with x, y, width and height properties.
      */
    def Clone(source: phaserLib.PhaserNs.GeomNs.Ellipse): phaserLib.PhaserNs.GeomNs.Ellipse = js.native
    /**
      * Check to see if the Ellipse contains the given x / y coordinates.
      * @param ellipse The Ellipse to check.
      * @param x The x coordinate to check within the ellipse.
      * @param y The y coordinate to check within the ellipse.
      */
    def Contains(ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, x: scala.Double, y: scala.Double): scala.Boolean = js.native
    def ContainsPoint(ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, point: js.Object): scala.Boolean = js.native
    /**
      * Check to see if the Ellipse contains the given Point object.
      * @param ellipse The Ellipse to check.
      * @param point The Point object to check if it's within the Circle or not.
      */
    def ContainsPoint(ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, point: phaserLib.PhaserNs.GeomNs.Point): scala.Boolean = js.native
    def ContainsRect(ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, rect: js.Object): scala.Boolean = js.native
    /**
      * Check to see if the Ellipse contains all four points of the given Rectangle object.
      * @param ellipse The Ellipse to check.
      * @param rect The Rectangle object to check if it's within the Ellipse or not.
      */
    def ContainsRect(ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, rect: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Boolean = js.native
    /**
      * Copies the `x`, `y`, `width` and `height` properties from the `source` Ellipse
      * into the given `dest` Ellipse, then returns the `dest` Ellipse.
      * @param source The source Ellipse to copy the values from.
      * @param dest The destination Ellipse to copy the values to.
      */
    def CopyFrom[O /* <: phaserLib.PhaserNs.GeomNs.Ellipse */](source: phaserLib.PhaserNs.GeomNs.Ellipse, dest: O): O = js.native
    /**
      * Compares the `x`, `y`, `width` and `height` properties of the two given Ellipses.
      * Returns `true` if they all match, otherwise returns `false`.
      * @param ellipse The first Ellipse to compare.
      * @param toCompare The second Ellipse to compare.
      */
    def Equals(ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, toCompare: phaserLib.PhaserNs.GeomNs.Ellipse): scala.Boolean = js.native
    /**
      * Returns the bounds of the Ellipse object.
      * @param ellipse The Ellipse to get the bounds from.
      * @param out A Rectangle, or rectangle-like object, to store the ellipse bounds in. If not given a new Rectangle will be created.
      */
    def GetBounds[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](ellipse: phaserLib.PhaserNs.GeomNs.Ellipse): O = js.native
    def GetBounds[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, out: O): O = js.native
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param ellipse The Ellipse to get the circumference point on.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the ellipse.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, position: scala.Double): O = js.native
    def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, position: scala.Double, out: O): O = js.native
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Ellipse,
      * based on the given quantity or stepRate values.
      * @param ellipse The Ellipse to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the ellipse and dividing it by the stepRate.
      * @param out An array to insert the points in to. If not provided a new array will be created.
      */
    def GetPoints[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Point] */](ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, quantity: phaserLib.integer): O = js.native
    def GetPoints[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Point] */](ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, quantity: phaserLib.integer, stepRate: scala.Double): O = js.native
    def GetPoints[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Point] */](
      ellipse: phaserLib.PhaserNs.GeomNs.Ellipse,
      quantity: phaserLib.integer,
      stepRate: scala.Double,
      out: O
    ): O = js.native
    /**
      * Offsets the Ellipse by the values given.
      * @param ellipse The Ellipse to be offset (translated.)
      * @param x The amount to horizontally offset the Ellipse by.
      * @param y The amount to vertically offset the Ellipse by.
      */
    def Offset[O /* <: phaserLib.PhaserNs.GeomNs.Ellipse */](ellipse: O, x: scala.Double, y: scala.Double): O = js.native
    def OffsetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Ellipse */](ellipse: O, point: js.Object): O = js.native
    /**
      * Offsets the Ellipse by the values given in the `x` and `y` properties of the Point object.
      * @param ellipse The Ellipse to be offset (translated.)
      * @param point The Point object containing the values to offset the Ellipse by.
      */
    def OffsetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Ellipse */](ellipse: O, point: phaserLib.PhaserNs.GeomNs.Point): O = js.native
    /**
      * Returns a uniformly distributed random point from anywhere within the given Ellipse.
      * @param ellipse The Ellipse to get a random point from.
      * @param out A Point or point-like object to set the random `x` and `y` values in.
      */
    def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](ellipse: phaserLib.PhaserNs.GeomNs.Ellipse): O = js.native
    def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](ellipse: phaserLib.PhaserNs.GeomNs.Ellipse, out: O): O = js.native
  }
  
  @JSName("Intersects")
  @js.native
  object IntersectsNs extends js.Object {
    /**
      * Checks if two Circles intersect.
      * @param circleA The first Circle to check for intersection.
      * @param circleB The second Circle to check for intersection.
      */
    def CircleToCircle(circleA: phaserLib.PhaserNs.GeomNs.Circle, circleB: phaserLib.PhaserNs.GeomNs.Circle): scala.Boolean = js.native
    /**
      * Checks for intersection between a circle and a rectangle.
      * @param circle The circle to be checked.
      * @param rect The rectangle to be checked.
      */
    def CircleToRectangle(circle: phaserLib.PhaserNs.GeomNs.Circle, rect: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Boolean = js.native
    /**
      * Checks if two Circles intersect and returns the intersection points as a Point object array.
      * @param circleA The first Circle to check for intersection.
      * @param circleB The second Circle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetCircleToCircle(circleA: phaserLib.PhaserNs.GeomNs.Circle, circleB: phaserLib.PhaserNs.GeomNs.Circle): js.Array[_] = js.native
    def GetCircleToCircle(
      circleA: phaserLib.PhaserNs.GeomNs.Circle,
      circleB: phaserLib.PhaserNs.GeomNs.Circle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    /**
      * Checks for intersection between a circle and a rectangle,
      * and returns the intersection points as a Point object array.
      * @param circle The circle to be checked.
      * @param rect The rectangle to be checked.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetCircleToRectangle(circle: phaserLib.PhaserNs.GeomNs.Circle, rect: phaserLib.PhaserNs.GeomNs.Rectangle): js.Array[_] = js.native
    def GetCircleToRectangle(
      circle: phaserLib.PhaserNs.GeomNs.Circle,
      rect: phaserLib.PhaserNs.GeomNs.Rectangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    /**
      * Checks for intersection between the line segment and circle,
      * and returns the intersection points as a Point object array.
      * @param line The line segment to check.
      * @param circle The circle to check against the line.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetLineToCircle(line: phaserLib.PhaserNs.GeomNs.Line, circle: phaserLib.PhaserNs.GeomNs.Circle): js.Array[_] = js.native
    def GetLineToCircle(line: phaserLib.PhaserNs.GeomNs.Line, circle: phaserLib.PhaserNs.GeomNs.Circle, out: js.Array[_]): js.Array[_] = js.native
    def GetLineToRectangle(line: phaserLib.PhaserNs.GeomNs.Line, rect: js.Object): js.Array[_] = js.native
    def GetLineToRectangle(line: phaserLib.PhaserNs.GeomNs.Line, rect: js.Object, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks for intersection between the Line and a Rectangle shape,
      * and returns the intersection points as a Point object array.
      * @param line The Line to check for intersection.
      * @param rect The Rectangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetLineToRectangle(line: phaserLib.PhaserNs.GeomNs.Line, rect: phaserLib.PhaserNs.GeomNs.Rectangle): js.Array[_] = js.native
    def GetLineToRectangle(line: phaserLib.PhaserNs.GeomNs.Line, rect: phaserLib.PhaserNs.GeomNs.Rectangle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks if two Rectangle shapes intersect and returns the area of this intersection as Rectangle object.
      * 
      * If optional `output` parameter is omitted, new Rectangle object is created and returned. If there is intersection, it will contain intersection area. If there is no intersection, it wil be empty Rectangle (all values set to zero).
      * 
      * If Rectangle object is passed as `output` and there is intersection, then intersection area data will be loaded into it and it will be returned. If there is no intersetion, it will be returned without any change.
      * @param rectA The first Rectangle object.
      * @param rectB The second Rectangle object.
      * @param output Optional Rectangle object. If given, the intersection data will be loaded into it (in case of no intersection, it will be left unchanged). Otherwise, new Rectangle object will be created and returned with either intersection data or empty (all values set to zero), if there is no intersection.
      */
    def GetRectangleIntersection[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rectA: phaserLib.PhaserNs.GeomNs.Rectangle, rectB: phaserLib.PhaserNs.GeomNs.Rectangle): O = js.native
    def GetRectangleIntersection[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rectA: phaserLib.PhaserNs.GeomNs.Rectangle, rectB: phaserLib.PhaserNs.GeomNs.Rectangle, output: O): O = js.native
    /**
      * Checks if two Rectangles intersect and returns the intersection points as a Point object array.
      * 
      * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds. As such, the two Rectangles are considered "solid". A Rectangle with no width or no height will never intersect another Rectangle.
      * @param rectA The first Rectangle to check for intersection.
      * @param rectB The second Rectangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetRectangleToRectangle(rectA: phaserLib.PhaserNs.GeomNs.Rectangle, rectB: phaserLib.PhaserNs.GeomNs.Rectangle): js.Array[_] = js.native
    def GetRectangleToRectangle(
      rectA: phaserLib.PhaserNs.GeomNs.Rectangle,
      rectB: phaserLib.PhaserNs.GeomNs.Rectangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    /**
      * Checks for intersection between Rectangle shape and Triangle shape,
      * and returns the intersection points as a Point object array.
      * @param rect Rectangle object to test.
      * @param triangle Triangle object to test.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetRectangleToTriangle(rect: phaserLib.PhaserNs.GeomNs.Rectangle, triangle: phaserLib.PhaserNs.GeomNs.Triangle): js.Array[_] = js.native
    def GetRectangleToTriangle(
      rect: phaserLib.PhaserNs.GeomNs.Rectangle,
      triangle: phaserLib.PhaserNs.GeomNs.Triangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    /**
      * Checks if a Triangle and a Circle intersect, and returns the intersection points as a Point object array.
      * 
      * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
      * @param triangle The Triangle to check for intersection.
      * @param circle The Circle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetTriangleToCircle(triangle: phaserLib.PhaserNs.GeomNs.Triangle, circle: phaserLib.PhaserNs.GeomNs.Circle): js.Array[_] = js.native
    def GetTriangleToCircle(
      triangle: phaserLib.PhaserNs.GeomNs.Triangle,
      circle: phaserLib.PhaserNs.GeomNs.Circle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    /**
      * Checks if a Triangle and a Line intersect, and returns the intersection points as a Point object array.
      * 
      * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
      * @param triangle The Triangle to check with.
      * @param line The Line to check with.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetTriangleToLine(triangle: phaserLib.PhaserNs.GeomNs.Triangle, line: phaserLib.PhaserNs.GeomNs.Line): js.Array[_] = js.native
    def GetTriangleToLine(
      triangle: phaserLib.PhaserNs.GeomNs.Triangle,
      line: phaserLib.PhaserNs.GeomNs.Line,
      out: js.Array[_]
    ): js.Array[_] = js.native
    /**
      * Checks if two Triangles intersect, and returns the intersection points as a Point object array.
      * 
      * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
      * @param triangleA The first Triangle to check for intersection.
      * @param triangleB The second Triangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetTriangleToTriangle(triangleA: phaserLib.PhaserNs.GeomNs.Triangle, triangleB: phaserLib.PhaserNs.GeomNs.Triangle): js.Array[_] = js.native
    def GetTriangleToTriangle(
      triangleA: phaserLib.PhaserNs.GeomNs.Triangle,
      triangleB: phaserLib.PhaserNs.GeomNs.Triangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    /**
      * Checks for intersection between the line segment and circle.
      * 
      * Based on code by [Matt DesLauriers](https://github.com/mattdesl/line-circle-collision/blob/master/LICENSE.md).
      * @param line The line segment to check.
      * @param circle The circle to check against the line.
      * @param nearest An optional Point-like object. If given the closest point on the Line where the circle intersects will be stored in this object.
      */
    def LineToCircle(line: phaserLib.PhaserNs.GeomNs.Line, circle: phaserLib.PhaserNs.GeomNs.Circle): scala.Boolean = js.native
    def LineToCircle(line: phaserLib.PhaserNs.GeomNs.Line, circle: phaserLib.PhaserNs.GeomNs.Circle, nearest: js.Any): scala.Boolean = js.native
    def LineToCircle(
      line: phaserLib.PhaserNs.GeomNs.Line,
      circle: phaserLib.PhaserNs.GeomNs.Circle,
      nearest: phaserLib.PhaserNs.GeomNs.Point
    ): scala.Boolean = js.native
    /**
      * Checks if two Lines intersect. If the Lines are identical, they will be treated as parallel and thus non-intersecting.
      * @param line1 The first Line to check.
      * @param line2 The second Line to check.
      * @param out A Point in which to optionally store the point of intersection.
      */
    def LineToLine(line1: phaserLib.PhaserNs.GeomNs.Line, line2: phaserLib.PhaserNs.GeomNs.Line): scala.Boolean = js.native
    def LineToLine(
      line1: phaserLib.PhaserNs.GeomNs.Line,
      line2: phaserLib.PhaserNs.GeomNs.Line,
      out: phaserLib.PhaserNs.GeomNs.Point
    ): scala.Boolean = js.native
    def LineToRectangle(line: phaserLib.PhaserNs.GeomNs.Line, rect: js.Object): scala.Boolean = js.native
    /**
      * Checks for intersection between the Line and a Rectangle shape, or a rectangle-like
      * object, with public `x`, `y`, `right` and `bottom` properties, such as a Sprite or Body.
      * 
      * An intersection is considered valid if:
      * 
      * The line starts within, or ends within, the Rectangle.
      * The line segment intersects one of the 4 rectangle edges.
      * 
      * The for the purposes of this function rectangles are considered 'solid'.
      * @param line The Line to check for intersection.
      * @param rect The Rectangle to check for intersection.
      */
    def LineToRectangle(line: phaserLib.PhaserNs.GeomNs.Line, rect: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Boolean = js.native
    def PointToLine(point: js.Any, line: phaserLib.PhaserNs.GeomNs.Line): scala.Boolean = js.native
    def PointToLine(point: js.Any, line: phaserLib.PhaserNs.GeomNs.Line, lineThickness: scala.Double): scala.Boolean = js.native
    /**
      * Checks if the a Point falls between the two end-points of a Line, based on the given line thickness.
      * 
      * Assumes that the line end points are circular, not square.
      * @param point The point, or point-like object to check.
      * @param line The line segment to test for intersection on.
      * @param lineThickness The line thickness. Assumes that the line end points are circular. Default 1.
      */
    def PointToLine(point: phaserLib.PhaserNs.GeomNs.Point, line: phaserLib.PhaserNs.GeomNs.Line): scala.Boolean = js.native
    def PointToLine(
      point: phaserLib.PhaserNs.GeomNs.Point,
      line: phaserLib.PhaserNs.GeomNs.Line,
      lineThickness: scala.Double
    ): scala.Boolean = js.native
    /**
      * Checks if a Point is located on the given line segment.
      * @param point The Point to check for intersection.
      * @param line The line segment to check for intersection.
      */
    def PointToLineSegment(point: phaserLib.PhaserNs.GeomNs.Point, line: phaserLib.PhaserNs.GeomNs.Line): scala.Boolean = js.native
    /**
      * Checks if two Rectangles intersect.
      * 
      * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds. As such, the two Rectangles are considered "solid". A Rectangle with no width or no height will never intersect another Rectangle.
      * @param rectA The first Rectangle to check for intersection.
      * @param rectB The second Rectangle to check for intersection.
      */
    def RectangleToRectangle(rectA: phaserLib.PhaserNs.GeomNs.Rectangle, rectB: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Boolean = js.native
    /**
      * Checks for intersection between Rectangle shape and Triangle shape.
      * @param rect Rectangle object to test.
      * @param triangle Triangle object to test.
      */
    def RectangleToTriangle(rect: phaserLib.PhaserNs.GeomNs.Rectangle, triangle: phaserLib.PhaserNs.GeomNs.Triangle): scala.Boolean = js.native
    /**
      * Check if rectangle intersects with values.
      * @param rect The rectangle object
      * @param left The x coordinate of the left of the Rectangle.
      * @param right The x coordinate of the right of the Rectangle.
      * @param top The y coordinate of the top of the Rectangle.
      * @param bottom The y coordinate of the bottom of the Rectangle.
      * @param tolerance Tolerance allowed in the calculation, expressed in pixels. Default 0.
      */
    def RectangleToValues(
      rect: phaserLib.PhaserNs.GeomNs.Rectangle,
      left: scala.Double,
      right: scala.Double,
      top: scala.Double,
      bottom: scala.Double
    ): scala.Boolean = js.native
    def RectangleToValues(
      rect: phaserLib.PhaserNs.GeomNs.Rectangle,
      left: scala.Double,
      right: scala.Double,
      top: scala.Double,
      bottom: scala.Double,
      tolerance: scala.Double
    ): scala.Boolean = js.native
    /**
      * Checks if a Triangle and a Circle intersect.
      * 
      * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
      * @param triangle The Triangle to check for intersection.
      * @param circle The Circle to check for intersection.
      */
    def TriangleToCircle(triangle: phaserLib.PhaserNs.GeomNs.Triangle, circle: phaserLib.PhaserNs.GeomNs.Circle): scala.Boolean = js.native
    /**
      * Checks if a Triangle and a Line intersect.
      * 
      * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
      * @param triangle The Triangle to check with.
      * @param line The Line to check with.
      */
    def TriangleToLine(triangle: phaserLib.PhaserNs.GeomNs.Triangle, line: phaserLib.PhaserNs.GeomNs.Line): scala.Boolean = js.native
    /**
      * Checks if two Triangles intersect.
      * 
      * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
      * @param triangleA The first Triangle to check for intersection.
      * @param triangleB The second Triangle to check for intersection.
      */
    def TriangleToTriangle(triangleA: phaserLib.PhaserNs.GeomNs.Triangle, triangleB: phaserLib.PhaserNs.GeomNs.Triangle): scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Line extends js.Object {
    /**
      * Calculate the angle of the line in radians.
      * @param line The line to calculate the angle of.
      */
    def Angle(line: phaserLib.PhaserNs.GeomNs.Line): scala.Double = js.native
    /**
      * Using Bresenham's line algorithm this will return an array of all coordinates on this line.
      * 
      * The `start` and `end` points are rounded before this runs as the algorithm works on integers.
      * @param line The line.
      * @param stepRate The optional step rate for the points on the line. Default 1.
      * @param results An optional array to push the resulting coordinates into.
      */
    def BresenhamPoints(line: phaserLib.PhaserNs.GeomNs.Line): js.Array[js.Object] = js.native
    def BresenhamPoints(line: phaserLib.PhaserNs.GeomNs.Line, stepRate: phaserLib.integer): js.Array[js.Object] = js.native
    def BresenhamPoints(line: phaserLib.PhaserNs.GeomNs.Line, stepRate: phaserLib.integer, results: js.Array[_]): js.Array[js.Object] = js.native
    /**
      * Center a line on the given coordinates.
      * @param line The line to center.
      * @param x The horizontal coordinate to center the line on.
      * @param y The vertical coordinate to center the line on.
      */
    def CenterOn(line: phaserLib.PhaserNs.GeomNs.Line, x: scala.Double, y: scala.Double): phaserLib.PhaserNs.GeomNs.Line = js.native
    /**
      * Clone the given line.
      * @param source The source line to clone.
      */
    def Clone(source: phaserLib.PhaserNs.GeomNs.Line): phaserLib.PhaserNs.GeomNs.Line = js.native
    /**
      * Copy the values of one line to a destination line.
      * @param source The source line to copy the values from.
      * @param dest The destination line to copy the values to.
      */
    def CopyFrom[O /* <: phaserLib.PhaserNs.GeomNs.Line */](source: phaserLib.PhaserNs.GeomNs.Line, dest: O): O = js.native
    /**
      * Compare two lines for strict equality.
      * @param line The first line to compare.
      * @param toCompare The second line to compare.
      */
    def Equals(line: phaserLib.PhaserNs.GeomNs.Line, toCompare: phaserLib.PhaserNs.GeomNs.Line): scala.Boolean = js.native
    /**
      * Extends the start and end points of a Line by the given amounts.
      * 
      * The amounts can be positive or negative. Positive points will increase the length of the line,
      * while negative ones will decrease it.
      * 
      * If no `right` value is provided it will extend the length of the line equally in both directions.
      * 
      * Pass a value of zero to leave the start or end point unchanged.
      * @param line The line instance to extend.
      * @param left The amount to extend the start of the line by.
      * @param right The amount to extend the end of the line by. If not given it will be set to the `left` value.
      */
    def Extend(line: phaserLib.PhaserNs.GeomNs.Line, left: scala.Double): phaserLib.PhaserNs.GeomNs.Line = js.native
    def Extend(line: phaserLib.PhaserNs.GeomNs.Line, left: scala.Double, right: scala.Double): phaserLib.PhaserNs.GeomNs.Line = js.native
    /**
      * Get the midpoint of the given line.
      * @param line The line to get the midpoint of.
      * @param out An optional point object to store the midpoint in.
      */
    def GetMidPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line): O = js.native
    def GetMidPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, out: O): O = js.native
    def GetNearestPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, point: js.Object): O = js.native
    def GetNearestPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, point: js.Object, out: O): O = js.native
    /**
      * Get the nearest point on a line perpendicular to the given point.
      * @param line The line to get the nearest point on.
      * @param point The point to get the nearest point to.
      * @param out An optional point, or point-like object, to store the coordinates of the nearest point on the line.
      */
    def GetNearestPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, point: phaserLib.PhaserNs.GeomNs.Point): O = js.native
    def GetNearestPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, point: phaserLib.PhaserNs.GeomNs.Point, out: O): O = js.native
    /**
      * Calculate the normal of the given line.
      * 
      * The normal of a line is a vector that points perpendicular from it.
      * @param line The line to calculate the normal of.
      * @param out An optional point object to store the normal in.
      */
    def GetNormal[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line): O = js.native
    def GetNormal[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, out: O): O = js.native
    /**
      * Get a point on a line that's a given percentage along its length.
      * @param line The line.
      * @param position A value between 0 and 1, where 0 is the start, 0.5 is the middle and 1 is the end of the line.
      * @param out An optional point, or point-like object, to store the coordinates of the point on the line.
      */
    def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, position: scala.Double): O = js.native
    def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, position: scala.Double, out: O): O = js.native
    /**
      * Get a number of points along a line's length.
      * 
      * Provide a `quantity` to get an exact number of points along the line.
      * 
      * Provide a `stepRate` to ensure a specific distance between each point on the line. Set `quantity` to `0` when
      * providing a `stepRate`.
      * @param line The line.
      * @param quantity The number of points to place on the line. Set to `0` to use `stepRate` instead.
      * @param stepRate The distance between each point on the line. When set, `quantity` is implied and should be set to `0`.
      * @param out An optional array of Points, or point-like objects, to store the coordinates of the points on the line.
      */
    def GetPoints[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Point] */](line: phaserLib.PhaserNs.GeomNs.Line, quantity: phaserLib.integer): O = js.native
    def GetPoints[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Point] */](line: phaserLib.PhaserNs.GeomNs.Line, quantity: phaserLib.integer, stepRate: scala.Double): O = js.native
    def GetPoints[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Point] */](line: phaserLib.PhaserNs.GeomNs.Line, quantity: phaserLib.integer, stepRate: scala.Double, out: O): O = js.native
    def GetShortestDistance[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, point: js.Object): O = js.native
    /**
      * Get the shortest distance from a Line to the given Point.
      * @param line The line to get the distance from.
      * @param point The point to get the shortest distance to.
      */
    def GetShortestDistance[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, point: phaserLib.PhaserNs.GeomNs.Point): O = js.native
    /**
      * Calculate the height of the given line.
      * @param line The line to calculate the height of.
      */
    def Height(line: phaserLib.PhaserNs.GeomNs.Line): scala.Double = js.native
    /**
      * Calculate the length of the given line.
      * @param line The line to calculate the length of.
      */
    def Length(line: phaserLib.PhaserNs.GeomNs.Line): scala.Double = js.native
    /**
      * Get the angle of the normal of the given line in radians.
      * @param line The line to calculate the angle of the normal of.
      */
    def NormalAngle(line: phaserLib.PhaserNs.GeomNs.Line): scala.Double = js.native
    /**
      * [description]
      * @param line The Line object to get the normal value from.
      */
    def NormalX(line: phaserLib.PhaserNs.GeomNs.Line): scala.Double = js.native
    /**
      * The Y value of the normal of the given line.
      * The normal of a line is a vector that points perpendicular from it.
      * @param line The line to calculate the normal of.
      */
    def NormalY(line: phaserLib.PhaserNs.GeomNs.Line): scala.Double = js.native
    /**
      * Offset a line by the given amount.
      * @param line The line to offset.
      * @param x The horizontal offset to add to the line.
      * @param y The vertical offset to add to the line.
      */
    def Offset[O /* <: phaserLib.PhaserNs.GeomNs.Line */](line: O, x: scala.Double, y: scala.Double): O = js.native
    /**
      * Calculate the perpendicular slope of the given line.
      * @param line The line to calculate the perpendicular slope of.
      */
    def PerpSlope(line: phaserLib.PhaserNs.GeomNs.Line): scala.Double = js.native
    /**
      * Returns a random point on a given Line.
      * @param line The Line to calculate the random Point on.
      * @param out An instance of a Point to be modified.
      */
    def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line): O = js.native
    def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](line: phaserLib.PhaserNs.GeomNs.Line, out: O): O = js.native
    /**
      * Calculate the reflected angle between two lines.
      * 
      * This is the outgoing angle based on the angle of Line 1 and the normalAngle of Line 2.
      * @param lineA The first line.
      * @param lineB The second line.
      */
    def ReflectAngle(lineA: phaserLib.PhaserNs.GeomNs.Line, lineB: phaserLib.PhaserNs.GeomNs.Line): scala.Double = js.native
    /**
      * Rotate a line around its midpoint by the given angle in radians.
      * @param line The line to rotate.
      * @param angle The angle of rotation in radians.
      */
    def Rotate[O /* <: phaserLib.PhaserNs.GeomNs.Line */](line: O, angle: scala.Double): O = js.native
    def RotateAroundPoint[O /* <: phaserLib.PhaserNs.GeomNs.Line */](line: O, point: js.Object, angle: scala.Double): O = js.native
    /**
      * Rotate a line around a point by the given angle in radians.
      * @param line The line to rotate.
      * @param point The point to rotate the line around.
      * @param angle The angle of rotation in radians.
      */
    def RotateAroundPoint[O /* <: phaserLib.PhaserNs.GeomNs.Line */](line: O, point: phaserLib.PhaserNs.GeomNs.Point, angle: scala.Double): O = js.native
    /**
      * Rotate a line around the given coordinates by the given angle in radians.
      * @param line The line to rotate.
      * @param x The horizontal coordinate to rotate the line around.
      * @param y The vertical coordinate to rotate the line around.
      * @param angle The angle of rotation in radians.
      */
    def RotateAroundXY[O /* <: phaserLib.PhaserNs.GeomNs.Line */](line: O, x: scala.Double, y: scala.Double, angle: scala.Double): O = js.native
    /**
      * Set a line to a given position, angle and length.
      * @param line The line to set.
      * @param x The horizontal start position of the line.
      * @param y The vertical start position of the line.
      * @param angle The angle of the line in radians.
      * @param length The length of the line.
      */
    def SetToAngle[O /* <: phaserLib.PhaserNs.GeomNs.Line */](line: O, x: scala.Double, y: scala.Double, angle: scala.Double, length: scala.Double): O = js.native
    /**
      * Calculate the slope of the given line.
      * @param line The line to calculate the slope of.
      */
    def Slope(line: phaserLib.PhaserNs.GeomNs.Line): scala.Double = js.native
    /**
      * Calculate the width of the given line.
      * @param line The line to calculate the width of.
      */
    def Width(line: phaserLib.PhaserNs.GeomNs.Line): scala.Double = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    /**
      * Apply `Math.ceil()` to each coordinate of the given Point.
      * @param point The Point to ceil.
      */
    def Ceil[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: O): O = js.native
    /**
      * Clone the given Point.
      * @param source The source Point to clone.
      */
    def Clone(source: phaserLib.PhaserNs.GeomNs.Point): phaserLib.PhaserNs.GeomNs.Point = js.native
    /**
      * Copy the values of one Point to a destination Point.
      * @param source The source Point to copy the values from.
      * @param dest The destination Point to copy the values to.
      */
    def CopyFrom[O /* <: phaserLib.PhaserNs.GeomNs.Point */](source: phaserLib.PhaserNs.GeomNs.Point, dest: O): O = js.native
    /**
      * A comparison of two `Point` objects to see if they are equal.
      * @param point The original `Point` to compare against.
      * @param toCompare The second `Point` to compare.
      */
    def Equals(point: phaserLib.PhaserNs.GeomNs.Point, toCompare: phaserLib.PhaserNs.GeomNs.Point): scala.Boolean = js.native
    /**
      * Apply `Math.ceil()` to each coordinate of the given Point.
      * @param point The Point to floor.
      */
    def Floor[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: O): O = js.native
    /**
      * Get the centroid or geometric center of a plane figure (the arithmetic mean position of all the points in the figure).
      * Informally, it is the point at which a cutout of the shape could be perfectly balanced on the tip of a pin.
      * @param points [description]
      * @param out [description]
      */
    def GetCentroid[O /* <: phaserLib.PhaserNs.GeomNs.Point */](points: js.Array[phaserLib.PhaserNs.GeomNs.Point]): O = js.native
    def GetCentroid[O /* <: phaserLib.PhaserNs.GeomNs.Point */](points: js.Array[phaserLib.PhaserNs.GeomNs.Point], out: O): O = js.native
    /**
      * Calculate the magnitude of the point, which equivalent to the length of the line from the origin to this point.
      * @param point The point to calculate the magnitude for
      */
    def GetMagnitude(point: phaserLib.PhaserNs.GeomNs.Point): scala.Double = js.native
    /**
      * Calculates the square of magnitude of given point.(Can be used for fast magnitude calculation of point)
      * @param point Returns square of the magnitude/length of given point.
      */
    def GetMagnitudeSq(point: phaserLib.PhaserNs.GeomNs.Point): scala.Double = js.native
    /**
      * Calculates the Axis Aligned Bounding Box (or aabb) from an array of points.
      * @param points [description]
      * @param out [description]
      */
    def GetRectangleFromPoints[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](points: js.Array[phaserLib.PhaserNs.GeomNs.Point]): O = js.native
    def GetRectangleFromPoints[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](points: js.Array[phaserLib.PhaserNs.GeomNs.Point], out: O): O = js.native
    /**
      * [description]
      * @param pointA The starting `Point` for the interpolation.
      * @param pointB The target `Point` for the interpolation.
      * @param t The amount to interpolate between the two points. Generally, a value between 0 (returns the starting `Point`) and 1 (returns the target `Point`). If omitted, 0 is used. Default 0.
      * @param out An optional `Point` object whose `x` and `y` values will be set to the result of the interpolation (can also be any object with `x` and `y` properties). If omitted, a new `Point` created and returned.
      */
    def Interpolate[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point): O = js.native
    def Interpolate[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point, t: scala.Double): O = js.native
    def Interpolate[O /* <: phaserLib.PhaserNs.GeomNs.Point */](
      pointA: phaserLib.PhaserNs.GeomNs.Point,
      pointB: phaserLib.PhaserNs.GeomNs.Point,
      t: scala.Double,
      out: O
    ): O = js.native
    /**
      * Swaps the X and the Y coordinate of a point.
      * @param point The Point to modify.
      */
    def Invert[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: O): O = js.native
    /**
      * Inverts a Point's coordinates.
      * @param point The Point to invert.
      * @param out The Point to return the inverted coordinates in.
      */
    def Negative[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: phaserLib.PhaserNs.GeomNs.Point): O = js.native
    def Negative[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: phaserLib.PhaserNs.GeomNs.Point, out: O): O = js.native
    /**
      * [description]
      * @param pointA [description]
      * @param pointB [description]
      * @param out [description]
      */
    def Project[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point): O = js.native
    def Project[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point, out: O): O = js.native
    /**
      * [description]
      * @param pointA [description]
      * @param pointB [description]
      * @param out [description]
      */
    def ProjectUnit[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point): O = js.native
    def ProjectUnit[O /* <: phaserLib.PhaserNs.GeomNs.Point */](pointA: phaserLib.PhaserNs.GeomNs.Point, pointB: phaserLib.PhaserNs.GeomNs.Point, out: O): O = js.native
    /**
      * Changes the magnitude (length) of a two-dimensional vector without changing its direction.
      * @param point The Point to treat as the end point of the vector.
      * @param magnitude The new magnitude of the vector.
      */
    def SetMagnitude[O /* <: phaserLib.PhaserNs.GeomNs.Point */](point: O, magnitude: scala.Double): O = js.native
  }
  
  /* static members */
  @js.native
  object Polygon extends js.Object {
    /**
      * Create a new polygon which is a copy of the specified polygon
      * @param polygon The polygon to create a clone of
      */
    def Clone(polygon: phaserLib.PhaserNs.GeomNs.Polygon): phaserLib.PhaserNs.GeomNs.Polygon = js.native
    /**
      * Checks if a point is within the bounds of a Polygon.
      * @param polygon The Polygon to check against.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def Contains(polygon: phaserLib.PhaserNs.GeomNs.Polygon, x: scala.Double, y: scala.Double): scala.Boolean = js.native
    /**
      * [description]
      * @param polygon [description]
      * @param point [description]
      */
    def ContainsPoint(polygon: phaserLib.PhaserNs.GeomNs.Polygon, point: phaserLib.PhaserNs.GeomNs.Point): scala.Boolean = js.native
    /**
      * Calculates the bounding AABB rectangle of a polygon.
      * @param polygon The polygon that should be calculated.
      * @param out The rectangle or object that has x, y, width, and height properties to store the result. Optional.
      */
    def GetAABB[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](polygon: phaserLib.PhaserNs.GeomNs.Polygon): O = js.native
    def GetAABB[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](polygon: phaserLib.PhaserNs.GeomNs.Polygon, out: O): O = js.native
    /**
      * Stores all of the points of a Polygon into a flat array of numbers following the sequence [ x,y, x,y, x,y ],
      * i.e. each point of the Polygon, in the order it's defined, corresponds to two elements of the resultant
      * array for the point's X and Y coordinate.
      * @param polygon The Polygon whose points to export.
      * @param output An array to which the points' coordinates should be appended.
      */
    def GetNumberArray[O /* <: js.Array[scala.Double] */](polygon: phaserLib.PhaserNs.GeomNs.Polygon): O = js.native
    def GetNumberArray[O /* <: js.Array[scala.Double] */](polygon: phaserLib.PhaserNs.GeomNs.Polygon, output: O): O = js.native
    /**
      * Returns an array of Point objects containing the coordinates of the points around the perimeter of the Polygon,
      * based on the given quantity or stepRate values.
      * @param polygon The Polygon to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the perimeter of the Polygon and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def GetPoints(polygon: phaserLib.PhaserNs.GeomNs.Polygon, quantity: phaserLib.integer): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
    def GetPoints(polygon: phaserLib.PhaserNs.GeomNs.Polygon, quantity: phaserLib.integer, stepRate: scala.Double): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
    def GetPoints(
      polygon: phaserLib.PhaserNs.GeomNs.Polygon,
      quantity: phaserLib.integer,
      stepRate: scala.Double,
      output: js.Array[_]
    ): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
    /**
      * Returns the perimeter of the given Polygon.
      * @param polygon The Polygon to get the perimeter of.
      */
    def Perimeter(polygon: phaserLib.PhaserNs.GeomNs.Polygon): scala.Double = js.native
    /**
      * Reverses the order of the points of a Polygon.
      * @param polygon The Polygon to modify.
      */
    def Reverse[O /* <: phaserLib.PhaserNs.GeomNs.Polygon */](polygon: O): O = js.native
    /**
      * Takes a Polygon object and applies Chaikin's smoothing algorithm on its points.
      * @param polygon The polygon to be smoothed. The polygon will be modified in-place and returned.
      */
    def Smooth[O /* <: phaserLib.PhaserNs.GeomNs.Polygon */](polygon: O): O = js.native
  }
  
  /* static members */
  @js.native
  object Rectangle extends js.Object {
    /**
      * Calculates the area of the given Rectangle object.
      * @param rect The rectangle to calculate the area of.
      */
    def Area(rect: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Double = js.native
    /**
      * Rounds a Rectangle's position up to the smallest integer greater than or equal to each current coordinate.
      * @param rect The Rectangle to adjust.
      */
    def Ceil[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rect: O): O = js.native
    /**
      * Rounds a Rectangle's position and size up to the smallest integer greater than or equal to each respective value.
      * @param rect The Rectangle to modify.
      */
    def CeilAll[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rect: O): O = js.native
    /**
      * Moves the top-left corner of a Rectangle so that its center is at the given coordinates.
      * @param rect The Rectangle to be centered.
      * @param x The X coordinate of the Rectangle's center.
      * @param y The Y coordinate of the Rectangle's center.
      */
    def CenterOn[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rect: O, x: scala.Double, y: scala.Double): O = js.native
    /**
      * Creates a new Rectangle which is identical to the given one.
      * @param source The Rectangle to clone.
      */
    def Clone(source: phaserLib.PhaserNs.GeomNs.Rectangle): phaserLib.PhaserNs.GeomNs.Rectangle = js.native
    /**
      * Checks if a given point is inside a Rectangle's bounds.
      * @param rect The Rectangle to check.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def Contains(rect: phaserLib.PhaserNs.GeomNs.Rectangle, x: scala.Double, y: scala.Double): scala.Boolean = js.native
    /**
      * Determines whether the specified point is contained within the rectangular region defined by this Rectangle object.
      * @param rect The Rectangle object.
      * @param point The point object to be checked. Can be a Phaser Point object or any object with x and y values.
      */
    def ContainsPoint(rect: phaserLib.PhaserNs.GeomNs.Rectangle, point: phaserLib.PhaserNs.GeomNs.Point): scala.Boolean = js.native
    /**
      * Tests if one rectangle fully contains another.
      * @param rectA The first rectangle.
      * @param rectB The second rectangle.
      */
    def ContainsRect(rectA: phaserLib.PhaserNs.GeomNs.Rectangle, rectB: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Boolean = js.native
    /**
      * Copy the values of one Rectangle to a destination Rectangle.
      * @param source The source Rectangle to copy the values from.
      * @param dest The destination Rectangle to copy the values to.
      */
    def CopyFrom[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](source: phaserLib.PhaserNs.GeomNs.Rectangle, dest: O): O = js.native
    /**
      * Create an array of points for each corner of a Rectangle
      * If an array is specified, each point object will be added to the end of the array, otherwise a new array will be created.
      * @param rect The Rectangle object to be decomposed.
      * @param out If provided, each point will be added to this array.
      */
    def Decompose(rect: phaserLib.PhaserNs.GeomNs.Rectangle): js.Array[_] = js.native
    def Decompose(rect: phaserLib.PhaserNs.GeomNs.Rectangle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Compares the `x`, `y`, `width` and `height` properties of two rectangles.
      * @param rect Rectangle A
      * @param toCompare Rectangle B
      */
    def Equals(rect: phaserLib.PhaserNs.GeomNs.Rectangle, toCompare: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Boolean = js.native
    /**
      * Adjusts the target rectangle, changing its width, height and position,
      * so that it fits inside the area of the source rectangle, while maintaining its original
      * aspect ratio.
      * 
      * Unlike the `FitOutside` function, there may be some space inside the source area not covered.
      * @param target The target rectangle to adjust.
      * @param source The source rectangle to envlope the target in.
      */
    def FitInside[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](target: O, source: phaserLib.PhaserNs.GeomNs.Rectangle): O = js.native
    /**
      * Adjusts the target rectangle, changing its width, height and position,
      * so that it fully covers the area of the source rectangle, while maintaining its original
      * aspect ratio.
      * 
      * Unlike the `FitInside` function, the target rectangle may extend further out than the source.
      * @param target The target rectangle to adjust.
      * @param source The source rectangle to envlope the target in.
      */
    def FitOutside[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](target: O, source: phaserLib.PhaserNs.GeomNs.Rectangle): O = js.native
    /**
      * Rounds down (floors) the top left X and Y co-ordinates of the given Rectangle to the largest integer less than or equal to them
      * @param rect The rectangle to floor the top left X and Y co-ordinates of
      */
    def Floor[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rect: O): O = js.native
    /**
      * Rounds a Rectangle's position and size down to the largest integer less than or equal to each current coordinate or dimension.
      * @param rect The Rectangle to adjust.
      */
    def FloorAll[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rect: O): O = js.native
    /**
      * Constructs new Rectangle or repositions and resizes an existing Rectangle so that all of the given points are on or within its bounds.
      * @param points An array of points (either arrays with two elements corresponding to the X and Y coordinate or an object with public `x` and `y` properties) which should be surrounded by the Rectangle.
      * @param out Optional Rectangle to adjust.
      */
    def FromPoints[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](points: js.Array[_]): O = js.native
    def FromPoints[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](points: js.Array[_], out: O): O = js.native
    /**
      * Calculates the width/height ratio of a rectangle.
      * @param rect The rectangle.
      */
    def GetAspectRatio(rect: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Double = js.native
    /**
      * Returns the center of a Rectangle as a Point.
      * @param rect The Rectangle to get the center of.
      * @param out Optional point-like object to update with the center coordinates.
      */
    def GetCenter[O /* <: phaserLib.PhaserNs.GeomNs.Point */](rect: phaserLib.PhaserNs.GeomNs.Rectangle): O = js.native
    def GetCenter[O /* <: phaserLib.PhaserNs.GeomNs.Point */](rect: phaserLib.PhaserNs.GeomNs.Rectangle, out: O): O = js.native
    /**
      * Position is a value between 0 and 1 where 0 = the top-left of the rectangle and 0.5 = the bottom right.
      * @param rectangle [description]
      * @param position [description]
      * @param out [description]
      */
    def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](rectangle: phaserLib.PhaserNs.GeomNs.Rectangle, position: scala.Double): O = js.native
    def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](rectangle: phaserLib.PhaserNs.GeomNs.Rectangle, position: scala.Double, out: O): O = js.native
    /**
      * Return an array of points from the perimeter of the rectangle, each spaced out based on the quantity or step required.
      * @param rectangle The Rectangle object to get the points from.
      * @param step Step between points. Used to calculate the number of points to return when quantity is falsy. Ignored if quantity is positive.
      * @param quantity The number of evenly spaced points from the rectangles perimeter to return. If falsy, step param will be used to calculate the number of points.
      * @param out An optional array to store the points in.
      */
    def GetPoints[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Point] */](rectangle: phaserLib.PhaserNs.GeomNs.Rectangle, step: scala.Double, quantity: phaserLib.integer): O = js.native
    def GetPoints[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Point] */](
      rectangle: phaserLib.PhaserNs.GeomNs.Rectangle,
      step: scala.Double,
      quantity: phaserLib.integer,
      out: O
    ): O = js.native
    /**
      * [description]
      * @param rect [description]
      * @param out [description]
      */
    def GetSize[O /* <: phaserLib.PhaserNs.GeomNs.Point */](rect: phaserLib.PhaserNs.GeomNs.Rectangle): O = js.native
    def GetSize[O /* <: phaserLib.PhaserNs.GeomNs.Point */](rect: phaserLib.PhaserNs.GeomNs.Rectangle, out: O): O = js.native
    /**
      * Increases the size of a Rectangle by a specified amount.
      * 
      * The center of the Rectangle stays the same. The amounts are added to each side, so the actual increase in width or height is two times bigger than the respective argument.
      * @param rect The Rectangle to inflate.
      * @param x How many pixels the left and the right side should be moved by horizontally.
      * @param y How many pixels the top and the bottom side should be moved by vertically.
      */
    def Inflate[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rect: O, x: scala.Double, y: scala.Double): O = js.native
    /**
      * Takes two Rectangles and first checks to see if they intersect.
      * If they intersect it will return the area of intersection in the `out` Rectangle.
      * If they do not intersect, the `out` Rectangle will have a width and height of zero.
      * @param rectA The first Rectangle to get the intersection from.
      * @param rectB The second Rectangle to get the intersection from.
      * @param out A Rectangle to store the intersection results in.
      */
    def Intersection[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rectA: phaserLib.PhaserNs.GeomNs.Rectangle, rectB: phaserLib.PhaserNs.GeomNs.Rectangle): O = js.native
    def Intersection[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](
      rectA: phaserLib.PhaserNs.GeomNs.Rectangle,
      rectB: phaserLib.PhaserNs.GeomNs.Rectangle,
      out: phaserLib.PhaserNs.GeomNs.Rectangle
    ): O = js.native
    /**
      * [description]
      * @param rect [description]
      * @param step [description]
      * @param quantity [description]
      * @param out [description]
      */
    def MarchingAnts[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Point] */](rect: phaserLib.PhaserNs.GeomNs.Rectangle, step: scala.Double, quantity: phaserLib.integer): O = js.native
    def MarchingAnts[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Point] */](rect: phaserLib.PhaserNs.GeomNs.Rectangle, step: scala.Double, quantity: phaserLib.integer, out: O): O = js.native
    /**
      * Merges a Rectangle with a list of points by repositioning and/or resizing it such that all points are located on or within its bounds.
      * @param target The Rectangle which should be merged.
      * @param points An array of Points (or any object with public `x` and `y` properties) which should be merged with the Rectangle.
      */
    def MergePoints[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](target: O, points: js.Array[phaserLib.PhaserNs.GeomNs.Point]): O = js.native
    /**
      * Merges the source rectangle into the target rectangle and returns the target.
      * Neither rectangle should have a negative width or height.
      * @param target Target rectangle. Will be modified to include source rectangle.
      * @param source Rectangle that will be merged into target rectangle.
      */
    def MergeRect[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](target: O, source: phaserLib.PhaserNs.GeomNs.Rectangle): O = js.native
    /**
      * Merges a Rectangle with a point by repositioning and/or resizing it so that the point is on or within its bounds.
      * @param target The Rectangle which should be merged and modified.
      * @param x The X coordinate of the point which should be merged.
      * @param y The Y coordinate of the point which should be merged.
      */
    def MergeXY[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](target: O, x: scala.Double, y: scala.Double): O = js.native
    /**
      * Nudges (translates) the top left corner of a Rectangle by a given offset.
      * @param rect The Rectangle to adjust.
      * @param x The distance to move the Rectangle horizontally.
      * @param y The distance to move the Rectangle vertically.
      */
    def Offset[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rect: O, x: scala.Double, y: scala.Double): O = js.native
    /**
      * Nudges (translates) the top-left corner of a Rectangle by the coordinates of a point (translation vector).
      * @param rect The Rectangle to adjust.
      * @param point The point whose coordinates should be used as an offset.
      */
    def OffsetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rect: O, point: phaserLib.PhaserNs.GeomNs.Point): O = js.native
    def OffsetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rect: O, point: phaserLib.PhaserNs.MathNs.Vector2): O = js.native
    /**
      * Checks if two Rectangles overlap. If a Rectangle is within another Rectangle, the two will be considered overlapping. Thus, the Rectangles are treated as "solid".
      * @param rectA The first Rectangle to check.
      * @param rectB The second Rectangle to check.
      */
    def Overlaps(rectA: phaserLib.PhaserNs.GeomNs.Rectangle, rectB: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Boolean = js.native
    /**
      * Calculates the perimeter of a Rectangle.
      * @param rect The Rectangle to use.
      */
    def Perimeter(rect: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Double = js.native
    /**
      * [description]
      * @param rectangle [description]
      * @param angle [description]
      * @param out [description]
      */
    def PerimeterPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](rectangle: phaserLib.PhaserNs.GeomNs.Rectangle, angle: phaserLib.integer): O = js.native
    def PerimeterPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](rectangle: phaserLib.PhaserNs.GeomNs.Rectangle, angle: phaserLib.integer, out: O): O = js.native
    /**
      * Returns a random point within a Rectangle.
      * @param rect The Rectangle to return a point from.
      * @param out The object to update with the point's coordinates.
      */
    def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](rect: phaserLib.PhaserNs.GeomNs.Rectangle, out: O): O = js.native
    /**
      * Calculates a random point that lies within the `outer` Rectangle, but outside of the `inner` Rectangle.
      * The inner Rectangle must be fully contained within the outer rectangle.
      * @param outer The outer Rectangle to get the random point within.
      * @param inner The inner Rectangle to exclude from the returned point.
      * @param out A Point, or Point-like object to store the result in. If not specified, a new Point will be created.
      */
    def RandomOutside[O /* <: phaserLib.PhaserNs.GeomNs.Point */](outer: phaserLib.PhaserNs.GeomNs.Rectangle, inner: phaserLib.PhaserNs.GeomNs.Rectangle): O = js.native
    def RandomOutside[O /* <: phaserLib.PhaserNs.GeomNs.Point */](outer: phaserLib.PhaserNs.GeomNs.Rectangle, inner: phaserLib.PhaserNs.GeomNs.Rectangle, out: O): O = js.native
    /**
      * Determines if the two objects (either Rectangles or Rectangle-like) have the same width and height values under strict equality.
      * @param rect The first Rectangle object.
      * @param toCompare The second Rectangle object.
      */
    def SameDimensions(rect: phaserLib.PhaserNs.GeomNs.Rectangle, toCompare: phaserLib.PhaserNs.GeomNs.Rectangle): scala.Boolean = js.native
    /**
      * Scales the width and height of this Rectangle by the given amounts.
      * @param rect The `Rectangle` object that will be scaled by the specified amount(s).
      * @param x The factor by which to scale the rectangle horizontally.
      * @param y The amount by which to scale the rectangle vertically. If this is not specified, the rectangle will be scaled by the factor `x` in both directions.
      */
    def Scale[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rect: O, x: scala.Double, y: scala.Double): O = js.native
    /**
      * Creates a new Rectangle or repositions and/or resizes an existing Rectangle so that it encompasses the two given Rectangles, i.e. calculates their union.
      * @param rectA The first Rectangle to use.
      * @param rectB The second Rectangle to use.
      * @param out The Rectangle to store the union in.
      */
    def Union[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rectA: phaserLib.PhaserNs.GeomNs.Rectangle, rectB: phaserLib.PhaserNs.GeomNs.Rectangle): O = js.native
    def Union[O /* <: phaserLib.PhaserNs.GeomNs.Rectangle */](rectA: phaserLib.PhaserNs.GeomNs.Rectangle, rectB: phaserLib.PhaserNs.GeomNs.Rectangle, out: O): O = js.native
  }
  
  /* static members */
  @js.native
  object Triangle extends js.Object {
    /**
      * Returns the area of a Triangle.
      * @param triangle The Triangle to use.
      */
    def Area(triangle: phaserLib.PhaserNs.GeomNs.Triangle): scala.Double = js.native
    /**
      * Builds an equilateral triangle. In the equilateral triangle, all the sides are the same length (congruent) and all the angles are the same size (congruent).
      * The x/y specifies the top-middle of the triangle (x1/y1) and length is the length of each side.
      * @param x x coordinate of the top point of the triangle.
      * @param y y coordinate of the top point of the triangle.
      * @param length Length of each side of the triangle.
      */
    def BuildEquilateral(x: scala.Double, y: scala.Double, length: scala.Double): phaserLib.PhaserNs.GeomNs.Triangle = js.native
    /**
      * [description]
      * @param data A flat array of vertice coordinates like [x0,y0, x1,y1, x2,y2, ...]
      * @param holes An array of hole indices if any (e.g. [5, 8] for a 12-vertice input would mean one hole with vertices 5–7 and another with 8–11). Default null.
      * @param scaleX [description] Default 1.
      * @param scaleY [description] Default 1.
      * @param out [description]
      */
    def BuildFromPolygon[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Triangle] */](data: js.Array[_]): O = js.native
    def BuildFromPolygon[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Triangle] */](data: js.Array[_], holes: js.Array[_]): O = js.native
    def BuildFromPolygon[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: scala.Double): O = js.native
    def BuildFromPolygon[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: scala.Double, scaleY: scala.Double): O = js.native
    def BuildFromPolygon[O /* <: js.Array[phaserLib.PhaserNs.GeomNs.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: scala.Double, scaleY: scala.Double, out: O): O = js.native
    /**
      * Builds a right triangle, i.e. one which has a 90-degree angle and two acute angles.
      * @param x The X coordinate of the right angle, which will also be the first X coordinate of the constructed Triangle.
      * @param y The Y coordinate of the right angle, which will also be the first Y coordinate of the constructed Triangle.
      * @param width The length of the side which is to the left or to the right of the right angle.
      * @param height The length of the side which is above or below the right angle.
      */
    def BuildRight(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): phaserLib.PhaserNs.GeomNs.Triangle = js.native
    /**
      * Positions the Triangle so that it is centered on the given coordinates.
      * @param triangle The triangle to be positioned.
      * @param x The horizontal coordinate to center on.
      * @param y The vertical coordinate to center on.
      * @param centerFunc The function used to center the triangle. Defaults to Centroid centering.
      */
    def CenterOn[O /* <: phaserLib.PhaserNs.GeomNs.Triangle */](triangle: O, x: scala.Double, y: scala.Double): O = js.native
    def CenterOn[O /* <: phaserLib.PhaserNs.GeomNs.Triangle */](triangle: O, x: scala.Double, y: scala.Double, centerFunc: phaserLib.CenterFunction): O = js.native
    /**
      * Calculates the position of a Triangle's centroid, which is also its center of mass (center of gravity).
      * 
      * The centroid is the point in a Triangle at which its three medians (the lines drawn from the vertices to the bisectors of the opposite sides) meet. It divides each one in a 2:1 ratio.
      * @param triangle The Triangle to use.
      * @param out An object to store the coordinates in.
      */
    def Centroid[O /* <: phaserLib.PhaserNs.GeomNs.Point */](triangle: phaserLib.PhaserNs.GeomNs.Triangle): O = js.native
    def Centroid[O /* <: phaserLib.PhaserNs.GeomNs.Point */](triangle: phaserLib.PhaserNs.GeomNs.Triangle, out: O): O = js.native
    /**
      * Computes the circumcentre of a triangle. The circumcentre is the centre of
      * the circumcircle, the smallest circle which encloses the triangle. It is also
      * the common intersection point of the perpendicular bisectors of the sides of
      * the triangle, and is the only point which has equal distance to all three
      * vertices of the triangle.
      * @param triangle [description]
      * @param out [description]
      */
    def CircumCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](triangle: phaserLib.PhaserNs.GeomNs.Triangle): O = js.native
    def CircumCenter[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](triangle: phaserLib.PhaserNs.GeomNs.Triangle, out: O): O = js.native
    /**
      * Finds the circumscribed circle (circumcircle) of a Triangle object. The circumcircle is the circle which touches all of the triangle's vertices.
      * @param triangle The Triangle to use as input.
      * @param out An optional Circle to store the result in.
      */
    def CircumCircle[O /* <: phaserLib.PhaserNs.GeomNs.Circle */](triangle: phaserLib.PhaserNs.GeomNs.Triangle): O = js.native
    def CircumCircle[O /* <: phaserLib.PhaserNs.GeomNs.Circle */](triangle: phaserLib.PhaserNs.GeomNs.Triangle, out: O): O = js.native
    /**
      * Clones a Triangle object.
      * @param source The Triangle to clone.
      */
    def Clone(source: phaserLib.PhaserNs.GeomNs.Triangle): phaserLib.PhaserNs.GeomNs.Triangle = js.native
    /**
      * Checks if a point (as a pair of coordinates) is inside a Triangle's bounds.
      * @param triangle The Triangle to check.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def Contains(triangle: phaserLib.PhaserNs.GeomNs.Triangle, x: scala.Double, y: scala.Double): scala.Boolean = js.native
    /**
      * Filters an array of point-like objects to only those contained within a triangle.
      * If `returnFirst` is true, will return an array containing only the first point in the provided array that is within the triangle (or an empty array if there are no such points).
      * @param triangle The triangle that the points are being checked in.
      * @param points An array of point-like objects (objects that have an `x` and `y` property)
      * @param returnFirst If `true`, return an array containing only the first point found that is within the triangle. Default false.
      * @param out If provided, the points that are within the triangle will be appended to this array instead of being added to a new array. If `returnFirst` is true, only the first point found within the triangle will be appended. This array will also be returned by this function.
      */
    def ContainsArray(triangle: phaserLib.PhaserNs.GeomNs.Triangle, points: js.Array[phaserLib.PhaserNs.GeomNs.Point]): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
    def ContainsArray(
      triangle: phaserLib.PhaserNs.GeomNs.Triangle,
      points: js.Array[phaserLib.PhaserNs.GeomNs.Point],
      returnFirst: scala.Boolean
    ): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
    def ContainsArray(
      triangle: phaserLib.PhaserNs.GeomNs.Triangle,
      points: js.Array[phaserLib.PhaserNs.GeomNs.Point],
      returnFirst: scala.Boolean,
      out: js.Array[_]
    ): js.Array[phaserLib.PhaserNs.GeomNs.Point] = js.native
    def ContainsPoint(triangle: phaserLib.PhaserNs.GeomNs.Triangle, point: js.Any): scala.Boolean = js.native
    /**
      * Tests if a triangle contains a point.
      * @param triangle The triangle.
      * @param point The point to test, or any point-like object with public `x` and `y` properties.
      */
    def ContainsPoint(triangle: phaserLib.PhaserNs.GeomNs.Triangle, point: phaserLib.PhaserNs.GeomNs.Point): scala.Boolean = js.native
    def ContainsPoint(triangle: phaserLib.PhaserNs.GeomNs.Triangle, point: phaserLib.PhaserNs.MathNs.Vector2): scala.Boolean = js.native
    /**
      * Copy the values of one Triangle to a destination Triangle.
      * @param source The source Triangle to copy the values from.
      * @param dest The destination Triangle to copy the values to.
      */
    def CopyFrom[O /* <: phaserLib.PhaserNs.GeomNs.Triangle */](source: phaserLib.PhaserNs.GeomNs.Triangle, dest: O): O = js.native
    /**
      * Decomposes a Triangle into an array of its points.
      * @param triangle The Triangle to decompose.
      * @param out An array to store the points into.
      */
    def Decompose(triangle: phaserLib.PhaserNs.GeomNs.Triangle): js.Array[_] = js.native
    def Decompose(triangle: phaserLib.PhaserNs.GeomNs.Triangle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Returns true if two triangles have the same coordinates.
      * @param triangle The first triangle to check.
      * @param toCompare The second triangle to check.
      */
    def Equals(triangle: phaserLib.PhaserNs.GeomNs.Triangle, toCompare: phaserLib.PhaserNs.GeomNs.Triangle): scala.Boolean = js.native
    /**
      * Returns a Point from around the perimeter of a Triangle.
      * @param triangle The Triangle to get the point on its perimeter from.
      * @param position The position along the perimeter of the triangle. A value between 0 and 1.
      * @param out An option Point, or Point-like object to store the value in. If not given a new Point will be created.
      */
    def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](triangle: phaserLib.PhaserNs.GeomNs.Triangle, position: scala.Double): O = js.native
    def GetPoint[O /* <: phaserLib.PhaserNs.GeomNs.Point */](triangle: phaserLib.PhaserNs.GeomNs.Triangle, position: scala.Double, out: O): O = js.native
    /**
      * Returns an array of evenly spaced points on the perimeter of a Triangle.
      * @param triangle The Triangle to get the points from.
      * @param quantity The number of evenly spaced points to return. Set to 0 to return an arbitrary number of points based on the `stepRate`.
      * @param stepRate If `quantity` is 0, the distance between each returned point.
      * @param out An array to which the points should be appended.
      */
    def GetPoints[O /* <: phaserLib.PhaserNs.GeomNs.Point */](triangle: phaserLib.PhaserNs.GeomNs.Triangle, quantity: phaserLib.integer, stepRate: scala.Double): O = js.native
    def GetPoints[O /* <: phaserLib.PhaserNs.GeomNs.Point */](
      triangle: phaserLib.PhaserNs.GeomNs.Triangle,
      quantity: phaserLib.integer,
      stepRate: scala.Double,
      out: O
    ): O = js.native
    /**
      * Calculates the position of the incenter of a Triangle object. This is the point where its three angle bisectors meet and it's also the center of the incircle, which is the circle inscribed in the triangle.
      * @param triangle The Triangle to find the incenter of.
      * @param out An optional Point in which to store the coordinates.
      */
    def InCenter[O /* <: phaserLib.PhaserNs.GeomNs.Point */](triangle: phaserLib.PhaserNs.GeomNs.Triangle): O = js.native
    def InCenter[O /* <: phaserLib.PhaserNs.GeomNs.Point */](triangle: phaserLib.PhaserNs.GeomNs.Triangle, out: O): O = js.native
    /**
      * Moves each point (vertex) of a Triangle by a given offset, thus moving the entire Triangle by that offset.
      * @param triangle The Triangle to move.
      * @param x The horizontal offset (distance) by which to move each point. Can be positive or negative.
      * @param y The vertical offset (distance) by which to move each point. Can be positive or negative.
      */
    def Offset[O /* <: phaserLib.PhaserNs.GeomNs.Triangle */](triangle: O, x: scala.Double, y: scala.Double): O = js.native
    /**
      * Gets the length of the perimeter of the given triangle.
      * @param triangle [description]
      */
    def Perimeter(triangle: phaserLib.PhaserNs.GeomNs.Triangle): scala.Double = js.native
    /**
      * [description]
      * @param triangle [description]
      * @param out [description]
      */
    def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](triangle: phaserLib.PhaserNs.GeomNs.Triangle): O = js.native
    def Random[O /* <: phaserLib.PhaserNs.GeomNs.Point */](triangle: phaserLib.PhaserNs.GeomNs.Triangle, out: O): O = js.native
    /**
      * Rotates a Triangle about its incenter, which is the point at which its three angle bisectors meet.
      * @param triangle The Triangle to rotate.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    def Rotate[O /* <: phaserLib.PhaserNs.GeomNs.Triangle */](triangle: O, angle: scala.Double): O = js.native
    /**
      * Rotates a Triangle at a certain angle about a given Point or object with public `x` and `y` properties.
      * @param triangle The Triangle to rotate.
      * @param point The Point to rotate the Triangle about.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    def RotateAroundPoint[O /* <: phaserLib.PhaserNs.GeomNs.Triangle */](triangle: O, point: phaserLib.PhaserNs.GeomNs.Point, angle: scala.Double): O = js.native
    /**
      * Rotates an entire Triangle at a given angle about a specific point.
      * @param triangle The Triangle to rotate.
      * @param x The X coordinate of the point to rotate the Triangle about.
      * @param y The Y coordinate of the point to rotate the Triangle about.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    def RotateAroundXY[O /* <: phaserLib.PhaserNs.GeomNs.Triangle */](triangle: O, x: scala.Double, y: scala.Double, angle: scala.Double): O = js.native
  }
  
}

