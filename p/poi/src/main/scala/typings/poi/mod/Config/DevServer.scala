package typings.poi.mod.Config

import org.scalablytyped.runtime.StringDictionary
import typings.connectHistoryApiFallback.mod.Options
import typings.express.mod.Application_
import typings.node.httpsMod.ServerOptions
import typings.webpackDevServer.mod.ProxyConfigArray
import typings.webpackDevServer.mod.ProxyConfigArrayItem
import typings.webpackDevServer.mod.ProxyConfigMap
import typings.webpackDevServer.mod.WebpackDevServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevServer extends js.Object {
  
  var after: js.UndefOr[
    js.Function3[
      /* app */ Application_, 
      /* server */ WebpackDevServer, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var before: js.UndefOr[
    js.Function3[
      /* app */ Application_, 
      /* server */ WebpackDevServer, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
      Unit
    ]
  ] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var historyApiFallback: js.UndefOr[Boolean | Options] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var hot: js.UndefOr[Boolean] = js.native
  
  var hotEntries: js.UndefOr[js.Array[String]] = js.native
  
  var hotOnly: js.UndefOr[Boolean] = js.native
  
  var https: js.UndefOr[Boolean | ServerOptions] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var port: js.UndefOr[String | Double] = js.native
  
  var proxy: js.UndefOr[String | ProxyConfigMap | ProxyConfigArray] = js.native
}
object DevServer {
  
  @scala.inline
  def apply(): DevServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevServer]
  }
  
  @scala.inline
  implicit class DevServerOps[Self <: DevServer] (val x: Self) extends AnyVal {
    
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
    def setAfter(
      value: (/* app */ Application_, /* server */ WebpackDevServer, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any) => Unit
    ): Self = this.set("after", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBefore(
      value: (/* app */ Application_, /* server */ WebpackDevServer, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any) => Unit
    ): Self = this.set("before", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHistoryApiFallback(value: Boolean | Options): Self = this.set("historyApiFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryApiFallback: Self = this.set("historyApiFallback", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHot(value: Boolean): Self = this.set("hot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHot: Self = this.set("hot", js.undefined)
    
    @scala.inline
    def setHotEntriesVarargs(value: String*): Self = this.set("hotEntries", js.Array(value :_*))
    
    @scala.inline
    def setHotEntries(value: js.Array[String]): Self = this.set("hotEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotEntries: Self = this.set("hotEntries", js.undefined)
    
    @scala.inline
    def setHotOnly(value: Boolean): Self = this.set("hotOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotOnly: Self = this.set("hotOnly", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean | ServerOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPort(value: String | Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProxyVarargs(value: ProxyConfigArrayItem*): Self = this.set("proxy", js.Array(value :_*))
    
    @scala.inline
    def setProxy(value: String | ProxyConfigMap | ProxyConfigArray): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
}
