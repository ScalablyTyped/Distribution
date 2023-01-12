package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioRoutingGroup
  extends StObject
     with Entity {
  
  var receivers: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var routingMode: js.UndefOr[RoutingMode] = js.undefined
  
  var sources: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object AudioRoutingGroup {
  
  inline def apply(): AudioRoutingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioRoutingGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioRoutingGroup] (val x: Self) extends AnyVal {
    
    inline def setReceivers(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "receivers", value.asInstanceOf[js.Any])
    
    inline def setReceiversNull: Self = StObject.set(x, "receivers", null)
    
    inline def setReceiversUndefined: Self = StObject.set(x, "receivers", js.undefined)
    
    inline def setReceiversVarargs(value: String*): Self = StObject.set(x, "receivers", js.Array(value*))
    
    inline def setRoutingMode(value: RoutingMode): Self = StObject.set(x, "routingMode", value.asInstanceOf[js.Any])
    
    inline def setRoutingModeUndefined: Self = StObject.set(x, "routingMode", js.undefined)
    
    inline def setSources(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesNull: Self = StObject.set(x, "sources", null)
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
