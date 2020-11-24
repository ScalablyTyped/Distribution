package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.JSONFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single JSON File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#json method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#json.
  */
@JSImport("phaser", "Loader.FileTypes.JSONFile")
@js.native
class JSONFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.JSONFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.json`, i.e. if `key` was "alien" then the URL will be "alien.json". Or, can be a fully formed JSON Object.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    * @param dataKey When the JSON file loads only this property will be stored in the Cache.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: JSONFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Object) = this()
  def this(loader: LoaderPlugin, key: JSONFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: JSONFileConfig, url: js.Object) = this()
  def this(loader: LoaderPlugin, key: String, url: js.UndefOr[scala.Nothing], xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Object, xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: JSONFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(loader: LoaderPlugin, key: JSONFileConfig, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: JSONFileConfig, url: js.Object, xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: js.UndefOr[scala.Nothing],
    dataKey: String
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject,
    dataKey: String
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    xhrSettings: js.UndefOr[scala.Nothing],
    dataKey: String
  ) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataKey: String) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.Object,
    xhrSettings: js.UndefOr[scala.Nothing],
    dataKey: String
  ) = this()
  def this(loader: LoaderPlugin, key: String, url: js.Object, xhrSettings: XHRSettingsObject, dataKey: String) = this()
  def this(
    loader: LoaderPlugin,
    key: JSONFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: js.UndefOr[scala.Nothing],
    dataKey: String
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: JSONFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject,
    dataKey: String
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: JSONFileConfig,
    url: String,
    xhrSettings: js.UndefOr[scala.Nothing],
    dataKey: String
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: JSONFileConfig,
    url: String,
    xhrSettings: XHRSettingsObject,
    dataKey: String
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: JSONFileConfig,
    url: js.Object,
    xhrSettings: js.UndefOr[scala.Nothing],
    dataKey: String
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: JSONFileConfig,
    url: js.Object,
    xhrSettings: XHRSettingsObject,
    dataKey: String
  ) = this()
}
