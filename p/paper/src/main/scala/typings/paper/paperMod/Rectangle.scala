package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A Rectangle specifies an area that is enclosed by it's top-left
  * point (x, y), its width, and its height. It should not be confused with a
  * rectangular path, it is not an item.
  */
@JSImport("paper", "Rectangle")
@js.native
class Rectangle protected ()
  extends typings.paper.paper.Rectangle {
  /** 
    * Creates a Rectangle object.
    * 
    * @param object - an object containing properties to be set on the
    * rectangle
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a new rectangle object from the passed rectangle object.
    */
  def this(rectangle: typings.paper.paper.Rectangle) = this()
  /** 
    * Creates a rectangle object from the passed points. These do not
    * necessarily need to be the top left and bottom right corners, the
    * constructor figures out how to fit a rectangle between them.
    * 
    * @param from - the first point defining the rectangle
    * @param to - the second point defining the rectangle
    */
  def this(from: typings.paper.paper.Point, to: typings.paper.paper.Point) = this()
  /** 
    * Creates a Rectangle object.
    * 
    * @param point - the top-left point of the rectangle
    * @param size - the size of the rectangle
    */
  def this(point: typings.paper.paper.Point, size: typings.paper.paper.Size) = this()
  /** 
    * Creates a rectangle object.
    * 
    * @param x - the left coordinate
    * @param y - the top coordinate
    */
  def this(x: Double, y: Double, width: Double, height: Double) = this()
}

