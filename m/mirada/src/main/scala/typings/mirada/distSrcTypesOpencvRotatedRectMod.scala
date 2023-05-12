package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.float
import typings.mirada.distSrcTypesOpencvTypesMod.Point2f
import typings.mirada.distSrcTypesOpencvTypesMod.Rect
import typings.mirada.distSrcTypesOpencvTypesMod.Rect_
import typings.mirada.distSrcTypesOpencvTypesMod.Size2f
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvRotatedRectMod {
  
  @JSImport("mirada/dist/src/types/opencv/RotatedRect", "RotatedRect")
  @js.native
  open class RotatedRect () extends StObject {
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
    
    var angle: float = js.native
    
    def boundingRect(): Rect = js.native
    
    def boundingRect2f(): Rect_ = js.native
    
    var center: Point2f = js.native
    
    /**
      *   returns 4 vertices of the rectangle
      *
      * @param pts The points array for storing rectangle vertices. The order is bottomLeft, topLeft,
      * topRight, bottomRight.
      */
    def points(pts: Point2f): Point2f = js.native
    
    var size: Size2f = js.native
  }
}
