package typings.oauthShim

import org.scalablytyped.runtime.Shortcut
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.RequestHandler
import typings.expressServeStaticCore.mod.Response
import typings.oauthShim.anon.Data
import typings.oauthShim.anon.Get
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("oauth-shim", JSImport.Namespace)
  @js.native
  val ^ : Handler = js.native
  
  trait Config extends StObject {
    
    var client_id: String
    
    var client_secret: String
    
    var domain: String
    
    var grant_url: String
  }
  object Config {
    
    inline def apply(client_id: String, client_secret: String, domain: String, grant_url: String): Config = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], grant_url = grant_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setGrant_url(value: String): Self = StObject.set(x, "grant_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Handler extends RequestHandler {
    
    var credentials: Get = js.native
    
    def init(configs: js.Array[Config]): Unit = js.native
    
    def interpret(req: typings.expressServeStaticCore.mod.Request, res: Response): Any = js.native
    def interpret(req: typings.expressServeStaticCore.mod.Request, res: Response, next: NextFunction): Any = js.native
    @JSName("interpret")
    var interpret_Original: typings.express.mod.RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    def proxy(req: typings.expressServeStaticCore.mod.Request, res: Response): Any = js.native
    def proxy(req: typings.expressServeStaticCore.mod.Request, res: Response, next: NextFunction): Any = js.native
    @JSName("proxy")
    var proxy_Original: typings.express.mod.RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    def redirect(req: typings.expressServeStaticCore.mod.Request, res: Response): Any = js.native
    def redirect(req: typings.expressServeStaticCore.mod.Request, res: Response, next: NextFunction): Any = js.native
    @JSName("redirect")
    var redirect_Original: typings.express.mod.RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    def unhandled(req: typings.expressServeStaticCore.mod.Request, res: Response): Any = js.native
    def unhandled(req: typings.expressServeStaticCore.mod.Request, res: Response, next: NextFunction): Any = js.native
    @JSName("unhandled")
    var unhandled_Original: typings.express.mod.RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
  }
  
  @js.native
  trait Request
    extends StObject
       with typings.expressServeStaticCore.mod.Request {
    
    var oauthshim: js.UndefOr[Data] = js.native
  }
  
  type _To = Handler
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Handler = ^
}
