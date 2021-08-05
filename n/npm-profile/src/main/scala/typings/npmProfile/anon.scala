package typings.npmProfile

import org.scalablytyped.runtime.StringDictionary
import typings.npmProfile.mod._TFAStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any]
       with _TFAStatus {
    
    var pending: Boolean
  }
  object Dictkey {
    
    inline def apply(pending: Boolean): Dictkey = {
      val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    }
  }
}
