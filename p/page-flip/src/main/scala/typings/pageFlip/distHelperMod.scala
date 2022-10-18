package typings.pageFlip

import typings.pageFlip.distBasicTypesMod.Point
import typings.pageFlip.distBasicTypesMod.Rect
import typings.pageFlip.distBasicTypesMod.Segment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelperMod {
  
  object Helper {
    
    @JSImport("page-flip/dist/Helper", "Helper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the angle between two lines
      */
    inline def GetAngleBetweenTwoLine(line1: Segment, line2: Segment): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAngleBetweenTwoLine")(line1.asInstanceOf[js.Any], line2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Get a list of coordinates (step: 1px) between two points
      */
    inline def GetCordsFromTwoPoint(pointOne: Point, pointTwo: Point): js.Array[Point] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCordsFromTwoPoint")(pointOne.asInstanceOf[js.Any], pointTwo.asInstanceOf[js.Any])).asInstanceOf[js.Array[Point]]
    
    /**
      * Get the distance between two points
      */
    inline def GetDistanceBetweenTwoPoint(point1: Point, point2: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("GetDistanceBetweenTwoPoint")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the intersection point of two lines
      *
      * @throws Error if the segments are on the same line
      */
    inline def GetIntersectBeetwenTwoLine(one: Segment, two: Segment): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("GetIntersectBeetwenTwoLine")(one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * Find the intersection of two lines bounded by a rectangle "rectBorder"
      */
    inline def GetIntersectBetweenTwoSegment(rectBorder: Rect, one: Segment, two: Segment): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("GetIntersectBetweenTwoSegment")(rectBorder.asInstanceOf[js.Any], one.asInstanceOf[js.Any], two.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * Transform point coordinates to a given angle
      */
    inline def GetRotatedPoint(transformedPoint: Point, startPoint: Point, angle: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("GetRotatedPoint")(transformedPoint.asInstanceOf[js.Any], startPoint.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * Get the length of the line segment
      */
    inline def GetSegmentLength(segment: Segment): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSegmentLength")(segment.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Limit a point "linePoint" to a given circle centered at point "startPoint" and a given radius
      */
    inline def LimitPointToCircle(startPoint: Point, radius: Double, limitedPoint: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("LimitPointToCircle")(startPoint.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], limitedPoint.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    /**
      * Check for a point in a rectangle
      */
    inline def PointInRect(rect: Rect, pos: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("PointInRect")(rect.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Point]
  }
}
