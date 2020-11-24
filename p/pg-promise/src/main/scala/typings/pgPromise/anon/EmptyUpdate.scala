package typings.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyUpdate extends js.Object {
  
  var emptyUpdate: js.UndefOr[js.Any] = js.native
  
  var tableAlias: js.UndefOr[String] = js.native
  
  var valueAlias: js.UndefOr[String] = js.native
}
object EmptyUpdate {
  
  @scala.inline
  def apply(): EmptyUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmptyUpdate]
  }
  
  @scala.inline
  implicit class EmptyUpdateOps[Self <: EmptyUpdate] (val x: Self) extends AnyVal {
    
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
    def setEmptyUpdate(value: js.Any): Self = this.set("emptyUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyUpdate: Self = this.set("emptyUpdate", js.undefined)
    
    @scala.inline
    def setTableAlias(value: String): Self = this.set("tableAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableAlias: Self = this.set("tableAlias", js.undefined)
    
    @scala.inline
    def setValueAlias(value: String): Self = this.set("valueAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAlias: Self = this.set("valueAlias", js.undefined)
  }
}
