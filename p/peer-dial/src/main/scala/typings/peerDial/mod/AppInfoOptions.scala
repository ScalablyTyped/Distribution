package typings.peerDial.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInfoOptions extends js.Object {
  
  var allowStop: String = js.native
}
object AppInfoOptions {
  
  @scala.inline
  def apply(allowStop: String): AppInfoOptions = {
    val __obj = js.Dynamic.literal(allowStop = allowStop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInfoOptions]
  }
  
  @scala.inline
  implicit class AppInfoOptionsOps[Self <: AppInfoOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowStop(value: String): Self = this.set("allowStop", value.asInstanceOf[js.Any])
  }
}
