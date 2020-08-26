package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.BitmapFontFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Bitmap Font based File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#bitmapFont method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#bitmapFont.
  */
@JSImport("phaser", "Loader.FileTypes.BitmapFontFile")
@js.native
class BitmapFontFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.BitmapFontFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param textureURL The absolute or relative URL to load the font image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param fontDataURL The absolute or relative URL to load the font xml data file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
    * @param textureXhrSettings An XHR Settings configuration object for the font image file. Used in replacement of the Loaders default XHR Settings.
    * @param fontDataXhrSettings An XHR Settings configuration object for the font data xml file. Used in replacement of the Loaders default XHR Settings.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: BitmapFontFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: String) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: String) = this()
  def this(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: js.UndefOr[scala.Nothing], fontDataURL: String) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: String, fontDataURL: String) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: js.Array[String], fontDataURL: String) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: String
  ) = this()
  def this(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: String, fontDataURL: String) = this()
  def this(loader: LoaderPlugin, key: BitmapFontFileConfig, textureURL: js.Array[String], fontDataURL: String) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: String,
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.Array[String],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: String,
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: String,
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: String,
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.Array[String],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.Array[String],
    fontDataURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BitmapFontFileConfig,
    textureURL: js.Array[String],
    fontDataURL: String,
    textureXhrSettings: XHRSettingsObject,
    fontDataXhrSettings: XHRSettingsObject
  ) = this()
}

