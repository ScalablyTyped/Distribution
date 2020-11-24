package typings.mockery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockeryEnableArgs extends js.Object {
  
  var useCleanCache: js.UndefOr[Boolean] = js.native
  
  var warnOnReplace: js.UndefOr[Boolean] = js.native
  
  var warnOnUnregistered: js.UndefOr[Boolean] = js.native
}
object MockeryEnableArgs {
  
  @scala.inline
  def apply(): MockeryEnableArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockeryEnableArgs]
  }
  
  @scala.inline
  implicit class MockeryEnableArgsOps[Self <: MockeryEnableArgs] (val x: Self) extends AnyVal {
    
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
    def setUseCleanCache(value: Boolean): Self = this.set("useCleanCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCleanCache: Self = this.set("useCleanCache", js.undefined)
    
    @scala.inline
    def setWarnOnReplace(value: Boolean): Self = this.set("warnOnReplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnOnReplace: Self = this.set("warnOnReplace", js.undefined)
    
    @scala.inline
    def setWarnOnUnregistered(value: Boolean): Self = this.set("warnOnUnregistered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnOnUnregistered: Self = this.set("warnOnUnregistered", js.undefined)
  }
}
