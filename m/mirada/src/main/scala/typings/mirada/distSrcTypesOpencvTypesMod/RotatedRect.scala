package typings.mirada.distSrcTypesOpencvTypesMod

import typings.mirada.distSrcTypesOpencvHacksMod.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_types", "RotatedRect")
@js.native
open class RotatedRect ()
  extends typings.mirada.distSrcTypesOpencvRotatedRectMod.RotatedRect {
  /**
    *   full constructor
    *
    * @param center The rectangle mass center.
    *
    * @param size Width and height of the rectangle.
    *
    * @param angle The rotation angle in a clockwise direction. When the angle is 0, 90, 180, 270 etc.,
    * the rectangle becomes an up-right rectangle.
    */
  def this(center: Point2f, size: Size2f, angle: float) = this()
  /**
    *   Any 3 end points of the [RotatedRect]. They must be given in order (either clockwise or
    * anticlockwise).
    */
  def this(point1: Point2f, point2: Point2f, point3: Point2f) = this()
}
