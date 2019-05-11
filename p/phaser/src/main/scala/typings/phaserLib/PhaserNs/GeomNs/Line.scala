package typings
package phaserLib.PhaserNs.GeomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a Line segment, a part of a line between two endpoints.
  */
@JSGlobal("Phaser.Geom.Line")
@js.native
/**
  * 
  * @param x1 The x coordinate of the lines starting point. Default 0.
  * @param y1 The y coordinate of the lines starting point. Default 0.
  * @param x2 The x coordinate of the lines ending point. Default 0.
  * @param y2 The y coordinate of the lines ending point. Default 0.
  */
class Line () extends js.Object {
  def this(x1: scala.Double) = this()
  def this(x1: scala.Double, y1: scala.Double) = this()
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double) = this()
  def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double) = this()
  /**
    * The bottom position of the Line.
    */
  var bottom: scala.Double = js.native
  /**
    * The left position of the Line.
    */
  var left: scala.Double = js.native
  /**
    * The right position of the Line.
    */
  var right: scala.Double = js.native
  /**
    * The top position of the Line.
    */
  var top: scala.Double = js.native
  /**
    * The x coordinate of the lines starting point.
    */
  var x1: scala.Double = js.native
  /**
    * The x coordinate of the lines ending point.
    */
  var x2: scala.Double = js.native
  /**
    * The y coordinate of the lines starting point.
    */
  var y1: scala.Double = js.native
  /**
    * The y coordinate of the lines ending point.
    */
  var y2: scala.Double = js.native
  /**
    * Get a point on a line that's a given percentage along its length.
    * @param position A value between 0 and 1, where 0 is the start, 0.5 is the middle and 1 is the end of the line.
    * @param output An optional point, or point-like object, to store the coordinates of the point on the line.
    */
  def getPoint[O /* <: Point */](position: scala.Double): O = js.native
  def getPoint[O /* <: Point */](position: scala.Double, output: O): O = js.native
  /**
    * Returns a Vector2 object that corresponds to the start of this Line.
    * @param vec2 A Vector2 object to set the results in. If `undefined` a new Vector2 will be created.
    */
  def getPointA[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getPointA[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](vec2: O): O = js.native
  /**
    * Returns a Vector2 object that corresponds to the end of this Line.
    * @param vec2 A Vector2 object to set the results in. If `undefined` a new Vector2 will be created.
    */
  def getPointB[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](): O = js.native
  def getPointB[O /* <: phaserLib.PhaserNs.MathNs.Vector2 */](vec2: O): O = js.native
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
  def getPoints[O /* <: Point */](quantity: phaserLib.integer): O = js.native
  def getPoints[O /* <: Point */](quantity: phaserLib.integer, stepRate: phaserLib.integer): O = js.native
  def getPoints[O /* <: Point */](quantity: phaserLib.integer, stepRate: phaserLib.integer, output: O): O = js.native
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
  def setTo(x1: scala.Double): Line = js.native
  def setTo(x1: scala.Double, y1: scala.Double): Line = js.native
  def setTo(x1: scala.Double, y1: scala.Double, x2: scala.Double): Line = js.native
  def setTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): Line = js.native
}

/* static members */
@JSGlobal("Phaser.Geom.Line")
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

