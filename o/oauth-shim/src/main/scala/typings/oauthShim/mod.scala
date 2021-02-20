package typings.oauthShim

import org.scalablytyped.runtime.Shortcut
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.Response
import typings.oauthShim.anon.Data
import typings.oauthShim.anon.Get
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("oauth-shim", JSImport.Namespace)
  @js.native
  val ^ : Handler = js.native
  
  @js.native
  trait Config extends StObject {
    
    var client_id: String = js.native
    
    var client_secret: String = js.native
    
    var domain: String = js.native
    
    var grant_url: String = js.native
  }
  object Config {
    
    @scala.inline
    def apply(client_id: String, client_secret: String, domain: String, grant_url: String): Config = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], grant_url = grant_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrant_url(value: String): Self = StObject.set(x, "grant_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Handler
    extends RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
    
    var credentials: Get = js.native
    
    def init(configs: js.Array[Config]): Unit = js.native
    
    def interpret(
      req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
      res: Response[_, Double],
      next: NextFunction
    ): js.Any = js.native
    @JSName("interpret")
    var interpret_Original: typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def proxy(
      req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
      res: Response[_, Double],
      next: NextFunction
    ): js.Any = js.native
    @JSName("proxy")
    var proxy_Original: typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def redirect(
      req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
      res: Response[_, Double],
      next: NextFunction
    ): js.Any = js.native
    @JSName("redirect")
    var redirect_Original: typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
    
    def unhandled(
      req: typings.expressServeStaticCore.mod.Request[ParamsDictionary, _, _, Query],
      res: Response[_, Double],
      next: NextFunction
    ): js.Any = js.native
    @JSName("unhandled")
    var unhandled_Original: typings.express.mod.RequestHandler[ParamsDictionary, _, _, Query] = js.native
  }
  
  @js.native
  trait Request
    extends typings.expressServeStaticCore.mod.Request[ParamsDictionary, js.Any, js.Any, Query] {
    
    var oauthshim: js.UndefOr[Data] = js.native
  }
  
  type _To = Handler
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Handler = ^
}
