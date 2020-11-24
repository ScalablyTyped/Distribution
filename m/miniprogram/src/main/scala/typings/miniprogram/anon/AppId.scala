package typings.miniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppId extends js.Object {
  
  var appId: String = js.native
  
  var extraData: js.Any = js.native
  
  var sourceServiceId: String = js.native
}
object AppId {
  
  @scala.inline
  def apply(appId: String, extraData: js.Any, sourceServiceId: String): AppId = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], sourceServiceId = sourceServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppId]
  }
  
  @scala.inline
  implicit class AppIdOps[Self <: AppId] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceServiceId(value: String): Self = this.set("sourceServiceId", value.asInstanceOf[js.Any])
  }
}
