package typings.phaser.global.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Types.Loader.FileTypes.SVGFileConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.SVGSizeConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single SVG File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#svg method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#svg.
  */
@JSGlobal("Phaser.Loader.FileTypes.SVGFile")
@js.native
class SVGFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.SVGFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.svg`, i.e. if `key` was "alien" then the URL will be "alien.svg".
    * @param svgConfig The svg size configuration object.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: SVGFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: SVGFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.UndefOr[scala.Nothing], svgConfig: SVGSizeConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String, svgConfig: SVGSizeConfig) = this()
  def this(loader: LoaderPlugin, key: SVGFileConfig, url: js.UndefOr[scala.Nothing], svgConfig: SVGSizeConfig) = this()
  def this(loader: LoaderPlugin, key: SVGFileConfig, url: String, svgConfig: SVGSizeConfig) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    svgConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: js.UndefOr[scala.Nothing],
    svgConfig: SVGSizeConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    svgConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    url: String,
    svgConfig: SVGSizeConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SVGFileConfig,
    url: js.UndefOr[scala.Nothing],
    svgConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SVGFileConfig,
    url: js.UndefOr[scala.Nothing],
    svgConfig: SVGSizeConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SVGFileConfig,
    url: String,
    svgConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SVGFileConfig,
    url: String,
    svgConfig: SVGSizeConfig,
    xhrSettings: XHRSettingsObject
  ) = this()
}
