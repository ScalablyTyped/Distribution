package typings.minappEnv.anon

import typings.minappEnv.ICloud.CallFunctionData
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.ICloud.CallFunctionParam> */
@js.native
trait RQCallFunctionParam extends js.Object {
  
  var config: js.UndefOr[ICloudConfig] = js.native
  
  var data: js.UndefOr[CallFunctionData] = js.native
  
  var name: String = js.native
  
  var slow: js.UndefOr[Boolean] = js.native
}
object RQCallFunctionParam {
  
  @scala.inline
  def apply(name: String): RQCallFunctionParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQCallFunctionParam]
  }
  
  @scala.inline
  implicit class RQCallFunctionParamOps[Self <: RQCallFunctionParam] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setData(value: CallFunctionData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setSlow(value: Boolean): Self = this.set("slow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlow: Self = this.set("slow", js.undefined)
  }
}
