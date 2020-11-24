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
import typings.poi.mod.Config.PluginOption
import typings.poi.mod.Config.Plugins
import typings.poi.mod.Config.PublicFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://poi.js.org/config.html
  */
@js.native
trait Config_ extends js.Object {
  
  var assets: js.UndefOr[Assets] = js.native
  
  var babel: js.UndefOr[Babel] = js.native
  
  var chainWebpack: js.UndefOr[ChainWebpack] = js.native
  
  var configureWebpack: js.UndefOr[ConfigureWebpack] = js.native
  
  var constants: js.UndefOr[Constants] = js.native
  
  var css: js.UndefOr[Css] = js.native
  
  var devServer: js.UndefOr[DevServer] = js.native
  
  var entry: js.UndefOr[Entry] = js.native
  
  var envs: js.UndefOr[Envs] = js.native
  
  var output: js.UndefOr[Output] = js.native
  
  var pages: js.UndefOr[Pages] = js.native
  
  var plugins: js.UndefOr[Plugins] = js.native
  
  var publicFolder: js.UndefOr[PublicFolder] = js.native
}
object Config_ {
  
  @scala.inline
  def apply(): Config_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config_]
  }
  
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssets(value: Assets): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssets: Self = this.set("assets", js.undefined)
    
    @scala.inline
    def setBabel(value: Babel): Self = this.set("babel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabel: Self = this.set("babel", js.undefined)
    
    @scala.inline
    def setChainWebpack(value: (/* config */ typings.webpackChain.mod.^, /* opts */ Opts) => Unit): Self = this.set("chainWebpack", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChainWebpack: Self = this.set("chainWebpack", js.undefined)
    
    @scala.inline
    def setConfigureWebpackFunction2(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ /* config */ js.Any, /* opts */ Opts) => Unit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ js.Any)
    ): Self = this.set("configureWebpack", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConfigureWebpack(value: ConfigureWebpack): Self = this.set("configureWebpack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigureWebpack: Self = this.set("configureWebpack", js.undefined)
    
    @scala.inline
    def setConstants(value: Constants): Self = this.set("constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstants: Self = this.set("constants", js.undefined)
    
    @scala.inline
    def setCss(value: Css): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setDevServer(value: DevServer): Self = this.set("devServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevServer: Self = this.set("devServer", js.undefined)
    
    @scala.inline
    def setEntry(value: Entry): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    
    @scala.inline
    def setEnvs(value: Envs): Self = this.set("envs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvs: Self = this.set("envs", js.undefined)
    
    @scala.inline
    def setOutput(value: Output): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setPages(value: Pages): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (String | PluginOption)*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: Plugins): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPublicFolder(value: PublicFolder): Self = this.set("publicFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicFolder: Self = this.set("publicFolder", js.undefined)
  }
}
