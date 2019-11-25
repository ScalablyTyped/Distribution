package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioSpriteFileConfig extends js.Object {
  /**
    * The audio configuration options.
    */
  var audioConfig: js.UndefOr[js.Any] = js.undefined
  /**
    * The absolute or relative URL to load the audio file from.
    */
  var audioURL: js.UndefOr[js.Object] = js.undefined
  /**
    * Extra XHR Settings specifically for the audio file.
    */
  var audioXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  /**
    * The absolute or relative URL to load the json file from. Or a well formed JSON object to use instead.
    */
  var jsonURL: String
  /**
    * Extra XHR Settings specifically for the json file.
    */
  var jsonXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Audio Cache.
    */
  var key: String
}

object AudioSpriteFileConfig {
  @scala.inline
  def apply(
    jsonURL: String,
    key: String,
    audioConfig: js.Any = null,
    audioURL: js.Object = null,
    audioXhrSettings: XHRSettingsObject = null,
    jsonXhrSettings: XHRSettingsObject = null
  ): AudioSpriteFileConfig = {
    val __obj = js.Dynamic.literal(jsonURL = jsonURL.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (audioConfig != null) __obj.updateDynamic("audioConfig")(audioConfig.asInstanceOf[js.Any])
    if (audioURL != null) __obj.updateDynamic("audioURL")(audioURL.asInstanceOf[js.Any])
    if (audioXhrSettings != null) __obj.updateDynamic("audioXhrSettings")(audioXhrSettings.asInstanceOf[js.Any])
    if (jsonXhrSettings != null) __obj.updateDynamic("jsonXhrSettings")(jsonXhrSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSpriteFileConfig]
  }
}

