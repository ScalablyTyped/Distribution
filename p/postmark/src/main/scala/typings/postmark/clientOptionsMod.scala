package typings.postmark

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/client/ClientOptions", JSImport.Namespace)
@js.native
object clientOptionsMod extends js.Object {
  
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
    object DefaultHeaderNames extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[DefaultHeaderNames with String] = js.native
      
      @js.native
      sealed trait ACCOUNT_TOKEN extends DefaultHeaderNames
      /* "X-Postmark-Account-Token" */ @js.native
      object ACCOUNT_TOKEN extends TopLevel[ACCOUNT_TOKEN with String]
      
      @js.native
      sealed trait SERVER_TOKEN extends DefaultHeaderNames
      /* "X-Postmark-Server-Token" */ @js.native
      object SERVER_TOKEN extends TopLevel[SERVER_TOKEN with String]
    }
    
    @js.native
    sealed trait HttpMethod extends js.Object
    @js.native
    object HttpMethod extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[HttpMethod with String] = js.native
      
      @js.native
      sealed trait DELETE extends HttpMethod
      /* "DELETE" */ @js.native
      object DELETE extends TopLevel[DELETE with String]
      
      @js.native
      sealed trait GET extends HttpMethod
      /* "GET" */ @js.native
      object GET extends TopLevel[GET with String]
      
      @js.native
      sealed trait HEAD extends HttpMethod
      /* "HEAD" */ @js.native
      object HEAD extends TopLevel[HEAD with String]
      
      @js.native
      sealed trait OPTIONS extends HttpMethod
      /* "OPTIONS" */ @js.native
      object OPTIONS extends TopLevel[OPTIONS with String]
      
      @js.native
      sealed trait PATCH extends HttpMethod
      /* "PATCH" */ @js.native
      object PATCH extends TopLevel[PATCH with String]
      
      @js.native
      sealed trait POST extends HttpMethod
      /* "POST" */ @js.native
      object POST extends TopLevel[POST with String]
      
      @js.native
      sealed trait PUT extends HttpMethod
      /* "PUT" */ @js.native
      object PUT extends TopLevel[PUT with String]
    }
  }
}
