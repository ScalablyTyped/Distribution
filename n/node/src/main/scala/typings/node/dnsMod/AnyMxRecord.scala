package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyMxRecord
  extends StObject
     with MxRecord {
  
  var `type`: "MX"
}
object AnyMxRecord {
  
  inline def apply(exchange: String, priority: Double): AnyMxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MX")
    __obj.asInstanceOf[AnyMxRecord]
  }
  
  extension [Self <: AnyMxRecord](x: Self) {
    
    inline def setType(value: "MX"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
