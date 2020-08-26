package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.AudioFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
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
@JSImport("phaser", "Loader.FileTypes.HTML5AudioFile")
@js.native
class HTML5AudioFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.HTML5AudioFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param urlConfig The absolute or relative URL to load this file from.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: AudioFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, urlConfig: String) = this()
  def this(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: String) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    urlConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(loader: LoaderPlugin, key: String, urlConfig: String, xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioFileConfig,
    urlConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: String, xhrSettings: XHRSettingsObject) = this()
}

