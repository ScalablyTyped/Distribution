package typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILoadUnitResponse extends StObject {
  
  var eventId: Double
  
  var unit: IAbstractUnitJson
}
object ILoadUnitResponse {
  
  inline def apply(eventId: Double, unit: IAbstractUnitJson): ILoadUnitResponse = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadUnitResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILoadUnitResponse] (val x: Self) extends AnyVal {
    
    inline def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: IAbstractUnitJson): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}
