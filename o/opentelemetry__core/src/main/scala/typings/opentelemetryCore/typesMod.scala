package typings.opentelemetryCore

import typings.opentelemetryApi.exceptionMod.Exception
import typings.opentelemetryCore.anon.FetchStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ErrorHandler = js.Function1[/* ex */ Exception, Unit]
  
  trait InstrumentationLibrary extends StObject {
    
    val name: String
    
    val schemaUrl: js.UndefOr[String] = js.undefined
    
    val version: js.UndefOr[String] = js.undefined
  }
  object InstrumentationLibrary {
    
    inline def apply(name: String): InstrumentationLibrary = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstrumentationLibrary]
    }
    
    extension [Self <: InstrumentationLibrary](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSchemaUrl(value: String): Self = StObject.set(x, "schemaUrl", value.asInstanceOf[js.Any])
      
      inline def setSchemaUrlUndefined: Self = StObject.set(x, "schemaUrl", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait InstrumentationScope extends StObject {
    
    val name: String
    
    val schemaUrl: js.UndefOr[String] = js.undefined
    
    val version: js.UndefOr[String] = js.undefined
  }
  object InstrumentationScope {
    
    inline def apply(name: String): InstrumentationScope = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstrumentationScope]
    }
    
    extension [Self <: InstrumentationScope](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSchemaUrl(value: String): Self = StObject.set(x, "schemaUrl", value.asInstanceOf[js.Any])
      
      inline def setSchemaUrlUndefined: Self = StObject.set(x, "schemaUrl", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait ShimWrapped
    extends js.Function {
    
    var __original: js.Function = js.native
    
    var __unwrap: js.Function = js.native
    
    var __wrapped: Boolean = js.native
  }
  
  trait TimeOriginLegacy extends StObject {
    
    var timing: FetchStart
  }
  object TimeOriginLegacy {
    
    inline def apply(timing: FetchStart): TimeOriginLegacy = {
      val __obj = js.Dynamic.literal(timing = timing.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeOriginLegacy]
    }
    
    extension [Self <: TimeOriginLegacy](x: Self) {
      
      inline def setTiming(value: FetchStart): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    }
  }
}
