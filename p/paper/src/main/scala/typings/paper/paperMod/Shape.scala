package typings.paper.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Shape")
@js.native
class Shape ()
  extends typings.paper.paperNs.Shape

/* static members */
@JSImport("paper", "Shape")
@js.native
object Shape extends js.Object {
  /**
    * Creates a circular shape item.
    * @param center - the center point of the circle
    * @param radius - the radius of the circle
    */
  def Circle(center: typings.paper.paperNs.Point, radius: Double): typings.paper.paperNs.Shape = js.native
  /**
    * Creates a circular shape item from the properties described by an object literal.
    * @param object - an object literal containing properties descriving the shapes attributes
    */
  def Circle(`object`: js.Any): typings.paper.paperNs.Shape = js.native
  /**
    * Creates an elliptical shape item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the shape's attributes
    */
  def Ellipse(`object`: js.Any): typings.paper.paperNs.Shape = js.native
  /**
    * Creates an elliptical shape item.
    * @param rectangle - the rectangle circumscribing the ellipse
    */
  def Ellipse(rectangle: typings.paper.paperNs.Rectangle): typings.paper.paperNs.Shape = js.native
  /**
    * Creates a rectangular shape item from the passed points. These do not necessarily need to be the top left and bottom right corners, the constructor figures out how to fit a rectangle between them.
    * @param from - the first point defining the rectangle
    * @param to - the second point defining the rectangle
    */
  def Rectangle(from: typings.paper.paperNs.Point, to: typings.paper.paperNs.Point): typings.paper.paperNs.Shape = js.native
  /**
    * Creates a rectangular shape item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the shape's attributes
    */
  def Rectangle(`object`: js.Any): typings.paper.paperNs.Shape = js.native
  /**
    * Creates a rectangular shape item from a point and a size object.
    * @param point - the rectangle's top-left corner
    * @param size - the rectangle's size.
    */
  def Rectangle(point: typings.paper.paperNs.Point, size: typings.paper.paperNs.Size): typings.paper.paperNs.Shape = js.native
  /**
    * Creates a rectangular shape item, with optionally rounded corners.
    * @param rectangle - the rectangle object describing the geometry of the rectangular shape to be created.
    * @param radius [optional] - the size of the rounded corners, default: null
    */
  def Rectangle(rectangle: typings.paper.paperNs.Rectangle): typings.paper.paperNs.Shape = js.native
  def Rectangle(rectangle: typings.paper.paperNs.Rectangle, radius: Double): typings.paper.paperNs.Shape = js.native
}

