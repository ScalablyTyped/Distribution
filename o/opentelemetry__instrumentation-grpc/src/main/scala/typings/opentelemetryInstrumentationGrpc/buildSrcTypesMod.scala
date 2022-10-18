package typings.opentelemetryInstrumentationGrpc

import typings.opentelemetryInstrumentation.buildSrcTypesMod.InstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  trait GrpcInstrumentationConfig
    extends StObject
       with InstrumentationConfig {
    
    var ignoreGrpcMethods: js.UndefOr[js.Array[IgnoreMatcher]] = js.undefined
  }
  object GrpcInstrumentationConfig {
    
    inline def apply(): GrpcInstrumentationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrpcInstrumentationConfig]
    }
    
    extension [Self <: GrpcInstrumentationConfig](x: Self) {
      
      inline def setIgnoreGrpcMethods(value: js.Array[IgnoreMatcher]): Self = StObject.set(x, "ignoreGrpcMethods", value.asInstanceOf[js.Any])
      
      inline def setIgnoreGrpcMethodsUndefined: Self = StObject.set(x, "ignoreGrpcMethods", js.undefined)
      
      inline def setIgnoreGrpcMethodsVarargs(value: IgnoreMatcher*): Self = StObject.set(x, "ignoreGrpcMethods", js.Array(value*))
    }
  }
  
  type IgnoreMatcher = String | js.RegExp | (js.Function1[/* str */ String, Boolean])
}
