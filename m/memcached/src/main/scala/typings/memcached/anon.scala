package typings.memcached

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var cas: String
  }
  object Dictkey {
    
    inline def apply(cas: String): Dictkey = {
      val __obj = js.Dynamic.literal(cas = cas.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setCas(value: String): Self = StObject.set(x, "cas", value.asInstanceOf[js.Any])
    }
  }
}
