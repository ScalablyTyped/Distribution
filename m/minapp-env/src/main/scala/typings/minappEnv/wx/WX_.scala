package typings.minappEnv.wx

import typings.minappEnv.anon.CallFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WX_ extends js.Object {
  
  var cloud: CallFunction = js.native
}
object WX_ {
  
  @scala.inline
  def apply(cloud: CallFunction): WX_ = {
    val __obj = js.Dynamic.literal(cloud = cloud.asInstanceOf[js.Any])
    __obj.asInstanceOf[WX_]
  }
  
  @scala.inline
  implicit class WX_Ops[Self <: WX_] (val x: Self) extends AnyVal {
    
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
    def setCloud(value: CallFunction): Self = this.set("cloud", value.asInstanceOf[js.Any])
  }
}
