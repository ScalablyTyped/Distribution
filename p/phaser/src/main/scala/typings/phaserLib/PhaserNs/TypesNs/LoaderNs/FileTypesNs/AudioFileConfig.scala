package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioFileConfig extends js.Object {
  /**
    * The AudioContext this file will use to process itself.
    */
  var audioContext: js.UndefOr[stdLib.AudioContext] = js.undefined
  /**
    * The key of the file. Must be unique within the Loader and Audio Cache.
    */
  var key: java.lang.String
  /**
    * The absolute or relative URL to load the file from.
    */
  var urlConfig: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
}

object AudioFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    audioContext: stdLib.AudioContext = null,
    urlConfig: java.lang.String = null,
    xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): AudioFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (audioContext != null) __obj.updateDynamic("audioContext")(audioContext)
    if (urlConfig != null) __obj.updateDynamic("urlConfig")(urlConfig)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[AudioFileConfig]
  }
}

