package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.ImageFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.ImageFrameConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Image File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#image method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#image.
  */
@JSGlobal("Phaser.Loader.FileTypes.ImageFile")
@js.native
class ImageFile protected () extends File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    * @param frameConfig The frame configuration object. Only provided for, and used by, Sprite Sheets.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: ImageFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: ImageFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: ImageFileConfig, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String], xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: ImageFileConfig, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: ImageFileConfig, url: js.Array[String], xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    xhrSettings: XHRSettingsObject,
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.Array[String],
    xhrSettings: XHRSettingsObject,
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: ImageFileConfig,
    url: String,
    xhrSettings: XHRSettingsObject,
    frameConfig: ImageFrameConfig
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: ImageFileConfig,
    url: js.Array[String],
    xhrSettings: XHRSettingsObject,
    frameConfig: ImageFrameConfig
  ) = this()
}

