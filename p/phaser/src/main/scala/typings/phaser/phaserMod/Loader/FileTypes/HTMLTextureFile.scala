package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.HTMLTextureFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single HTML File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#htmlTexture method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#htmlTexture.
  */
@JSImport("phaser", "Loader.FileTypes.HTMLTextureFile")
@js.native
class HTMLTextureFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.HTMLTextureFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param width The width of the texture the HTML will be rendered to.
    * @param height The height of the texture the HTML will be rendered to.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: HTMLTextureFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: HTMLTextureFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: String, width: integer) = this()
  def this(loader: LoaderPlugin, key: HTMLTextureFileConfig, url: String, width: integer) = this()
  def this(loader: LoaderPlugin, key: String, url: String, width: integer, height: integer) = this()
  def this(loader: LoaderPlugin, key: HTMLTextureFileConfig, url: String, width: integer, height: integer) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    width: integer,
    height: integer,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: HTMLTextureFileConfig,
    url: String,
    width: integer,
    height: integer,
    xhrSettings: XHRSettingsObject
  ) = this()
}

