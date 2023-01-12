package typings.otplibCore

import typings.otplibCore.utilsMod.SecretKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Counter extends StObject {
    
    var counter: Double
    
    var secret: SecretKey
    
    var token: String
  }
  object Counter {
    
    inline def apply(counter: Double, secret: SecretKey, token: String): Counter = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: SecretKey): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait Secret extends StObject {
    
    var secret: SecretKey
    
    var token: String
  }
  object Secret {
    
    inline def apply(secret: SecretKey, token: String): Secret = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Secret]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Secret] (val x: Self) extends AnyVal {
      
      inline def setSecret(value: SecretKey): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
