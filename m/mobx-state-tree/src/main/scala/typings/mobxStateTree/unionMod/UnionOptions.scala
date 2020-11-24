package typings.mobxStateTree.unionMod

import typings.mobxStateTree.typeMod.IAnyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionOptions extends js.Object {
  
  var dispatcher: js.UndefOr[ITypeDispatcher] = js.native
  
  var eager: js.UndefOr[Boolean] = js.native
}
object UnionOptions {
  
  @scala.inline
  def apply(): UnionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnionOptions]
  }
  
  @scala.inline
  implicit class UnionOptionsOps[Self <: UnionOptions] (val x: Self) extends AnyVal {
    
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
    def setDispatcher(value: /* snapshot */ js.Any => IAnyType): Self = this.set("dispatcher", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDispatcher: Self = this.set("dispatcher", js.undefined)
    
    @scala.inline
    def setEager(value: Boolean): Self = this.set("eager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEager: Self = this.set("eager", js.undefined)
  }
}
