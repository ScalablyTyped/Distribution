package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.PluginFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Plugin Script File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#plugin method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#plugin.
  */
@JSImport("phaser", "Loader.FileTypes.PluginFile")
@js.native
class PluginFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.PluginFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
    * @param start Automatically start the plugin after loading? Default false.
    * @param mapping If this plugin is to be injected into the Scene, this is the property key used.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: PluginFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: PluginFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.UndefOr[scala.Nothing], start: Boolean) = this()
  def this(loader: LoaderPlugin, key: String, url: String, start: Boolean) = this()
  def this(loader: LoaderPlugin, key: PluginFileConfig, url: js.UndefOr[scala.Nothing], start: Boolean) = this()
  def this(loader: LoaderPlugin, key: PluginFileConfig, url: String, start: Boolean) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    mapping: String
  ) = this()
  def this(loader: LoaderPlugin, key: String, url: js.UndefOr[scala.Nothing], start: Boolean, mapping: String) = this()
  def this(loader: LoaderPlugin, key: String, url: String, start: js.UndefOr[scala.Nothing], mapping: String) = this()
  def this(loader: LoaderPlugin, key: String, url: String, start: Boolean, mapping: String) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    mapping: String
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: js.UndefOr[scala.Nothing],
    start: Boolean,
    mapping: String
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: String,
    start: js.UndefOr[scala.Nothing],
    mapping: String
  ) = this()
  def this(loader: LoaderPlugin, key: PluginFileConfig, url: String, start: Boolean, mapping: String) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    mapping: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    mapping: String,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    start: Boolean,
    mapping: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    start: Boolean,
    mapping: String,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    start: js.UndefOr[scala.Nothing],
    mapping: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    start: js.UndefOr[scala.Nothing],
    mapping: String,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    start: Boolean,
    mapping: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    start: Boolean,
    mapping: String,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    mapping: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: js.UndefOr[scala.Nothing],
    start: js.UndefOr[scala.Nothing],
    mapping: String,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: js.UndefOr[scala.Nothing],
    start: Boolean,
    mapping: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: js.UndefOr[scala.Nothing],
    start: Boolean,
    mapping: String,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: String,
    start: js.UndefOr[scala.Nothing],
    mapping: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: String,
    start: js.UndefOr[scala.Nothing],
    mapping: String,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: String,
    start: Boolean,
    mapping: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: PluginFileConfig,
    url: String,
    start: Boolean,
    mapping: String,
    xhrSettings: XHRSettingsObject
  ) = this()
}

