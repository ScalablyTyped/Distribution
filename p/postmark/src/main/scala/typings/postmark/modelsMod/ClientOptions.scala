package typings.postmark.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "ClientOptions")
@js.native
object ClientOptions extends js.Object {
  
  @js.native
  class Configuration protected ()
    extends typings.postmark.clientOptionsMod.ClientOptions.Configuration {
    def this(useHttps: Boolean, requestHost: String, timeout: Double) = this()
  }
  
  @js.native
  object DefaultHeaderNames extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames with String] = js.native
    
    /* "X-Postmark-Account-Token" */ val ACCOUNT_TOKEN: typings.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames.ACCOUNT_TOKEN with String = js.native
    
    /* "X-Postmark-Server-Token" */ val SERVER_TOKEN: typings.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames.SERVER_TOKEN with String = js.native
  }
  
  @js.native
  object HttpMethod extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.postmark.clientOptionsMod.ClientOptions.HttpMethod with String] = js.native
    
    /* "DELETE" */ val DELETE: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.DELETE with String = js.native
    
    /* "GET" */ val GET: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.GET with String = js.native
    
    /* "HEAD" */ val HEAD: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.HEAD with String = js.native
    
    /* "OPTIONS" */ val OPTIONS: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.OPTIONS with String = js.native
    
    /* "PATCH" */ val PATCH: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.PATCH with String = js.native
    
    /* "POST" */ val POST: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.POST with String = js.native
    
    /* "PUT" */ val PUT: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.PUT with String = js.native
  }
}
