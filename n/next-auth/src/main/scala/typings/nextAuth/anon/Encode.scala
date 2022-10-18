package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encode extends StObject {
  
  var encode: js.UndefOr[js.Function1[/* val */ Any, String]] = js.undefined
  
  var expires: js.UndefOr[js.Date | String] = js.undefined
}
object Encode {
  
  inline def apply(): Encode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encode]
  }
  
  extension [Self <: Encode](x: Self) {
    
    inline def setEncode(value: /* val */ Any => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setExpires(value: js.Date | String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
  }
}
