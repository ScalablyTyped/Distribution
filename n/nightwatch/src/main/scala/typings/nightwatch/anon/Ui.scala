package typings.nightwatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ui extends js.Object {
  
  var ui: js.UndefOr[String] = js.native
}
object Ui {
  
  @scala.inline
  def apply(): Ui = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ui]
  }
  
  @scala.inline
  implicit class UiOps[Self <: Ui] (val x: Self) extends AnyVal {
    
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
    def setUi(value: String): Self = this.set("ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
  }
}
