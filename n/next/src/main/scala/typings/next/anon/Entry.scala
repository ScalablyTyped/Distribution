package typings.next.anon

import typings.next.distServerResponseCacheTypesMod.ResponseCacheEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entry extends StObject {
  
  var entry: ResponseCacheEntry | Null
  
  var expiresAt: Double
  
  var key: String
}
object Entry {
  
  inline def apply(expiresAt: Double, key: String): Entry = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], entry = null)
    __obj.asInstanceOf[Entry]
  }
  
  extension [Self <: Entry](x: Self) {
    
    inline def setEntry(value: ResponseCacheEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryNull: Self = StObject.set(x, "entry", null)
    
    inline def setExpiresAt(value: Double): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
