package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFileConfig extends js.Object {
  /**
    * Load the video as a data blob, or via the Video element?
    */
  var asBlob: js.UndefOr[Boolean] = js.undefined
  /**
    * The key to use for this file, or a file configuration object.
    */
  var key: String | VideoFileConfig
  /**
    * The load event to listen for when _not_ loading as a blob. Either 'loadeddata', 'canplay' or 'canplaythrough'.
    */
  var loadEvent: js.UndefOr[String] = js.undefined
  /**
    * Does the video have an audio track? If not you can enable auto-playing on it.
    */
  var noAudio: js.UndefOr[Boolean] = js.undefined
  /**
    * The absolute or relative URL to load this file from in a config object.
    */
  var urlConfig: js.UndefOr[js.Any] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}

object VideoFileConfig {
  @scala.inline
  def apply(
    key: String | VideoFileConfig,
    asBlob: js.UndefOr[Boolean] = js.undefined,
    loadEvent: String = null,
    noAudio: js.UndefOr[Boolean] = js.undefined,
    urlConfig: js.Any = null,
    xhrSettings: XHRSettingsObject = null
  ): VideoFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(asBlob)) __obj.updateDynamic("asBlob")(asBlob)
    if (loadEvent != null) __obj.updateDynamic("loadEvent")(loadEvent)
    if (!js.isUndefined(noAudio)) __obj.updateDynamic("noAudio")(noAudio)
    if (urlConfig != null) __obj.updateDynamic("urlConfig")(urlConfig)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[VideoFileConfig]
  }
}

