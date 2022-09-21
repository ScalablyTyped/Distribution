package typings.phcBcrypt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@phc/bcrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hash(password: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(password.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def hash(password: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def identifiers(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("identifiers")().asInstanceOf[js.Array[String]]
  
  inline def verify(hash: String, plainPassword: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hash.asInstanceOf[js.Any], plainPassword.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  trait Options extends StObject {
    
    var rounds: js.UndefOr[Double] = js.undefined
    
    var saltSize: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRounds(value: Double): Self = StObject.set(x, "rounds", value.asInstanceOf[js.Any])
      
      inline def setRoundsUndefined: Self = StObject.set(x, "rounds", js.undefined)
      
      inline def setSaltSize(value: Double): Self = StObject.set(x, "saltSize", value.asInstanceOf[js.Any])
      
      inline def setSaltSizeUndefined: Self = StObject.set(x, "saltSize", js.undefined)
    }
  }
}
