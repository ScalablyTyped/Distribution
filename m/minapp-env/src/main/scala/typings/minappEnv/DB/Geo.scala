package typings.minappEnv.DB

import typings.minappEnv.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geo extends StObject {
  
  def Point(longitude: Double, latitide: Double): GeoPoint
  @JSName("Point")
  var Point_Original: Call
}
object Geo {
  
  @scala.inline
  def apply(Point: Call): Geo = {
    val __obj = js.Dynamic.literal(Point = Point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geo]
  }
  
  @scala.inline
  implicit class GeoMutableBuilder[Self <: Geo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoint(value: Call): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
  }
}
