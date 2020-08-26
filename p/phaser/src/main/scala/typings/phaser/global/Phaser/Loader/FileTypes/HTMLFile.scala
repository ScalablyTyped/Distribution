package typings.phaser.global.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.HTMLFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single HTML File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#html method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#html.
  */
@JSGlobal("Phaser.Loader.FileTypes.HTMLFile")
@js.native
class HTMLFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.HTMLFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.html".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: HTMLFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: HTMLFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.UndefOr[scala.Nothing], xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: HTMLFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(loader: LoaderPlugin, key: HTMLFileConfig, url: String, xhrSettings: XHRSettingsObject) = this()
}

