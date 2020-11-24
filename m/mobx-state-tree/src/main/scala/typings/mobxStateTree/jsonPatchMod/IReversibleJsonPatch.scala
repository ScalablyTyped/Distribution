package typings.mobxStateTree.jsonPatchMod

import typings.mobxStateTree.mobxStateTreeStrings.add
import typings.mobxStateTree.mobxStateTreeStrings.remove
import typings.mobxStateTree.mobxStateTreeStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReversibleJsonPatch extends IJsonPatch {
  
  val oldValue: js.Any = js.native
}
object IReversibleJsonPatch {
  
  @scala.inline
  def apply(oldValue: js.Any, op: replace | add | remove, path: String): IReversibleJsonPatch = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReversibleJsonPatch]
  }
  
  @scala.inline
  implicit class IReversibleJsonPatchOps[Self <: IReversibleJsonPatch] (val x: Self) extends AnyVal {
    
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
    def setOldValue(value: js.Any): Self = this.set("oldValue", value.asInstanceOf[js.Any])
  }
}
