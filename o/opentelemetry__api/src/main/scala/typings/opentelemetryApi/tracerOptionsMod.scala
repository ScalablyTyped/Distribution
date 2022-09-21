package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracerOptionsMod {
  
  trait TracerOptions extends StObject {
    
    /**
      * The schemaUrl of the tracer or instrumentation library
      */
    var schemaUrl: js.UndefOr[String] = js.undefined
  }
  object TracerOptions {
    
    inline def apply(): TracerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracerOptions]
    }
    
    extension [Self <: TracerOptions](x: Self) {
      
      inline def setSchemaUrl(value: String): Self = StObject.set(x, "schemaUrl", value.asInstanceOf[js.Any])
      
      inline def setSchemaUrlUndefined: Self = StObject.set(x, "schemaUrl", js.undefined)
    }
  }
}
