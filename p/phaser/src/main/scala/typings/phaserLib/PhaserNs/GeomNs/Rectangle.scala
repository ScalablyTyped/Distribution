package typings
package phaserLib.PhaserNs.GeomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates a 2D rectangle defined by its corner point in the top-left and its extends in x (width) and y (height)
  */
@JSGlobal("Phaser.Geom.Rectangle")
@js.native
/**
  * 
  * @param x The X coordinate of the top left corner of the Rectangle. Default 0.
  * @param y The Y coordinate of the top left corner of the Rectangle. Default 0.
  * @param width The width of the Rectangle. Default 0.
  * @param height The height of the Rectangle. Default 0.
  */
class Rectangle () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  /**
    * The sum of the y and height properties.
    * Changing the bottom property of a Rectangle object has no effect on the x, y and width properties, but does change the height property.
    */
  var bottom: scala.Double = js.native
  /**
    * The x coordinate of the center of the Rectangle.
    */
  var centerX: scala.Double = js.native
  /**
    * The y coordinate of the center of the Rectangle.
    */
  var centerY: scala.Double = js.native
  /**
    * The height of the Rectangle, i.e. the distance between its top side (defined by `y`) and its bottom side.
    */
  var height: scala.Double = js.native
  /**
    * The x coordinate of the left of the Rectangle.
    * Changing the left property of a Rectangle object has no effect on the y and height properties. However it does affect the width property, whereas changing the x value does not affect the width property.
    */
  var left: scala.Double = js.native
  /**
    * The sum of the x and width properties.
    * Changing the right property of a Rectangle object has no effect on the x, y and height properties, however it does affect the width property.
    */
  var right: scala.Double = js.native
  /**
    * The y coordinate of the top of the Rectangle. Changing the top property of a Rectangle object has no effect on the x and width properties.
    * However it does affect the height property, whereas changing the y value does not affect the height property.
    */
  var top: scala.Double = js.native
  /**
    * The width of the Rectangle, i.e. the distance between its left side (defined by `x`) and its right side.
    */
  var width: scala.Double = js.native
  /**
    * The X coordinate of the top left corner of the Rectangle.
    */
  var x: scala.Double = js.native
  /**
    * The Y coordinate of the top left corner of the Rectangle.
    */
  var y: scala.Double = js.native
  /**
    * Checks if the given point is inside the Rectangle's bounds.
    * @param x The X coordinate of the point to check.
    * @param y The Y coordinate of the point to check.
    */
  def contains(x: scala.Double, y: scala.Double): scala.Boolean = js.native
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
  def getPoint[O /* <: Point */](position: scala.Double): O = js.native
  def getPoint[O /* <: Point */](position: scala.Double, output: O): O = js.native
  /**
    * Returns an array of points from the perimeter of the Rectangle, each spaced out based on the quantity or step required.
    * @param quantity The number of points to return. Set to `false` or 0 to return an arbitrary number of points (`perimeter / stepRate`) evenly spaced around the Rectangle based on the `stepRate`.
    * @param stepRate If `quantity` is 0, determines the normalized distance between each returned point.
    * @param output An array to which to append the points.
    */
  def getPoints[O /* <: js.Array[Point] */](quantity: phaserLib.integer): O = js.native
  def getPoints[O /* <: js.Array[Point] */](quantity: phaserLib.integer, stepRate: scala.Double): O = js.native
  def getPoints[O /* <: js.Array[Point] */](quantity: phaserLib.integer, stepRate: scala.Double, output: O): O = js.native
  /**
    * Returns a random point within the Rectangle's bounds.
    * @param point The object in which to store the `x` and `y` coordinates of the point.
    */
  def getRandomPoint[O /* <: Point */](): O = js.native
  def getRandomPoint[O /* <: Point */](point: O): O = js.native
  /**
    * Determines if the Rectangle is empty. A Rectangle is empty if its width or height is less than or equal to 0.
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    * Resets the position, width, and height of the Rectangle to 0.
    */
  def setEmpty(): Rectangle = js.native
  /**
    * Sets the position of the Rectangle.
    * @param x The X coordinate of the top left corner of the Rectangle.
    * @param y The Y coordinate of the top left corner of the Rectangle. Default x.
    */
  def setPosition(x: scala.Double): Rectangle = js.native
  def setPosition(x: scala.Double, y: scala.Double): Rectangle = js.native
  /**
    * Sets the width and height of the Rectangle.
    * @param width The width to set the Rectangle to.
    * @param height The height to set the Rectangle to. Default width.
    */
  def setSize(width: scala.Double): Rectangle = js.native
  def setSize(width: scala.Double, height: scala.Double): Rectangle = js.native
  /**
    * Sets the position, width, and height of the Rectangle.
    * @param x The X coordinate of the top left corner of the Rectangle.
    * @param y The Y coordinate of the top left corner of the Rectangle.
    * @param width The width of the Rectangle.
    * @param height The height of the Rectangle.
    */
  def setTo(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Rectangle = js.native
}

/* static members */
@JSGlobal("Phaser.Geom.Rectangle")
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

