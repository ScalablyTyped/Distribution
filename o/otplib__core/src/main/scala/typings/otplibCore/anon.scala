package typings.otplibCore

import typings.otplibCore.utilsMod.SecretKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Counter extends StObject {
    
    var counter: Double = js.native
    
    var secret: SecretKey = js.native
    
    var token: String = js.native
  }
  object Counter {
    
    @scala.inline
    def apply(counter: Double, secret: SecretKey, token: String): Counter = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counter]
    }
    
    @scala.inline
    implicit class CounterMutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: SecretKey): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Secret extends StObject {
    
    var secret: SecretKey = js.native
    
    var token: String = js.native
  }
  object Secret {
    
    @scala.inline
    def apply(secret: SecretKey, token: String): Secret = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Secret]
    }
    
    @scala.inline
    implicit class SecretMutableBuilder[Self <: Secret] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecret(value: SecretKey): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
