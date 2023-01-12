package typings.muri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Pass extends StObject {
    
    var pass: js.UndefOr[String] = js.undefined
    
    var user: String
  }
  object Pass {
    
    inline def apply(user: String): Pass = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pass]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pass] (val x: Self) extends AnyVal {
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
