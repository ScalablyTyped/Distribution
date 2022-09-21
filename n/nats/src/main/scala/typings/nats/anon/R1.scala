package typings.nats.anon

import typings.nats.typesMod.JetStreamUsageAccountLimits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R1 extends StObject {
  
  var R1: js.UndefOr[JetStreamUsageAccountLimits] = js.undefined
  
  var R3: js.UndefOr[JetStreamUsageAccountLimits] = js.undefined
}
object R1 {
  
  inline def apply(): R1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[R1]
  }
  
  extension [Self <: R1](x: Self) {
    
    inline def setR1(value: JetStreamUsageAccountLimits): Self = StObject.set(x, "R1", value.asInstanceOf[js.Any])
    
    inline def setR1Undefined: Self = StObject.set(x, "R1", js.undefined)
    
    inline def setR3(value: JetStreamUsageAccountLimits): Self = StObject.set(x, "R3", value.asInstanceOf[js.Any])
    
    inline def setR3Undefined: Self = StObject.set(x, "R3", js.undefined)
  }
}
