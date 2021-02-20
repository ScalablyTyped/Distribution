package typings.npmListAuthorPackages

import typings.npmListAuthorPackages.npmListAuthorPackagesNumbers.`443`
import typings.npmListAuthorPackages.npmListAuthorPackagesNumbers.`80`
import typings.npmListAuthorPackages.npmListAuthorPackagesStrings.http
import typings.npmListAuthorPackages.npmListAuthorPackagesStrings.https
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("npm-list-author-packages", JSImport.Namespace)
  @js.native
  def apply(opts: Options, callback: Callback): Unit = js.native
  
  @JSImport("npm-list-author-packages", "factory")
  @js.native
  def factory(opts: Options, callback: Callback): js.Function0[Unit] = js.native
  
  type Callback = js.Function2[/* error */ Error | Null, /* data */ js.Array[String], Unit]
  
  @js.native
  trait Options extends StObject {
    
    /** registry port. Default: 443 (HTTPS) or 80 (HTTP). */
    var port: js.UndefOr[`443` | `80`] = js.native
    
    /** registry protocol. Default: 'https'. */
    var protocol: js.UndefOr[http | https] = js.native
    
    /** registry. Default: 'registry.npmjs.org'. */
    var registry: js.UndefOr[String] = js.native
    
    /** author username (required). */
    var username: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(username: String): Options = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: `443` | `80`): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
