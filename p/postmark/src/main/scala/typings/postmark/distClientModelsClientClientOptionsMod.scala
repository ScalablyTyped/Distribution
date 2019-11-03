package typings.postmark

import typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.DefaultHeaderNames
import typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/client/ClientOptions", JSImport.Namespace)
@js.native
object distClientModelsClientClientOptionsMod extends js.Object {
  @js.native
  object ClientOptions extends js.Object {
    @js.native
    class Configuration protected () extends js.Object {
      def this(useHttps: Boolean, requestHost: String, timeout: Double) = this()
      var requestHost: String = js.native
      var timeout: Double = js.native
      var useHttps: Boolean = js.native
    }
    
    @js.native
    sealed trait DefaultHeaderNames extends js.Object
    
    @js.native
    sealed trait HttpMethod extends js.Object
    
    @js.native
    object DefaultHeaderNames extends js.Object {
      @js.native
      sealed trait ACCOUNT_TOKEN extends DefaultHeaderNames
      
      @js.native
      sealed trait SERVER_TOKEN extends DefaultHeaderNames
      
      /* "X-Postmark-Account-Token" */ val ACCOUNT_TOKEN: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.DefaultHeaderNames.ACCOUNT_TOKEN with String = js.native
      /* "X-Postmark-Server-Token" */ val SERVER_TOKEN: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.DefaultHeaderNames.SERVER_TOKEN with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[DefaultHeaderNames with String] = js.native
    }
    
    @js.native
    object HttpMethod extends js.Object {
      @js.native
      sealed trait DELETE extends HttpMethod
      
      @js.native
      sealed trait GET extends HttpMethod
      
      @js.native
      sealed trait HEAD extends HttpMethod
      
      @js.native
      sealed trait OPTIONS extends HttpMethod
      
      @js.native
      sealed trait POST extends HttpMethod
      
      @js.native
      sealed trait PUT extends HttpMethod
      
      /* "DELETE" */ val DELETE: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.DELETE with String = js.native
      /* "GET" */ val GET: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.GET with String = js.native
      /* "HEAD" */ val HEAD: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.HEAD with String = js.native
      /* "OPTIONS" */ val OPTIONS: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.OPTIONS with String = js.native
      /* "POST" */ val POST: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.POST with String = js.native
      /* "PUT" */ val PUT: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.PUT with String = js.native
      @JSBracketAccess
      def apply(value: String): js.UndefOr[HttpMethod with String] = js.native
    }
    
  }
  
}

