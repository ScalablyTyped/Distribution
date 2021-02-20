package typings.nextAuth

import org.scalablytyped.runtime.StringDictionary
import typings.nextAuth.mod.User
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  type GenericObject = StringDictionary[js.Any]
  
  @js.native
  trait NextApiRequest
    extends IncomingMessage
       with GenericObject {
    
    var body: js.Any = js.native
    
    var cookies: StringDictionary[String] = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    var query: StringDictionary[String | js.Array[String]] = js.native
  }
  
  @js.native
  trait NextApiResponse[T]
    extends ServerResponse
       with GenericObject {
    
    var json: Send[T] = js.native
    
    var send: Send[T] = js.native
    
    def status(statusCode: Double): NextApiResponse[T] = js.native
  }
  
  type Send[T] = js.Function1[/* body */ T, Unit]
  
  @js.native
  trait SessionBase extends StObject {
    
    var accessToken: js.UndefOr[String] = js.native
    
    var expires: String = js.native
    
    var user: User = js.native
  }
  object SessionBase {
    
    @scala.inline
    def apply(expires: String, user: User): SessionBase = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionBase]
    }
    
    @scala.inline
    implicit class SessionBaseMutableBuilder[Self <: SessionBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
