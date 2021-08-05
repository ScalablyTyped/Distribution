package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameOnly extends StObject {
  
  var nameOnly: js.UndefOr[Boolean] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object NameOnly {
  
  inline def apply(): NameOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameOnly]
  }
  
  extension [Self <: NameOnly](x: Self) {
    
    inline def setNameOnly(value: Boolean): Self = StObject.set(x, "nameOnly", value.asInstanceOf[js.Any])
    
    inline def setNameOnlyUndefined: Self = StObject.set(x, "nameOnly", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
