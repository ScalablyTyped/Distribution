package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projection extends StObject {
  
  def fromCoordToPoint(coord: Coord): Point
  
  def fromPointToCoord(point: Point): Coord
}
object Projection {
  
  inline def apply(fromCoordToPoint: Coord => Point, fromPointToCoord: Point => Coord): Projection = {
    val __obj = js.Dynamic.literal(fromCoordToPoint = js.Any.fromFunction1(fromCoordToPoint), fromPointToCoord = js.Any.fromFunction1(fromPointToCoord))
    __obj.asInstanceOf[Projection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
    
    inline def setFromCoordToPoint(value: Coord => Point): Self = StObject.set(x, "fromCoordToPoint", js.Any.fromFunction1(value))
    
    inline def setFromPointToCoord(value: Point => Coord): Self = StObject.set(x, "fromPointToCoord", js.Any.fromFunction1(value))
  }
}
