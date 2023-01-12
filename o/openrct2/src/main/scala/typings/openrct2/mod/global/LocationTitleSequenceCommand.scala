package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var `type`: location
  
  var x: Double
  
  var y: Double
}
object LocationTitleSequenceCommand {
  
  inline def apply(x: Double, y: Double): LocationTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("location")
    __obj.asInstanceOf[LocationTitleSequenceCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationTitleSequenceCommand] (val x: Self) extends AnyVal {
    
    inline def setType(value: location): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
