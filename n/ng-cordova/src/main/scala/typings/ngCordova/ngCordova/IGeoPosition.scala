package typings.ngCordova.ngCordova

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoPosition extends StObject {
  
  var coords: IGeoCoordinates
  
  var timestamp: Date
}
object IGeoPosition {
  
  inline def apply(coords: IGeoCoordinates, timestamp: Date): IGeoPosition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoPosition]
  }
  
  extension [Self <: IGeoPosition](x: Self) {
    
    inline def setCoords(value: IGeoCoordinates): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
