package typings.paper.global.paper

import typings.paper.paper.PointLike
import typings.paper.paper.RectangleLike
import typings.paper.paper.SizeLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A Rectangle specifies an area that is enclosed by it's top-left
  * point (x, y), its width, and its height. It should not be confused with a
  * rectangular path, it is not an item.
  */
@JSGlobal("paper.Rectangle")
@js.native
open class Rectangle protected ()
  extends StObject
     with typings.paper.paper.Rectangle {
  /** 
    * Creates a new rectangle object from the passed rectangle object.
    */
  /** 
    * Creates a Rectangle object.
    * 
    * @param object - an object containing properties to be set on the
    * rectangle
    */
  def this(rectangle: js.Object | RectangleLike) = this()
  /** 
    * Creates a Rectangle object.
    * 
    * @param point - the top-left point of the rectangle
    * @param size - the size of the rectangle
    */
  /** 
    * Creates a rectangle object from the passed points. These do not
    * necessarily need to be the top left and bottom right corners, the
    * constructor figures out how to fit a rectangle between them.
    * 
    * @param from - the first point defining the rectangle
    * @param to - the second point defining the rectangle
    */
  def this(point: PointLike, size: PointLike | SizeLike) = this()
  /** 
    * Creates a rectangle object.
    * 
    * @param x - the left coordinate
    * @param y - the top coordinate
    */
  def this(x: Double, y: Double, width: Double, height: Double) = this()
}
