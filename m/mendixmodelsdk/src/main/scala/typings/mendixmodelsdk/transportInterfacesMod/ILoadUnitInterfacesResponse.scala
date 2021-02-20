package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoadUnitInterfacesResponse extends StObject {
  
  var eventId: Double = js.native
  
  var units: js.Array[IAbstractUnitJson] = js.native
}
object ILoadUnitInterfacesResponse {
  
  @scala.inline
  def apply(eventId: Double, units: js.Array[IAbstractUnitJson]): ILoadUnitInterfacesResponse = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadUnitInterfacesResponse]
  }
  
  @scala.inline
  implicit class ILoadUnitInterfacesResponseMutableBuilder[Self <: ILoadUnitInterfacesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventId(value: Double): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnits(value: js.Array[IAbstractUnitJson]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsVarargs(value: IAbstractUnitJson*): Self = StObject.set(x, "units", js.Array(value :_*))
  }
}
