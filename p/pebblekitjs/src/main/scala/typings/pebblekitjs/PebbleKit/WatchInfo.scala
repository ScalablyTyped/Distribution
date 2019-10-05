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
    val __obj = js.Dynamic.literal(firmware = firmware, language = language, model = model, platform = platform)
  
    __obj.asInstanceOf[WatchInfo]
  }
}

