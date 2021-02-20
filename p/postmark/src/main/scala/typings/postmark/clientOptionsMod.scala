package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientOptionsMod {
  
  object ClientOptions {
    
    @JSImport("postmark/dist/client/models/client/ClientOptions", "ClientOptions.Configuration")
    @js.native
    class Configuration protected () extends StObject {
      def this(useHttps: Boolean, requestHost: String, timeout: Double) = this()
      
      var requestHost: String = js.native
      
      var timeout: Double = js.native
      
      var useHttps: Boolean = js.native
    }
    
    @js.native
    sealed trait DefaultHeaderNames extends StObject
    @JSImport("postmark/dist/client/models/client/ClientOptions", "ClientOptions.DefaultHeaderNames")
    @js.native
    object DefaultHeaderNames extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[DefaultHeaderNames with String] = js.native
      
      @js.native
      sealed trait ACCOUNT_TOKEN extends DefaultHeaderNames
      /* "X-Postmark-Account-Token" */ val ACCOUNT_TOKEN: typings.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames.ACCOUNT_TOKEN with String = js.native
      
      @js.native
      sealed trait SERVER_TOKEN extends DefaultHeaderNames
      /* "X-Postmark-Server-Token" */ val SERVER_TOKEN: typings.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames.SERVER_TOKEN with String = js.native
    }
    
    @js.native
    sealed trait HttpMethod extends StObject
    @JSImport("postmark/dist/client/models/client/ClientOptions", "ClientOptions.HttpMethod")
    @js.native
    object HttpMethod extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[HttpMethod with String] = js.native
      
      @js.native
      sealed trait DELETE extends HttpMethod
      /* "DELETE" */ val DELETE: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.DELETE with String = js.native
      
      @js.native
      sealed trait GET extends HttpMethod
      /* "GET" */ val GET: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.GET with String = js.native
      
      @js.native
      sealed trait HEAD extends HttpMethod
      /* "HEAD" */ val HEAD: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.HEAD with String = js.native
      
      @js.native
      sealed trait OPTIONS extends HttpMethod
      /* "OPTIONS" */ val OPTIONS: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.OPTIONS with String = js.native
      
      @js.native
      sealed trait PATCH extends HttpMethod
      /* "PATCH" */ val PATCH: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.PATCH with String = js.native
      
      @js.native
      sealed trait POST extends HttpMethod
      /* "POST" */ val POST: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.POST with String = js.native
      
      @js.native
      sealed trait PUT extends HttpMethod
      /* "PUT" */ val PUT: typings.postmark.clientOptionsMod.ClientOptions.HttpMethod.PUT with String = js.native
    }
  }
}
