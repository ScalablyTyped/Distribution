package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.BinaryFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single Binary File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#binary method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#binary.
  */
@JSImport("phaser", "Loader.FileTypes.BinaryFile")
@js.native
class BinaryFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.BinaryFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.bin`, i.e. if `key` was "alien" then the URL will be "alien.bin".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    * @param dataType Optional type to cast the binary file to once loaded. For example, `Uint8Array`.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: BinaryFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: BinaryFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.UndefOr[scala.Nothing], xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: BinaryFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(loader: LoaderPlugin, key: BinaryFileConfig, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: js.UndefOr[scala.Nothing],
    dataType: js.Any
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject,
    dataType: js.Any
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    xhrSettings: js.UndefOr[scala.Nothing],
    dataType: js.Any
  ) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject, dataType: js.Any) = this()
  def this(
    loader: LoaderPlugin,
    key: BinaryFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: js.UndefOr[scala.Nothing],
    dataType: js.Any
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BinaryFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject,
    dataType: js.Any
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BinaryFileConfig,
    url: String,
    xhrSettings: js.UndefOr[scala.Nothing],
    dataType: js.Any
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: BinaryFileConfig,
    url: String,
    xhrSettings: XHRSettingsObject,
    dataType: js.Any
  ) = this()
}
