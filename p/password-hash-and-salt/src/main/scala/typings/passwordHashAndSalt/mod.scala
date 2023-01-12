package typings.passwordHashAndSalt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(password: String): Password = ^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any]).asInstanceOf[Password]
  
  @JSImport("password-hash-and-salt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Password extends StObject {
    
    def hash(cb: js.Function2[/* error */ String, /* hash */ String, Unit]): Unit
    
    def verifyAgainst(hash: String, cb: js.Function2[/* error */ String, /* verified */ Boolean, Unit]): Unit
  }
  object Password {
    
    inline def apply(
      hash: js.Function2[/* error */ String, /* hash */ String, Unit] => Unit,
      verifyAgainst: (String, js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => Unit
    ): Password = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash), verifyAgainst = js.Any.fromFunction2(verifyAgainst))
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      inline def setHash(value: js.Function2[/* error */ String, /* hash */ String, Unit] => Unit): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      
      inline def setVerifyAgainst(value: (String, js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => Unit): Self = StObject.set(x, "verifyAgainst", js.Any.fromFunction2(value))
    }
  }
}
