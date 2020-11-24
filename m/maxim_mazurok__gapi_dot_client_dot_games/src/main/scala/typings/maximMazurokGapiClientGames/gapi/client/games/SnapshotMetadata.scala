package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotMetadata extends js.Object {
  
  /** The description of this snapshot. */
  var description: js.UndefOr[String] = js.native
  
  /** The device that created the current revision. */
  var deviceName: js.UndefOr[String] = js.native
  
  /** The duration associated with this snapshot. Values with sub-millisecond precision can be rounded or trimmed to the closest millisecond. */
  var duration: js.UndefOr[String] = js.native
  
  /** The timestamp of the last modification to this snapshot. Values with sub-millisecond precision can be rounded or trimmed to the closest millisecond. */
  var lastModifyTime: js.UndefOr[String] = js.native
  
  /** The progress value (64-bit integer set by developer) associated with this snapshot. */
  var progressValue: js.UndefOr[String] = js.native
  
  /** The title of this snapshot. */
  var title: js.UndefOr[String] = js.native
}
object SnapshotMetadata {
  
  @scala.inline
  def apply(): SnapshotMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotMetadata]
  }
  
  @scala.inline
  implicit class SnapshotMetadataOps[Self <: SnapshotMetadata] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setLastModifyTime(value: String): Self = this.set("lastModifyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifyTime: Self = this.set("lastModifyTime", js.undefined)
    
    @scala.inline
    def setProgressValue(value: String): Self = this.set("progressValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressValue: Self = this.set("progressValue", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
