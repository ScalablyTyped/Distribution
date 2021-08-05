package typings.opentelemetryCore

import typings.opentelemetryCore.anon.FetchStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("@opentelemetry/core/build/src/common/types", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with LogLevel
    /* 3 */ val DEBUG: typings.opentelemetryCore.typesMod.LogLevel.DEBUG & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with LogLevel
    /* 0 */ val ERROR: typings.opentelemetryCore.typesMod.LogLevel.ERROR & Double = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with LogLevel
    /* 2 */ val INFO: typings.opentelemetryCore.typesMod.LogLevel.INFO & Double = js.native
    
    @js.native
    sealed trait WARN
      extends StObject
         with LogLevel
    /* 1 */ val WARN: typings.opentelemetryCore.typesMod.LogLevel.WARN & Double = js.native
  }
  
  trait InstrumentationLibrary extends StObject {
    
    val name: String
    
    val version: String
  }
  object InstrumentationLibrary {
    
    inline def apply(name: String, version: String): InstrumentationLibrary = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstrumentationLibrary]
    }
    
    extension [Self <: InstrumentationLibrary](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type LogLevelString = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any */ String
  
  trait ShimWrapped extends StObject {
    
    var __original: js.Function
    
    var __unwrap: js.Function
    
    var __wrapped: Boolean
  }
  object ShimWrapped {
    
    inline def apply(__original: js.Function, __unwrap: js.Function, __wrapped: Boolean): ShimWrapped = {
      val __obj = js.Dynamic.literal(__original = __original.asInstanceOf[js.Any], __unwrap = __unwrap.asInstanceOf[js.Any], __wrapped = __wrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShimWrapped]
    }
    
    extension [Self <: ShimWrapped](x: Self) {
      
      inline def set__original(value: js.Function): Self = StObject.set(x, "__original", value.asInstanceOf[js.Any])
      
      inline def set__unwrap(value: js.Function): Self = StObject.set(x, "__unwrap", value.asInstanceOf[js.Any])
      
      inline def set__wrapped(value: Boolean): Self = StObject.set(x, "__wrapped", value.asInstanceOf[js.Any])
    }
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
