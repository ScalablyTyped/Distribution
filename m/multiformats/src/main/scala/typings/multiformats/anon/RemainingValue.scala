package typings.multiformats.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemainingValue extends StObject {
  
  var remaining: Unit
  
  var value: Record[String, Any]
}
object RemainingValue {
  
  inline def apply(remaining: Unit, value: Record[String, Any]): RemainingValue = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemainingValue]
  }
  
  extension [Self <: RemainingValue](x: Self) {
    
    inline def setRemaining(value: Unit): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Record[String, Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
