package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualTrigger extends js.Object {
  
  /** Required. The maximum duration of each activation in minutes. Must be between 1 and 360 inclusive. After this duration, the trigger will be automatically deactivated. */
  var activationDurationMinutes: js.UndefOr[String] = js.native
  
  /** Required. Immutable. The unique ID of the advertiser that the manual trigger belongs to. */
  var advertiserId: js.UndefOr[String] = js.native
  
  /** Required. The display name of the manual trigger. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Output only. The timestamp of the trigger's latest activation. */
  var latestActivationTime: js.UndefOr[String] = js.native
  
  /** Output only. The resource name of the manual trigger. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The state of the manual trigger. Will be set to the `INACTIVE` state upon creation. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The unique ID of the manual trigger. */
  var triggerId: js.UndefOr[String] = js.native
}
object ManualTrigger {
  
  @scala.inline
  def apply(): ManualTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManualTrigger]
  }
  
  @scala.inline
  implicit class ManualTriggerOps[Self <: ManualTrigger] (val x: Self) extends AnyVal {
    
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
    def setActivationDurationMinutes(value: String): Self = this.set("activationDurationMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivationDurationMinutes: Self = this.set("activationDurationMinutes", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setLatestActivationTime(value: String): Self = this.set("latestActivationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestActivationTime: Self = this.set("latestActivationTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTriggerId(value: String): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerId: Self = this.set("triggerId", js.undefined)
  }
}
