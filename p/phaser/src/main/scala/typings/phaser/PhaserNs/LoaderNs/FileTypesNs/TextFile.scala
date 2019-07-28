package typings.phaser.PhaserNs.LoaderNs.FileTypesNs

import typings.phaser.PhaserNs.LoaderNs.File
import typings.phaser.PhaserNs.LoaderNs.LoaderPlugin
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.TextFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Text File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#text method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#text.
  */
@JSGlobal("Phaser.Loader.FileTypes.TextFile")
@js.native
class TextFile protected () extends File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: TextFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: TextFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: TextFileConfig, url: String, xhrSettings: XHRSettingsObject) = this()
}

