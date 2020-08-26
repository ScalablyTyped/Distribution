package typings.phaser.global.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.AtlasJSONFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single JSON based Texture Atlas File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#atlas method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#atlas.
  * 
  * https://www.codeandweb.com/texturepacker/tutorials/how-to-create-sprite-sheets-for-phaser3?source=photonstorm
  */
@JSGlobal("Phaser.Loader.FileTypes.AtlasJSONFile")
@js.native
class AtlasJSONFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.AtlasJSONFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param atlasURL The absolute or relative URL to load the texture atlas json data file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, a well formed JSON object.
    * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas json file. Used in replacement of the Loaders default XHR Settings.
    */
  def this(
    loader: LoaderPlugin,
    key: String | AtlasJSONFileConfig,
    textureURL: js.UndefOr[String | js.Array[String]],
    atlasURL: js.UndefOr[js.Object | String],
    textureXhrSettings: js.UndefOr[XHRSettingsObject],
    atlasXhrSettings: js.UndefOr[XHRSettingsObject]
  ) = this()
}

