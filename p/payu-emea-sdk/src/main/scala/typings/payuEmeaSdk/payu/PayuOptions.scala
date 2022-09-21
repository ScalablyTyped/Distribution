package typings.payuEmeaSdk.payu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayuOptions extends StObject {
  
  var dev: js.UndefOr[Boolean] = js.undefined
}
object PayuOptions {
  
  inline def apply(): PayuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayuOptions]
  }
  
  extension [Self <: PayuOptions](x: Self) {
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
  }
}
