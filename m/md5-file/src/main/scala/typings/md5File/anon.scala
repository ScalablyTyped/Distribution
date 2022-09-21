package typings.md5File

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Sync extends StObject {
    
    def sync(path: String): String
    @JSName("sync")
    var sync_Original: js.Function1[/* path */ String, String]
  }
  object Sync {
    
    inline def apply(sync: /* path */ String => String): Sync = {
      val __obj = js.Dynamic.literal(sync = js.Any.fromFunction1(sync))
      __obj.asInstanceOf[Sync]
    }
    
    extension [Self <: Sync](x: Self) {
      
      inline def setSync(value: /* path */ String => String): Self = StObject.set(x, "sync", js.Any.fromFunction1(value))
    }
  }
}
