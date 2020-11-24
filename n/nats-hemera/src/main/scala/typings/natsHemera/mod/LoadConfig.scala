package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadConfig extends js.Object {
  
  var checkPolicy: js.UndefOr[Boolean] = js.native
  
  var policy: js.UndefOr[LoadPolicyConfig] = js.native
  
  var process: js.UndefOr[LoadProcessConfig] = js.native
  
  var shouldCrash: js.UndefOr[Boolean] = js.native
}
object LoadConfig {
  
  @scala.inline
  def apply(): LoadConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadConfig]
  }
  
  @scala.inline
  implicit class LoadConfigOps[Self <: LoadConfig] (val x: Self) extends AnyVal {
    
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
    def setCheckPolicy(value: Boolean): Self = this.set("checkPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckPolicy: Self = this.set("checkPolicy", js.undefined)
    
    @scala.inline
    def setPolicy(value: LoadPolicyConfig): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setProcess(value: LoadProcessConfig): Self = this.set("process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    
    @scala.inline
    def setShouldCrash(value: Boolean): Self = this.set("shouldCrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldCrash: Self = this.set("shouldCrash", js.undefined)
  }
}
