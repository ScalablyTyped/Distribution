package typings.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormattingOptions extends js.Object {
  
  var capSQL: js.UndefOr[Boolean] = js.native
  
  var `def`: js.UndefOr[js.Any] = js.native
  
  var partial: js.UndefOr[Boolean] = js.native
}
object IFormattingOptions {
  
  @scala.inline
  def apply(): IFormattingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormattingOptions]
  }
  
  @scala.inline
  implicit class IFormattingOptionsOps[Self <: IFormattingOptions] (val x: Self) extends AnyVal {
    
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
    def setCapSQL(value: Boolean): Self = this.set("capSQL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapSQL: Self = this.set("capSQL", js.undefined)
    
    @scala.inline
    def setDef(value: js.Any): Self = this.set("def", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDef: Self = this.set("def", js.undefined)
    
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
  }
}
