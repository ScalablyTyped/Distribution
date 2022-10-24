package typings.next

import typings.next.anon.AppRenderToHTML
import typings.next.anon.Components
import typings.next.anon.GenerateEtags
import typings.next.anon.Query
import typings.next.distServerBaseHttpWebMod.WebNextRequest
import typings.next.distServerBaseHttpWebMod.WebNextResponse
import typings.next.distServerBaseServerMod.Options
import typings.next.distServerConfigSharedMod.NextConfig
import typings.next.distServerRenderMod.RenderOpts
import typings.next.distServerRequestMetaMod.NextParsedUrlQuery
import typings.next.distServerRequestMetaMod.NextUrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebServerMod {
  
  @JSImport("next/dist/server/web-server", JSImport.Default)
  @js.native
  open class default protected () extends NextWebServer {
    def this(options: WebServerOptions) = this()
  }
  
  @js.native
  trait NextWebServer
    extends typings.next.distServerBaseServerMod.default[WebServerOptions] {
    
    /* protected */ def attachRequestMeta(req: WebNextRequest, parsedUrl: NextUrlWithParsedQuery): Unit = js.native
    
    /* protected */ def findPageComponents(param0: Query): js.Promise[Components | Null] = js.native
    
    /* protected */ def getFallback(): js.Promise[String] = js.native
    
    /* protected */ def getResponseCache(): typings.next.distServerResponseCacheWebMod.default = js.native
    
    /* protected */ def handleApiRequest(): js.Promise[Boolean] = js.native
    
    /* protected */ def handleCompression(): Unit = js.native
    
    /* protected */ def loadEnvConfig(): Unit = js.native
    
    /* protected */ def renderHTML(
      req: WebNextRequest,
      _res: WebNextResponse,
      pathname: String,
      query: NextParsedUrlQuery,
      renderOpts: RenderOpts
    ): js.Promise[typings.next.distServerRenderResultMod.default | Null] = js.native
    
    /* protected */ def runApi(): js.Promise[Boolean] = js.native
    
    /* protected */ def sendRenderResult(_req: WebNextRequest, res: WebNextResponse, options: GenerateEtags): js.Promise[Unit] = js.native
  }
  
  trait WebServerOptions
    extends StObject
       with Options {
    
    var webServerConfig: AppRenderToHTML
  }
  object WebServerOptions {
    
    inline def apply(conf: NextConfig, webServerConfig: AppRenderToHTML): WebServerOptions = {
      val __obj = js.Dynamic.literal(conf = conf.asInstanceOf[js.Any], webServerConfig = webServerConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebServerOptions]
    }
    
    extension [Self <: WebServerOptions](x: Self) {
      
      inline def setWebServerConfig(value: AppRenderToHTML): Self = StObject.set(x, "webServerConfig", value.asInstanceOf[js.Any])
    }
  }
}
