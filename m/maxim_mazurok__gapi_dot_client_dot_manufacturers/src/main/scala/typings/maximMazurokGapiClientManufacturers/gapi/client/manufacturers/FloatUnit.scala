package typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloatUnit extends StObject {
  
  /** amount. */
  var amount: js.UndefOr[Double] = js.undefined
  
  /** unit. */
  var unit: js.UndefOr[String] = js.undefined
}
object FloatUnit {
  
  inline def apply(): FloatUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatUnit]
  }
  
  extension [Self <: FloatUnit](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
