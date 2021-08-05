package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapDataControlOptions extends StObject {
  
  var position: Position
}
object MapDataControlOptions {
  
  inline def apply(position: Position): MapDataControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDataControlOptions]
  }
  
  extension [Self <: MapDataControlOptions](x: Self) {
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
