package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionTokenOption extends StObject {
  
  var sessionToken: js.UndefOr[String] = js.undefined
}
object SessionTokenOption {
  
  inline def apply(): SessionTokenOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionTokenOption]
  }
  
  extension [Self <: SessionTokenOption](x: Self) {
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
  }
}
