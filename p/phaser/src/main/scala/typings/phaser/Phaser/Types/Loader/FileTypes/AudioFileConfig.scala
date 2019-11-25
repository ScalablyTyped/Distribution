package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.std.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioFileConfig extends js.Object {
  /**
    * The AudioContext this file will use to process itself.
    */
  var audioContext: js.UndefOr[AudioContext] = js.undefined
  /**
    * The key of the file. Must be unique within the Loader and Audio Cache.
    */
  var key: String
  /**
    * The absolute or relative URL to load the file from.
    */
  var urlConfig: js.UndefOr[String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object AudioFileConfig {
  @scala.inline
  def apply(
    key: String,
    audioContext: AudioContext = null,
    urlConfig: String = null,
    xhrSettings: XHRSettingsObject = null
  ): AudioFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (audioContext != null) __obj.updateDynamic("audioContext")(audioContext.asInstanceOf[js.Any])
    if (urlConfig != null) __obj.updateDynamic("urlConfig")(urlConfig.asInstanceOf[js.Any])
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFileConfig]
  }
}

