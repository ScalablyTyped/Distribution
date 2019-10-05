package typings.poi.poiMod

import typings.poi.poiMod.Config.Assets
import typings.poi.poiMod.Config.Babel
import typings.poi.poiMod.Config.ChainWebpack
import typings.poi.poiMod.Config.ConfigureWebpack
import typings.poi.poiMod.Config.Constants
import typings.poi.poiMod.Config.Css
import typings.poi.poiMod.Config.DevServer
import typings.poi.poiMod.Config.Entry
import typings.poi.poiMod.Config.Envs
import typings.poi.poiMod.Config.Output
import typings.poi.poiMod.Config.Pages
import typings.poi.poiMod.Config.Plugins
import typings.poi.poiMod.Config.PublicFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://poi.js.org/config.html
  */
@JSName("Config")
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
    chainWebpack: (/* config */ typings.webpackDashChain.webpackDashChainMod.^, /* opts */ Opts) => Unit = null,
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
    if (assets != null) __obj.updateDynamic("assets")(assets)
    if (babel != null) __obj.updateDynamic("babel")(babel)
    if (chainWebpack != null) __obj.updateDynamic("chainWebpack")(js.Any.fromFunction2(chainWebpack))
    if (configureWebpack != null) __obj.updateDynamic("configureWebpack")(configureWebpack.asInstanceOf[js.Any])
    if (constants != null) __obj.updateDynamic("constants")(constants)
    if (css != null) __obj.updateDynamic("css")(css)
    if (devServer != null) __obj.updateDynamic("devServer")(devServer)
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (envs != null) __obj.updateDynamic("envs")(envs)
    if (output != null) __obj.updateDynamic("output")(output)
    if (pages != null) __obj.updateDynamic("pages")(pages)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (publicFolder != null) __obj.updateDynamic("publicFolder")(publicFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
}

