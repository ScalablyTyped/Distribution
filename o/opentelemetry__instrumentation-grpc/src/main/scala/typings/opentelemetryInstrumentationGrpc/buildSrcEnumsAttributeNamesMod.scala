package typings.opentelemetryInstrumentationGrpc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcEnumsAttributeNamesMod {
  
  /* Inlined std.Readonly<@opentelemetry/instrumentation-grpc.@opentelemetry/instrumentation-grpc/build/src/enums/AttributeNames.AttributesType> */
  object AttributeNames {
    
    @JSImport("@opentelemetry/instrumentation-grpc/build/src/enums/AttributeNames", "AttributeNames.GRPC_ERROR_MESSAGE")
    @js.native
    val GRPC_ERROR_MESSAGE: String = js.native
    
    @JSImport("@opentelemetry/instrumentation-grpc/build/src/enums/AttributeNames", "AttributeNames.GRPC_ERROR_NAME")
    @js.native
    val GRPC_ERROR_NAME: String = js.native
  }
  
  trait AttributesType extends StObject {
    
    var GRPC_ERROR_MESSAGE: String
    
    var GRPC_ERROR_NAME: String
  }
  object AttributesType {
    
    inline def apply(GRPC_ERROR_MESSAGE: String, GRPC_ERROR_NAME: String): AttributesType = {
      val __obj = js.Dynamic.literal(GRPC_ERROR_MESSAGE = GRPC_ERROR_MESSAGE.asInstanceOf[js.Any], GRPC_ERROR_NAME = GRPC_ERROR_NAME.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributesType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributesType] (val x: Self) extends AnyVal {
      
      inline def setGRPC_ERROR_MESSAGE(value: String): Self = StObject.set(x, "GRPC_ERROR_MESSAGE", value.asInstanceOf[js.Any])
      
      inline def setGRPC_ERROR_NAME(value: String): Self = StObject.set(x, "GRPC_ERROR_NAME", value.asInstanceOf[js.Any])
    }
  }
}
