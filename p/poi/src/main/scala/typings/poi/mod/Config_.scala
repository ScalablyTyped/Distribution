package typings.poi.mod

import typings.poi.mod.Config.Assets
import typings.poi.mod.Config.Babel
import typings.poi.mod.Config.ChainWebpack
import typings.poi.mod.Config.ConfigureWebpack
import typings.poi.mod.Config.Constants
import typings.poi.mod.Config.Css
import typings.poi.mod.Config.DevServer
import typings.poi.mod.Config.Entry
import typings.poi.mod.Config.Envs
import typings.poi.mod.Config.Output
import typings.poi.mod.Config.Pages
import typings.poi.mod.Config.Plugins
import typings.poi.mod.Config.PublicFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://poi.js.org/config.html
  */
trait Config_ extends js.Object {
  var assets: js.UndefOr[Assets] = js.undefined
  var babel: js.UndefOr[Babel] = js.undefined
  var chainWebpack: js.UndefOr[ChainWebpack] = js.undefined
  var configureWebpack: js.UndefOr[ConfigureWebpack] = js.undefined
  var constants: js.UndefOr[Constants] = js.undefined
  var css: js.UndefOr[Css] = js.undefined
  var devServer: js.UndefOr[DevServer] = js.undefined
  var entry: js.UndefOr[Entry] = js.undefined
  var envs: js.UndefOr[Envs] = js.undefined
  var output: js.UndefOr[Output] = js.undefined
  var pages: js.UndefOr[Pages] = js.undefined
  var plugins: js.UndefOr[Plugins] = js.undefined
  var publicFolder: js.UndefOr[PublicFolder] = js.undefined
}

object Config_ {
  @scala.inline
  def apply(
    assets: Assets = null,
    babel: Babel = null,
    chainWebpack: (/* config */ typings.webpackChain.mod.^, /* opts */ Opts) => Unit = null,
    configureWebpack: ConfigureWebpack = null,
    constants: Constants = null,
    css: Css = null,
    devServer: DevServer = null,
    entry: Entry = null,
    envs: Envs = null,
    output: Output = null,
    pages: Pages = null,
    plugins: Plugins = null,
    publicFolder: PublicFolder = null
  ): Config_ = {
    val __obj = js.Dynamic.literal()
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    if (babel != null) __obj.updateDynamic("babel")(babel.asInstanceOf[js.Any])
    if (chainWebpack != null) __obj.updateDynamic("chainWebpack")(js.Any.fromFunction2(chainWebpack))
    if (configureWebpack != null) __obj.updateDynamic("configureWebpack")(configureWebpack.asInstanceOf[js.Any])
    if (constants != null) __obj.updateDynamic("constants")(constants.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (devServer != null) __obj.updateDynamic("devServer")(devServer.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (envs != null) __obj.updateDynamic("envs")(envs.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (publicFolder != null) __obj.updateDynamic("publicFolder")(publicFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
}

