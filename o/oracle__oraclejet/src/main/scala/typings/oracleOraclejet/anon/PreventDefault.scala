package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventDefault extends StObject {
  
  var preventDefault: Boolean
}
object PreventDefault {
  
  inline def apply(preventDefault: Boolean): PreventDefault = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventDefault]
  }
  
  extension [Self <: PreventDefault](x: Self) {
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
  }
}
