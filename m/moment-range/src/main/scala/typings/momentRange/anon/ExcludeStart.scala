package typings.momentRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcludeStart extends js.Object {
  
  var excludeEnd: js.UndefOr[Boolean] = js.native
  
  var excludeStart: js.UndefOr[Boolean] = js.native
}
object ExcludeStart {
  
  @scala.inline
  def apply(): ExcludeStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeStart]
  }
  
  @scala.inline
  implicit class ExcludeStartOps[Self <: ExcludeStart] (val x: Self) extends AnyVal {
    
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
    def setExcludeEnd(value: Boolean): Self = this.set("excludeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeEnd: Self = this.set("excludeEnd", js.undefined)
    
    @scala.inline
    def setExcludeStart(value: Boolean): Self = this.set("excludeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeStart: Self = this.set("excludeStart", js.undefined)
  }
}
