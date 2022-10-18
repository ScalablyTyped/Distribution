package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var hash: String
  
  var pathname: String
  
  var query: String
}
object Hash {
  
  inline def apply(hash: String, pathname: String, query: String): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  extension [Self <: Hash](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
