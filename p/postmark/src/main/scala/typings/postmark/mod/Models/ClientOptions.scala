package typings.postmark.mod.Models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClientOptions {
  
  @JSImport("postmark", "Models.ClientOptions.AuthHeaderNames")
  @js.native
  object AuthHeaderNames extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.AuthHeaderNames & String
      ] = js.native
    
    /* "X-Postmark-Account-Token" */ val ACCOUNT_TOKEN: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.AuthHeaderNames.ACCOUNT_TOKEN & String = js.native
    
    /* "X-Postmark-Server-Token" */ val SERVER_TOKEN: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.AuthHeaderNames.SERVER_TOKEN & String = js.native
  }
  
  @JSImport("postmark", "Models.ClientOptions.Configuration")
  @js.native
  open class Configuration ()
    extends typings.postmark.distClientModelsMod.ClientOptions.Configuration {
    def this(useHttps: Boolean) = this()
    def this(useHttps: Boolean, requestHost: String) = this()
    def this(useHttps: Unit, requestHost: String) = this()
    def this(useHttps: Boolean, requestHost: String, timeout: Double) = this()
    def this(useHttps: Boolean, requestHost: Unit, timeout: Double) = this()
    def this(useHttps: Unit, requestHost: String, timeout: Double) = this()
    def this(useHttps: Unit, requestHost: Unit, timeout: Double) = this()
  }
  
  @JSImport("postmark", "Models.ClientOptions.HttpMethod")
  @js.native
  object HttpMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod & String
      ] = js.native
    
    /* "DELETE" */ val DELETE: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.DELETE & String = js.native
    
    /* "GET" */ val GET: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.GET & String = js.native
    
    /* "HEAD" */ val HEAD: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.HEAD & String = js.native
    
    /* "OPTIONS" */ val OPTIONS: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.OPTIONS & String = js.native
    
    /* "PATCH" */ val PATCH: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.PATCH & String = js.native
    
    /* "POST" */ val POST: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.POST & String = js.native
    
    /* "PUT" */ val PUT: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.PUT & String = js.native
  }
}
