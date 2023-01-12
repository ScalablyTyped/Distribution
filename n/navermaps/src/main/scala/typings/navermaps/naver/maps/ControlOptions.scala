package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ControlOptions
  */
trait ControlOptions extends StObject {
  
  var position: Position
}
object ControlOptions {
  
  inline def apply(position: Position): ControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlOptions] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
