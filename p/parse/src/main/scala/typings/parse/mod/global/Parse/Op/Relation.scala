package typings.parse.mod.global.Parse.Op

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Relation extends js.Object {
  
  def added(): js.Array[Object[Attributes]] = js.native
  
  var removed: js.Array[Object[Attributes]] = js.native
  
  def toJSON(): js.Any = js.native
}
object Relation {
  
  @scala.inline
  def apply(
    added: () => js.Array[Object[Attributes]],
    removed: js.Array[Object[Attributes]],
    toJSON: () => js.Any
  ): Relation = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Relation]
  }
  
  @scala.inline
  implicit class RelationOps[Self <: Relation] (val x: Self) extends AnyVal {
    
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
    def setAdded(value: () => js.Array[Object[Attributes]]): Self = this.set("added", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemovedVarargs(value: Object[Attributes]*): Self = this.set("removed", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[Object[Attributes]]): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
