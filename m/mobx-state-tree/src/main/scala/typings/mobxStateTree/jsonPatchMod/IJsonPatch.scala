package typings.mobxStateTree.jsonPatchMod

import typings.mobxStateTree.mobxStateTreeStrings.add
import typings.mobxStateTree.mobxStateTreeStrings.remove
import typings.mobxStateTree.mobxStateTreeStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonPatch extends js.Object {
  
  val op: replace | add | remove = js.native
  
  val path: String = js.native
  
  val value: js.UndefOr[js.Any] = js.native
}
object IJsonPatch {
  
  @scala.inline
  def apply(op: replace | add | remove, path: String): IJsonPatch = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonPatch]
  }
  
  @scala.inline
  implicit class IJsonPatchOps[Self <: IJsonPatch] (val x: Self) extends AnyVal {
    
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
    def setOp(value: replace | add | remove): Self = this.set("op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
