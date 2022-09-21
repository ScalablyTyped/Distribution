package typings.navermaps.naver.maps.Service

import typings.navermaps.naver.maps.Coord
import typings.navermaps.naver.maps.CoordLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReverseServiceOptions
  extends StObject
     with ServiceOptions {
  
  var coords: String | Coord | CoordLiteral
}
object ReverseServiceOptions {
  
  inline def apply(coords: String | Coord | CoordLiteral): ReverseServiceOptions = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseServiceOptions]
  }
  
  extension [Self <: ReverseServiceOptions](x: Self) {
    
    inline def setCoords(value: String | Coord | CoordLiteral): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
  }
}
