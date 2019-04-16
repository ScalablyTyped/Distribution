package typings
package poiLib.poiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://poi.js.org/config.html
  */
trait Config extends js.Object {
  var assets: js.UndefOr[poiLib.poiMod.ConfigNs.Assets] = js.undefined
  var babel: js.UndefOr[poiLib.poiMod.ConfigNs.Babel] = js.undefined
  var chainWebpack: js.UndefOr[poiLib.poiMod.ConfigNs.ChainWebpack] = js.undefined
  var configureWebpack: js.UndefOr[poiLib.poiMod.ConfigNs.ConfigureWebpack] = js.undefined
  var constants: js.UndefOr[poiLib.poiMod.ConfigNs.Constants] = js.undefined
  var css: js.UndefOr[poiLib.poiMod.ConfigNs.Css] = js.undefined
  var devServer: js.UndefOr[poiLib.poiMod.ConfigNs.DevServer] = js.undefined
  var entry: js.UndefOr[poiLib.poiMod.ConfigNs.Entry] = js.undefined
  var envs: js.UndefOr[poiLib.poiMod.ConfigNs.Envs] = js.undefined
  var output: js.UndefOr[poiLib.poiMod.ConfigNs.Output] = js.undefined
  var pages: js.UndefOr[poiLib.poiMod.ConfigNs.Pages] = js.undefined
  var plugins: js.UndefOr[poiLib.poiMod.ConfigNs.Plugins] = js.undefined
  var publicFolder: js.UndefOr[poiLib.poiMod.ConfigNs.PublicFolder] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    assets: poiLib.poiMod.ConfigNs.Assets = null,
    babel: poiLib.poiMod.ConfigNs.Babel = null,
    chainWebpack: poiLib.poiMod.ConfigNs.ChainWebpack = null,
    configureWebpack: poiLib.poiMod.ConfigNs.ConfigureWebpack = null,
    constants: poiLib.poiMod.ConfigNs.Constants = null,
    css: poiLib.poiMod.ConfigNs.Css = null,
    devServer: poiLib.poiMod.ConfigNs.DevServer = null,
    entry: poiLib.poiMod.ConfigNs.Entry = null,
    envs: poiLib.poiMod.ConfigNs.Envs = null,
    output: poiLib.poiMod.ConfigNs.Output = null,
    pages: poiLib.poiMod.ConfigNs.Pages = null,
    plugins: poiLib.poiMod.ConfigNs.Plugins = null,
    publicFolder: poiLib.poiMod.ConfigNs.PublicFolder = null
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

