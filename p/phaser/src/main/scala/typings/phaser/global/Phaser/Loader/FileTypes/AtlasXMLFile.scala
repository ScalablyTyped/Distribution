package typings.phaser.global.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.AtlasXMLFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single XML based Texture Atlas File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#atlasXML method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#atlasXML.
  */
@JSGlobal("Phaser.Loader.FileTypes.AtlasXMLFile")
@js.native
class AtlasXMLFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.AtlasXMLFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param atlasURL The absolute or relative URL to load the texture atlas xml data file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
    * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas xml file. Used in replacement of the Loaders default XHR Settings.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: AtlasXMLFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: String) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String) = this()
  def this(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: js.UndefOr[scala.Nothing], atlasURL: String) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: String, atlasURL: String) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: js.Array[String], atlasURL: String) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: String
  ) = this()
  def this(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: String, atlasURL: String) = this()
  def this(loader: LoaderPlugin, key: AtlasXMLFileConfig, textureURL: js.Array[String], atlasURL: String) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: String,
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.Array[String],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.UndefOr[scala.Nothing],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: String,
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: String,
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.Array[String],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.Array[String],
    atlasURL: js.UndefOr[scala.Nothing],
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: js.UndefOr[scala.Nothing],
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AtlasXMLFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
}

