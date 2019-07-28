package typings.phaser.PhaserNs.LoaderNs.FileTypesNs

import typings.phaser.PhaserNs.LoaderNs.File
import typings.phaser.PhaserNs.LoaderNs.LoaderPlugin
import typings.phaser.PhaserNs.TypesNs.LoaderNs.FileTypesNs.ScenePluginFileConfig
import typings.phaser.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Scene Plugin Script File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#scenePlugin method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#scenePlugin.
  */
@JSGlobal("Phaser.Loader.FileTypes.ScenePluginFile")
@js.native
class ScenePluginFile protected () extends File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
    * @param systemKey If this plugin is to be added to Scene.Systems, this is the property key for it.
    * @param sceneKey If this plugin is to be added to the Scene, this is the property key for it.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: ScenePluginFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: ScenePluginFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: String, systemKey: String) = this()
  def this(loader: LoaderPlugin, key: ScenePluginFileConfig, url: String, systemKey: String) = this()
  def this(loader: LoaderPlugin, key: String, url: String, systemKey: String, sceneKey: String) = this()
  def this(loader: LoaderPlugin, key: ScenePluginFileConfig, url: String, systemKey: String, sceneKey: String) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    systemKey: String,
    sceneKey: String,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: ScenePluginFileConfig,
    url: String,
    systemKey: String,
    sceneKey: String,
    xhrSettings: XHRSettingsObject
  ) = this()
}

