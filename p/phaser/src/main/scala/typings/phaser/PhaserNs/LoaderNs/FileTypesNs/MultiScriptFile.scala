package typings.phaser.PhaserNs.LoaderNs.FileTypesNs

import typings.phaser.PhaserNs.LoaderNs.LoaderPlugin
import typings.phaser.PhaserNs.LoaderNs.MultiFile
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.MultiScriptFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Multi Script File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#scripts method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#scripts.
  */
@JSGlobal("Phaser.Loader.FileTypes.MultiScriptFile")
@js.native
class MultiScriptFile protected () extends MultiFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url An array of absolute or relative URLs to load the script files from. They are processed in the order given in the array.
    * @param xhrSettings An XHR Settings configuration object for the script files. Used in replacement of the Loaders default XHR Settings.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: MultiScriptFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: MultiScriptFileConfig, url: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Array[String], xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: MultiScriptFileConfig,
    url: js.Array[String],
    xhrSettings: XHRSettingsObject
  ) = this()
  /**
    * Adds this file to its target cache upon successful loading and processing.
    */
  def addToCache(): Unit = js.native
}

