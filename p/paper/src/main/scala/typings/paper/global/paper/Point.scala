package typings.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Point object represents a point in the two dimensional space
  * of the Paper.js project. It is also used to represent two dimensional
  * vector objects.
  */
@JSGlobal("paper.Point")
@js.native
class Point protected ()
  extends StObject
     with typings.paper.paper.Point {
  /** 
    * Creates a Point object using the numbers in the given array as
    * coordinates.
    */
  def this(array: js.Array[js.Any]) = this()
  /** 
    * Creates a Point object using the properties in the given object.
    * 
    * @param object - the object describing the point's properties
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a Point object using the coordinates of the given Point object.
    */
  def this(point: typings.paper.paper.Point) = this()
  /** 
    * Creates a Point object using the width and height values of the given
    * Size object.
    */
  def this(size: typings.paper.paper.Size) = this()
  /** 
    * Creates a Point object with the given x and y coordinates.
    * 
    * @param x - the x coordinate
    * @param y - the y coordinate
    */
  def this(x: Double, y: Double) = this()
}
object Point {
  
  @JSGlobal("paper.Point")
  @js.native
  val ^ : js.Any = js.native
  
  /** 
    * Returns a new point object with the largest {@link #x} and
    * {@link #y} of the supplied points.
    * 
    * @return the newly created point object
    */
  /* static member */
  @scala.inline
  def max(point1: typings.paper.paper.Point, point2: typings.paper.paper.Point): typings.paper.paper.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[typings.paper.paper.Point]
  
  /** 
    * Returns a new point object with the smallest {@link #x} and
    * {@link #y} of the supplied points.
    * 
    * @return the newly created point object
    */
  /* static member */
  @scala.inline
  def min(point1: typings.paper.paper.Point, point2: typings.paper.paper.Point): typings.paper.paper.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[typings.paper.paper.Point]
  
  /** 
    * Returns a point object with random {@link #x} and {@link #y} values
    * between `0` and `1`.
    * 
    * @return the newly created point object
    */
  /* static member */
  @scala.inline
  def random(): typings.paper.paper.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.paper.paper.Point]
}
