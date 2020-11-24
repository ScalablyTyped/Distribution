package typings.preact.anon

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ref[RefType] extends js.Object {
  
  var children: js.UndefOr[ComponentChildren] = js.native
  
  var ref: js.UndefOr[typings.preact.mod.Ref[RefType]] = js.native
}
object Ref {
  
  @scala.inline
  def apply[RefType](): Ref[RefType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref[RefType]]
  }
  
  @scala.inline
  implicit class RefOps[Self <: Ref[_], RefType] (val x: Self with Ref[RefType]) extends AnyVal {
    
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
    def setChildrenVarargs(value: ComponentChild*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: ComponentChildren): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ RefType | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: typings.preact.mod.Ref[RefType]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
}
