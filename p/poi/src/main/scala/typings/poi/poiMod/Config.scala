package typings.poi.poiMod

import typings.poi.poiMod.ConfigNs.Assets
import typings.poi.poiMod.ConfigNs.Babel
import typings.poi.poiMod.ConfigNs.ChainWebpack
import typings.poi.poiMod.ConfigNs.ConfigureWebpack
import typings.poi.poiMod.ConfigNs.Constants
import typings.poi.poiMod.ConfigNs.Css
import typings.poi.poiMod.ConfigNs.DevServer
import typings.poi.poiMod.ConfigNs.Entry
import typings.poi.poiMod.ConfigNs.Envs
import typings.poi.poiMod.ConfigNs.Output
import typings.poi.poiMod.ConfigNs.Pages
import typings.poi.poiMod.ConfigNs.Plugins
import typings.poi.poiMod.ConfigNs.PublicFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://poi.js.org/config.html
  */
trait Config extends js.Object {
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

object Config {
  @scala.inline
  def apply(
    assets: Assets = null,
    babel: Babel = null,
    chainWebpack: ChainWebpack = null,
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
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (assets != null) __obj.updateDynamic("assets")(assets)
    if (babel != null) __obj.updateDynamic("babel")(babel)
    if (chainWebpack != null) __obj.updateDynamic("chainWebpack")(chainWebpack)
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
    __obj.asInstanceOf[Config]
  }
}

