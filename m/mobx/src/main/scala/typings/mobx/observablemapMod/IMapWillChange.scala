package typings.mobx.observablemapMod

import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.delete
import typings.mobx.mobxStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapWillChange[K, V] extends js.Object {
  
  var name: K = js.native
  
  var newValue: js.UndefOr[V] = js.native
  
  var `object`: ObservableMap[K, V] = js.native
  
  var `type`: update | add | delete = js.native
}
object IMapWillChange {
  
  @scala.inline
  def apply[K, V](name: K, `object`: ObservableMap[K, V], `type`: update | add | delete): IMapWillChange[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapWillChange[K, V]]
  }
  
  @scala.inline
  implicit class IMapWillChangeOps[Self <: IMapWillChange[_, _], K, V] (val x: Self with (IMapWillChange[K, V])) extends AnyVal {
    
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
    def setName(value: K): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ObservableMap[K, V]): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: update | add | delete): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: V): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
  }
}
