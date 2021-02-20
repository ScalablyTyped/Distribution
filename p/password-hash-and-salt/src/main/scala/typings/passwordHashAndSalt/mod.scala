package typings.passwordHashAndSalt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("password-hash-and-salt", JSImport.Namespace)
  @js.native
  def apply(password: String): Password = js.native
  
  @js.native
  trait Password extends StObject {
    
    def hash(cb: js.Function2[/* error */ String, /* hash */ String, Unit]): Unit = js.native
    
    def verifyAgainst(hash: String, cb: js.Function2[/* error */ String, /* verified */ Boolean, Unit]): Unit = js.native
  }
  object Password {
    
    @scala.inline
    def apply(
      hash: js.Function2[/* error */ String, /* hash */ String, Unit] => Unit,
      verifyAgainst: (String, js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => Unit
    ): Password = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash), verifyAgainst = js.Any.fromFunction2(verifyAgainst))
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: js.Function2[/* error */ String, /* hash */ String, Unit] => Unit): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerifyAgainst(value: (String, js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => Unit): Self = StObject.set(x, "verifyAgainst", js.Any.fromFunction2(value))
    }
  }
}
