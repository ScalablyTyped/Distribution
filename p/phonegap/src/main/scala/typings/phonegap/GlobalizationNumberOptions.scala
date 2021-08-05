package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalizationNumberOptions extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object GlobalizationNumberOptions {
  
  inline def apply(): GlobalizationNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalizationNumberOptions]
  }
  
  extension [Self <: GlobalizationNumberOptions](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
