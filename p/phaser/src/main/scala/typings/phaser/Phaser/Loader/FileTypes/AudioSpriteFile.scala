package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import typings.phaser.Phaser.Types.Loader.FileTypes.AudioSpriteFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Audio Sprite File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#audioSprite method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audioSprite.
  */
@JSGlobal("Phaser.Loader.FileTypes.AudioSpriteFile")
@js.native
class AudioSpriteFile protected () extends MultiFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param jsonURL The absolute or relative URL to load the json file from. Or a well formed JSON object to use instead.
    * @param audioURL The absolute or relative URL to load the audio file from. If empty it will be obtained by parsing the JSON file.
    * @param audioConfig The audio configuration options.
    * @param audioXhrSettings An XHR Settings configuration object for the audio file. Used in replacement of the Loaders default XHR Settings.
    * @param jsonXhrSettings An XHR Settings configuration object for the json file. Used in replacement of the Loaders default XHR Settings.
    */
  def this(loader: LoaderPlugin, key: String, jsonURL: String) = this()
  def this(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String) = this()
  def this(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: js.Object) = this()
  def this(loader: LoaderPlugin, key: AudioSpriteFileConfig, jsonURL: String, audioURL: js.Object) = this()
  def this(loader: LoaderPlugin, key: String, jsonURL: String, audioURL: js.Object, audioConfig: js.Any) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioSpriteFileConfig,
    jsonURL: String,
    audioURL: js.Object,
    audioConfig: js.Any
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    jsonURL: String,
    audioURL: js.Object,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioSpriteFileConfig,
    jsonURL: String,
    audioURL: js.Object,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    jsonURL: String,
    audioURL: js.Object,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject,
    jsonXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioSpriteFileConfig,
    jsonURL: String,
    audioURL: js.Object,
    audioConfig: js.Any,
    audioXhrSettings: XHRSettingsObject,
    jsonXhrSettings: XHRSettingsObject
  ) = this()
  /**
    * Adds this file to its target cache upon successful loading and processing.
    */
  def addToCache(): Unit = js.native
}

