package typings.nextAuth

import org.scalablytyped.runtime.StringDictionary
import typings.nextAuth.mod.User
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  type GenericObject = StringDictionary[js.Any]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - typings.nextAuth.utilsMod.GenericObject because Inheritance from two classes. Inlined  */ @js.native
  trait NextApiRequest extends IncomingMessage {
    
    var body: js.Any = js.native
    
    var cookies: StringDictionary[String] = js.native
    
    var query: StringDictionary[String | js.Array[String]] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - typings.nextAuth.utilsMod.GenericObject because Inheritance from two classes. Inlined  */ @js.native
  trait NextApiResponse[T] extends ServerResponse {
    
    var json: Send[T] = js.native
    
    var send: Send[T] = js.native
    
    def status(statusCode: Double): NextApiResponse[T] = js.native
  }
  
  type Send[T] = js.Function1[/* body */ T, Unit]
  
  trait SessionBase extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var expires: String
    
    var user: User
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
