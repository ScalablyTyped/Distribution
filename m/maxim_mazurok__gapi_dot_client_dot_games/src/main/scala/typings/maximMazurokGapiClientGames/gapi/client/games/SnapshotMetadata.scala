package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotMetadata extends StObject {
  
  /** The description of this snapshot. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The device that created the current revision. */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /** The duration associated with this snapshot. Values with sub-millisecond precision can be rounded or trimmed to the closest millisecond. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** The timestamp of the last modification to this snapshot. Values with sub-millisecond precision can be rounded or trimmed to the closest millisecond. */
  var lastModifyTime: js.UndefOr[String] = js.undefined
  
  /** The progress value (64-bit integer set by developer) associated with this snapshot. */
  var progressValue: js.UndefOr[String] = js.undefined
  
  /** The title of this snapshot. */
  var title: js.UndefOr[String] = js.undefined
}
object SnapshotMetadata {
  
  @scala.inline
  def apply(): SnapshotMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotMetadata]
  }
  
  @scala.inline
  implicit class SnapshotMetadataMutableBuilder[Self <: SnapshotMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setLastModifyTime(value: String): Self = StObject.set(x, "lastModifyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifyTimeUndefined: Self = StObject.set(x, "lastModifyTime", js.undefined)
    
    @scala.inline
    def setProgressValue(value: String): Self = StObject.set(x, "progressValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressValueUndefined: Self = StObject.set(x, "progressValue", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
