package typings.postmark.postmarkMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.ClientOptions")
@js.native
object ClientOptions extends js.Object {
  @js.native
  class Configuration protected ()
    extends typings.postmark.distClientModelsMod.ClientOptions.Configuration {
    def this(useHttps: Boolean, requestHost: String, timeout: Double) = this()
  }
  
  @js.native
  object DefaultHeaderNames extends js.Object {
    /* "X-Postmark-Account-Token" */ val ACCOUNT_TOKEN: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.DefaultHeaderNames.ACCOUNT_TOKEN with String = js.native
    /* "X-Postmark-Server-Token" */ val SERVER_TOKEN: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.DefaultHeaderNames.SERVER_TOKEN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.DefaultHeaderNames with String
      ] = js.native
  }
  
  @js.native
  object HttpMethod extends js.Object {
    /* "DELETE" */ val DELETE: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.DELETE with String = js.native
    /* "GET" */ val GET: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.GET with String = js.native
    /* "HEAD" */ val HEAD: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.HEAD with String = js.native
    /* "OPTIONS" */ val OPTIONS: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.OPTIONS with String = js.native
    /* "POST" */ val POST: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.POST with String = js.native
    /* "PUT" */ val PUT: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.PUT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod with String
      ] = js.native
  }
  
}

