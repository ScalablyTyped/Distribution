package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemGroupDefinition
  extends StObject
     with PropertyDefinition {
  
  var auth: js.UndefOr[RequestAuthDefinition] = js.undefined
  
  var event: js.UndefOr[js.Array[EventDefinition]] = js.undefined
  
  var item: js.UndefOr[js.Array[ItemDefinition | ItemGroupDefinition]] = js.undefined
}
object ItemGroupDefinition {
  
  inline def apply(): ItemGroupDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemGroupDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemGroupDefinition] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: RequestAuthDefinition): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setEvent(value: js.Array[EventDefinition]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: EventDefinition*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setItem(value: js.Array[ItemDefinition | ItemGroupDefinition]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setItemVarargs(value: (ItemDefinition | ItemGroupDefinition)*): Self = StObject.set(x, "item", js.Array(value*))
  }
}
