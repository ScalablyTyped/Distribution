package typings.moment.ts3Dot1TypingsMomentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromTo
  extends StObject
     with _DurationInputArg1 {
  
  var from: MomentInput
  
  var to: MomentInput
}
object FromTo {
  
  inline def apply(): FromTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromTo]
  }
  
  extension [Self <: FromTo](x: Self) {
    
    inline def setFrom(value: MomentInput): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: (Double | String)*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setTo(value: MomentInput): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(value: (Double | String)*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
