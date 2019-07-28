package typings.phaser.PhaserNs.LoaderNs.FileTypesNs

import typings.phaser.PhaserNs.LoaderNs.File
import typings.phaser.PhaserNs.LoaderNs.LoaderPlugin
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ImageFrameConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.SpriteSheetFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Sprite Sheet Image File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#spritesheet method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#spritesheet.
  */
@JSGlobal("Phaser.Loader.FileTypes.SpriteSheetFile")
@js.native
class SpriteSheetFile protected () extends File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param frameConfig The frame configuration object.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: SpriteSheetFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: String, url: String, frameConfig: ImageFrameConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String], frameConfig: ImageFrameConfig) = this()
  def this(loader: LoaderPlugin, key: SpriteSheetFileConfig, url: String, frameConfig: ImageFrameConfig) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: js.Array[String],
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.Array[String],
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: String,
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpriteSheetFileConfig,
    url: js.Array[String],
    frameConfig: ImageFrameConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
}

