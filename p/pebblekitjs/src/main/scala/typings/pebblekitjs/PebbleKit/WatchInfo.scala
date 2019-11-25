package typings.pebblekitjs.PebbleKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object containing information about the currently connected watch,
  * returned by Pebble.getActiveWatchInfo().
  * Read the PebbleKit JS guides for complete information on possible values.
  * @see Pebble.getActiveWatchInfo
  */
trait WatchInfo extends js.Object {
  var firmware: Firmware
  var language: String
  var model: String
  var platform: String
}

object WatchInfo {
  @scala.inline
  def apply(firmware: Firmware, language: String, model: String, platform: String): WatchInfo = {
    val __obj = js.Dynamic.literal(firmware = firmware.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WatchInfo]
  }
}

