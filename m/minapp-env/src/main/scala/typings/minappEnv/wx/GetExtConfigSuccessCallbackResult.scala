package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExtConfigSuccessCallbackResult extends js.Object {
  
  /** 第三方平台自定义的数据 */
  var extConfig: js.Object = js.native
}
object GetExtConfigSuccessCallbackResult {
  
  @scala.inline
  def apply(extConfig: js.Object): GetExtConfigSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(extConfig = extConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExtConfigSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class GetExtConfigSuccessCallbackResultOps[Self <: GetExtConfigSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setExtConfig(value: js.Object): Self = this.set("extConfig", value.asInstanceOf[js.Any])
  }
}
