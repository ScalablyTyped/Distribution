package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantBody
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var grant_type: String
}
object GrantBody {
  
  inline def apply(grant_type: String): GrantBody = {
    val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantBody]
  }
  
  extension [Self <: GrantBody](x: Self) {
    
    inline def setGrant_type(value: String): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
  }
}
