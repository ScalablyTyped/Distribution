package typings.postmark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientModelsClientClientOptionsMod {
  
  object ClientOptions {
    
    @js.native
    sealed trait AuthHeaderNames extends StObject
    @JSImport("postmark/dist/client/models/client/ClientOptions", "ClientOptions.AuthHeaderNames")
    @js.native
    object AuthHeaderNames extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[AuthHeaderNames & String] = js.native
      
      @js.native
      sealed trait ACCOUNT_TOKEN
        extends StObject
           with AuthHeaderNames
      /* "X-Postmark-Account-Token" */ val ACCOUNT_TOKEN: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.AuthHeaderNames.ACCOUNT_TOKEN & String = js.native
      
      @js.native
      sealed trait SERVER_TOKEN
        extends StObject
           with AuthHeaderNames
      /* "X-Postmark-Server-Token" */ val SERVER_TOKEN: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.AuthHeaderNames.SERVER_TOKEN & String = js.native
    }
    
    @JSImport("postmark/dist/client/models/client/ClientOptions", "ClientOptions.Configuration")
    @js.native
    open class Configuration () extends StObject {
      def this(useHttps: Boolean) = this()
      def this(useHttps: Boolean, requestHost: String) = this()
      def this(useHttps: Unit, requestHost: String) = this()
      def this(useHttps: Boolean, requestHost: String, timeout: Double) = this()
      def this(useHttps: Boolean, requestHost: Unit, timeout: Double) = this()
      def this(useHttps: Unit, requestHost: String, timeout: Double) = this()
      def this(useHttps: Unit, requestHost: Unit, timeout: Double) = this()
      
      var requestHost: js.UndefOr[String] = js.native
      
      var timeout: js.UndefOr[Double] = js.native
      
      var useHttps: js.UndefOr[Boolean] = js.native
    }
    
    @js.native
    sealed trait HttpMethod extends StObject
    @JSImport("postmark/dist/client/models/client/ClientOptions", "ClientOptions.HttpMethod")
    @js.native
    object HttpMethod extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[HttpMethod & String] = js.native
      
      @js.native
      sealed trait DELETE
        extends StObject
           with HttpMethod
      /* "DELETE" */ val DELETE: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.DELETE & String = js.native
      
      @js.native
      sealed trait GET
        extends StObject
           with HttpMethod
      /* "GET" */ val GET: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.GET & String = js.native
      
      @js.native
      sealed trait HEAD
        extends StObject
           with HttpMethod
      /* "HEAD" */ val HEAD: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.HEAD & String = js.native
      
      @js.native
      sealed trait OPTIONS
        extends StObject
           with HttpMethod
      /* "OPTIONS" */ val OPTIONS: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.OPTIONS & String = js.native
      
      @js.native
      sealed trait PATCH
        extends StObject
           with HttpMethod
      /* "PATCH" */ val PATCH: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.PATCH & String = js.native
      
      @js.native
      sealed trait POST
        extends StObject
           with HttpMethod
      /* "POST" */ val POST: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.POST & String = js.native
      
      @js.native
      sealed trait PUT
        extends StObject
           with HttpMethod
      /* "PUT" */ val PUT: typings.postmark.distClientModelsClientClientOptionsMod.ClientOptions.HttpMethod.PUT & String = js.native
    }
  }
}
