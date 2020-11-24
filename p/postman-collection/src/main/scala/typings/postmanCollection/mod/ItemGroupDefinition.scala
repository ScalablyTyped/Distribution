package typings.postmanCollection.mod

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
  implicit class ItemGroupDefinitionOps[Self <: ItemGroupDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: RequestAuthDefinition): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setEventVarargs(value: EventDefinition*): Self = this.set("event", js.Array(value :_*))
    
    @scala.inline
    def setEvent(value: js.Array[EventDefinition]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setItemVarargs(value: (ItemDefinition | ItemGroupDefinition)*): Self = this.set("item", js.Array(value :_*))
    
    @scala.inline
    def setItem(value: js.Array[ItemDefinition | ItemGroupDefinition]): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
  }
}
