package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogoControlOptions extends StObject {
  
  var position: Position
}
object LogoControlOptions {
  
  inline def apply(position: Position): LogoControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoControlOptions]
  }
  
  extension [Self <: LogoControlOptions](x: Self) {
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
