package typings.npmListAuthorPackages

import typings.npmListAuthorPackages.npmListAuthorPackagesInts.`443`
import typings.npmListAuthorPackages.npmListAuthorPackagesInts.`80`
import typings.npmListAuthorPackages.npmListAuthorPackagesStrings.http
import typings.npmListAuthorPackages.npmListAuthorPackagesStrings.https
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(opts: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("npm-list-author-packages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factory(opts: Options, callback: Callback): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("factory")(opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  type Callback = js.Function2[/* error */ js.Error | Null, /* data */ js.Array[String], Unit]
  
  trait Options extends StObject {
    
    /** registry port. Default: 443 (HTTPS) or 80 (HTTP). */
    var port: js.UndefOr[`443` | `80`] = js.undefined
    
    /** registry protocol. Default: 'https'. */
    var protocol: js.UndefOr[http | https] = js.undefined
    
    /** registry. Default: 'registry.npmjs.org'. */
    var registry: js.UndefOr[String] = js.undefined
    
    /** author username (required). */
    var username: String
  }
  object Options {
    
    inline def apply(username: String): Options = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPort(value: `443` | `80`): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
