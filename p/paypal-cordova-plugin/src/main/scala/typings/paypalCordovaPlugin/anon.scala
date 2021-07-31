package typings.paypalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Authorizationid extends StObject {
    
    var authorization_id: String
    
    var create_time: String
    
    var id: String
    
    var intent: String
    
    var state: String
  }
  object Authorizationid {
    
    @scala.inline
    def apply(authorization_id: String, create_time: String, id: String, intent: String, state: String): Authorizationid = {
      val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authorizationid]
    }
    
    @scala.inline
    implicit class AuthorizationidMutableBuilder[Self <: Authorizationid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization_id(value: String): Self = StObject.set(x, "authorization_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate_time(value: String): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: String
  }
  object Code {
    
    @scala.inline
    def apply(code: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
}
