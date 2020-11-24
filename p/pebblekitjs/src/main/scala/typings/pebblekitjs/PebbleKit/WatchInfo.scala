package typings.pebblekitjs.PebbleKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing information about the currently connected watch,
  * returned by Pebble.getActiveWatchInfo().
  * Read the PebbleKit JS guides for complete information on possible values.
  * @see Pebble.getActiveWatchInfo
  */
@js.native
trait WatchInfo extends js.Object {
  
  var firmware: Firmware = js.native
  
  var language: String = js.native
  
  var model: String = js.native
  
  var platform: String = js.native
}
object WatchInfo {
  
  @scala.inline
  def apply(firmware: Firmware, language: String, model: String, platform: String): WatchInfo = {
    val __obj = js.Dynamic.literal(firmware = firmware.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchInfo]
  }
  
  @scala.inline
  implicit class WatchInfoOps[Self <: WatchInfo] (val x: Self) extends AnyVal {
    
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
    def setFirmware(value: Firmware): Self = this.set("firmware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
  }
}
