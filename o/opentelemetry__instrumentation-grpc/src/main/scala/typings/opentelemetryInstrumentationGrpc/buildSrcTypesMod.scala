package typings.opentelemetryInstrumentationGrpc

import typings.opentelemetryInstrumentation.buildSrcTypesMod.InstrumentationConfig
import typings.opentelemetryInstrumentationGrpc.anon.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  trait GrpcInstrumentationConfig
    extends StObject
       with InstrumentationConfig {
    
    var ignoreGrpcMethods: js.UndefOr[js.Array[IgnoreMatcher]] = js.undefined
    
    /** Map the following gRPC metadata to span attributes. */
    var metadataToSpanAttributes: js.UndefOr[Client] = js.undefined
  }
  object GrpcInstrumentationConfig {
    
    inline def apply(): GrpcInstrumentationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrpcInstrumentationConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrpcInstrumentationConfig] (val x: Self) extends AnyVal {
      
      inline def setIgnoreGrpcMethods(value: js.Array[IgnoreMatcher]): Self = StObject.set(x, "ignoreGrpcMethods", value.asInstanceOf[js.Any])
      
      inline def setIgnoreGrpcMethodsUndefined: Self = StObject.set(x, "ignoreGrpcMethods", js.undefined)
      
      inline def setIgnoreGrpcMethodsVarargs(value: IgnoreMatcher*): Self = StObject.set(x, "ignoreGrpcMethods", js.Array(value*))
      
      inline def setMetadataToSpanAttributes(value: Client): Self = StObject.set(x, "metadataToSpanAttributes", value.asInstanceOf[js.Any])
      
      inline def setMetadataToSpanAttributesUndefined: Self = StObject.set(x, "metadataToSpanAttributes", js.undefined)
    }
  }
  
  type IgnoreMatcher = String | js.RegExp | (js.Function1[/* str */ String, Boolean])
}
