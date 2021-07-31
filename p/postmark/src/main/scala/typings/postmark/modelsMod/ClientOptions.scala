package typings.postmark.modelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClientOptions {
  
  @JSImport("postmark/dist/client/models", "ClientOptions.Configuration")
  @js.native
  class Configuration protected ()
    extends typings.postmark.clientOptionsMod.ClientOptions.Configuration {
    def this(useHttps: Boolean, requestHost: String, timeout: Double) = this()
  }
  
  @JSImport("postmark/dist/client/models", "ClientOptions.DefaultHeaderNames")
  @js.native
  object DefaultHeaderNames extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames & String] = js.native
    
    /* "X-Postmark-Account-Token" */ val ACCOUNT_TOKEN: typings.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames.ACCOUNT_TOKEN & String = js.native
    
    /* "X-Postmark-Server-Token" */ val SERVER_TOKEN: typings.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames.SERVER_TOKEN & String = js.native
  }
  
  @JSImport("postmark/dist/client/models", "ClientOptions.HttpMethod")
  @js.native
  object HttpMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.postmark.clientOptionsMod.ClientOptions.HttpMethod & String] = js.native
    
    /* "DELETE" */ val DELETE: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.DELETE & String = js.native
    
    /* "GET" */ val GET: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.GET & String = js.native
    
    /* "HEAD" */ val HEAD: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.HEAD & String = js.native
    
    /* "OPTIONS" */ val OPTIONS: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.OPTIONS & String = js.native
    
    /* "PATCH" */ val PATCH: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.PATCH & String = js.native
    
    /* "POST" */ val POST: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.POST & String = js.native
    
    /* "PUT" */ val PUT: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.PUT & String = js.native
  }
}
