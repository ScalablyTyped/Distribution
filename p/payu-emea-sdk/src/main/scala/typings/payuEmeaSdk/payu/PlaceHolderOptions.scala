package typings.payuEmeaSdk.payu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceHolderOptions extends StObject {
  
  var cvv: js.UndefOr[String] = js.undefined
  
  var date: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
}
object PlaceHolderOptions {
  
  inline def apply(): PlaceHolderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceHolderOptions]
  }
  
  extension [Self <: PlaceHolderOptions](x: Self) {
    
    inline def setCvv(value: String): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    inline def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
