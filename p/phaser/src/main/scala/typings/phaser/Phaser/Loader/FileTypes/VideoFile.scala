package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.VideoFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Video File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#video method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#video.
  */
@JSGlobal("Phaser.Loader.FileTypes.VideoFile")
@js.native
class VideoFile protected () extends File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param urlConfig The absolute or relative URL to load this file from in a config object.
    * @param loadEvent The load event to listen for when _not_ loading as a blob. Either 'loadeddata', 'canplay' or 'canplaythrough'.
    * @param asBlob Load the video as a data blob, or via the Video element?
    * @param noAudio Does the video have an audio track? If not you can enable auto-playing on it.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: VideoFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, urlConfig: js.Any) = this()
  def this(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: js.Any) = this()
  def this(loader: LoaderPlugin, key: String, urlConfig: js.Any, loadEvent: String) = this()
  def this(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: js.Any, loadEvent: String) = this()
  def this(loader: LoaderPlugin, key: String, urlConfig: js.Any, loadEvent: String, asBlob: Boolean) = this()
  def this(loader: LoaderPlugin, key: VideoFileConfig, urlConfig: js.Any, loadEvent: String, asBlob: Boolean) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    urlConfig: js.Any,
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: VideoFileConfig,
    urlConfig: js.Any,
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    urlConfig: js.Any,
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: VideoFileConfig,
    urlConfig: js.Any,
    loadEvent: String,
    asBlob: Boolean,
    noAudio: Boolean,
    xhrSettings: XHRSettingsObject
  ) = this()
}

