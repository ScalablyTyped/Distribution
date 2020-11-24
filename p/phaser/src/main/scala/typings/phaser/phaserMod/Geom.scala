package typings.phaser.phaserMod

import typings.phaser.CenterFunction
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Geom")
@js.native
object Geom extends js.Object {
  
  /**
    * A Circle Geometry object type.
    */
  @JSName("CIRCLE")
  var CIRCLE_ : integer = js.native
  
  /**
    * An Ellipse Geometry object type.
    */
  @JSName("ELLIPSE")
  var ELLIPSE_ : integer = js.native
  
  /**
    * A Line Geometry object type.
    */
  @JSName("LINE")
  var LINE_ : integer = js.native
  
  /**
    * A Point Geometry object type.
    */
  @JSName("POINT")
  var POINT_ : integer = js.native
  
  /**
    * A Polygon Geometry object type.
    */
  @JSName("POLYGON")
  var POLYGON_ : integer = js.native
  
  /**
    * A Rectangle Geometry object type.
    */
  @JSName("RECTANGLE")
  var RECTANGLE_ : integer = js.native
  
  /**
    * A Triangle Geometry object type.
    */
  @JSName("TRIANGLE")
  var TRIANGLE_ : integer = js.native
  
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
    extends typings.phaser.Phaser.Geom.Circle {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], radius: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, radius: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], radius: Double) = this()
    def this(x: Double, y: Double, radius: Double) = this()
  }
  /* static members */
  @js.native
  object Circle extends js.Object {
    
    /**
      * Calculates the area of the circle.
      * @param circle The Circle to get the area of.
      */
    def Area(circle: typings.phaser.Phaser.Geom.Circle): Double = js.native
    
    /**
      * Returns the circumference of the given Circle.
      * @param circle The Circle to get the circumference of.
      */
    def Circumference(circle: typings.phaser.Phaser.Geom.Circle): Double = js.native
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle based on the given angle.
      * @param circle The Circle to get the circumference point on.
      * @param angle The angle from the center of the Circle to the circumference to return the point from. Given in radians.
      * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
      */
    def CircumferencePoint[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle, angle: Double): O = js.native
    def CircumferencePoint[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle, angle: Double, out: O): O = js.native
    
    def Clone(source: js.Object): typings.phaser.Phaser.Geom.Circle = js.native
    /**
      * Creates a new Circle instance based on the values contained in the given source.
      * @param source The Circle to be cloned. Can be an instance of a Circle or a circle-like object, with x, y and radius properties.
      */
    def Clone(source: typings.phaser.Phaser.Geom.Circle): typings.phaser.Phaser.Geom.Circle = js.native
    
    /**
      * Check to see if the Circle contains the given x / y coordinates.
      * @param circle The Circle to check.
      * @param x The x coordinate to check within the circle.
      * @param y The y coordinate to check within the circle.
      */
    def Contains(circle: typings.phaser.Phaser.Geom.Circle, x: Double, y: Double): Boolean = js.native
    
    def ContainsPoint(circle: typings.phaser.Phaser.Geom.Circle, point: js.Object): Boolean = js.native
    /**
      * Check to see if the Circle contains the given Point object.
      * @param circle The Circle to check.
      * @param point The Point object to check if it's within the Circle or not.
      */
    def ContainsPoint(circle: typings.phaser.Phaser.Geom.Circle, point: typings.phaser.Phaser.Geom.Point): Boolean = js.native
    
    def ContainsRect(circle: typings.phaser.Phaser.Geom.Circle, rect: js.Object): Boolean = js.native
    /**
      * Check to see if the Circle contains all four points of the given Rectangle object.
      * @param circle The Circle to check.
      * @param rect The Rectangle object to check if it's within the Circle or not.
      */
    def ContainsRect(circle: typings.phaser.Phaser.Geom.Circle, rect: typings.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    /**
      * Copies the `x`, `y` and `radius` properties from the `source` Circle
      * into the given `dest` Circle, then returns the `dest` Circle.
      * @param source The source Circle to copy the values from.
      * @param dest The destination Circle to copy the values to.
      */
    def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Circle */](source: typings.phaser.Phaser.Geom.Circle, dest: O): O = js.native
    
    /**
      * Compares the `x`, `y` and `radius` properties of the two given Circles.
      * Returns `true` if they all match, otherwise returns `false`.
      * @param circle The first Circle to compare.
      * @param toCompare The second Circle to compare.
      */
    def Equals(circle: typings.phaser.Phaser.Geom.Circle, toCompare: typings.phaser.Phaser.Geom.Circle): Boolean = js.native
    
    /**
      * Returns the bounds of the Circle object.
      * @param circle The Circle to get the bounds from.
      * @param out A Rectangle, or rectangle-like object, to store the circle bounds in. If not given a new Rectangle will be created.
      */
    def GetBounds[O /* <: typings.phaser.Phaser.Geom.Rectangle */](circle: typings.phaser.Phaser.Geom.Circle): O = js.native
    def GetBounds[O /* <: typings.phaser.Phaser.Geom.Rectangle */](circle: typings.phaser.Phaser.Geom.Circle, out: O): O = js.native
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Circle
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param circle The Circle to get the circumference point on.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the circle.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle, position: Double): O = js.native
    def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle, position: Double, out: O): O = js.native
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Circle,
      * based on the given quantity or stepRate values.
      * @param circle The Circle to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the circle and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def GetPoints(circle: typings.phaser.Phaser.Geom.Circle, quantity: integer): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    def GetPoints(
      circle: typings.phaser.Phaser.Geom.Circle,
      quantity: integer,
      stepRate: js.UndefOr[scala.Nothing],
      output: js.Array[_]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    def GetPoints(circle: typings.phaser.Phaser.Geom.Circle, quantity: integer, stepRate: Double): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    def GetPoints(
      circle: typings.phaser.Phaser.Geom.Circle,
      quantity: integer,
      stepRate: Double,
      output: js.Array[_]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    
    /**
      * Offsets the Circle by the values given.
      * @param circle The Circle to be offset (translated.)
      * @param x The amount to horizontally offset the Circle by.
      * @param y The amount to vertically offset the Circle by.
      */
    def Offset[O /* <: typings.phaser.Phaser.Geom.Circle */](circle: O, x: Double, y: Double): O = js.native
    
    def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Circle */](circle: O, point: js.Object): O = js.native
    /**
      * Offsets the Circle by the values given in the `x` and `y` properties of the Point object.
      * @param circle The Circle to be offset (translated.)
      * @param point The Point object containing the values to offset the Circle by.
      */
    def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Circle */](circle: O, point: typings.phaser.Phaser.Geom.Point): O = js.native
    
    /**
      * Returns a uniformly distributed random point from anywhere within the given Circle.
      * @param circle The Circle to get a random point from.
      * @param out A Point or point-like object to set the random `x` and `y` values in.
      */
    def Random[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle): O = js.native
    def Random[O /* <: typings.phaser.Phaser.Geom.Point */](circle: typings.phaser.Phaser.Geom.Circle, out: O): O = js.native
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
    extends typings.phaser.Phaser.Geom.Ellipse {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
  /* static members */
  @js.native
  object Ellipse extends js.Object {
    
    /**
      * Calculates the area of the Ellipse.
      * @param ellipse The Ellipse to get the area of.
      */
    def Area(ellipse: typings.phaser.Phaser.Geom.Ellipse): Double = js.native
    
    /**
      * Returns the circumference of the given Ellipse.
      * @param ellipse The Ellipse to get the circumference of.
      */
    def Circumference(ellipse: typings.phaser.Phaser.Geom.Ellipse): Double = js.native
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse based on the given angle.
      * @param ellipse The Ellipse to get the circumference point on.
      * @param angle The angle from the center of the Ellipse to the circumference to return the point from. Given in radians.
      * @param out A Point, or point-like object, to store the results in. If not given a Point will be created.
      */
    def CircumferencePoint[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse, angle: Double): O = js.native
    def CircumferencePoint[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse, angle: Double, out: O): O = js.native
    
    /**
      * Creates a new Ellipse instance based on the values contained in the given source.
      * @param source The Ellipse to be cloned. Can be an instance of an Ellipse or a ellipse-like object, with x, y, width and height properties.
      */
    def Clone(source: typings.phaser.Phaser.Geom.Ellipse): typings.phaser.Phaser.Geom.Ellipse = js.native
    
    /**
      * Check to see if the Ellipse contains the given x / y coordinates.
      * @param ellipse The Ellipse to check.
      * @param x The x coordinate to check within the ellipse.
      * @param y The y coordinate to check within the ellipse.
      */
    def Contains(ellipse: typings.phaser.Phaser.Geom.Ellipse, x: Double, y: Double): Boolean = js.native
    
    def ContainsPoint(ellipse: typings.phaser.Phaser.Geom.Ellipse, point: js.Object): Boolean = js.native
    /**
      * Check to see if the Ellipse contains the given Point object.
      * @param ellipse The Ellipse to check.
      * @param point The Point object to check if it's within the Circle or not.
      */
    def ContainsPoint(ellipse: typings.phaser.Phaser.Geom.Ellipse, point: typings.phaser.Phaser.Geom.Point): Boolean = js.native
    
    def ContainsRect(ellipse: typings.phaser.Phaser.Geom.Ellipse, rect: js.Object): Boolean = js.native
    /**
      * Check to see if the Ellipse contains all four points of the given Rectangle object.
      * @param ellipse The Ellipse to check.
      * @param rect The Rectangle object to check if it's within the Ellipse or not.
      */
    def ContainsRect(ellipse: typings.phaser.Phaser.Geom.Ellipse, rect: typings.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    /**
      * Copies the `x`, `y`, `width` and `height` properties from the `source` Ellipse
      * into the given `dest` Ellipse, then returns the `dest` Ellipse.
      * @param source The source Ellipse to copy the values from.
      * @param dest The destination Ellipse to copy the values to.
      */
    def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Ellipse */](source: typings.phaser.Phaser.Geom.Ellipse, dest: O): O = js.native
    
    /**
      * Compares the `x`, `y`, `width` and `height` properties of the two given Ellipses.
      * Returns `true` if they all match, otherwise returns `false`.
      * @param ellipse The first Ellipse to compare.
      * @param toCompare The second Ellipse to compare.
      */
    def Equals(ellipse: typings.phaser.Phaser.Geom.Ellipse, toCompare: typings.phaser.Phaser.Geom.Ellipse): Boolean = js.native
    
    /**
      * Returns the bounds of the Ellipse object.
      * @param ellipse The Ellipse to get the bounds from.
      * @param out A Rectangle, or rectangle-like object, to store the ellipse bounds in. If not given a new Rectangle will be created.
      */
    def GetBounds[O /* <: typings.phaser.Phaser.Geom.Rectangle */](ellipse: typings.phaser.Phaser.Geom.Ellipse): O = js.native
    def GetBounds[O /* <: typings.phaser.Phaser.Geom.Rectangle */](ellipse: typings.phaser.Phaser.Geom.Ellipse, out: O): O = js.native
    
    /**
      * Returns a Point object containing the coordinates of a point on the circumference of the Ellipse
      * based on the given angle normalized to the range 0 to 1. I.e. a value of 0.5 will give the point
      * at 180 degrees around the circle.
      * @param ellipse The Ellipse to get the circumference point on.
      * @param position A value between 0 and 1, where 0 equals 0 degrees, 0.5 equals 180 degrees and 1 equals 360 around the ellipse.
      * @param out An object to store the return values in. If not given a Point object will be created.
      */
    def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse, position: Double): O = js.native
    def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse, position: Double, out: O): O = js.native
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the circumference of the Ellipse,
      * based on the given quantity or stepRate values.
      * @param ellipse The Ellipse to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the circumference of the ellipse and dividing it by the stepRate.
      * @param out An array to insert the points in to. If not provided a new array will be created.
      */
    def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](ellipse: typings.phaser.Phaser.Geom.Ellipse, quantity: integer): O = js.native
    def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      ellipse: typings.phaser.Phaser.Geom.Ellipse,
      quantity: integer,
      stepRate: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](ellipse: typings.phaser.Phaser.Geom.Ellipse, quantity: integer, stepRate: Double): O = js.native
    def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](ellipse: typings.phaser.Phaser.Geom.Ellipse, quantity: integer, stepRate: Double, out: O): O = js.native
    
    /**
      * Offsets the Ellipse by the values given.
      * @param ellipse The Ellipse to be offset (translated.)
      * @param x The amount to horizontally offset the Ellipse by.
      * @param y The amount to vertically offset the Ellipse by.
      */
    def Offset[O /* <: typings.phaser.Phaser.Geom.Ellipse */](ellipse: O, x: Double, y: Double): O = js.native
    
    def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Ellipse */](ellipse: O, point: js.Object): O = js.native
    /**
      * Offsets the Ellipse by the values given in the `x` and `y` properties of the Point object.
      * @param ellipse The Ellipse to be offset (translated.)
      * @param point The Point object containing the values to offset the Ellipse by.
      */
    def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Ellipse */](ellipse: O, point: typings.phaser.Phaser.Geom.Point): O = js.native
    
    /**
      * Returns a uniformly distributed random point from anywhere within the given Ellipse.
      * @param ellipse The Ellipse to get a random point from.
      * @param out A Point or point-like object to set the random `x` and `y` values in.
      */
    def Random[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse): O = js.native
    def Random[O /* <: typings.phaser.Phaser.Geom.Point */](ellipse: typings.phaser.Phaser.Geom.Ellipse, out: O): O = js.native
  }
  
  @js.native
  object Intersects extends js.Object {
    
    /**
      * Checks if two Circles intersect.
      * @param circleA The first Circle to check for intersection.
      * @param circleB The second Circle to check for intersection.
      */
    def CircleToCircle(circleA: typings.phaser.Phaser.Geom.Circle, circleB: typings.phaser.Phaser.Geom.Circle): Boolean = js.native
    
    /**
      * Checks for intersection between a circle and a rectangle.
      * @param circle The circle to be checked.
      * @param rect The rectangle to be checked.
      */
    def CircleToRectangle(circle: typings.phaser.Phaser.Geom.Circle, rect: typings.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    /**
      * Checks if two Circles intersect and returns the intersection points as a Point object array.
      * @param circleA The first Circle to check for intersection.
      * @param circleB The second Circle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetCircleToCircle(circleA: typings.phaser.Phaser.Geom.Circle, circleB: typings.phaser.Phaser.Geom.Circle): js.Array[_] = js.native
    def GetCircleToCircle(
      circleA: typings.phaser.Phaser.Geom.Circle,
      circleB: typings.phaser.Phaser.Geom.Circle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks for intersection between a circle and a rectangle,
      * and returns the intersection points as a Point object array.
      * @param circle The circle to be checked.
      * @param rect The rectangle to be checked.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetCircleToRectangle(circle: typings.phaser.Phaser.Geom.Circle, rect: typings.phaser.Phaser.Geom.Rectangle): js.Array[_] = js.native
    def GetCircleToRectangle(
      circle: typings.phaser.Phaser.Geom.Circle,
      rect: typings.phaser.Phaser.Geom.Rectangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks for intersection between the line segment and circle,
      * and returns the intersection points as a Point object array.
      * @param line The line segment to check.
      * @param circle The circle to check against the line.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetLineToCircle(line: typings.phaser.Phaser.Geom.Line, circle: typings.phaser.Phaser.Geom.Circle): js.Array[_] = js.native
    def GetLineToCircle(line: typings.phaser.Phaser.Geom.Line, circle: typings.phaser.Phaser.Geom.Circle, out: js.Array[_]): js.Array[_] = js.native
    
    def GetLineToRectangle(line: typings.phaser.Phaser.Geom.Line, rect: js.Object): js.Array[_] = js.native
    def GetLineToRectangle(line: typings.phaser.Phaser.Geom.Line, rect: js.Object, out: js.Array[_]): js.Array[_] = js.native
    /**
      * Checks for intersection between the Line and a Rectangle shape,
      * and returns the intersection points as a Point object array.
      * @param line The Line to check for intersection.
      * @param rect The Rectangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetLineToRectangle(line: typings.phaser.Phaser.Geom.Line, rect: typings.phaser.Phaser.Geom.Rectangle): js.Array[_] = js.native
    def GetLineToRectangle(
      line: typings.phaser.Phaser.Geom.Line,
      rect: typings.phaser.Phaser.Geom.Rectangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
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
    def GetRectangleIntersection[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): O = js.native
    def GetRectangleIntersection[O /* <: typings.phaser.Phaser.Geom.Rectangle */](
      rectA: typings.phaser.Phaser.Geom.Rectangle,
      rectB: typings.phaser.Phaser.Geom.Rectangle,
      output: O
    ): O = js.native
    
    /**
      * Checks if two Rectangles intersect and returns the intersection points as a Point object array.
      * 
      * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds. As such, the two Rectangles are considered "solid". A Rectangle with no width or no height will never intersect another Rectangle.
      * @param rectA The first Rectangle to check for intersection.
      * @param rectB The second Rectangle to check for intersection.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetRectangleToRectangle(rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): js.Array[_] = js.native
    def GetRectangleToRectangle(
      rectA: typings.phaser.Phaser.Geom.Rectangle,
      rectB: typings.phaser.Phaser.Geom.Rectangle,
      out: js.Array[_]
    ): js.Array[_] = js.native
    
    /**
      * Checks for intersection between Rectangle shape and Triangle shape,
      * and returns the intersection points as a Point object array.
      * @param rect Rectangle object to test.
      * @param triangle Triangle object to test.
      * @param out An optional array in which to store the points of intersection.
      */
    def GetRectangleToTriangle(rect: typings.phaser.Phaser.Geom.Rectangle, triangle: typings.phaser.Phaser.Geom.Triangle): js.Array[_] = js.native
    def GetRectangleToTriangle(
      rect: typings.phaser.Phaser.Geom.Rectangle,
      triangle: typings.phaser.Phaser.Geom.Triangle,
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
    def GetTriangleToCircle(triangle: typings.phaser.Phaser.Geom.Triangle, circle: typings.phaser.Phaser.Geom.Circle): js.Array[_] = js.native
    def GetTriangleToCircle(
      triangle: typings.phaser.Phaser.Geom.Triangle,
      circle: typings.phaser.Phaser.Geom.Circle,
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
    def GetTriangleToLine(triangle: typings.phaser.Phaser.Geom.Triangle, line: typings.phaser.Phaser.Geom.Line): js.Array[_] = js.native
    def GetTriangleToLine(
      triangle: typings.phaser.Phaser.Geom.Triangle,
      line: typings.phaser.Phaser.Geom.Line,
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
    def GetTriangleToTriangle(triangleA: typings.phaser.Phaser.Geom.Triangle, triangleB: typings.phaser.Phaser.Geom.Triangle): js.Array[_] = js.native
    def GetTriangleToTriangle(
      triangleA: typings.phaser.Phaser.Geom.Triangle,
      triangleB: typings.phaser.Phaser.Geom.Triangle,
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
    def LineToCircle(line: typings.phaser.Phaser.Geom.Line, circle: typings.phaser.Phaser.Geom.Circle): Boolean = js.native
    def LineToCircle(line: typings.phaser.Phaser.Geom.Line, circle: typings.phaser.Phaser.Geom.Circle, nearest: js.Any): Boolean = js.native
    def LineToCircle(
      line: typings.phaser.Phaser.Geom.Line,
      circle: typings.phaser.Phaser.Geom.Circle,
      nearest: typings.phaser.Phaser.Geom.Point
    ): Boolean = js.native
    
    /**
      * Checks if two Lines intersect. If the Lines are identical, they will be treated as parallel and thus non-intersecting.
      * @param line1 The first Line to check.
      * @param line2 The second Line to check.
      * @param out A Point in which to optionally store the point of intersection.
      */
    def LineToLine(line1: typings.phaser.Phaser.Geom.Line, line2: typings.phaser.Phaser.Geom.Line): Boolean = js.native
    def LineToLine(
      line1: typings.phaser.Phaser.Geom.Line,
      line2: typings.phaser.Phaser.Geom.Line,
      out: typings.phaser.Phaser.Geom.Point
    ): Boolean = js.native
    
    def LineToRectangle(line: typings.phaser.Phaser.Geom.Line, rect: js.Object): Boolean = js.native
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
    def LineToRectangle(line: typings.phaser.Phaser.Geom.Line, rect: typings.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    def PointToLine(point: js.Any, line: typings.phaser.Phaser.Geom.Line): Boolean = js.native
    def PointToLine(point: js.Any, line: typings.phaser.Phaser.Geom.Line, lineThickness: Double): Boolean = js.native
    /**
      * Checks if the a Point falls between the two end-points of a Line, based on the given line thickness.
      * 
      * Assumes that the line end points are circular, not square.
      * @param point The point, or point-like object to check.
      * @param line The line segment to test for intersection on.
      * @param lineThickness The line thickness. Assumes that the line end points are circular. Default 1.
      */
    def PointToLine(point: typings.phaser.Phaser.Geom.Point, line: typings.phaser.Phaser.Geom.Line): Boolean = js.native
    def PointToLine(
      point: typings.phaser.Phaser.Geom.Point,
      line: typings.phaser.Phaser.Geom.Line,
      lineThickness: Double
    ): Boolean = js.native
    
    /**
      * Checks if a Point is located on the given line segment.
      * @param point The Point to check for intersection.
      * @param line The line segment to check for intersection.
      */
    def PointToLineSegment(point: typings.phaser.Phaser.Geom.Point, line: typings.phaser.Phaser.Geom.Line): Boolean = js.native
    
    /**
      * Checks if two Rectangles intersect.
      * 
      * A Rectangle intersects another Rectangle if any part of its bounds is within the other Rectangle's bounds.
      * As such, the two Rectangles are considered "solid".
      * A Rectangle with no width or no height will never intersect another Rectangle.
      * @param rectA The first Rectangle to check for intersection.
      * @param rectB The second Rectangle to check for intersection.
      */
    def RectangleToRectangle(rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    /**
      * Checks for intersection between Rectangle shape and Triangle shape.
      * @param rect Rectangle object to test.
      * @param triangle Triangle object to test.
      */
    def RectangleToTriangle(rect: typings.phaser.Phaser.Geom.Rectangle, triangle: typings.phaser.Phaser.Geom.Triangle): Boolean = js.native
    
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
      rect: typings.phaser.Phaser.Geom.Rectangle,
      left: Double,
      right: Double,
      top: Double,
      bottom: Double
    ): Boolean = js.native
    def RectangleToValues(
      rect: typings.phaser.Phaser.Geom.Rectangle,
      left: Double,
      right: Double,
      top: Double,
      bottom: Double,
      tolerance: Double
    ): Boolean = js.native
    
    /**
      * Checks if a Triangle and a Circle intersect.
      * 
      * A Circle intersects a Triangle if its center is located within it or if any of the Triangle's sides intersect the Circle. As such, the Triangle and the Circle are considered "solid" for the intersection.
      * @param triangle The Triangle to check for intersection.
      * @param circle The Circle to check for intersection.
      */
    def TriangleToCircle(triangle: typings.phaser.Phaser.Geom.Triangle, circle: typings.phaser.Phaser.Geom.Circle): Boolean = js.native
    
    /**
      * Checks if a Triangle and a Line intersect.
      * 
      * The Line intersects the Triangle if it starts inside of it, ends inside of it, or crosses any of the Triangle's sides. Thus, the Triangle is considered "solid".
      * @param triangle The Triangle to check with.
      * @param line The Line to check with.
      */
    def TriangleToLine(triangle: typings.phaser.Phaser.Geom.Triangle, line: typings.phaser.Phaser.Geom.Line): Boolean = js.native
    
    /**
      * Checks if two Triangles intersect.
      * 
      * A Triangle intersects another Triangle if any pair of their lines intersects or if any point of one Triangle is within the other Triangle. Thus, the Triangles are considered "solid".
      * @param triangleA The first Triangle to check for intersection.
      * @param triangleB The second Triangle to check for intersection.
      */
    def TriangleToTriangle(triangleA: typings.phaser.Phaser.Geom.Triangle, triangleB: typings.phaser.Phaser.Geom.Triangle): Boolean = js.native
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
    extends typings.phaser.Phaser.Geom.Line {
    def this(x1: Double) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: Double) = this()
    def this(x1: Double, y1: Double) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: js.UndefOr[scala.Nothing], x2: Double) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: Double, x2: Double) = this()
    def this(x1: Double, y1: js.UndefOr[scala.Nothing], x2: Double) = this()
    def this(x1: Double, y1: Double, x2: Double) = this()
    def this(
      x1: js.UndefOr[scala.Nothing],
      y1: js.UndefOr[scala.Nothing],
      x2: js.UndefOr[scala.Nothing],
      y2: Double
    ) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: js.UndefOr[scala.Nothing], x2: Double, y2: Double) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: Double, x2: js.UndefOr[scala.Nothing], y2: Double) = this()
    def this(x1: js.UndefOr[scala.Nothing], y1: Double, x2: Double, y2: Double) = this()
    def this(x1: Double, y1: js.UndefOr[scala.Nothing], x2: js.UndefOr[scala.Nothing], y2: Double) = this()
    def this(x1: Double, y1: js.UndefOr[scala.Nothing], x2: Double, y2: Double) = this()
    def this(x1: Double, y1: Double, x2: js.UndefOr[scala.Nothing], y2: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
  }
  /* static members */
  @js.native
  object Line extends js.Object {
    
    /**
      * Calculate the angle of the line in radians.
      * @param line The line to calculate the angle of.
      */
    def Angle(line: typings.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Using Bresenham's line algorithm this will return an array of all coordinates on this line.
      * 
      * The `start` and `end` points are rounded before this runs as the algorithm works on integers.
      * @param line The line.
      * @param stepRate The optional step rate for the points on the line. Default 1.
      * @param results An optional array to push the resulting coordinates into.
      */
    def BresenhamPoints(line: typings.phaser.Phaser.Geom.Line): js.Array[Vector2Like] = js.native
    def BresenhamPoints(
      line: typings.phaser.Phaser.Geom.Line,
      stepRate: js.UndefOr[scala.Nothing],
      results: js.Array[Vector2Like]
    ): js.Array[Vector2Like] = js.native
    def BresenhamPoints(line: typings.phaser.Phaser.Geom.Line, stepRate: integer): js.Array[Vector2Like] = js.native
    def BresenhamPoints(line: typings.phaser.Phaser.Geom.Line, stepRate: integer, results: js.Array[Vector2Like]): js.Array[Vector2Like] = js.native
    
    /**
      * Center a line on the given coordinates.
      * @param line The line to center.
      * @param x The horizontal coordinate to center the line on.
      * @param y The vertical coordinate to center the line on.
      */
    def CenterOn(line: typings.phaser.Phaser.Geom.Line, x: Double, y: Double): typings.phaser.Phaser.Geom.Line = js.native
    
    /**
      * Clone the given line.
      * @param source The source line to clone.
      */
    def Clone(source: typings.phaser.Phaser.Geom.Line): typings.phaser.Phaser.Geom.Line = js.native
    
    /**
      * Copy the values of one line to a destination line.
      * @param source The source line to copy the values from.
      * @param dest The destination line to copy the values to.
      */
    def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Line */](source: typings.phaser.Phaser.Geom.Line, dest: O): O = js.native
    
    /**
      * Compare two lines for strict equality.
      * @param line The first line to compare.
      * @param toCompare The second line to compare.
      */
    def Equals(line: typings.phaser.Phaser.Geom.Line, toCompare: typings.phaser.Phaser.Geom.Line): Boolean = js.native
    
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
    def Extend(line: typings.phaser.Phaser.Geom.Line, left: Double): typings.phaser.Phaser.Geom.Line = js.native
    def Extend(line: typings.phaser.Phaser.Geom.Line, left: Double, right: Double): typings.phaser.Phaser.Geom.Line = js.native
    
    /**
      * Returns an array of `quantity` Points where each point is taken from the given Line,
      * spaced out according to the ease function specified.
      * 
      * ```javascript
      * const line = new Phaser.Geom.Line(100, 300, 700, 300);
      * const points = Phaser.Geom.Line.GetEasedPoints(line, 'sine.out', 32)
      * ```
      * 
      * In the above example, the `points` array will contain 32 points spread-out across
      * the length of `line`, where the position of each point is determined by the `Sine.out`
      * ease function.
      * 
      * You can optionally provide a collinear threshold. In this case, the resulting points
      * are checked against each other, and if they are `< collinearThreshold` distance apart,
      * they are dropped from the results. This can help avoid lots of clustered points at
      * far ends of the line with tightly-packed eases such as Quartic. Leave the value set
      * to zero to skip this check.
      * 
      * Note that if you provide a collinear threshold, the resulting array may not always
      * contain `quantity` points.
      * @param line The Line object.
      * @param ease The ease to use. This can be either a string from the EaseMap, or a custom function.
      * @param quantity The number of points to return. Note that if you provide a `collinearThreshold`, the resulting array may not always contain this number of points.
      * @param collinearThreshold An optional threshold. The final array is reduced so that each point is spaced out at least this distance apart. This helps reduce clustering in noisey eases. Default 0.
      * @param easeParams An optional array of ease parameters to go with the ease.
      */
    def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, ease: String, quantity: integer): O = js.native
    def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      ease: String,
      quantity: integer,
      collinearThreshold: js.UndefOr[scala.Nothing],
      easeParams: js.Array[Double]
    ): O = js.native
    def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, ease: String, quantity: integer, collinearThreshold: Double): O = js.native
    def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      ease: String,
      quantity: integer,
      collinearThreshold: Double,
      easeParams: js.Array[Double]
    ): O = js.native
    def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, ease: js.Function, quantity: integer): O = js.native
    def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      ease: js.Function,
      quantity: integer,
      collinearThreshold: js.UndefOr[scala.Nothing],
      easeParams: js.Array[Double]
    ): O = js.native
    def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      ease: js.Function,
      quantity: integer,
      collinearThreshold: Double
    ): O = js.native
    def GetEasedPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      ease: js.Function,
      quantity: integer,
      collinearThreshold: Double,
      easeParams: js.Array[Double]
    ): O = js.native
    
    /**
      * Get the midpoint of the given line.
      * @param line The line to get the midpoint of.
      * @param out An optional point object to store the midpoint in.
      */
    def GetMidPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line): O = js.native
    def GetMidPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, out: O): O = js.native
    
    def GetNearestPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: js.Object): O = js.native
    def GetNearestPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: js.Object, out: O): O = js.native
    /**
      * Get the nearest point on a line perpendicular to the given point.
      * @param line The line to get the nearest point on.
      * @param point The point to get the nearest point to.
      * @param out An optional point, or point-like object, to store the coordinates of the nearest point on the line.
      */
    def GetNearestPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: typings.phaser.Phaser.Geom.Point): O = js.native
    def GetNearestPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: typings.phaser.Phaser.Geom.Point, out: O): O = js.native
    
    /**
      * Calculate the normal of the given line.
      * 
      * The normal of a line is a vector that points perpendicular from it.
      * @param line The line to calculate the normal of.
      * @param out An optional point object to store the normal in.
      */
    def GetNormal[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line): O = js.native
    def GetNormal[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, out: O): O = js.native
    
    /**
      * Get a point on a line that's a given percentage along its length.
      * @param line The line.
      * @param position A value between 0 and 1, where 0 is the start, 0.5 is the middle and 1 is the end of the line.
      * @param out An optional point, or point-like object, to store the coordinates of the point on the line.
      */
    def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, position: Double): O = js.native
    def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, position: Double, out: O): O = js.native
    
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
    def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, quantity: integer): O = js.native
    def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      line: typings.phaser.Phaser.Geom.Line,
      quantity: integer,
      stepRate: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, quantity: integer, stepRate: Double): O = js.native
    def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](line: typings.phaser.Phaser.Geom.Line, quantity: integer, stepRate: Double, out: O): O = js.native
    
    def GetShortestDistance[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: js.Object): O = js.native
    /**
      * Get the shortest distance from a Line to the given Point.
      * @param line The line to get the distance from.
      * @param point The point to get the shortest distance to.
      */
    def GetShortestDistance[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, point: typings.phaser.Phaser.Geom.Point): O = js.native
    
    /**
      * Calculate the height of the given line.
      * @param line The line to calculate the height of.
      */
    def Height(line: typings.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Calculate the length of the given line.
      * @param line The line to calculate the length of.
      */
    def Length(line: typings.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Get the angle of the normal of the given line in radians.
      * @param line The line to calculate the angle of the normal of.
      */
    def NormalAngle(line: typings.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Returns the x component of the normal vector of the given line.
      * @param line The Line object to get the normal value from.
      */
    def NormalX(line: typings.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * The Y value of the normal of the given line.
      * The normal of a line is a vector that points perpendicular from it.
      * @param line The line to calculate the normal of.
      */
    def NormalY(line: typings.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Offset a line by the given amount.
      * @param line The line to offset.
      * @param x The horizontal offset to add to the line.
      * @param y The vertical offset to add to the line.
      */
    def Offset[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, x: Double, y: Double): O = js.native
    
    /**
      * Calculate the perpendicular slope of the given line.
      * @param line The line to calculate the perpendicular slope of.
      */
    def PerpSlope(line: typings.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Returns a random point on a given Line.
      * @param line The Line to calculate the random Point on.
      * @param out An instance of a Point to be modified.
      */
    def Random[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line): O = js.native
    def Random[O /* <: typings.phaser.Phaser.Geom.Point */](line: typings.phaser.Phaser.Geom.Line, out: O): O = js.native
    
    /**
      * Calculate the reflected angle between two lines.
      * 
      * This is the outgoing angle based on the angle of Line 1 and the normalAngle of Line 2.
      * @param lineA The first line.
      * @param lineB The second line.
      */
    def ReflectAngle(lineA: typings.phaser.Phaser.Geom.Line, lineB: typings.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Rotate a line around its midpoint by the given angle in radians.
      * @param line The line to rotate.
      * @param angle The angle of rotation in radians.
      */
    def Rotate[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, angle: Double): O = js.native
    
    def RotateAroundPoint[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, point: js.Object, angle: Double): O = js.native
    /**
      * Rotate a line around a point by the given angle in radians.
      * @param line The line to rotate.
      * @param point The point to rotate the line around.
      * @param angle The angle of rotation in radians.
      */
    def RotateAroundPoint[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, point: typings.phaser.Phaser.Geom.Point, angle: Double): O = js.native
    
    /**
      * Rotate a line around the given coordinates by the given angle in radians.
      * @param line The line to rotate.
      * @param x The horizontal coordinate to rotate the line around.
      * @param y The vertical coordinate to rotate the line around.
      * @param angle The angle of rotation in radians.
      */
    def RotateAroundXY[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, x: Double, y: Double, angle: Double): O = js.native
    
    /**
      * Set a line to a given position, angle and length.
      * @param line The line to set.
      * @param x The horizontal start position of the line.
      * @param y The vertical start position of the line.
      * @param angle The angle of the line in radians.
      * @param length The length of the line.
      */
    def SetToAngle[O /* <: typings.phaser.Phaser.Geom.Line */](line: O, x: Double, y: Double, angle: Double, length: Double): O = js.native
    
    /**
      * Calculate the slope of the given line.
      * @param line The line to calculate the slope of.
      */
    def Slope(line: typings.phaser.Phaser.Geom.Line): Double = js.native
    
    /**
      * Calculate the width of the given line.
      * @param line The line to calculate the width of.
      */
    def Width(line: typings.phaser.Phaser.Geom.Line): Double = js.native
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
    extends typings.phaser.Phaser.Geom.Point {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
  }
  /* static members */
  @js.native
  object Point extends js.Object {
    
    /**
      * Apply `Math.ceil()` to each coordinate of the given Point.
      * @param point The Point to ceil.
      */
    def Ceil[O /* <: typings.phaser.Phaser.Geom.Point */](point: O): O = js.native
    
    /**
      * Clone the given Point.
      * @param source The source Point to clone.
      */
    def Clone(source: typings.phaser.Phaser.Geom.Point): typings.phaser.Phaser.Geom.Point = js.native
    
    /**
      * Copy the values of one Point to a destination Point.
      * @param source The source Point to copy the values from.
      * @param dest The destination Point to copy the values to.
      */
    def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Point */](source: typings.phaser.Phaser.Geom.Point, dest: O): O = js.native
    
    /**
      * A comparison of two `Point` objects to see if they are equal.
      * @param point The original `Point` to compare against.
      * @param toCompare The second `Point` to compare.
      */
    def Equals(point: typings.phaser.Phaser.Geom.Point, toCompare: typings.phaser.Phaser.Geom.Point): Boolean = js.native
    
    /**
      * Apply `Math.ceil()` to each coordinate of the given Point.
      * @param point The Point to floor.
      */
    def Floor[O /* <: typings.phaser.Phaser.Geom.Point */](point: O): O = js.native
    
    /**
      * Get the centroid or geometric center of a plane figure (the arithmetic mean position of all the points in the figure).
      * Informally, it is the point at which a cutout of the shape could be perfectly balanced on the tip of a pin.
      * @param points An array of Vector2Like objects to get the geometric center of.
      * @param out A Point object to store the output coordinates in. If not given, a new Point instance is created.
      */
    def GetCentroid[O /* <: typings.phaser.Phaser.Geom.Point */](points: js.Array[Vector2Like]): O = js.native
    def GetCentroid[O /* <: typings.phaser.Phaser.Geom.Point */](points: js.Array[Vector2Like], out: O): O = js.native
    
    /**
      * Calculate the magnitude of the point, which equivalent to the length of the line from the origin to this point.
      * @param point The point to calculate the magnitude for
      */
    def GetMagnitude(point: typings.phaser.Phaser.Geom.Point): Double = js.native
    
    /**
      * Calculates the square of magnitude of given point.(Can be used for fast magnitude calculation of point)
      * @param point Returns square of the magnitude/length of given point.
      */
    def GetMagnitudeSq(point: typings.phaser.Phaser.Geom.Point): Double = js.native
    
    /**
      * Calculates the Axis Aligned Bounding Box (or aabb) from an array of points.
      * @param points An array of Vector2Like objects to get the AABB from.
      * @param out A Rectangle object to store the results in. If not given, a new Rectangle instance is created.
      */
    def GetRectangleFromPoints[O /* <: typings.phaser.Phaser.Geom.Rectangle */](points: js.Array[Vector2Like]): O = js.native
    def GetRectangleFromPoints[O /* <: typings.phaser.Phaser.Geom.Rectangle */](points: js.Array[Vector2Like], out: O): O = js.native
    
    /**
      * Returns the linear interpolation point between the two given points, based on `t`.
      * @param pointA The starting `Point` for the interpolation.
      * @param pointB The target `Point` for the interpolation.
      * @param t The amount to interpolate between the two points. Generally, a value between 0 (returns the starting `Point`) and 1 (returns the target `Point`). If omitted, 0 is used. Default 0.
      * @param out An optional `Point` object whose `x` and `y` values will be set to the result of the interpolation (can also be any object with `x` and `y` properties). If omitted, a new `Point` created and returned.
      */
    def Interpolate[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point): O = js.native
    def Interpolate[O /* <: typings.phaser.Phaser.Geom.Point */](
      pointA: typings.phaser.Phaser.Geom.Point,
      pointB: typings.phaser.Phaser.Geom.Point,
      t: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    def Interpolate[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point, t: Double): O = js.native
    def Interpolate[O /* <: typings.phaser.Phaser.Geom.Point */](
      pointA: typings.phaser.Phaser.Geom.Point,
      pointB: typings.phaser.Phaser.Geom.Point,
      t: Double,
      out: O
    ): O = js.native
    
    /**
      * Swaps the X and the Y coordinate of a point.
      * @param point The Point to modify.
      */
    def Invert[O /* <: typings.phaser.Phaser.Geom.Point */](point: O): O = js.native
    
    /**
      * Inverts a Point's coordinates.
      * @param point The Point to invert.
      * @param out The Point to return the inverted coordinates in.
      */
    def Negative[O /* <: typings.phaser.Phaser.Geom.Point */](point: typings.phaser.Phaser.Geom.Point): O = js.native
    def Negative[O /* <: typings.phaser.Phaser.Geom.Point */](point: typings.phaser.Phaser.Geom.Point, out: O): O = js.native
    
    /**
      * Calculates the vector projection of `pointA` onto the nonzero `pointB`. This is the
      * orthogonal projection of `pointA` onto a straight line paralle to `pointB`.
      * @param pointA Point A, to be projected onto Point B.
      * @param pointB Point B, to have Point A projected upon it.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    def Project[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point): O = js.native
    def Project[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point, out: O): O = js.native
    
    /**
      * Calculates the vector projection of `pointA` onto the nonzero `pointB`. This is the
      * orthogonal projection of `pointA` onto a straight line paralle to `pointB`.
      * @param pointA Point A, to be projected onto Point B. Must be a normalized point with a magnitude of 1.
      * @param pointB Point B, to have Point A projected upon it.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    def ProjectUnit[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point): O = js.native
    def ProjectUnit[O /* <: typings.phaser.Phaser.Geom.Point */](pointA: typings.phaser.Phaser.Geom.Point, pointB: typings.phaser.Phaser.Geom.Point, out: O): O = js.native
    
    /**
      * Changes the magnitude (length) of a two-dimensional vector without changing its direction.
      * @param point The Point to treat as the end point of the vector.
      * @param magnitude The new magnitude of the vector.
      */
    def SetMagnitude[O /* <: typings.phaser.Phaser.Geom.Point */](point: O, magnitude: Double): O = js.native
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
    extends typings.phaser.Phaser.Geom.Polygon {
    def this(points: js.Array[typings.phaser.Phaser.Geom.Point]) = this()
  }
  /* static members */
  @js.native
  object Polygon extends js.Object {
    
    /**
      * Create a new polygon which is a copy of the specified polygon
      * @param polygon The polygon to create a clone of
      */
    def Clone(polygon: typings.phaser.Phaser.Geom.Polygon): typings.phaser.Phaser.Geom.Polygon = js.native
    
    /**
      * Checks if a point is within the bounds of a Polygon.
      * @param polygon The Polygon to check against.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def Contains(polygon: typings.phaser.Phaser.Geom.Polygon, x: Double, y: Double): Boolean = js.native
    
    /**
      * Checks the given Point again the Polygon to see if the Point lays within its vertices.
      * @param polygon The Polygon to check.
      * @param point The Point to check if it's within the Polygon.
      */
    def ContainsPoint(polygon: typings.phaser.Phaser.Geom.Polygon, point: typings.phaser.Phaser.Geom.Point): Boolean = js.native
    
    /**
      * Calculates the bounding AABB rectangle of a polygon.
      * @param polygon The polygon that should be calculated.
      * @param out The rectangle or object that has x, y, width, and height properties to store the result. Optional.
      */
    def GetAABB[O /* <: typings.phaser.Phaser.Geom.Rectangle */](polygon: typings.phaser.Phaser.Geom.Polygon): O = js.native
    def GetAABB[O /* <: typings.phaser.Phaser.Geom.Rectangle */](polygon: typings.phaser.Phaser.Geom.Polygon, out: O): O = js.native
    
    /**
      * Stores all of the points of a Polygon into a flat array of numbers following the sequence [ x,y, x,y, x,y ],
      * i.e. each point of the Polygon, in the order it's defined, corresponds to two elements of the resultant
      * array for the point's X and Y coordinate.
      * @param polygon The Polygon whose points to export.
      * @param output An array to which the points' coordinates should be appended.
      */
    def GetNumberArray[O /* <: js.Array[Double] */](polygon: typings.phaser.Phaser.Geom.Polygon): O = js.native
    def GetNumberArray[O /* <: js.Array[Double] */](polygon: typings.phaser.Phaser.Geom.Polygon, output: O): O = js.native
    
    /**
      * Returns an array of Point objects containing the coordinates of the points around the perimeter of the Polygon,
      * based on the given quantity or stepRate values.
      * @param polygon The Polygon to get the points from.
      * @param quantity The amount of points to return. If a falsey value the quantity will be derived from the `stepRate` instead.
      * @param stepRate Sets the quantity by getting the perimeter of the Polygon and dividing it by the stepRate.
      * @param output An array to insert the points in to. If not provided a new array will be created.
      */
    def GetPoints(polygon: typings.phaser.Phaser.Geom.Polygon, quantity: integer): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    def GetPoints(
      polygon: typings.phaser.Phaser.Geom.Polygon,
      quantity: integer,
      stepRate: js.UndefOr[scala.Nothing],
      output: js.Array[_]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    def GetPoints(polygon: typings.phaser.Phaser.Geom.Polygon, quantity: integer, stepRate: Double): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    def GetPoints(
      polygon: typings.phaser.Phaser.Geom.Polygon,
      quantity: integer,
      stepRate: Double,
      output: js.Array[_]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    
    /**
      * Returns the perimeter of the given Polygon.
      * @param polygon The Polygon to get the perimeter of.
      */
    def Perimeter(polygon: typings.phaser.Phaser.Geom.Polygon): Double = js.native
    
    /**
      * Reverses the order of the points of a Polygon.
      * @param polygon The Polygon to modify.
      */
    def Reverse[O /* <: typings.phaser.Phaser.Geom.Polygon */](polygon: O): O = js.native
    
    /**
      * Takes a Polygon object and applies Chaikin's smoothing algorithm on its points.
      * @param polygon The polygon to be smoothed. The polygon will be modified in-place and returned.
      */
    def Smooth[O /* <: typings.phaser.Phaser.Geom.Polygon */](polygon: O): O = js.native
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
    extends typings.phaser.Phaser.Geom.Rectangle {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
  }
  /* static members */
  @js.native
  object Rectangle extends js.Object {
    
    /**
      * Calculates the area of the given Rectangle object.
      * @param rect The rectangle to calculate the area of.
      */
    def Area(rect: typings.phaser.Phaser.Geom.Rectangle): Double = js.native
    
    /**
      * Rounds a Rectangle's position up to the smallest integer greater than or equal to each current coordinate.
      * @param rect The Rectangle to adjust.
      */
    def Ceil[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O): O = js.native
    
    /**
      * Rounds a Rectangle's position and size up to the smallest integer greater than or equal to each respective value.
      * @param rect The Rectangle to modify.
      */
    def CeilAll[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O): O = js.native
    
    /**
      * Moves the top-left corner of a Rectangle so that its center is at the given coordinates.
      * @param rect The Rectangle to be centered.
      * @param x The X coordinate of the Rectangle's center.
      * @param y The Y coordinate of the Rectangle's center.
      */
    def CenterOn[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = js.native
    
    /**
      * Creates a new Rectangle which is identical to the given one.
      * @param source The Rectangle to clone.
      */
    def Clone(source: typings.phaser.Phaser.Geom.Rectangle): typings.phaser.Phaser.Geom.Rectangle = js.native
    
    /**
      * Checks if a given point is inside a Rectangle's bounds.
      * @param rect The Rectangle to check.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def Contains(rect: typings.phaser.Phaser.Geom.Rectangle, x: Double, y: Double): Boolean = js.native
    
    /**
      * Determines whether the specified point is contained within the rectangular region defined by this Rectangle object.
      * @param rect The Rectangle object.
      * @param point The point object to be checked. Can be a Phaser Point object or any object with x and y values.
      */
    def ContainsPoint(rect: typings.phaser.Phaser.Geom.Rectangle, point: typings.phaser.Phaser.Geom.Point): Boolean = js.native
    
    /**
      * Tests if one rectangle fully contains another.
      * @param rectA The first rectangle.
      * @param rectB The second rectangle.
      */
    def ContainsRect(rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    /**
      * Copy the values of one Rectangle to a destination Rectangle.
      * @param source The source Rectangle to copy the values from.
      * @param dest The destination Rectangle to copy the values to.
      */
    def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Rectangle */](source: typings.phaser.Phaser.Geom.Rectangle, dest: O): O = js.native
    
    /**
      * Create an array of points for each corner of a Rectangle
      * If an array is specified, each point object will be added to the end of the array, otherwise a new array will be created.
      * @param rect The Rectangle object to be decomposed.
      * @param out If provided, each point will be added to this array.
      */
    def Decompose(rect: typings.phaser.Phaser.Geom.Rectangle): js.Array[_] = js.native
    def Decompose(rect: typings.phaser.Phaser.Geom.Rectangle, out: js.Array[_]): js.Array[_] = js.native
    
    /**
      * Compares the `x`, `y`, `width` and `height` properties of two rectangles.
      * @param rect Rectangle A
      * @param toCompare Rectangle B
      */
    def Equals(rect: typings.phaser.Phaser.Geom.Rectangle, toCompare: typings.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    /**
      * Adjusts the target rectangle, changing its width, height and position,
      * so that it fits inside the area of the source rectangle, while maintaining its original
      * aspect ratio.
      * 
      * Unlike the `FitOutside` function, there may be some space inside the source area not covered.
      * @param target The target rectangle to adjust.
      * @param source The source rectangle to envelop the target in.
      */
    def FitInside[O /* <: typings.phaser.Phaser.Geom.Rectangle */](target: O, source: typings.phaser.Phaser.Geom.Rectangle): O = js.native
    
    /**
      * Adjusts the target rectangle, changing its width, height and position,
      * so that it fully covers the area of the source rectangle, while maintaining its original
      * aspect ratio.
      * 
      * Unlike the `FitInside` function, the target rectangle may extend further out than the source.
      * @param target The target rectangle to adjust.
      * @param source The source rectangle to envelope the target in.
      */
    def FitOutside[O /* <: typings.phaser.Phaser.Geom.Rectangle */](target: O, source: typings.phaser.Phaser.Geom.Rectangle): O = js.native
    
    /**
      * Rounds down (floors) the top left X and Y coordinates of the given Rectangle to the largest integer less than or equal to them
      * @param rect The rectangle to floor the top left X and Y coordinates of
      */
    def Floor[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O): O = js.native
    
    /**
      * Rounds a Rectangle's position and size down to the largest integer less than or equal to each current coordinate or dimension.
      * @param rect The Rectangle to adjust.
      */
    def FloorAll[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O): O = js.native
    
    /**
      * Constructs new Rectangle or repositions and resizes an existing Rectangle so that all of the given points are on or within its bounds.
      * @param points An array of points (either arrays with two elements corresponding to the X and Y coordinate or an object with public `x` and `y` properties) which should be surrounded by the Rectangle.
      * @param out Optional Rectangle to adjust.
      */
    def FromPoints[O /* <: typings.phaser.Phaser.Geom.Rectangle */](points: js.Array[_]): O = js.native
    def FromPoints[O /* <: typings.phaser.Phaser.Geom.Rectangle */](points: js.Array[_], out: O): O = js.native
    
    /**
      * Create the smallest Rectangle containing two coordinate pairs.
      * @param x1 The X coordinate of the first point.
      * @param y1 The Y coordinate of the first point.
      * @param x2 The X coordinate of the second point.
      * @param y2 The Y coordinate of the second point.
      * @param out Optional Rectangle to adjust.
      */
    def FromXY[O /* <: typings.phaser.Phaser.Geom.Rectangle */](x1: Double, y1: Double, x2: Double, y2: Double): O = js.native
    def FromXY[O /* <: typings.phaser.Phaser.Geom.Rectangle */](x1: Double, y1: Double, x2: Double, y2: Double, out: O): O = js.native
    
    /**
      * Calculates the width/height ratio of a rectangle.
      * @param rect The rectangle.
      */
    def GetAspectRatio(rect: typings.phaser.Phaser.Geom.Rectangle): Double = js.native
    
    /**
      * Returns the center of a Rectangle as a Point.
      * @param rect The Rectangle to get the center of.
      * @param out Optional point-like object to update with the center coordinates.
      */
    def GetCenter[O /* <: typings.phaser.Phaser.Geom.Point */](rect: typings.phaser.Phaser.Geom.Rectangle): O = js.native
    def GetCenter[O /* <: typings.phaser.Phaser.Geom.Point */](rect: typings.phaser.Phaser.Geom.Rectangle, out: O): O = js.native
    
    /**
      * Calculates the coordinates of a point at a certain `position` on the Rectangle's perimeter.
      * 
      * The `position` is a fraction between 0 and 1 which defines how far into the perimeter the point is.
      * 
      * A value of 0 or 1 returns the point at the top left corner of the rectangle, while a value of 0.5 returns the point at the bottom right corner of the rectangle. Values between 0 and 0.5 are on the top or the right side and values between 0.5 and 1 are on the bottom or the left side.
      * @param rectangle The Rectangle to get the perimeter point from.
      * @param position The normalized distance into the Rectangle's perimeter to return.
      * @param out An object to update with the `x` and `y` coordinates of the point.
      */
    def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](rectangle: typings.phaser.Phaser.Geom.Rectangle, position: Double): O = js.native
    def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](rectangle: typings.phaser.Phaser.Geom.Rectangle, position: Double, out: O): O = js.native
    
    /**
      * Return an array of points from the perimeter of the rectangle, each spaced out based on the quantity or step required.
      * @param rectangle The Rectangle object to get the points from.
      * @param step Step between points. Used to calculate the number of points to return when quantity is falsey. Ignored if quantity is positive.
      * @param quantity The number of evenly spaced points from the rectangles perimeter to return. If falsey, step param will be used to calculate the number of points.
      * @param out An optional array to store the points in.
      */
    def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rectangle: typings.phaser.Phaser.Geom.Rectangle, step: Double, quantity: integer): O = js.native
    def GetPoints[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rectangle: typings.phaser.Phaser.Geom.Rectangle, step: Double, quantity: integer, out: O): O = js.native
    
    /**
      * Returns the size of the Rectangle, expressed as a Point object.
      * With the value of the `width` as the `x` property and the `height` as the `y` property.
      * @param rect The Rectangle to get the size from.
      * @param out The Point object to store the size in. If not given, a new Point instance is created.
      */
    def GetSize[O /* <: typings.phaser.Phaser.Geom.Point */](rect: typings.phaser.Phaser.Geom.Rectangle): O = js.native
    def GetSize[O /* <: typings.phaser.Phaser.Geom.Point */](rect: typings.phaser.Phaser.Geom.Rectangle, out: O): O = js.native
    
    /**
      * Increases the size of a Rectangle by a specified amount.
      * 
      * The center of the Rectangle stays the same. The amounts are added to each side, so the actual increase in width or height is two times bigger than the respective argument.
      * @param rect The Rectangle to inflate.
      * @param x How many pixels the left and the right side should be moved by horizontally.
      * @param y How many pixels the top and the bottom side should be moved by vertically.
      */
    def Inflate[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = js.native
    
    /**
      * Takes two Rectangles and first checks to see if they intersect.
      * If they intersect it will return the area of intersection in the `out` Rectangle.
      * If they do not intersect, the `out` Rectangle will have a width and height of zero.
      * @param rectA The first Rectangle to get the intersection from.
      * @param rectB The second Rectangle to get the intersection from.
      * @param out A Rectangle to store the intersection results in.
      */
    def Intersection[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): O = js.native
    def Intersection[O /* <: typings.phaser.Phaser.Geom.Rectangle */](
      rectA: typings.phaser.Phaser.Geom.Rectangle,
      rectB: typings.phaser.Phaser.Geom.Rectangle,
      out: typings.phaser.Phaser.Geom.Rectangle
    ): O = js.native
    
    /**
      * Returns an array of points from the perimeter of the Rectangle, where each point is spaced out based
      * on either the `step` value, or the `quantity`.
      * @param rect The Rectangle to get the perimeter points from.
      * @param step The distance between each point of the perimeter. Set to `null` if you wish to use the `quantity` parameter instead.
      * @param quantity The total number of points to return. The step is then calculated based on the length of the Rectangle, divided by this value.
      * @param out An array in which the perimeter points will be stored. If not given, a new array instance is created.
      */
    def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle): O = js.native
    def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      rect: typings.phaser.Phaser.Geom.Rectangle,
      step: js.UndefOr[scala.Nothing],
      quantity: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: js.UndefOr[scala.Nothing], quantity: integer): O = js.native
    def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      rect: typings.phaser.Phaser.Geom.Rectangle,
      step: js.UndefOr[scala.Nothing],
      quantity: integer,
      out: O
    ): O = js.native
    def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: Double): O = js.native
    def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](
      rect: typings.phaser.Phaser.Geom.Rectangle,
      step: Double,
      quantity: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: Double, quantity: integer): O = js.native
    def MarchingAnts[O /* <: js.Array[typings.phaser.Phaser.Geom.Point] */](rect: typings.phaser.Phaser.Geom.Rectangle, step: Double, quantity: integer, out: O): O = js.native
    
    /**
      * Merges a Rectangle with a list of points by repositioning and/or resizing it such that all points are located on or within its bounds.
      * @param target The Rectangle which should be merged.
      * @param points An array of Points (or any object with public `x` and `y` properties) which should be merged with the Rectangle.
      */
    def MergePoints[O /* <: typings.phaser.Phaser.Geom.Rectangle */](target: O, points: js.Array[typings.phaser.Phaser.Geom.Point]): O = js.native
    
    /**
      * Merges the source rectangle into the target rectangle and returns the target.
      * Neither rectangle should have a negative width or height.
      * @param target Target rectangle. Will be modified to include source rectangle.
      * @param source Rectangle that will be merged into target rectangle.
      */
    def MergeRect[O /* <: typings.phaser.Phaser.Geom.Rectangle */](target: O, source: typings.phaser.Phaser.Geom.Rectangle): O = js.native
    
    /**
      * Merges a Rectangle with a point by repositioning and/or resizing it so that the point is on or within its bounds.
      * @param target The Rectangle which should be merged and modified.
      * @param x The X coordinate of the point which should be merged.
      * @param y The Y coordinate of the point which should be merged.
      */
    def MergeXY[O /* <: typings.phaser.Phaser.Geom.Rectangle */](target: O, x: Double, y: Double): O = js.native
    
    /**
      * Nudges (translates) the top left corner of a Rectangle by a given offset.
      * @param rect The Rectangle to adjust.
      * @param x The distance to move the Rectangle horizontally.
      * @param y The distance to move the Rectangle vertically.
      */
    def Offset[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = js.native
    
    /**
      * Nudges (translates) the top-left corner of a Rectangle by the coordinates of a point (translation vector).
      * @param rect The Rectangle to adjust.
      * @param point The point whose coordinates should be used as an offset.
      */
    def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, point: typings.phaser.Phaser.Geom.Point): O = js.native
    def OffsetPoint[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, point: Vector2): O = js.native
    
    /**
      * Checks if two Rectangles overlap. If a Rectangle is within another Rectangle, the two will be considered overlapping. Thus, the Rectangles are treated as "solid".
      * @param rectA The first Rectangle to check.
      * @param rectB The second Rectangle to check.
      */
    def Overlaps(rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    /**
      * Calculates the perimeter of a Rectangle.
      * @param rect The Rectangle to use.
      */
    def Perimeter(rect: typings.phaser.Phaser.Geom.Rectangle): Double = js.native
    
    /**
      * Returns a Point from the perimeter of a Rectangle based on the given angle.
      * @param rectangle The Rectangle to get the perimeter point from.
      * @param angle The angle of the point, in degrees.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    def PerimeterPoint[O /* <: typings.phaser.Phaser.Geom.Point */](rectangle: typings.phaser.Phaser.Geom.Rectangle, angle: integer): O = js.native
    def PerimeterPoint[O /* <: typings.phaser.Phaser.Geom.Point */](rectangle: typings.phaser.Phaser.Geom.Rectangle, angle: integer, out: O): O = js.native
    
    /**
      * Returns a random point within a Rectangle.
      * @param rect The Rectangle to return a point from.
      * @param out The object to update with the point's coordinates.
      */
    def Random[O /* <: typings.phaser.Phaser.Geom.Point */](rect: typings.phaser.Phaser.Geom.Rectangle, out: O): O = js.native
    
    /**
      * Calculates a random point that lies within the `outer` Rectangle, but outside of the `inner` Rectangle.
      * The inner Rectangle must be fully contained within the outer rectangle.
      * @param outer The outer Rectangle to get the random point within.
      * @param inner The inner Rectangle to exclude from the returned point.
      * @param out A Point, or Point-like object to store the result in. If not specified, a new Point will be created.
      */
    def RandomOutside[O /* <: typings.phaser.Phaser.Geom.Point */](outer: typings.phaser.Phaser.Geom.Rectangle, inner: typings.phaser.Phaser.Geom.Rectangle): O = js.native
    def RandomOutside[O /* <: typings.phaser.Phaser.Geom.Point */](outer: typings.phaser.Phaser.Geom.Rectangle, inner: typings.phaser.Phaser.Geom.Rectangle, out: O): O = js.native
    
    /**
      * Determines if the two objects (either Rectangles or Rectangle-like) have the same width and height values under strict equality.
      * @param rect The first Rectangle object.
      * @param toCompare The second Rectangle object.
      */
    def SameDimensions(rect: typings.phaser.Phaser.Geom.Rectangle, toCompare: typings.phaser.Phaser.Geom.Rectangle): Boolean = js.native
    
    /**
      * Scales the width and height of this Rectangle by the given amounts.
      * @param rect The `Rectangle` object that will be scaled by the specified amount(s).
      * @param x The factor by which to scale the rectangle horizontally.
      * @param y The amount by which to scale the rectangle vertically. If this is not specified, the rectangle will be scaled by the factor `x` in both directions.
      */
    def Scale[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rect: O, x: Double, y: Double): O = js.native
    
    /**
      * Creates a new Rectangle or repositions and/or resizes an existing Rectangle so that it encompasses the two given Rectangles, i.e. calculates their union.
      * @param rectA The first Rectangle to use.
      * @param rectB The second Rectangle to use.
      * @param out The Rectangle to store the union in.
      */
    def Union[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle): O = js.native
    def Union[O /* <: typings.phaser.Phaser.Geom.Rectangle */](rectA: typings.phaser.Phaser.Geom.Rectangle, rectB: typings.phaser.Phaser.Geom.Rectangle, out: O): O = js.native
  }
  
  /**
    * A triangle is a plane created by connecting three points.
    * The first two arguments specify the first point, the middle two arguments
    * specify the second point, and the last two arguments specify the third point.
    */
  @js.native
  class Triangle protected ()
    extends typings.phaser.Phaser.Geom.Triangle {
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
  }
  /* static members */
  @js.native
  object Triangle extends js.Object {
    
    /**
      * Returns the area of a Triangle.
      * @param triangle The Triangle to use.
      */
    def Area(triangle: typings.phaser.Phaser.Geom.Triangle): Double = js.native
    
    /**
      * Builds an equilateral triangle. In the equilateral triangle, all the sides are the same length (congruent) and all the angles are the same size (congruent).
      * The x/y specifies the top-middle of the triangle (x1/y1) and length is the length of each side.
      * @param x x coordinate of the top point of the triangle.
      * @param y y coordinate of the top point of the triangle.
      * @param length Length of each side of the triangle.
      */
    def BuildEquilateral(x: Double, y: Double, length: Double): typings.phaser.Phaser.Geom.Triangle = js.native
    
    /**
      * Takes an array of vertex coordinates, and optionally an array of hole indices, then returns an array
      * of Triangle instances, where the given vertices have been decomposed into a series of triangles.
      * @param data A flat array of vertex coordinates like [x0,y0, x1,y1, x2,y2, ...]
      * @param holes An array of hole indices if any (e.g. [5, 8] for a 12-vertex input would mean one hole with vertices 5–7 and another with 8–11). Default null.
      * @param scaleX Horizontal scale factor to multiply the resulting points by. Default 1.
      * @param scaleY Vertical scale factor to multiply the resulting points by. Default 1.
      * @param out An array to store the resulting Triangle instances in. If not provided, a new array is created.
      */
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_]): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](
      data: js.Array[_],
      holes: js.UndefOr[scala.Nothing],
      scaleX: js.UndefOr[scala.Nothing],
      scaleY: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](
      data: js.Array[_],
      holes: js.UndefOr[scala.Nothing],
      scaleX: js.UndefOr[scala.Nothing],
      scaleY: Double
    ): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](
      data: js.Array[_],
      holes: js.UndefOr[scala.Nothing],
      scaleX: js.UndefOr[scala.Nothing],
      scaleY: Double,
      out: O
    ): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.UndefOr[scala.Nothing], scaleX: Double): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](
      data: js.Array[_],
      holes: js.UndefOr[scala.Nothing],
      scaleX: Double,
      scaleY: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.UndefOr[scala.Nothing], scaleX: Double, scaleY: Double): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.UndefOr[scala.Nothing], scaleX: Double, scaleY: Double, out: O): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_]): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](
      data: js.Array[_],
      holes: js.Array[_],
      scaleX: js.UndefOr[scala.Nothing],
      scaleY: js.UndefOr[scala.Nothing],
      out: O
    ): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: js.UndefOr[scala.Nothing], scaleY: Double): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: js.UndefOr[scala.Nothing], scaleY: Double, out: O): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double, scaleY: js.UndefOr[scala.Nothing], out: O): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double, scaleY: Double): O = js.native
    def BuildFromPolygon[O /* <: js.Array[typings.phaser.Phaser.Geom.Triangle] */](data: js.Array[_], holes: js.Array[_], scaleX: Double, scaleY: Double, out: O): O = js.native
    
    /**
      * Builds a right triangle, i.e. one which has a 90-degree angle and two acute angles.
      * @param x The X coordinate of the right angle, which will also be the first X coordinate of the constructed Triangle.
      * @param y The Y coordinate of the right angle, which will also be the first Y coordinate of the constructed Triangle.
      * @param width The length of the side which is to the left or to the right of the right angle.
      * @param height The length of the side which is above or below the right angle.
      */
    def BuildRight(x: Double, y: Double, width: Double, height: Double): typings.phaser.Phaser.Geom.Triangle = js.native
    
    /**
      * Positions the Triangle so that it is centered on the given coordinates.
      * @param triangle The triangle to be positioned.
      * @param x The horizontal coordinate to center on.
      * @param y The vertical coordinate to center on.
      * @param centerFunc The function used to center the triangle. Defaults to Centroid centering.
      */
    def CenterOn[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double): O = js.native
    def CenterOn[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double, centerFunc: CenterFunction): O = js.native
    
    /**
      * Calculates the position of a Triangle's centroid, which is also its center of mass (center of gravity).
      * 
      * The centroid is the point in a Triangle at which its three medians (the lines drawn from the vertices to the bisectors of the opposite sides) meet. It divides each one in a 2:1 ratio.
      * @param triangle The Triangle to use.
      * @param out An object to store the coordinates in.
      */
    def Centroid[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle): O = js.native
    def Centroid[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, out: O): O = js.native
    
    /**
      * Computes the circumcentre of a triangle. The circumcentre is the centre of
      * the circumcircle, the smallest circle which encloses the triangle. It is also
      * the common intersection point of the perpendicular bisectors of the sides of
      * the triangle, and is the only point which has equal distance to all three
      * vertices of the triangle.
      * @param triangle The Triangle to get the circumcenter of.
      * @param out The Vector2 object to store the position in. If not given, a new Vector2 instance is created.
      */
    def CircumCenter[O /* <: Vector2 */](triangle: typings.phaser.Phaser.Geom.Triangle): O = js.native
    def CircumCenter[O /* <: Vector2 */](triangle: typings.phaser.Phaser.Geom.Triangle, out: O): O = js.native
    
    /**
      * Finds the circumscribed circle (circumcircle) of a Triangle object. The circumcircle is the circle which touches all of the triangle's vertices.
      * @param triangle The Triangle to use as input.
      * @param out An optional Circle to store the result in.
      */
    def CircumCircle[O /* <: typings.phaser.Phaser.Geom.Circle */](triangle: typings.phaser.Phaser.Geom.Triangle): O = js.native
    def CircumCircle[O /* <: typings.phaser.Phaser.Geom.Circle */](triangle: typings.phaser.Phaser.Geom.Triangle, out: O): O = js.native
    
    /**
      * Clones a Triangle object.
      * @param source The Triangle to clone.
      */
    def Clone(source: typings.phaser.Phaser.Geom.Triangle): typings.phaser.Phaser.Geom.Triangle = js.native
    
    /**
      * Checks if a point (as a pair of coordinates) is inside a Triangle's bounds.
      * @param triangle The Triangle to check.
      * @param x The X coordinate of the point to check.
      * @param y The Y coordinate of the point to check.
      */
    def Contains(triangle: typings.phaser.Phaser.Geom.Triangle, x: Double, y: Double): Boolean = js.native
    
    /**
      * Filters an array of point-like objects to only those contained within a triangle.
      * If `returnFirst` is true, will return an array containing only the first point in the provided array that is within the triangle (or an empty array if there are no such points).
      * @param triangle The triangle that the points are being checked in.
      * @param points An array of point-like objects (objects that have an `x` and `y` property)
      * @param returnFirst If `true`, return an array containing only the first point found that is within the triangle. Default false.
      * @param out If provided, the points that are within the triangle will be appended to this array instead of being added to a new array. If `returnFirst` is true, only the first point found within the triangle will be appended. This array will also be returned by this function.
      */
    def ContainsArray(triangle: typings.phaser.Phaser.Geom.Triangle, points: js.Array[typings.phaser.Phaser.Geom.Point]): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    def ContainsArray(
      triangle: typings.phaser.Phaser.Geom.Triangle,
      points: js.Array[typings.phaser.Phaser.Geom.Point],
      returnFirst: js.UndefOr[scala.Nothing],
      out: js.Array[_]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    def ContainsArray(
      triangle: typings.phaser.Phaser.Geom.Triangle,
      points: js.Array[typings.phaser.Phaser.Geom.Point],
      returnFirst: Boolean
    ): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    def ContainsArray(
      triangle: typings.phaser.Phaser.Geom.Triangle,
      points: js.Array[typings.phaser.Phaser.Geom.Point],
      returnFirst: Boolean,
      out: js.Array[_]
    ): js.Array[typings.phaser.Phaser.Geom.Point] = js.native
    
    def ContainsPoint(triangle: typings.phaser.Phaser.Geom.Triangle, point: js.Any): Boolean = js.native
    /**
      * Tests if a triangle contains a point.
      * @param triangle The triangle.
      * @param point The point to test, or any point-like object with public `x` and `y` properties.
      */
    def ContainsPoint(triangle: typings.phaser.Phaser.Geom.Triangle, point: typings.phaser.Phaser.Geom.Point): Boolean = js.native
    def ContainsPoint(triangle: typings.phaser.Phaser.Geom.Triangle, point: Vector2): Boolean = js.native
    
    /**
      * Copy the values of one Triangle to a destination Triangle.
      * @param source The source Triangle to copy the values from.
      * @param dest The destination Triangle to copy the values to.
      */
    def CopyFrom[O /* <: typings.phaser.Phaser.Geom.Triangle */](source: typings.phaser.Phaser.Geom.Triangle, dest: O): O = js.native
    
    /**
      * Decomposes a Triangle into an array of its points.
      * @param triangle The Triangle to decompose.
      * @param out An array to store the points into.
      */
    def Decompose(triangle: typings.phaser.Phaser.Geom.Triangle): js.Array[_] = js.native
    def Decompose(triangle: typings.phaser.Phaser.Geom.Triangle, out: js.Array[_]): js.Array[_] = js.native
    
    /**
      * Returns true if two triangles have the same coordinates.
      * @param triangle The first triangle to check.
      * @param toCompare The second triangle to check.
      */
    def Equals(triangle: typings.phaser.Phaser.Geom.Triangle, toCompare: typings.phaser.Phaser.Geom.Triangle): Boolean = js.native
    
    /**
      * Returns a Point from around the perimeter of a Triangle.
      * @param triangle The Triangle to get the point on its perimeter from.
      * @param position The position along the perimeter of the triangle. A value between 0 and 1.
      * @param out An option Point, or Point-like object to store the value in. If not given a new Point will be created.
      */
    def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, position: Double): O = js.native
    def GetPoint[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, position: Double, out: O): O = js.native
    
    /**
      * Returns an array of evenly spaced points on the perimeter of a Triangle.
      * @param triangle The Triangle to get the points from.
      * @param quantity The number of evenly spaced points to return. Set to 0 to return an arbitrary number of points based on the `stepRate`.
      * @param stepRate If `quantity` is 0, the distance between each returned point.
      * @param out An array to which the points should be appended.
      */
    def GetPoints[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, quantity: integer, stepRate: Double): O = js.native
    def GetPoints[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, quantity: integer, stepRate: Double, out: O): O = js.native
    
    /**
      * Calculates the position of the incenter of a Triangle object. This is the point where its three angle bisectors meet and it's also the center of the incircle, which is the circle inscribed in the triangle.
      * @param triangle The Triangle to find the incenter of.
      * @param out An optional Point in which to store the coordinates.
      */
    def InCenter[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle): O = js.native
    def InCenter[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, out: O): O = js.native
    
    /**
      * Moves each point (vertex) of a Triangle by a given offset, thus moving the entire Triangle by that offset.
      * @param triangle The Triangle to move.
      * @param x The horizontal offset (distance) by which to move each point. Can be positive or negative.
      * @param y The vertical offset (distance) by which to move each point. Can be positive or negative.
      */
    def Offset[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double): O = js.native
    
    /**
      * Gets the length of the perimeter of the given triangle.
      * Calculated by adding together the length of each of the three sides.
      * @param triangle The Triangle to get the length from.
      */
    def Perimeter(triangle: typings.phaser.Phaser.Geom.Triangle): Double = js.native
    
    /**
      * Returns a random Point from within the area of the given Triangle.
      * @param triangle The Triangle to get a random point from.
      * @param out The Point object to store the position in. If not given, a new Point instance is created.
      */
    def Random[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle): O = js.native
    def Random[O /* <: typings.phaser.Phaser.Geom.Point */](triangle: typings.phaser.Phaser.Geom.Triangle, out: O): O = js.native
    
    /**
      * Rotates a Triangle about its incenter, which is the point at which its three angle bisectors meet.
      * @param triangle The Triangle to rotate.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    def Rotate[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, angle: Double): O = js.native
    
    /**
      * Rotates a Triangle at a certain angle about a given Point or object with public `x` and `y` properties.
      * @param triangle The Triangle to rotate.
      * @param point The Point to rotate the Triangle about.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    def RotateAroundPoint[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, point: typings.phaser.Phaser.Geom.Point, angle: Double): O = js.native
    
    /**
      * Rotates an entire Triangle at a given angle about a specific point.
      * @param triangle The Triangle to rotate.
      * @param x The X coordinate of the point to rotate the Triangle about.
      * @param y The Y coordinate of the point to rotate the Triangle about.
      * @param angle The angle by which to rotate the Triangle, in radians.
      */
    def RotateAroundXY[O /* <: typings.phaser.Phaser.Geom.Triangle */](triangle: O, x: Double, y: Double, angle: Double): O = js.native
  }
}
