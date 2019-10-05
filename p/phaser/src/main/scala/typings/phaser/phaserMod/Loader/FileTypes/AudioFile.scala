package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.FileTypes.AudioFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.std.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Audio File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#audio method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audio.
  */
@JSImport("phaser", "Loader.FileTypes.AudioFile")
@js.native
class AudioFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.AudioFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param urlConfig The absolute or relative URL to load this file from in a config object.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    * @param audioContext The AudioContext this file will use to process itself.
    */
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: AudioFileConfig) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, urlConfig: js.Any) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: AudioFileConfig, urlConfig: js.Any) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: String,
    urlConfig: js.Any,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: AudioFileConfig,
    urlConfig: js.Any,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: String,
    urlConfig: js.Any,
    xhrSettings: XHRSettingsObject,
    audioContext: AudioContext
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: AudioFileConfig,
    urlConfig: js.Any,
    xhrSettings: XHRSettingsObject,
    audioContext: AudioContext
  ) = this()
}

