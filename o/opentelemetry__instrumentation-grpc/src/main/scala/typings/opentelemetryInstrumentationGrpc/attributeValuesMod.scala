package typings.opentelemetryInstrumentationGrpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributeValuesMod {
  
  /* Inlined std.Readonly<@opentelemetry/instrumentation-grpc.@opentelemetry/instrumentation-grpc/build/src/enums/AttributeValues.AttributeValuesType> */
  object AttributeValues {
    
    @JSImport("@opentelemetry/instrumentation-grpc/build/src/enums/AttributeValues", "AttributeValues.RPC_SYSTEM")
    @js.native
    val RPC_SYSTEM: String = js.native
  }
  
  trait AttributeValuesType extends StObject {
    
    var RPC_SYSTEM: String
  }
  object AttributeValuesType {
    
    inline def apply(RPC_SYSTEM: String): AttributeValuesType = {
      val __obj = js.Dynamic.literal(RPC_SYSTEM = RPC_SYSTEM.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeValuesType]
    }
    
    extension [Self <: AttributeValuesType](x: Self) {
      
      inline def setRPC_SYSTEM(value: String): Self = StObject.set(x, "RPC_SYSTEM", value.asInstanceOf[js.Any])
    }
  }
}
