package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventFilter extends StObject {
  
  /** Filter on a dimension. */
  var dimensionFilter: js.UndefOr[PathQueryOptionsFilter] = js.undefined
}
object EventFilter {
  
  inline def apply(): EventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventFilter]
  }
  
  extension [Self <: EventFilter](x: Self) {
    
    inline def setDimensionFilter(value: PathQueryOptionsFilter): Self = StObject.set(x, "dimensionFilter", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterUndefined: Self = StObject.set(x, "dimensionFilter", js.undefined)
  }
}
