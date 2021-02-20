package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemGroupDefinition extends PropertyDefinition {
  
  var auth: js.UndefOr[RequestAuthDefinition] = js.native
  
  var event: js.UndefOr[js.Array[EventDefinition]] = js.native
  
  var item: js.UndefOr[js.Array[ItemDefinition | ItemGroupDefinition]] = js.native
}
object ItemGroupDefinition {
  
  @scala.inline
  def apply(): ItemGroupDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemGroupDefinition]
  }
  
  @scala.inline
  implicit class ItemGroupDefinitionMutableBuilder[Self <: ItemGroupDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: RequestAuthDefinition): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Array[EventDefinition]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setEventVarargs(value: EventDefinition*): Self = StObject.set(x, "event", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[ItemDefinition | ItemGroupDefinition]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: (ItemDefinition | ItemGroupDefinition)*): Self = StObject.set(x, "item", js.Array(value :_*))
  }
}
