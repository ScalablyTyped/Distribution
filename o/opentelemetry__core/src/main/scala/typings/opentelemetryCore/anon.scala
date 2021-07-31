package typings.opentelemetryCore

import typings.opentelemetryCore.typesMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FetchStart extends StObject {
    
    var fetchStart: Double
  }
  object FetchStart {
    
    @scala.inline
    def apply(fetchStart: Double): FetchStart = {
      val __obj = js.Dynamic.literal(fetchStart = fetchStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchStart]
    }
    
    @scala.inline
    implicit class FetchStartMutableBuilder[Self <: FetchStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<@opentelemetry/core.@opentelemetry/core/build/src/utils/environment.ENVIRONMENT> */
  trait RequiredENVIRONMENT extends StObject {
    
    var OTEL_LOG_LEVEL: LogLevel
    
    var OTEL_NO_PATCH_MODULES: String
    
    var OTEL_SAMPLING_PROBABILITY: Double
  }
  object RequiredENVIRONMENT {
    
    @scala.inline
    def apply(OTEL_LOG_LEVEL: LogLevel, OTEL_NO_PATCH_MODULES: String, OTEL_SAMPLING_PROBABILITY: Double): RequiredENVIRONMENT = {
      val __obj = js.Dynamic.literal(OTEL_LOG_LEVEL = OTEL_LOG_LEVEL.asInstanceOf[js.Any], OTEL_NO_PATCH_MODULES = OTEL_NO_PATCH_MODULES.asInstanceOf[js.Any], OTEL_SAMPLING_PROBABILITY = OTEL_SAMPLING_PROBABILITY.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredENVIRONMENT]
    }
    
    @scala.inline
    implicit class RequiredENVIRONMENTMutableBuilder[Self <: RequiredENVIRONMENT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOTEL_LOG_LEVEL(value: LogLevel): Self = StObject.set(x, "OTEL_LOG_LEVEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTEL_NO_PATCH_MODULES(value: String): Self = StObject.set(x, "OTEL_NO_PATCH_MODULES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTEL_SAMPLING_PROBABILITY(value: Double): Self = StObject.set(x, "OTEL_SAMPLING_PROBABILITY", value.asInstanceOf[js.Any])
    }
  }
}
