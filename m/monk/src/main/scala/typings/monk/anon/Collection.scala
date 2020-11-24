package typings.monk.anon

import typings.monk.mod.ICollection
import typings.monk.mod.IMonkManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection extends js.Object {
  
  var collection: ICollection[_] = js.native
  
  var monkInstance: IMonkManager = js.native
}
object Collection {
  
  @scala.inline
  def apply(collection: ICollection[_], monkInstance: IMonkManager): Collection = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], monkInstance = monkInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
  
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: ICollection[_]): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonkInstance(value: IMonkManager): Self = this.set("monkInstance", value.asInstanceOf[js.Any])
  }
}
