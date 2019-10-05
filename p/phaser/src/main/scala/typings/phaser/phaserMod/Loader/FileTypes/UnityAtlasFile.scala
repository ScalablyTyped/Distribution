package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.FileTypes.UnityAtlasFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single text file based Unity Texture Atlas File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#unityAtlas method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#unityAtlas.
  */
@JSImport("phaser", "Loader.FileTypes.UnityAtlasFile")
@js.native
class UnityAtlasFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.UnityAtlasFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param atlasURL The absolute or relative URL to load the texture atlas data file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
    * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas data file. Used in replacement of the Loaders default XHR Settings.
    */
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: UnityAtlasFileConfig) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, textureURL: String) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: js.Array[String]
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: String
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: String
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: String,
    atlasURL: String
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: js.Array[String],
    atlasURL: String
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
}

