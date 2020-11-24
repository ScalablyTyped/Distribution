package typings.maximMazurokGapiClientFcm.gapi.client.fcm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightSettings extends js.Object {
  
  /** Required. Set `color` of the LED with [google.type.Color](https://github.com/googleapis/googleapis/blob/master/google/type/color.proto). */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * Required. Along with `light_on_duration `, define the blink rate of LED flashes. Resolution defined by
    * [proto.Duration](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration)
    */
  var lightOffDuration: js.UndefOr[String] = js.native
  
  /**
    * Required. Along with `light_off_duration`, define the blink rate of LED flashes. Resolution defined by
    * [proto.Duration](https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.Duration)
    */
  var lightOnDuration: js.UndefOr[String] = js.native
}
object LightSettings {
  
  @scala.inline
  def apply(): LightSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LightSettings]
  }
  
  @scala.inline
  implicit class LightSettingsOps[Self <: LightSettings] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setLightOffDuration(value: String): Self = this.set("lightOffDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightOffDuration: Self = this.set("lightOffDuration", js.undefined)
    
    @scala.inline
    def setLightOnDuration(value: String): Self = this.set("lightOnDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLightOnDuration: Self = this.set("lightOnDuration", js.undefined)
  }
}
