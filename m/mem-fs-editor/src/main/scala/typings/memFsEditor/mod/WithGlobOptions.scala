package typings.memFsEditor.mod

import typings.glob.mod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithGlobOptions extends js.Object {
  
  var globOptions: js.UndefOr[IOptions] = js.native
}
object WithGlobOptions {
  
  @scala.inline
  def apply(): WithGlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithGlobOptions]
  }
  
  @scala.inline
  implicit class WithGlobOptionsOps[Self <: WithGlobOptions] (val x: Self) extends AnyVal {
    
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
    def setGlobOptions(value: IOptions): Self = this.set("globOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobOptions: Self = this.set("globOptions", js.undefined)
  }
}
