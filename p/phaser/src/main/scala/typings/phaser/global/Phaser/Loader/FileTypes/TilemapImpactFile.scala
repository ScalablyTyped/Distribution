package typings.phaser.global.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.TilemapImpactFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Impact.js Tilemap JSON File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#tilemapImpact method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#tilemapImpact.
  */
@JSGlobal("Phaser.Loader.FileTypes.TilemapImpactFile")
@js.native
class TilemapImpactFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.TilemapImpactFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: TilemapImpactFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: TilemapImpactFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.UndefOr[scala.Nothing], xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: TilemapImpactFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(loader: LoaderPlugin, key: TilemapImpactFileConfig, url: String, xhrSettings: XHRSettingsObject) = this()
}

