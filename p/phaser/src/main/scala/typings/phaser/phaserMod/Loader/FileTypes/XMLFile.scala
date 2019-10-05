package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.FileTypes.XMLFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single XML File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#xml method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#xml.
  */
@JSImport("phaser", "Loader.FileTypes.XMLFile")
@js.native
class XMLFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.XMLFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.xml`, i.e. if `key` was "alien" then the URL will be "alien.xml".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: XMLFileConfig) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: String, url: String) = this()
  def this(loader: typings.phaser.Phaser.Loader.LoaderPlugin, key: XMLFileConfig, url: String) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: String,
    url: String,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    key: XMLFileConfig,
    url: String,
    xhrSettings: XHRSettingsObject
  ) = this()
}

