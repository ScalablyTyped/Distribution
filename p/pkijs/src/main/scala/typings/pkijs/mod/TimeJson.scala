package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeJson extends StObject {
  
  var `type`: TimeType
  
  var value: js.Date
}
object TimeJson {
  
  inline def apply(`type`: TimeType, value: js.Date): TimeJson = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeJson]
  }
  
  extension [Self <: TimeJson](x: Self) {
    
    inline def setType(value: TimeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
