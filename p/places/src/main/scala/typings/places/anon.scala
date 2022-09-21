package typings.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Prefix extends StObject {
    
    var prefix: Any
    
    var root: String
  }
  object Prefix {
    
    inline def apply(prefix: Any, root: String): Prefix = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prefix]
    }
    
    extension [Self <: Prefix](x: Self) {
      
      inline def setPrefix(value: Any): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
