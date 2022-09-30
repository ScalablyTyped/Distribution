package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITime extends StObject {
  
  /**
    * 0 - UTCTime; 1 - GeneralizedTime; 2 - empty value
    */
  var `type`: TimeType
  
  /**
    * Value of the TIME class
    */
  var value: js.Date
}
object ITime {
  
  inline def apply(`type`: TimeType, value: js.Date): ITime = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITime]
  }
  
  extension [Self <: ITime](x: Self) {
    
    inline def setType(value: TimeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
