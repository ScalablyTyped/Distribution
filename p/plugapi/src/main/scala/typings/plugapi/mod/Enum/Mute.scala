package typings.plugapi.mod.Enum

import typings.plugapi.plugapiStrings.l
import typings.plugapi.plugapiStrings.m
import typings.plugapi.plugapiStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mute extends js.Object {
  
  var LONG: l = js.native
  
  var MEDIUM: m = js.native
  
  var SHORT: s = js.native
}
object Mute {
  
  @scala.inline
  def apply(LONG: l, MEDIUM: m, SHORT: s): Mute = {
    val __obj = js.Dynamic.literal(LONG = LONG.asInstanceOf[js.Any], MEDIUM = MEDIUM.asInstanceOf[js.Any], SHORT = SHORT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mute]
  }
  
  @scala.inline
  implicit class MuteOps[Self <: Mute] (val x: Self) extends AnyVal {
    
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
    def setLONG(value: l): Self = this.set("LONG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEDIUM(value: m): Self = this.set("MEDIUM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHORT(value: s): Self = this.set("SHORT", value.asInstanceOf[js.Any])
  }
}
