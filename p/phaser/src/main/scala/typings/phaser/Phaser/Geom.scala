package typings.phaser.Phaser

import typings.phaser.CenterFunction
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Geom")
@js.native
object Geom extends js.Object {
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
  class Circle () extends js.Object {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, radius: Double) = this()
    /**
      * The bottom position of the Circle.
      */
    var bottom: Double = js.native
    /**
      * The diameter of the Circle.
      */
    var diameter: Double = js.native
    /**
      * The left position of the Circle.
      */
    var left: Double = js.native
    /**
      * The radius of the Circle.
      */
    var radius: Double = js.native
    /**
      * The right position of the Circle.
      */
    var right: Double = js.native
    /**
      * The top position of the Circle.
      */
    var top: Double = js.native
    /**
      * The geometry constant type of this object: `GEOM_CONST.CIRCLE`.
      * Used for fast type comparisons.
      */
    val `type`: integer = js.native
    /**
      * The x position of the center of the circle.
      */
    var x: Double = js.native
    /**
      * The y position of the center of the circle.
      */
    var y: Double = js.native
    /**
      * Check to see if the Circle contains the given x / y coordinates.
      * @param x The x coordinate to check within the circle.
      * @param y The y coordinate to check within the circle.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the circle.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    def getPoint[O /* <: Point */](position: Double): O = js.native
    def getPoint[O /* <: Point */](position: Double, out: O): O = js.native
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Circle,
      * based on the given quantity or stepRate values.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the circle and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def getPoints[O /* <: js.Array[Point] */](quantity: integer): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: integer, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: integer, stepRate: Double, output: O): O = js.native
    /**
      * Returns a uniformly distributed random point from anywhere within the Circle.
      * @param point A Point or point-like object to set the random `x` and `y` values in.
      */
    def getRandomPoint[O /* <: Point */](): O = js.native
    def getRandomPoint[O /* <: Point */](point: O): O = js.native
    /**
      * Checks to see if the Circle is empty: has a radius of zero.
      */
    def isEmpty(): Boolean = js.native
    /**
      * Sets this Circle to be empty with a radius of zero.
      * Does not change its position.
      */
    def setEmpty(): Circle = js.native
    /**
      * Sets the position of this Circle.
      * @param x The x position of the center of the circle. Default 0.
      * @param y The y position of the center of the circle. Default 0.
      */
    def setPosition(): Circle = js.native
    def setPosition(x: Double): Circle = js.native
    def setPosition(x: Double, y: Double): Circle = js.native
    /**
      * Sets the x, y and radius of this circle.
      * @param x The x position of the center of the circle. Default 0.
      * @param y The y position of the center of the circle. Default 0.
      * @param radius The radius of the circle. Default 0.
      */
    def setTo(): Circle = js.native
    def setTo(x: Double): Circle = js.native
    def setTo(x: Double, y: Double): Circle = js.native
    def setTo(x: Double, y: Double, radius: Double): Circle = js.native
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
  class Ellipse () extends js.Object {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    /**
      * The bottom position of the Ellipse.
      */
    var bottom: Double = js.native
    /**
      * The height of the ellipse.
      */
    var height: Double = js.native
    /**
      * The left position of the Ellipse.
      */
    var left: Double = js.native
    /**
      * The right position of the Ellipse.
      */
    var right: Double = js.native
    /**
      * The top position of the Ellipse.
      */
    var top: Double = js.native
    /**
      * The geometry constant type of this object: `GEOM_CONST.ELLIPSE`.
      * Used for fast type comparisons.
      */
    val `type`: integer = js.native
    /**
      * The width of the ellipse.
      */
    var width: Double = js.native
    /**
      * The x position of the center of the ellipse.
      */
    var x: Double = js.native
    /**
      * The y position of the center of the ellipse.
      */
    var y: Double = js.native
    /**
      * Check to see if the Ellipse contains the given x / y coordinates.
      * @param x The x coordinate to check within the ellipse.
      * @param y The y coordinate to check within the ellipse.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    /**
      * Returns the major radius of the ellipse. Also known as the Semi Major Axis.
      */
    def getMajorRadius(): Double = js.native
    /**
      * Returns the minor radius of the ellipse. Also known as the Semi Minor Axis.
      */
    def getMinorRadius(): Double = js.native
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the ellipse.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    def getPoint[O /* <: Point */](position: Double): O = js.native
    def getPoint[O /* <: Point */](position: Double, out: O): O = js.native
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Ellipse,
      * based on the given quantity or stepRate values.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the ellipse and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def getPoints(quantity: integer): js.Array[Point] = js.native
    def getPoints(quantity: integer, stepRate: Double): js.Array[Point] = js.native
    def getPoints(quantity: integer, stepRate: Double, output: js.Array[_]): js.Array[Point] = js.native
    /**
      * Returns a uniformly distributed random point from anywhere within the given Ellipse.
      * @param point A Point or point-like object to set the random `x` and `y` values in.
      */
    def getRandomPoint[O /* <: Point */](): O = js.native
    def getRandomPoint[O /* <: Point */](point: O): O = js.native
    /**
      * Checks to see if the Ellipse is empty: has a width or height equal to zero.
      */
    def isEmpty(): Boolean = js.native
    /**
      * Sets this Ellipse to be empty with a width and height of zero.
      * Does not change its position.
      */
    def setEmpty(): Ellipse = js.native
    /**
      * Sets the position of this Ellipse.
      * @param x The x position of the center of the ellipse.
      * @param y The y position of the center of the ellipse.
      */
    def setPosition(x: Double, y: Double): Ellipse = js.native
    /**
      * Sets the size of this Ellipse.
      * Does not change its position.
      * @param width The width of the ellipse.
      * @param height The height of the ellipse. Default width.
      */
    def setSize(width: Double): Ellipse = js.native
    def setSize(width: Double, height: Double): Ellipse = js.native
    /**
      * Sets the x, y, width and height of this ellipse.
      * @param x The x position of the center of the ellipse.
      * @param y The y position of the center of the ellipse.
      * @param width The width of the ellipse.
      * @param height The height of the ellipse.
      */
    def setTo(x: Double, y: Double, width: Double, height: Double): Ellipse = js.native
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
  class Line () extends js.Object {
    def this(x1: Double) = this()
    def this(x1: Double, y1: Double) = this()
    def this(x1: Double, y1: Double, x2: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
    /**
      * The bottom position of the Line.
      */
    var bottom: Double = js.native
    /**
      * The left position of the Line.
      */
    var left: Double = js.native
    /**
      * The right position of the Line.
      */
    var right: Double = js.native
    /**
      * The top position of the Line.
      */
    var top: Double = js.native
    /**
      * The geometry constant type of this object: `GEOM_CONST.LINE`.
      * Used for fast type comparisons.
      */
    val `type`: integer = js.native
    /**
      * The x coordinate of the lines starting point.
      */
    var x1: Double = js.native
    /**
      * The x coordinate of the lines ending point.
      */
    var x2: Double = js.native
    /**
      * The y coordinate of the lines starting point.
      */
    var y1: Double = js.native
    /**
      * The y coordinate of the lines ending point.
      */
    var y2: Double = js.native
    /**
      * Get a point on a line that's a given percentage along its length.
      * @param position A value between 0 and 1, where 0 is the start, 0.5 is the middle and 1 is the end of the line.
      * @param output An optional point, or point-like object, to store the coordinates of the point on the line.
      */
    def getPoint[O /* <: Point */](position: Double): O = js.native
    def getPoint[O /* <: Point */](position: Double, output: O): O = js.native
    /**
      * Returns a Vector2 object that corresponds to the start of this Line.
      * @param vec2 A Vector2 object to set the results in. If `undefined` a new Vector2 will be created.
      */
    def getPointA[O /* <: Vector2 */](): O = js.native
    def getPointA[O /* <: Vector2 */](vec2: O): O = js.native
    /**
      * Returns a Vector2 object that corresponds to the end of this Line.
      * @param vec2 A Vector2 object to set the results in. If `undefined` a new Vector2 will be created.
      */
    def getPointB[O /* <: Vector2 */](): O = js.native
    def getPointB[O /* <: Vector2 */](vec2: O): O = js.native
    /**
      * Get a number of points along a line's length.
      * 
      * Provide a `quantity` to get an exact number of points along the line.
      * 
      * Provide a `stepRate` to ensure a specific distance between each point on the line. Set `quantity` to `0` when
      * providing a `stepRate`.
      * @param quantity The number of points to place on the line. Set to `0` to use `stepRate` instead.
      * @param stepRate The distance between each point on the line. When set, `quantity` is implied and should be set to `0`.
      * @param output An optional array of Points, or point-like objects, to store the coordinates of the points on the line.
      */
    def getPoints[O /* <: Point */](quantity: integer): O = js.native
    def getPoints[O /* <: Point */](quantity: integer, stepRate: integer): O = js.native
    def getPoints[O /* <: Point */](quantity: integer, stepRate: integer, output: O): O = js.native
    /**
      * Get a random Point on the Line.
      * @param point An instance of a Point to be modified.
      */
    def getRandomPoint[O /* <: Point */](): O = js.native
    def getRandomPoint[O /* <: Point */](point: O): O = js.native
    /**
      * Set new coordinates for the line endpoints.
      * @param x1 The x coordinate of the lines starting point. Default 0.
      * @param y1 The y coordinate of the lines starting point. Default 0.
      * @param x2 The x coordinate of the lines ending point. Default 0.
      * @param y2 The y coordinate of the lines ending point. Default 0.
      */
    def setTo(): Line = js.native
    def setTo(x1: Double): Line = js.native
    def setTo(x1: Double, y1: Double): Line = js.native
    def setTo(x1: Double, y1: Double, x2: Double): Line = js.native
    def setTo(x1: Double, y1: Double, x2: Double, y2: Double): Line = js.native
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
  class Point () extends js.Object {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    /**
      * The geometry constant type of this object: `GEOM_CONST.POINT`.
      * Used for fast type comparisons.
      */
    val `type`: integer = js.native
    /**
      * The x coordinate of this Point.
      */
    var x: Double = js.native
    /**
      * The y coordinate of this Point.
      */
    var y: Double = js.native
    /**
      * Set the x and y coordinates of the point to the given values.
      * @param x The x coordinate of this Point. Default 0.
      * @param y The y coordinate of this Point. Default x.
      */
    def setTo(): Point = js.native
    def setTo(x: Double): Point = js.native
    def setTo(x: Double, y: Double): Point = js.native
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
  class Polygon () extends js.Object {
    def this(points: js.Array[Point]) = this()
    /**
      * The area of this Polygon.
      */
    var area: Double = js.native
    /**
      * An array of number pair objects that make up this polygon. I.e. [ {x,y}, {x,y}, {x,y} ]
      */
    var points: js.Array[Point] = js.native
    /**
      * The geometry constant type of this object: `GEOM_CONST.POLYGON`.
      * Used for fast type comparisons.
      */
    val `type`: integer = js.native
    /**
      * Calculates the area of the Polygon. This is available in the property Polygon.area
      */
    def calculateArea(): Double = js.native
    /**
      * Check to see if the Polygon contains the given x / y coordinates.
      * @param x The x coordinate to check within the polygon.
      * @param y The y coordinate to check within the polygon.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    /**
      * Returns an array of Point objects containing the coordinates of the points around the perimeter of the Polygon,
      * based on the given quantity or stepRate values.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the perimeter of the Polygon and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def getPoints(quantity: integer): js.Array[Point] = js.native
    def getPoints(quantity: integer, stepRate: Double): js.Array[Point] = js.native
    def getPoints(quantity: integer, stepRate: Double, output: js.Array[_]): js.Array[Point] = js.native
    /**
      * Sets this Polygon to the given points.
      * 
      * The points can be set from a variety of formats:
      * 
      * - A string containing paired values separated by a single space: `'40 0 40 20 100 20 100 80 40 80 40 100 0 50'`
      * - An array of Point objects: `[new Phaser.Point(x1, y1), ...]`
      * - An array of objects with public x/y properties: `[obj1, obj2, ...]`
      * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
      * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
      * 
      * `setTo` may also be called without any arguments to remove all points.
      * @param points Points defining the perimeter of this polygon. Please check function description above for the different supported formats.
      */
    def setTo(points: js.Array[_]): Polygon = js.native
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
  class Rectangle () extends js.Object {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    /**
      * The sum of the y and height properties.
      * Changing the bottom property of a Rectangle object has no effect on the x, y and width properties, but does change the height property.
      */
    var bottom: Double = js.native
    /**
      * The x coordinate of the center of the Rectangle.
      */
    var centerX: Double = js.native
    /**
      * The y coordinate of the center of the Rectangle.
      */
    var centerY: Double = js.native
    /**
      * The height of the Rectangle, i.e. the distance between its top side (defined by `y`) and its bottom side.
      */
    var height: Double = js.native
    /**
      * The x coordinate of the left of the Rectangle.
      * Changing the left property of a Rectangle object has no effect on the y and height properties. However it does affect the width property, whereas changing the x value does not affect the width property.
      */
    var left: Double = js.native
    /**
      * The sum of the x and width properties.
      * Changing the right property of a Rectangle object has no effect on the x, y and height properties, however it does affect the width property.
      */
    var right: Double = js.native
    /**
      * The y coordinate of the top of the Rectangle. Changing the top property of a Rectangle object has no effect on the x and width properties.
      * However it does affect the height property, whereas changing the y value does not affect the height property.
      */
    var top: Double = js.native
    /**
      * The geometry constant type of this object: `GEOM_CONST.RECTANGLE`.
      * Used for fast type comparisons.
      */
    val `type`: integer = js.native
    /**
      * The width of the Rectangle, i.e. the distance between its left side (defined by `x`) and its right side.
      */
    var width: Double = js.native
    /**
      * The X coordinate of the top left corner of the Rectangle.
      */
    var x: Double = js.native
    /**
      * The Y coordinate of the top left corner of the Rectangle.
      */
    var y: Double = js.native
    /**
      * Checks if the given point is inside the Rectangle's bounds.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    /**
      * Returns a Line object that corresponds to the top of this Rectangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineA[O /* <: Line */](): O = js.native
    def getLineA[O /* <: Line */](line: O): O = js.native
    /**
      * Returns a Line object that corresponds to the right of this Rectangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineB[O /* <: Line */](): O = js.native
    def getLineB[O /* <: Line */](line: O): O = js.native
    /**
      * Returns a Line object that corresponds to the bottom of this Rectangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineC[O /* <: Line */](): O = js.native
    def getLineC[O /* <: Line */](line: O): O = js.native
    /**
      * Returns a Line object that corresponds to the left of this Rectangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineD[O /* <: Line */](): O = js.native
    def getLineD[O /* <: Line */](line: O): O = js.native
    /**
      * Calculates the coordinates of a point at a certain `position` on the Rectangle's perimeter.
      * 
      * The `position` is a fraction between 0 and 1 which defines how far into the perimeter the point is.
      * 
      * A value of 0 or 1 returns the point at the top left corner of the rectangle, while a value of 0.5 returns the point at the bottom right corner of the rectangle. Values between 0 and 0.5 are on the top or the right side and values between 0.5 and 1 are on the bottom or the left side.
      * @param position The normalized distance into the Rectangle's perimeter to return.
      * @param output An object to update with the `x` and `y` coordinates of the point.
      */
    def getPoint[O /* <: Point */](position: Double): O = js.native
    def getPoint[O /* <: Point */](position: Double, output: O): O = js.native
    /**
      * Returns an array of points from the perimeter of the Rectangle, each spaced out based on the quantity or step required.
      * @param quantity The number of points to return. Set to `false` or 0 to return an arbitrary number of points (`perimeter / stepRate`) evenly spaced around the Rectangle based on the `stepRate`.
      * @param stepRate If `quantity` is 0, determines the normalized distance between each returned point.
      * @param output An array to which to append the points.
      */
    def getPoints[O /* <: js.Array[Point] */](quantity: integer): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: integer, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: integer, stepRate: Double, output: O): O = js.native
    /**
      * Returns a random point within the Rectangle's bounds.
      * @param point The object in which to store the `x` and `y` coordinates of the point.
      */
    def getRandomPoint[O /* <: Point */](): O = js.native
    def getRandomPoint[O /* <: Point */](point: O): O = js.native
    /**
      * Determines if the Rectangle is empty. A Rectangle is empty if its width or height is less than or equal to 0.
      */
    def isEmpty(): Boolean = js.native
    /**
      * Resets the position, width, and height of the Rectangle to 0.
      */
    def setEmpty(): Rectangle = js.native
    /**
      * Sets the position of the Rectangle.
      * @param x The X coordinate of the top left corner of the Rectangle.
      * @param y The Y coordinate of the top left corner of the Rectangle. Default x.
      */
    def setPosition(x: Double): Rectangle = js.native
    def setPosition(x: Double, y: Double): Rectangle = js.native
    /**
      * Sets the width and height of the Rectangle.
      * @param width The width to set the Rectangle to.
      * @param height The height to set the Rectangle to. Default width.
      */
    def setSize(width: Double): Rectangle = js.native
    def setSize(width: Double, height: Double): Rectangle = js.native
    /**
      * Sets the position, width, and height of the Rectangle.
      * @param x The X coordinate of the top left corner of the Rectangle.
      * @param y The Y coordinate of the top left corner of the Rectangle.
      * @param width The width of the Rectangle.
      * @param height The height of the Rectangle.
      */
    def setTo(x: Double, y: Double, width: Double, height: Double): Rectangle = js.native
  }
  
  /**
    * A triangle is a plane created by connecting three points.
    * The first two arguments specify the first point, the middle two arguments
    * specify the second point, and the last two arguments specify the third point.
    */
  @js.native
  class Triangle protected () extends js.Object {
    /**
      * 
      * @param x1 `x` coordinate of the first point. Default 0.
      * @param y1 `y` coordinate of the first point. Default 0.
      * @param x2 `x` coordinate of the second point. Default 0.
      * @param y2 `y` coordinate of the second point. Default 0.
      * @param x3 `x` coordinate of the third point. Default 0.
      * @param y3 `y` coordinate of the third point. Default 0.
      */
    def this(
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x2: js.UndefOr[Double],
      y2: js.UndefOr[Double],
      x3: js.UndefOr[Double],
      y3: js.UndefOr[Double]
    ) = this()
    /**
      * Bottom most Y coordinate of the triangle. Setting it moves the triangle on the Y axis accordingly.
      */
    var bottom: Double = js.native
    /**
      * Left most X coordinate of the triangle. Setting it moves the triangle on the X axis accordingly.
      */
    var left: Double = js.native
    /**
      * Right most X coordinate of the triangle. Setting it moves the triangle on the X axis accordingly.
      */
    var right: Double = js.native
    /**
      * Top most Y coordinate of the triangle. Setting it moves the triangle on the Y axis accordingly.
      */
    var top: Double = js.native
    /**
      * The geometry constant type of this object: `GEOM_CONST.TRIANGLE`.
      * Used for fast type comparisons.
      */
    val `type`: integer = js.native
    /**
      * `x` coordinate of the first point.
      */
    var x1: Double = js.native
    /**
      * `x` coordinate of the second point.
      */
    var x2: Double = js.native
    /**
      * `x` coordinate of the third point.
      */
    var x3: Double = js.native
    /**
      * `y` coordinate of the first point.
      */
    var y1: Double = js.native
    /**
      * `y` coordinate of the second point.
      */
    var y2: Double = js.native
    /**
      * `y` coordinate of the third point.
      */
    var y3: Double = js.native
    /**
      * Checks whether a given points lies within the triangle.
      * @param x The x coordinate of the point to check.
      * @param y The y coordinate of the point to check.
      */
    def contains(x: Double, y: Double): Boolean = js.native
    /**
      * Returns a Line object that corresponds to Line A of this Triangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineA[O /* <: Line */](): O = js.native
    def getLineA[O /* <: Line */](line: O): O = js.native
    /**
      * Returns a Line object that corresponds to Line B of this Triangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineB[O /* <: Line */](): O = js.native
    def getLineB[O /* <: Line */](line: O): O = js.native
    /**
      * Returns a Line object that corresponds to Line C of this Triangle.
      * @param line A Line object to set the results in. If `undefined` a new Line will be created.
      */
    def getLineC[O /* <: Line */](): O = js.native
    def getLineC[O /* <: Line */](line: O): O = js.native
    /**
      * Returns a specific point  on the triangle.
      * @param position Position as float within `0` and `1`. `0` equals the first point.
      * @param output Optional Point, or point-like object, that the calculated point will be written to.
      */
    def getPoint[O /* <: Point */](position: Double): O = js.native
    def getPoint[O /* <: Point */](position: Double, output: O): O = js.native
    /**
      * Calculates a list of evenly distributed points on the triangle. It is either possible to pass an amount of points to be generated (`quantity`) or the distance between two points (`stepRate`).
      * @param quantity Number of points to be generated. Can be falsey when `stepRate` should be used. All points have the same distance along the triangle.
      * @param stepRate Distance between two points. Will only be used when `quantity` is falsey.
      * @param output Optional Array for writing the calculated points into. Otherwise a new array will be created.
      */
    def getPoints[O /* <: js.Array[Point] */](quantity: integer): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: integer, stepRate: Double): O = js.native
    def getPoints[O /* <: js.Array[Point] */](quantity: integer, stepRate: Double, output: O): O = js.native
    /**
      * Returns a random point along the triangle.
      * @param point Optional `Point` that should be modified. Otherwise a new one will be created.
      */
    def getRandomPoint[O /* <: Point */](): O = js.native
    def getRandomPoint[O /* <: Point */](point: O): O = js.native
    /**
      * Sets all three points of the triangle. Leaving out any coordinate sets it to be `0`.
      * @param x1 `x` coordinate of the first point. Default 0.
      * @param y1 `y` coordinate of the first point. Default 0.
      * @param x2 `x` coordinate of the second point. Default 0.
      * @param y2 `y` coordinate of the second point. Default 0.
      * @param x3 `x` coordinate of the third point. Default 0.
      * @param y3 `y` coordinate of the third point. Default 0.
      */
    def setTo(
      x1: js.UndefOr[Double],
      y1: js.UndefOr[Double],
      x2: js.UndefOr[Double],
      y2: js.UndefOr[Double],
      x3: js.UndefOr[Double],
      y3: js.UndefOr[Double]
    ): Triangle = js.native
  }
  
  /**
    * A Circle Geometry object type.
    */
  var CIRCLE: integer = js.native
  /**
    * An Ellipse Geometry object type.
    */
  var ELLIPSE: integer = js.native
  /**
    * A Line Geometry object type.
    */
  var LINE: integer = js.native
  /**
    * A Point Geometry object type.
    */
  var POINT: integer = js.native
  /**
    * A Polygon Geometry object type.
    */
  var POLYGON: integer = js.native
  /**
    * A Rectangle Geometry object type.
    */
  var RECTANGLE: integer = js.native
  /**
    * A Triangle Geometry object type.
    */
  var TRIANGLE: integer = js.native
  /* static members */
  @js.native
  object Circle extends js.Object {
    /**
      * Calculates the area of the circle.
      * @param circle The Circle to get the area of.
      */
    def Area(circle: Circle): Double = js.native
    /**
      * Returns the circumference of the given Circle.
      * @param circle The Circle to get the circumference of.
      */
    def Circumference(circle: Circle): Double = js.native
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle based on the given angle.
      * @param circle The Circle to get the circumference point on.
      * @param angle The angle from the center of the Circle to the circumference to return the point from. Given in radians.
      * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
      */
    def CircumferencePoint[O /* <: Point */](circle: Circle, angle: Double): O = js.native
    def CircumferencePoint[O /* <: Point */](circle: Circle, angle: Double, out: O): O = js.native
    def Clone(source: js.Object): Circle = js.native
    /**
      * Creates a new Circle instance based on the values contained in the given source.
      * @param source The Circle to be cloned. Can be an instance of a Circle or a circle-like object, with x, y and radius properties.
      */
    def Clone(source: Circle): Circle = js.native
    /**
      * Check to see if the Circle contains the given x / y coordinates.
      * @param circle The Circle to check.
      * @param x The x coordinate to check within the circle.
      * @param y The y coordinate to check within the circle.
      */
    def Contains(circle: Circle, x: Double, y: Double): Boolean = js.native
    def ContainsPoint(circle: Circle, point: js.Object): Boolean = js.native
    /**
      * Check to see if the Circle contains the given Point object.
      * @param circle The Circle to check.
      * @param point The Point object to check if it's within the Circle or not.
      */
    def ContainsPoint(circle: Circle, point: Point): Boolean = js.native
    def ContainsRect(circle: Circle, rect: js.Object): Boolean = js.native
    /**
      * Check to see if the Circle contains all four points of the given Rectangle object.
      * @param circle The Circle to check.
      * @param rect The Rectangle object to check if it's within the Circle or not.
      */
    def ContainsRect(circle: Circle, rect: Rectangle): Boolean = js.native
    /**
      * Copies the `x`, `y` and `radius` properties from the `source` Circle
      * into the given `dest` Circle, then returns the `dest` Circle.
      * @param source The source Circle to copy the values from.
      * @param dest The destination Circle to copy the values to.
      */
    def CopyFrom[O /* <: Circle */](source: Circle, dest: O): O = js.native
    /**
      * Compares the `x`, `y` and `radius` properties of the two given Circles.
      * Returns `true` if they all match, otherwise returns `false`.
      * @param circle The first Circle to compare.
      * @param toCompare The second Circle to compare.
      */
    def Equals(circle: Circle, toCompare: Circle): Boolean = js.native
    /**
      * Returns the bounds of the Circle object.
      * @param circle The Circle to get the bounds from.
      * @param out A Rectangle, or rectangle-like object, to store the circle bounds in. If not given a new Rectangle will be created.
      */
    def GetBounds[O /* <: Rectangle */](circle: Circle): O = js.native
    def GetBounds[O /* <: Rectangle */](circle: Circle, out: O): O = js.native
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param circle The Circle to get the circumference point on.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the circle.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    def GetPoint[O /* <: Point */](circle: Circle, position: Double): O = js.native
    def GetPoint[O /* <: Point */](circle: Circle, position: Double, out: O): O = js.native
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Circle,
      * based on the given quantity or stepRate values.
      * @param circle The Circle to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the circle and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def GetPoints(circle: Circle, quantity: integer): js.Array[Point] = js.native
    def GetPoints(circle: Circle, quantity: integer, stepRate: Double): js.Array[Point] = js.native
    def GetPoints(circle: Circle, quantity: integer, stepRate: Double, output: js.Array[_]): js.Array[Point] = js.native
    /**
      * Offsets the Circle by the values given.
      * @param circle The Circle to be offset (translated.)
      * @param x The amount to horizontally offset the Circle by.
      * @param y The amount to vertically offset the Circle by.
      */
    def Offset[O /* <: Circle */](circle: O, x: Double, y: Double): O = js.native
    def OffsetPoint[O /* <: Circle */](circle: O, point: js.Object): O = js.native
    /**
      * Offsets the Circle by the values given in the `x` and `y` properties of the Point object.
      * @param circle The Circle to be offset (translated.)
      * @param point The Point object containing the values to offset the Circle by.
      */
    def OffsetPoint[O /* <: Circle */](circle: O, point: Point): O = js.native
    /**
      * Returns a uniformly distributed random point from anywhere within the given Circle.
      * @param circle The Circle to get a random point from.
      * @param out A Point or point-like object to set the random `x` and `y` values in.
      */
    def Random[O /* <: Point */](circle: Circle): O = js.native
    def Random[O /* <: Point */](circle: Circle, out: O): O = js.native
  }
  
  /* static members */
  @js.native
  object Ellipse extends js.Object {
    /**
      * Calculates the area of the Ellipse.
      * @param ellipse The Ellipse to get the area of.
      */
    def Area(ellipse: Ellipse): Double = js.native
    /**
      * Returns the circumference of the given Ellipse.
      * @param ellipse The Ellipse to get the circumference of.
      */
    def Circumference(ellipse: Ellipse): Double = js.native
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse based on the given angle.
      * @param ellipse The Ellipse to get the circumference point on.
      * @param angle The angle from the center of the Ellipse to the circumference to return the point from. Given in radians.
      * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
      */
    def CircumferencePoint[O /* <: Point */](ellipse: Ellipse, angle: Double): O = js.native
    def CircumferencePoint[O /* <: Point */](ellipse: Ellipse, angle: Double, out: O): O = js.native
    /**
      * Creates a new Ellipse instance based on the values contained in the given source.
      * @param source The Ellipse to be cloned. Can be an instance of an Ellipse or a ellipse-like object, with x, y, width and height properties.
      */
    def Clone(source: Ellipse): Ellipse = js.native
    /**
      * Check to see if the Ellipse contains the given x / y coordinates.
      * @param ellipse The Ellipse to check.
      * @param x The x coordinate to check within the ellipse.
      * @param y The y coordinate to check within the ellipse.
      */
    def Contains(ellipse: Ellipse, x: Double, y: Double): Boolean = js.native
    def ContainsPoint(ellipse: Ellipse, point: js.Object): Boolean = js.native
    /**
      * Check to see if the Ellipse contains the given Point object.
      * @param ellipse The Ellipse to check.
      * @param point The Point object to check if it's within the Circle or not.
      */
    def ContainsPoint(ellipse: Ellipse, point: Point): Boolean = js.native
    def ContainsRect(ellipse: Ellipse, rect: js.Object): Boolean = js.native
    /**
      * Check to see if the Ellipse contains all four points of the given Rectangle object.
      * @param ellipse The Ellipse to check.
      * @param rect The Rectangle object to check if it's within the Ellipse or not.
      */
    def ContainsRect(ellipse: Ellipse, rect: Rectangle): Boolean = js.native
    /**
      * Copies the `x`, `y`, `width` and `height` properties from the `source` Ellipse
      * into the given `dest` Ellipse, then returns the `dest` Ellipse.
      * @param source The source Ellipse to copy the values from.
      * @param dest The destination Ellipse to copy the values to.
      */
    def CopyFrom[O /* <: Ellipse */](source: Ellipse, dest: O): O = js.native
    /**
      * Compares the `x`, `y`, `width` and `height` properties of the two given Ellipses.
      * Returns `true` if they all match, otherwise returns `false`.
      * @param ellipse The first Ellipse to compare.
      * @param toCompare The second Ellipse to compare.
      */
    def Equals(ellipse: Ellipse, toCompare: Ellipse): Boolean = js.native
    /**
      * Returns the bounds of the Ellipse object.
      * @param ellipse The Ellipse to get the bounds from.
      * @param out A Rectangle, or rectangle-like object, to store the ellipse bounds in. If not given a new Rectangle will be created.
      */
    def GetBounds[O /* <: Rectangle */](ellipse: Ellipse): O = js.native
    def GetBounds[O /* <: Rectangle */](ellipse: Ellipse, out: O): O = js.native
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param ellipse The Ellipse to get the circumference point on.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the ellipse.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    def GetPoint[O /* <: Point */](ellipse: Ellipse, position: Double): O = js.native
    def GetPoint[O /* <: Point */](ellipse: Ellipse, position: Double, out: O): O = js.native
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Ellipse,
      * based on the given quantity or stepRate values.
      * @param ellipse The Ellipse to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the ellipse and dividing it by the stepRate.
      * @param out An array to insert the points in to. If not provided a new array will be created.
      */
    def GetPoints[O /* <: js.Array[Point] */](ellipse: Ellipse, quantity: integer): O = js.native
    def GetPoints[O /* <: js.Array[Point] */](ellipse: Ellipse, quantity: integer, stepRate: Double): O = js.native
    def GetPoints[O /* <: js.Array[Point] */](ellipse: Ellipse, quantity: integer, stepRate: Double, out: O): O = js.native
    /**
      * Offsets the Ellipse by the values given.
      * @param ellipse The Ellipse to be offset (translated.)
      * @param x The amount to horizontally offset the Ellipse by.
      * @param y The amount to vertically offset the Ellipse by.
      */
    def Offset[O /* <: Ellipse */](ellipse: O, x: Double, y: Double): O = js.native
    def OffsetPoint[O /* <: Ellipse */](ellipse: O, point: js.Object): O = js.native
    /**
      * Offsets the Ellipse by the values given in the `x` and `y` properties of the Point object.
      * @param ellipse The Ellipse to be offset (translated.)
      * @param point The Point object containing the values to offset the Ellipse by.
      */
    def OffsetPoint[O /* <: Ellipse */](ellipse: O, point: Point): O = js.native
    /**
      * Returns a uniformly distributed random point from anywhere within the given Ellipse.
      * @param ellipse The Ellipse to get a random point from.
      * @param out A Point or point-like object to set the random `x` and `y` values in.
      */
    def Random[O /* <: Point */](ellipse: Ellipse): O = js.native
    def Random[O /* <: Point */](ellipse: Ellipse, out: O): O = js.native
  }
  
  @js.native
  object Intersects extends js.Object {
    /**
      * Checks if two Circles intersect.
      * @param circleA The first Circle to check for intersection.
      * @param circleB The second Circle to check for intersection.
      */
    def CircleToCircle(circleA: Circle, circleB: Circle): Boolean = js.native
    /**
      * Checks for intersection between a circle and a rectangle.
      * @param circle The circle to be checked.
      * @param rect The rectangle to be checked.
      */
    def CircleToRectangle(circle: Circle, rect: Rectangle): Boolean = js.native
    /**
      * Checks if two Circles intersect and returns the intersection points as a Point object array.
      * @param circleA The first Circle to check for intersection.
      * @param circleB The second Circle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetCircleToCircle(circleA: Circle, circleB: Circle): js.Array[_] = js.native
    def GetCircleToCircle(circleA: Circle, circleB: Circle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks for intersection between a circle and a rectangle,
      * and returns the intersection points as a Point object array.
      * @param circle The circle to be checked.
      * @param rect The rectangle to be checked.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetCircleToRectangle(circle: Circle, rect: Rectangle): js.Array[_] = js.native
    def GetCircleToRectangle(circle: Circle, rect: Rectangle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks for intersection between the line segment and circle,
      * and returns the intersection points as a Point object array.
      * @param line The line segment to check.
      * @param circle The circle to check against the line.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetLineToCircle(line: Line, circle: Circle): js.Array[_] = js.native
    def GetLineToCircle(line: Line, circle: Circle, out: js.Array[_]): js.Array[_] = js.native
    def GetLineToRectangle(line: Line, rect: js.Object): js.Array[_] = js.native
    def GetLineToRectangle(line: Line, rect: js.Object, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks for intersection between the Line and a Rectangle shape,
      * and returns the intersection points as a Point object array.
      * @param line The Line to check for intersection.
      * @param rect The Rectangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetLineToRectangle(line: Line, rect: Rectangle): js.Array[_] = js.native
    def GetLineToRectangle(line: Line, rect: Rectangle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks if two Rectangle shapes intersect and returns the area of this intersection as Rectangle object.
      * 
      * If optional `output` parameter is omitted, new Rectangle object is created and returned. If there is intersection, it will contain intersection area. If there is no intersection, it wil be empty Rectangle (all values set to zero).
      * 
      * If Rectangle object is passed as `output` and there is intersection, then intersection area data will be loaded into it and it will be returned. If there is no intersection, it will be returned without any change.
      * @param rectA The first Rectangle object.
      * @param rectB The second Rectangle object.
      * @param output Optional Rectangle object. If given, the intersection data will be loaded into it (in case of no intersection, it will be left unchanged). Otherwise, new Rectangle object will be created and returned with either intersection data or empty (all values set to zero), if there is no intersection.
      */
    def GetRectangleIntersection[O /* <: Rectangle */](rectA: Rectangle, rectB: Rectangle): O = js.native
    def GetRectangleIntersection[O /* <: Rectangle */](rectA: Rectangle, rectB: Rectangle, output: O): O = js.native
    /**
      * Checks if two Rectangles intersect and returns the intersection points as a Point object array.
      * 
      * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds. As such, the two Rectangles are considered "solid". A Rectangle with no width or no height will never intersect another Rectangle.
      * @param rectA The first Rectangle to check for intersection.
      * @param rectB The second Rectangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetRectangleToRectangle(rectA: Rectangle, rectB: Rectangle): js.Array[_] = js.native
    def GetRectangleToRectangle(rectA: Rectangle, rectB: Rectangle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks for intersection between Rectangle shape and Triangle shape,
      * and returns the intersection points as a Point object array.
      * @param rect Rectangle object to test.
      * @param triangle Triangle object to test.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetRectangleToTriangle(rect: Rectangle, triangle: Triangle): js.Array[_] = js.native
    def GetRectangleToTriangle(rect: Rectangle, triangle: Triangle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks if a Triangle and a Circle intersect, and returns the intersection points as a Point object array.
      * 
      * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
      * @param triangle The Triangle to check for intersection.
      * @param circle The Circle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetTriangleToCircle(triangle: Triangle, circle: Circle): js.Array[_] = js.native
    def GetTriangleToCircle(triangle: Triangle, circle: Circle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks if a Triangle and a Line intersect, and returns the intersection points as a Point object array.
      * 
      * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
      * @param triangle The Triangle to check with.
      * @param line The Line to check with.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetTriangleToLine(triangle: Triangle, line: Line): js.Array[_] = js.native
    def GetTriangleToLine(triangle: Triangle, line: Line, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks if two Triangles intersect, and returns the intersection points as a Point object array.
      * 
      * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
      * @param triangleA The first Triangle to check for intersection.
      * @param triangleB The second Triangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetTriangleToTriangle(triangleA: Triangle, triangleB: Triangle): js.Array[_] = js.native
    def GetTriangleToTriangle(triangleA: Triangle, triangleB: Triangle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks for intersection between the line segment and circle.
      * 
      * Based on code by [Matt DesLauriers](https://github.com/mattdesl/line-circle-collision/blob/master/LICENSE.md).
      * @param line The line segment to check.
      * @param circle The circle to check against the line.
      * @param nearest An optional Point-like object. If given the closest point on the Line where the circle intersects will be stored in this object.
      */
    def LineToCircle(line: Line, circle: Circle): Boolean = js.native
    def LineToCircle(line: Line, circle: Circle, nearest: js.Any): Boolean = js.native
    def LineToCircle(line: Line, circle: Circle, nearest: Point): Boolean = js.native
    /**
      * Checks if two Lines intersect. If the Lines are identical, they will be treated as parallel and thus non-intersecting.
      * @param line1 The first Line to check.
      * @param line2 The second Line to check.
      * @param out A Point in which to optionally store the point of intersection.
      */
    def LineToLine(line1: Line, line2: Line): Boolean = js.native
    def LineToLine(line1: Line, line2: Line, out: Point): Boolean = js.native
    def LineToRectangle(line: Line, rect: js.Object): Boolean = js.native
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
    def LineToRectangle(line: Line, rect: Rectangle): Boolean = js.native
    def PointToLine(point: js.Any, line: Line): Boolean = js.native
    def PointToLine(point: js.Any, line: Line, lineThickness: Double): Boolean = js.native
    /**
      * Checks if the a Point falls between the two end-points of a Line, based on the given line thickness.
      * 
      * Assumes that the line end points are circular, not square.
      * @param point The point, or point-like object to check.
      * @param line The line segment to test for intersection on.
      * @param lineThickness The line thickness. Assumes that the line end points are circular. Default 1.
      */
    def PointToLine(point: Point, line: Line): Boolean = js.native
    def PointToLine(point: Point, line: Line, lineThickness: Double): Boolean = js.native
    /**
      * Checks if a Point is located on the given line segment.
      * @param point The Point to check for intersection.
      * @param line The line segment to check for intersection.
      */
    def PointToLineSegment(point: Point, line: Line): Boolean = js.native
    /**
      * Checks if two Rectangles intersect.
      * 
      * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds.
      * As such, the two Rectangles are considered "solid".
      * A Rectangle with no width or no height will never intersect another Rectangle.
      * @param rectA The first Rectangle to check for intersection.
      * @param rectB The second Rectangle to check for intersection.
      */
    def RectangleToRectangle(rectA: Rectangle, rectB: Rectangle): Boolean = js.native
    /**
      * Checks for intersection between Rectangle shape and Triangle shape.
      * @param rect Rectangle object to test.
      * @param triangle Triangle object to test.
      */
    def RectangleToTriangle(rect: Rectangle, triangle: Triangle): Boolean = js.native
    /**
      * Check if rectangle intersects with values.
      * @param rect The rectangle object
      * @param left The x coordinate of the left of the Rectangle.
      * @param right The x coordinate of the right of the Rectangle.
      * @param top The y coordinate of the top of the Rectangle.
      * @param bottom The y coordinate of the bottom of the Rectangle.
      * @param tolerance Tolerance allowed in the calculation, expressed in pixels. Default 0.
      */
    def RectangleToValues(rect: Rectangle, left: Double, right: Double, top: Double, bottom: Double): Boolean = js.native
    def RectangleToValues(rect: Rectangle, left: Double, right: Double, top: Double, bottom: Double, tolerance: Double): Boolean = js.native
    /**
      * Checks if a Triangle and a Circle intersect.
      * 
      * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
      * @param triangle The Triangle to check for intersection.
      * @param circle The Circle to check for intersection.
      */
    def TriangleToCircle(triangle: Triangle, circle: Circle): Boolean = js.native
    /**
      * Checks if a Triangle and a Line intersect.
      * 
      * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
      * @param triangle The Triangle to check with.
      * @param line The Line to check with.
      */
    def TriangleToLine(triangle: Triangle, line: Line): Boolean = js.native
    /**
      * Checks if two Triangles intersect.
      * 
      * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
      * @param triangleA The first Triangle to check for intersection.
      * @param triangleB The second Triangle to check for intersection.
      */
    def TriangleToTriangle(triangleA: Triangle, triangleB: Triangle): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Line extends js.Object {
    /**
      * Calculate the angle of the line in radians.
      * @param line The line to calculate the angle of.
      */
    def Angle(line: Line): Double = js.native
    /**
      * Using Bresenham's line algorithm this will return an array of all coordinates on this line.
      * 
      * The `start` and `end` points are rounded before this runs as the algorithm works on integers.
      * @param line The line.
      * @param stepRate The optional step rate for the points on the line. Default 1.
      * @param results An optional array to push the resulting coordinates into.
      */
    def BresenhamPoints(line: Line): js.Array[js.Object] = js.native
    def BresenhamPoints(line: Line, stepRate: integer): js.Array[js.Object] = js.native
    def BresenhamPoints(line: Line, stepRate: integer, results: js.Array[_]): js.Array[js.Object] = js.native
    /**
      * Center a line on the given coordinates.
      * @param line The line to center.
      * @param x The horizontal coordinate to center the line on.
      * @param y The vertical coordinate to center the line on.
      */
    def CenterOn(line: Line, x: Double, y: Double): Line = js.native
    /**
      * Clone the given line.
      * @param source The source line to clone.
      */
    def Clone(source: Line): Line = js.native
    /**
      * Copy the values of one line to a destination line.
      * @param source The source line to copy the values from.
      * @param dest The destination line to copy the values to.
      */
    def CopyFrom[O /* <: Line */](source: Line, dest: O): O = js.native
    /**
      * Compare two lines for strict equality.
      * @param line The first line to compare.
      * @param toCompare The second line to compare.
      */
    def Equals(line: Line, toCompare: Line): Boolean = js.native
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
    def Extend(line: Line, left: Double): Line = js.native
    def Extend(line: Line, left: Double, right: Double): Line = js.native
    /**
      * Get the midpoint of the given line.
      * @param line The line to get the midpoint of.
      * @param out An optional point object to store the midpoint in.
      */
    def GetMidPoint[O /* <: Point */](line: Line): O = js.native
    def GetMidPoint[O /* <: Point */](line: Line, out: O): O = js.native
    def GetNearestPoint[O /* <: Point */](line: Line, point: js.Object): O = js.native
    def GetNearestPoint[O /* <: Point */](line: Line, point: js.Object, out: O): O = js.native
    /**
      * Get the nearest point on a line perpendicular to the given point.
      * @param line The line to get the nearest point on.
      * @param point The point to get the nearest point to.
      * @param out An optional point, or point-like object, to store the coordinates of the nearest point on the line.
      */
    def GetNearestPoint[O /* <: Point */](line: Line, point: Point): O = js.native
    def GetNearestPoint[O /* <: Point */](line: Line, point: Point, out: O): O = js.native
    /**
      * Calculate the normal of the given line.
      * 
      * The normal of a line is a vector that points perpendicular from it.
      * @param line The line to calculate the normal of.
      * @param out An optional point object to store the normal in.
      */
    def GetNormal[O /* <: Point */](line: Line): O = js.native
    def GetNormal[O /* <: Point */](line: Line, out: O): O = js.native
    /**
      * Get a point on a line that's a given percentage along its length.
      * @param line The line.
      * @param position A value between 0 and 1, where 0 is the start, 0.5 is the middle and 1 is the end of the line.
      * @param out An optional point, or point-like object, to store the coordinates of the point on the line.
      */
    def GetPoint[O /* <: Point */](line: Line, position: Double): O = js.native
    def GetPoint[O /* <: Point */](line: Line, position: Double, out: O): O = js.native
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
    def GetPoints[O /* <: js.Array[Point] */](line: Line, quantity: integer): O = js.native
    def GetPoints[O /* <: js.Array[Point] */](line: Line, quantity: integer, stepRate: Double): O = js.native
    def GetPoints[O /* <: js.Array[Point] */](line: Line, quantity: integer, stepRate: Double, out: O): O = js.native
    def GetShortestDistance[O /* <: Point */](line: Line, point: js.Object): O = js.native
    /**
      * Get the shortest distance from a Line to the given Point.
      * @param line The line to get the distance from.
      * @param point The point to get the shortest distance to.
      */
    def GetShortestDistance[O /* <: Point */](line: Line, point: Point): O = js.native
    /**
      * Calculate the height of the given line.
      * @param line The line to calculate the height of.
      */
    def Height(line: Line): Double = js.native
    /**
      * Calculate the length of the given line.
      * @param line The line to calculate the length of.
      */
    def Length(line: Line): Double = js.native
    /**
      * Get the angle of the normal of the given line in radians.
      * @param line The line to calculate the angle of the normal of.
      */
    def NormalAngle(line: Line): Double = js.native
    /**
      * [description]
      * @param line The Line object to get the normal value from.
      */
    def NormalX(line: Line): Double = js.native
    /**
      * The Y value of the normal of the given line.
      * The normal of a line is a vector that points perpendicular from it.
      * @param line The line to calculate the normal of.
      */
    def NormalY(line: Line): Double = js.native
    /**
      * Offset a line by the given amount.
      * @param line The line to offset.
      * @param x The horizontal offset to add to the line.
      * @param y The vertical offset to add to the line.
      */
    def Offset[O /* <: Line */](line: O, x: Double, y: Double): O = js.native
    /**
      * Calculate the perpendicular slope of the given line.
      * @param line The line to calculate the perpendicular slope of.
      */
    def PerpSlope(line: Line): Double = js.native
    /**
      * Returns a random point on a given Line.
      * @param line The Line to calculate the random Point on.
      * @param out An instance of a Point to be modified.
      */
    def Random[O /* <: Point */](line: Line): O = js.native
    def Random[O /* <: Point */](line: Line, out: O): O = js.native
    /**
      * Calculate the reflected angle between two lines.
      * 
      * This is the outgoing angle based on the angle of Line 1 and the normalAngle of Line 2.
      * @param lineA The first line.
      * @param lineB The second line.
      */
    def ReflectAngle(lineA: Line, lineB: Line): Double = js.native
    /**
      * Rotate a line around its midpoint by the given angle in radians.
      * @param line The line to rotate.
      * @param angle The angle of rotation in radians.
      */
    def Rotate[O /* <: Line */](line: O, angle: Double): O = js.native
    def RotateAroundPoint[O /* <: Line */](line: O, point: js.Object, angle: Double): O = js.native
    /**
      * Rotate a line around a point by the given angle in radians.
      * @param line The line to rotate.
      * @param point The point to rotate the line around.
      * @param angle The angle of rotation in radians.
      */
    def RotateAroundPoint[O /* <: Line */](line: O, point: Point, angle: Double): O = js.native
    /**
      * Rotate a line around the given coordinates by the given angle in radians.
      * @param line The line to rotate.
      * @param x The horizontal coordinate to rotate the line around.
      * @param y The vertical coordinate to rotate the line around.
      * @param angle The angle of rotation in radians.
      */
    def RotateAroundXY[O /* <: Line */](line: O, x: Double, y: Double, angle: Double): O = js.native
    /**
      * Set a line to a given position, angle and length.
      * @param line The line to set.
      * @param x The horizontal start position of the line.
      * @param y The vertical start position of the line.
      * @param angle The angle of the line in radians.
      * @param length The length of the line.
      */
    def SetToAngle[O /* <: Line */](line: O, x: Double, y: Double, angle: Double, length: Double): O = js.native
    /**
      * Calculate the slope of the given line.
      * @param line The line to calculate the slope of.
      */
    def Slope(line: Line): Double = js.native
    /**
      * Calculate the width of the given line.
      * @param line The line to calculate the width of.
      */
    def Width(line: Line): Double = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    /**
      * Apply `Math.ceil()` to each coordinate of the given Point.
      * @param point The Point to ceil.
      */
    def Ceil[O /* <: Point */](point: O): O = js.native
    /**
      * Clone the given Point.
      * @param source The source Point to clone.
      */
    def Clone(source: Point): Point = js.native
    /**
      * Copy the values of one Point to a destination Point.
      * @param source The source Point to copy the values from.
      * @param dest The destination Point to copy the values to.
      */
    def CopyFrom[O /* <: Point */](source: Point, dest: O): O = js.native
    /**
      * A comparison of two `Point` objects to see if they are equal.
      * @param point The original `Point` to compare against.
      * @param toCompare The second `Point` to compare.
      */
    def Equals(point: Point, toCompare: Point): Boolean = js.native
    /**
      * Apply `Math.ceil()` to each coordinate of the given Point.
      * @param point The Point to floor.
      */
    def Floor[O /* <: Point */](point: O): O = js.native
    /**
      * Get the centroid or geometric center of a plane figure (the arithmetic mean position of all the points in the figure).
      * Informally, it is the point at which a cutout of the shape could be perfectly balanced on the tip of a pin.
      * @param points [description]
      * @param out [description]
      */
    def GetCentroid[O /* <: Point */](points: js.Array[Point]): O = js.native
    def GetCentroid[O /* <: Point */](points: js.Array[Point], out: O): O = js.native
    /**
      * Calculate the magnitude of the point, which equivalent to the length of the line from the origin to this point.
      * @param point The point to calculate the magnitude for
      */
    def GetMagnitude(point: Point): Double = js.native
    /**
      * Calculates the square of magnitude of given point.(Can be used for fast magnitude calculation of point)
      * @param point Returns square of the magnitude/length of given point.
      */
    def GetMagnitudeSq(point: Point): Double = js.native
    /**
      * Calculates the Axis Aligned Bounding Box (or aabb) from an array of points.
      * @param points [description]
      * @param out [description]
      */
    def GetRectangleFromPoints[O /* <: Rectangle */](points: js.Array[Point]): O = js.native
    def GetRectangleFromPoints[O /* <: Rectangle */](points: js.Array[Point], out: O): O = js.native
    /**
      * [description]
      * @param pointA The starting `Point` for the interpolation.
      * @param pointB The target `Point` for the interpolation.
      * @param t The amount to interpolate between the two points. Generally, a value between 0 (returns the starting `Point`) and 1 (returns the target `Point`). If omitted, 0 is used. Default 0.
      * @param out An optional `Point` object whose `x` and `y` values will be set to the result of the interpolation (can also be any object with `x` and `y` properties). If omitted, a new `Point` created and returned.
      */
    def Interpolate[O /* <: Point */](pointA: Point, pointB: Point): O = js.native
    def Interpolate[O /* <: Point */](pointA: Point, pointB: Point, t: Double): O = js.native
    def Interpolate[O /* <: Point */](pointA: Point, pointB: Point, t: Double, out: O): O = js.native
    /**
      * Swaps the X and the Y coordinate of a point.
      * @param point The Point to modify.
      */
    def Invert[O /* <: Point */](point: O): O = js.native
    /**
      * Inverts a Point's coordinates.
      * @param point The Point to invert.
      * @param out The Point to return the inverted coordinates in.
      */
    def Negative[O /* <: Point */](point: Point): O = js.native
    def Negative[O /* <: Point */](point: Point, out: O): O = js.native
    /**
      * [description]
      * @param pointA [description]
      * @param pointB [description]
      * @param out [description]
      */
    def Project[O /* <: Point */](pointA: Point, pointB: Point): O = js.native
    def Project[O /* <: Point */](pointA: Point, pointB: Point, out: O): O = js.native
    /**
      * [description]
      * @param pointA [description]
      * @param pointB [description]
      * @param out [description]
      */
    def ProjectUnit[O /* <: Point */](pointA: Point, pointB: Point): O = js.native
    def ProjectUnit[O /* <: Point */](pointA: Point, pointB: Point, out: O): O = js.native
    /**
      * Changes the magnitude (length) of a two-dimensional vector without changing its direction.
      * @param point The Point to treat as the end point of the vector.
      * @param magnitude The new magnitude of the vector.
      */
    def SetMagnitude[O /* <: Point */](point: O, magnitude: Double): O = js.native
  }
  
  /* static members */
  @js.native
  object Polygon extends js.Object {
    /**
      * Create a new polygon which is a copy of the specified polygon
      * @param polygon The polygon to create a clone of
      */
    def Clone(polygon: Polygon): Polygon = js.native
    /**
      * Checks if a point is within the bounds of a Polygon.
      * @param polygon The Polygon to check against.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def Contains(polygon: Polygon, x: Double, y: Double): Boolean = js.native
    /**
      * [description]
      * @param polygon [description]
      * @param point [description]
      */
    def ContainsPoint(polygon: Polygon, point: Point): Boolean = js.native
    /**
      * Calculates the bounding AABB rectangle of a polygon.
      * @param polygon The polygon that should be calculated.
      * @param out The rectangle or object that has x, y, width, and height properties to store the result. Optional.
      */
    def GetAABB[O /* <: Rectangle */](polygon: Polygon): O = js.native
    def GetAABB[O /* <: Rectangle */](polygon: Polygon, out: O): O = js.native
    /**
      * Stores all of the points of a Polygon into a flat array of numbers following the sequence [ x,y, x,y, x,y ],
      * i.e. each point of the Polygon, in the order it's defined, corresponds to two elements of the resultant
      * array for the point's X and Y coordinate.
      * @param polygon The Polygon whose points to export.
      * @param output An array to which the points' coordinates should be appended.
      */
    def GetNumberArray[O /* <: js.Array[Double] */](polygon: Polygon): O = js.native
    def GetNumberArray[O /* <: js.Array[Double] */](polygon: Polygon, output: O): O = js.native
    /**
      * Returns an array of Point objects containing the coordinates of the points around the perimeter of the Polygon,
      * based on the given quantity or stepRate values.
      * @param polygon The Polygon to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the perimeter of the Polygon and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def GetPoints(polygon: Polygon, quantity: integer): js.Array[Point] = js.native
    def GetPoints(polygon: Polygon, quantity: integer, stepRate: Double): js.Array[Point] = js.native
    def GetPoints(polygon: Polygon, quantity: integer, stepRate: Double, output: js.Array[_]): js.Array[Point] = js.native
    /**
      * Returns the perimeter of the given Polygon.
      * @param polygon The Polygon to get the perimeter of.
      */
    def Perimeter(polygon: Polygon): Double = js.native
    /**
      * Reverses the order of the points of a Polygon.
      * @param polygon The Polygon to modify.
      */
    def Reverse[O /* <: Polygon */](polygon: O): O = js.native
    /**
      * Takes a Polygon object and applies Chaikin's smoothing algorithm on its points.
      * @param polygon The polygon to be smoothed. The polygon will be modified in-place and returned.
      */
    def Smooth[O /* <: Polygon */](polygon: O): O = js.native
  }
  
  /* static members */
  @js.native
  object Rectangle extends js.Object {
    /**
      * Calculates the area of the given Rectangle object.
      * @param rect The rectangle to calculate the area of.
      */
    def Area(rect: Rectangle): Double = js.native
    /**
      * Rounds a Rectangle's position up to the smallest integer greater than or equal to each current coordinate.
      * @param rect The Rectangle to adjust.
      */
    def Ceil[O /* <: Rectangle */](rect: O): O = js.native
    /**
      * Rounds a Rectangle's position and size up to the smallest integer greater than or equal to each respective value.
      * @param rect The Rectangle to modify.
      */
    def CeilAll[O /* <: Rectangle */](rect: O): O = js.native
    /**
      * Moves the top-left corner of a Rectangle so that its center is at the given coordinates.
      * @param rect The Rectangle to be centered.
      * @param x The X coordinate of the Rectangle's center.
      * @param y The Y coordinate of the Rectangle's center.
      */
    def CenterOn[O /* <: Rectangle */](rect: O, x: Double, y: Double): O = js.native
    /**
      * Creates a new Rectangle which is identical to the given one.
      * @param source The Rectangle to clone.
      */
    def Clone(source: Rectangle): Rectangle = js.native
    /**
      * Checks if a given point is inside a Rectangle's bounds.
      * @param rect The Rectangle to check.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def Contains(rect: Rectangle, x: Double, y: Double): Boolean = js.native
    /**
      * Determines whether the specified point is contained within the rectangular region defined by this Rectangle object.
      * @param rect The Rectangle object.
      * @param point The point object to be checked. Can be a Phaser Point object or any object with x and y values.
      */
    def ContainsPoint(rect: Rectangle, point: Point): Boolean = js.native
    /**
      * Tests if one rectangle fully contains another.
      * @param rectA The first rectangle.
      * @param rectB The second rectangle.
      */
    def ContainsRect(rectA: Rectangle, rectB: Rectangle): Boolean = js.native
    /**
      * Copy the values of one Rectangle to a destination Rectangle.
      * @param source The source Rectangle to copy the values from.
      * @param dest The destination Rectangle to copy the values to.
      */
    def CopyFrom[O /* <: Rectangle */](source: Rectangle, dest: O): O = js.native
    /**
      * Create an array of points for each corner of a Rectangle
      * If an array is specified, each point object will be added to the end of the array, otherwise a new array will be created.
      * @param rect The Rectangle object to be decomposed.
      * @param out If provided, each point will be added to this array.
      */
    def Decompose(rect: Rectangle): js.Array[_] = js.native
    def Decompose(rect: Rectangle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Compares the `x`, `y`, `width` and `height` properties of two rectangles.
      * @param rect Rectangle A
      * @param toCompare Rectangle B
      */
    def Equals(rect: Rectangle, toCompare: Rectangle): Boolean = js.native
    /**
      * Adjusts the target rectangle, changing its width, height and position,
      * so that it fits inside the area of the source rectangle, while maintaining its original
      * aspect ratio.
      * 
      * Unlike the `FitOutside` function, there may be some space inside the source area not covered.
      * @param target The target rectangle to adjust.
      * @param source The source rectangle to envelop the target in.
      */
    def FitInside[O /* <: Rectangle */](target: O, source: Rectangle): O = js.native
    /**
      * Adjusts the target rectangle, changing its width, height and position,
      * so that it fully covers the area of the source rectangle, while maintaining its original
      * aspect ratio.
      * 
      * Unlike the `FitInside` function, the target rectangle may extend further out than the source.
      * @param target The target rectangle to adjust.
      * @param source The source rectangle to envelope the target in.
      */
    def FitOutside[O /* <: Rectangle */](target: O, source: Rectangle): O = js.native
    /**
      * Rounds down (floors) the top left X and Y coordinates of the given Rectangle to the largest integer less than or equal to them
      * @param rect The rectangle to floor the top left X and Y coordinates of
      */
    def Floor[O /* <: Rectangle */](rect: O): O = js.native
    /**
      * Rounds a Rectangle's position and size down to the largest integer less than or equal to each current coordinate or dimension.
      * @param rect The Rectangle to adjust.
      */
    def FloorAll[O /* <: Rectangle */](rect: O): O = js.native
    /**
      * Constructs new Rectangle or repositions and resizes an existing Rectangle so that all of the given points are on or within its bounds.
      * @param points An array of points (either arrays with two elements corresponding to the X and Y coordinate or an object with public `x` and `y` properties) which should be surrounded by the Rectangle.
      * @param out Optional Rectangle to adjust.
      */
    def FromPoints[O /* <: Rectangle */](points: js.Array[_]): O = js.native
    def FromPoints[O /* <: Rectangle */](points: js.Array[_], out: O): O = js.native
    /**
      * Calculates the width/height ratio of a rectangle.
      * @param rect The rectangle.
      */
    def GetAspectRatio(rect: Rectangle): Double = js.native
    /**
      * Returns the center of a Rectangle as a Point.
      * @param rect The Rectangle to get the center of.
      * @param out Optional point-like object to update with the center coordinates.
      */
    def GetCenter[O /* <: Point */](rect: Rectangle): O = js.native
    def GetCenter[O /* <: Point */](rect: Rectangle, out: O): O = js.native
    /**
      * Position is a value between 0 and 1 where 0 = the top-left of the rectangle and 0.5 = the bottom right.
      * @param rectangle [description]
      * @param position [description]
      * @param out [description]
      */
    def GetPoint[O /* <: Point */](rectangle: Rectangle, position: Double): O = js.native
    def GetPoint[O /* <: Point */](rectangle: Rectangle, position: Double, out: O): O = js.native
    /**
      * Return an array of points from the perimeter of the rectangle, each spaced out based on the quantity or step required.
      * @param rectangle The Rectangle object to get the points from.
      * @param step Step between points. Used to calculate the number of points to return when quantity is falsey. Ignored if quantity is positive.
      * @param quantity The number of evenly spaced points from the rectangles perimeter to return. If falsey, step param will be used to calculate the number of points.
      * @param out An optional array to store the points in.
      */
    def GetPoints[O /* <: js.Array[Point] */](rectangle: Rectangle, step: Double, quantity: integer): O = js.native
    def GetPoints[O /* <: js.Array[Point] */](rectangle: Rectangle, step: Double, quantity: integer, out: O): O = js.native
    /**
      * The size of the Rectangle object, expressed as a Point object
      *  with the values of the width and height properties.
      * @param rect [description]
      * @param out [description]
      */
    def GetSize[O /* <: Point */](rect: Rectangle): O = js.native
    def GetSize[O /* <: Point */](rect: Rectangle, out: O): O = js.native
    /**
      * Increases the size of a Rectangle by a specified amount.
      * 
      * The center of the Rectangle stays the same. The amounts are added to each side, so the actual increase in width or height is two times bigger than the respective argument.
      * @param rect The Rectangle to inflate.
      * @param x How many pixels the left and the right side should be moved by horizontally.
      * @param y How many pixels the top and the bottom side should be moved by vertically.
      */
    def Inflate[O /* <: Rectangle */](rect: O, x: Double, y: Double): O = js.native
    /**
      * Takes two Rectangles and first checks to see if they intersect.
      * If they intersect it will return the area of intersection in the `out` Rectangle.
      * If they do not intersect, the `out` Rectangle will have a width and height of zero.
      * @param rectA The first Rectangle to get the intersection from.
      * @param rectB The second Rectangle to get the intersection from.
      * @param out A Rectangle to store the intersection results in.
      */
    def Intersection[O /* <: Rectangle */](rectA: Rectangle, rectB: Rectangle): O = js.native
    def Intersection[O /* <: Rectangle */](rectA: Rectangle, rectB: Rectangle, out: Rectangle): O = js.native
    /**
      * Return an array of points from the perimeter of the rectangle
      *  each spaced out based on the quantity or step required
      * @param rect [description]
      * @param step [description]
      * @param quantity [description]
      * @param out [description]
      */
    def MarchingAnts[O /* <: js.Array[Point] */](rect: Rectangle, step: Double, quantity: integer): O = js.native
    def MarchingAnts[O /* <: js.Array[Point] */](rect: Rectangle, step: Double, quantity: integer, out: O): O = js.native
    /**
      * Merges a Rectangle with a list of points by repositioning and/or resizing it such that all points are located on or within its bounds.
      * @param target The Rectangle which should be merged.
      * @param points An array of Points (or any object with public `x` and `y` properties) which should be merged with the Rectangle.
      */
    def MergePoints[O /* <: Rectangle */](target: O, points: js.Array[Point]): O = js.native
    /**
      * Merges the source rectangle into the target rectangle and returns the target.
      * Neither rectangle should have a negative width or height.
      * @param target Target rectangle. Will be modified to include source rectangle.
      * @param source Rectangle that will be merged into target rectangle.
      */
    def MergeRect[O /* <: Rectangle */](target: O, source: Rectangle): O = js.native
    /**
      * Merges a Rectangle with a point by repositioning and/or resizing it so that the point is on or within its bounds.
      * @param target The Rectangle which should be merged and modified.
      * @param x The X coordinate of the point which should be merged.
      * @param y The Y coordinate of the point which should be merged.
      */
    def MergeXY[O /* <: Rectangle */](target: O, x: Double, y: Double): O = js.native
    /**
      * Nudges (translates) the top left corner of a Rectangle by a given offset.
      * @param rect The Rectangle to adjust.
      * @param x The distance to move the Rectangle horizontally.
      * @param y The distance to move the Rectangle vertically.
      */
    def Offset[O /* <: Rectangle */](rect: O, x: Double, y: Double): O = js.native
    /**
      * Nudges (translates) the top-left corner of a Rectangle by the coordinates of a point (translation vector).
      * @param rect The Rectangle to adjust.
      * @param point The point whose coordinates should be used as an offset.
      */
    def OffsetPoint[O /* <: Rectangle */](rect: O, point: Point): O = js.native
    def OffsetPoint[O /* <: Rectangle */](rect: O, point: Vector2): O = js.native
    /**
      * Checks if two Rectangles overlap. If a Rectangle is within another Rectangle, the two will be considered overlapping. Thus, the Rectangles are treated as "solid".
      * @param rectA The first Rectangle to check.
      * @param rectB The second Rectangle to check.
      */
    def Overlaps(rectA: Rectangle, rectB: Rectangle): Boolean = js.native
    /**
      * Calculates the perimeter of a Rectangle.
      * @param rect The Rectangle to use.
      */
    def Perimeter(rect: Rectangle): Double = js.native
    /**
      * [description]
      * @param rectangle [description]
      * @param angle [description]
      * @param out [description]
      */
    def PerimeterPoint[O /* <: Point */](rectangle: Rectangle, angle: integer): O = js.native
    def PerimeterPoint[O /* <: Point */](rectangle: Rectangle, angle: integer, out: O): O = js.native
    /**
      * Returns a random point within a Rectangle.
      * @param rect The Rectangle to return a point from.
      * @param out The object to update with the point's coordinates.
      */
    def Random[O /* <: Point */](rect: Rectangle, out: O): O = js.native
    /**
      * Calculates a random point that lies within the `outer` Rectangle, but outside of the `inner` Rectangle.
      * The inner Rectangle must be fully contained within the outer rectangle.
      * @param outer The outer Rectangle to get the random point within.
      * @param inner The inner Rectangle to exclude from the returned point.
      * @param out A Point, or Point-like object to store the result in. If not specified, a new Point will be created.
      */
    def RandomOutside[O /* <: Point */](outer: Rectangle, inner: Rectangle): O = js.native
    def RandomOutside[O /* <: Point */](outer: Rectangle, inner: Rectangle, out: O): O = js.native
    /**
      * Determines if the two objects (either Rectangles or Rectangle-like) have the same width and height values under strict equality.
      * @param rect The first Rectangle object.
      * @param toCompare The second Rectangle object.
      */
    def SameDimensions(rect: Rectangle, toCompare: Rectangle): Boolean = js.native
    /**
      * Scales the width and height of this Rectangle by the given amounts.
      * @param rect The `Rectangle` object that will be scaled by the specified amount(s).
      * @param x The factor by which to scale the rectangle horizontally.
      * @param y The amount by which to scale the rectangle vertically. If this is not specified, the rectangle will be scaled by the factor `x` in both directions.
      */
    def Scale[O /* <: Rectangle */](rect: O, x: Double, y: Double): O = js.native
    /**
      * Creates a new Rectangle or repositions and/or resizes an existing Rectangle so that it encompasses the two given Rectangles, i.e. calculates their union.
      * @param rectA The first Rectangle to use.
      * @param rectB The second Rectangle to use.
      * @param out The Rectangle to store the union in.
      */
    def Union[O /* <: Rectangle */](rectA: Rectangle, rectB: Rectangle): O = js.native
    def Union[O /* <: Rectangle */](rectA: Rectangle, rectB: Rectangle, out: O): O = js.native
  }
  
  /* static members */
  @js.native
  object Triangle extends js.Object {
    /**
      * Returns the area of a Triangle.
      * @param triangle The Triangle to use.
      */
    def Area(triangle: Triangle): Double = js.native
    /**
      * Builds an equilateral triangle. In the equilateral triangle, all the sides are the same length (congruent) and all the angles are the same size (congruent).
      * The x/y specifies the top-middle of the triangle (x1/y1) and length is the length of each side.
      * @param x x coordinate of the top point of the triangle.
      * @param y y coordinate of the top point of the triangle.
      * @param length Length of each side of the triangle.
      */
    def BuildEquilateral(x: Double, y: Double, length: Double): Triangle = js.native
    /**
      * [description]
      * @param data A flat array of vertex coordinates like [x0,y0, x1,y1, x2,y2, ...]
      * @param holes An array of hole indices if any (e.g. [5, 8] for a 12-vertex input would mean one hole with vertices 5–7 and another with 8–11). Default null.
      * @param scaleX [description] Default 1.
      * @param scaleY [description] Default 1.
      * @param out [description]
      */
    def BuildFromPolygon[O /* <: js.Array[Triangle] */](data: js.Array[_]): O = js.native
    def BuildFromPolygon[O /* <: js.Array[Triangle] */](data: js.Array[_], holes: js.Array[_]): O = js.native
    def BuildFromPolygon[O /* <: js.Array[Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double): O = js.native
    def BuildFromPolygon[O /* <: js.Array[Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double, scaleY: Double): O = js.native
    def BuildFromPolygon[O /* <: js.Array[Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double, scaleY: Double, out: O): O = js.native
    /**
      * Builds a right triangle, i.e. one which has a 90-degree angle and two acute angles.
      * @param x The X coordinate of the right angle, which will also be the first X coordinate of the constructed Triangle.
      * @param y The Y coordinate of the right angle, which will also be the first Y coordinate of the constructed Triangle.
      * @param width The length of the side which is to the left or to the right of the right angle.
      * @param height The length of the side which is above or below the right angle.
      */
    def BuildRight(x: Double, y: Double, width: Double, height: Double): Triangle = js.native
    /**
      * Positions the Triangle so that it is centered on the given coordinates.
      * @param triangle The triangle to be positioned.
      * @param x The horizontal coordinate to center on.
      * @param y The vertical coordinate to center on.
      * @param centerFunc The function used to center the triangle. Defaults to Centroid centering.
      */
    def CenterOn[O /* <: Triangle */](triangle: O, x: Double, y: Double): O = js.native
    def CenterOn[O /* <: Triangle */](triangle: O, x: Double, y: Double, centerFunc: CenterFunction): O = js.native
    /**
      * Calculates the position of a Triangle's centroid, which is also its center of mass (center of gravity).
      * 
      * The centroid is the point in a Triangle at which its three medians (the lines drawn from the vertices to the bisectors of the opposite sides) meet. It divides each one in a 2:1 ratio.
      * @param triangle The Triangle to use.
      * @param out An object to store the coordinates in.
      */
    def Centroid[O /* <: Point */](triangle: Triangle): O = js.native
    def Centroid[O /* <: Point */](triangle: Triangle, out: O): O = js.native
    /**
      * Computes the circumcentre of a triangle. The circumcentre is the centre of
      * the circumcircle, the smallest circle which encloses the triangle. It is also
      * the common intersection point of the perpendicular bisectors of the sides of
      * the triangle, and is the only point which has equal distance to all three
      * vertices of the triangle.
      * @param triangle [description]
      * @param out [description]
      */
    def CircumCenter[O /* <: Vector2 */](triangle: Triangle): O = js.native
    def CircumCenter[O /* <: Vector2 */](triangle: Triangle, out: O): O = js.native
    /**
      * Finds the circumscribed circle (circumcircle) of a Triangle object. The circumcircle is the circle which touches all of the triangle's vertices.
      * @param triangle The Triangle to use as input.
      * @param out An optional Circle to store the result in.
      */
    def CircumCircle[O /* <: Circle */](triangle: Triangle): O = js.native
    def CircumCircle[O /* <: Circle */](triangle: Triangle, out: O): O = js.native
    /**
      * Clones a Triangle object.
      * @param source The Triangle to clone.
      */
    def Clone(source: Triangle): Triangle = js.native
    /**
      * Checks if a point (as a pair of coordinates) is inside a Triangle's bounds.
      * @param triangle The Triangle to check.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def Contains(triangle: Triangle, x: Double, y: Double): Boolean = js.native
    /**
      * Filters an array of point-like objects to only those contained within a triangle.
      * If `returnFirst` is true, will return an array containing only the first point in the provided array that is within the triangle (or an empty array if there are no such points).
      * @param triangle The triangle that the points are being checked in.
      * @param points An array of point-like objects (objects that have an `x` and `y` property)
      * @param returnFirst If `true`, return an array containing only the first point found that is within the triangle. Default false.
      * @param out If provided, the points that are within the triangle will be appended to this array instead of being added to a new array. If `returnFirst` is true, only the first point found within the triangle will be appended. This array will also be returned by this function.
      */
    def ContainsArray(triangle: Triangle, points: js.Array[Point]): js.Array[Point] = js.native
    def ContainsArray(triangle: Triangle, points: js.Array[Point], returnFirst: Boolean): js.Array[Point] = js.native
    def ContainsArray(triangle: Triangle, points: js.Array[Point], returnFirst: Boolean, out: js.Array[_]): js.Array[Point] = js.native
    def ContainsPoint(triangle: Triangle, point: js.Any): Boolean = js.native
    /**
      * Tests if a triangle contains a point.
      * @param triangle The triangle.
      * @param point The point to test, or any point-like object with public `x` and `y` properties.
      */
    def ContainsPoint(triangle: Triangle, point: Point): Boolean = js.native
    def ContainsPoint(triangle: Triangle, point: Vector2): Boolean = js.native
    /**
      * Copy the values of one Triangle to a destination Triangle.
      * @param source The source Triangle to copy the values from.
      * @param dest The destination Triangle to copy the values to.
      */
    def CopyFrom[O /* <: Triangle */](source: Triangle, dest: O): O = js.native
    /**
      * Decomposes a Triangle into an array of its points.
      * @param triangle The Triangle to decompose.
      * @param out An array to store the points into.
      */
    def Decompose(triangle: Triangle): js.Array[_] = js.native
    def Decompose(triangle: Triangle, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Returns true if two triangles have the same coordinates.
      * @param triangle The first triangle to check.
      * @param toCompare The second triangle to check.
      */
    def Equals(triangle: Triangle, toCompare: Triangle): Boolean = js.native
    /**
      * Returns a Point from around the perimeter of a Triangle.
      * @param triangle The Triangle to get the point on its perimeter from.
      * @param position The position along the perimeter of the triangle. A value between 0 and 1.
      * @param out An option Point, or Point-like object to store the value in. If not given a new Point will be created.
      */
    def GetPoint[O /* <: Point */](triangle: Triangle, position: Double): O = js.native
    def GetPoint[O /* <: Point */](triangle: Triangle, position: Double, out: O): O = js.native
    /**
      * Returns an array of evenly spaced points on the perimeter of a Triangle.
      * @param triangle The Triangle to get the points from.
      * @param quantity The number of evenly spaced points to return. Set to 0 to return an arbitrary number of points based on the `stepRate`.
      * @param stepRate If `quantity` is 0, the distance between each returned point.
      * @param out An array to which the points should be appended.
      */
    def GetPoints[O /* <: Point */](triangle: Triangle, quantity: integer, stepRate: Double): O = js.native
    def GetPoints[O /* <: Point */](triangle: Triangle, quantity: integer, stepRate: Double, out: O): O = js.native
    /**
      * Calculates the position of the incenter of a Triangle object. This is the point where its three angle bisectors meet and it's also the center of the incircle, which is the circle inscribed in the triangle.
      * @param triangle The Triangle to find the incenter of.
      * @param out An optional Point in which to store the coordinates.
      */
    def InCenter[O /* <: Point */](triangle: Triangle): O = js.native
    def InCenter[O /* <: Point */](triangle: Triangle, out: O): O = js.native
    /**
      * Moves each point (vertex) of a Triangle by a given offset, thus moving the entire Triangle by that offset.
      * @param triangle The Triangle to move.
      * @param x The horizontal offset (distance) by which to move each point. Can be positive or negative.
      * @param y The vertical offset (distance) by which to move each point. Can be positive or negative.
      */
    def Offset[O /* <: Triangle */](triangle: O, x: Double, y: Double): O = js.native
    /**
      * Gets the length of the perimeter of the given triangle.
      * @param triangle [description]
      */
    def Perimeter(triangle: Triangle): Double = js.native
    /**
      * [description]
      * @param triangle [description]
      * @param out [description]
      */
    def Random[O /* <: Point */](triangle: Triangle): O = js.native
    def Random[O /* <: Point */](triangle: Triangle, out: O): O = js.native
    /**
      * Rotates a Triangle about its incenter, which is the point at which its three angle bisectors meet.
      * @param triangle The Triangle to rotate.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    def Rotate[O /* <: Triangle */](triangle: O, angle: Double): O = js.native
    /**
      * Rotates a Triangle at a certain angle about a given Point or object with public `x` and `y` properties.
      * @param triangle The Triangle to rotate.
      * @param point The Point to rotate the Triangle about.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    def RotateAroundPoint[O /* <: Triangle */](triangle: O, point: Point, angle: Double): O = js.native
    /**
      * Rotates an entire Triangle at a given angle about a specific point.
      * @param triangle The Triangle to rotate.
      * @param x The X coordinate of the point to rotate the Triangle about.
      * @param y The Y coordinate of the point to rotate the Triangle about.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    def RotateAroundXY[O /* <: Triangle */](triangle: O, x: Double, y: Double, angle: Double): O = js.native
  }
  
}

