package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseCost extends StObject {
  
  val Currency: String
  
  val Value: Double
}
object ResponseCost {
  
  inline def apply(Currency: String, Value: Double): ResponseCost = {
    val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCost]
  }
  
  extension [Self <: ResponseCost](x: Self) {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
