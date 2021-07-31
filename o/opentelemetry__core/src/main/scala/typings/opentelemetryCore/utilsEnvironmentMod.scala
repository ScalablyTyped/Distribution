package typings.opentelemetryCore

import org.scalablytyped.runtime.StringDictionary
import typings.opentelemetryCore.typesMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsEnvironmentMod {
  
  @JSImport("@opentelemetry/core/build/src/utils/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Required<@opentelemetry/core.@opentelemetry/core/build/src/utils/environment.ENVIRONMENT> */
  object DEFAULT_ENVIRONMENT {
    
    @JSImport("@opentelemetry/core/build/src/utils/environment", "DEFAULT_ENVIRONMENT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/core/build/src/utils/environment", "DEFAULT_ENVIRONMENT.OTEL_LOG_LEVEL")
    @js.native
    def OTEL_LOG_LEVEL: LogLevel = js.native
    @scala.inline
    def OTEL_LOG_LEVEL_=(x: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OTEL_LOG_LEVEL")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/utils/environment", "DEFAULT_ENVIRONMENT.OTEL_NO_PATCH_MODULES")
    @js.native
    def OTEL_NO_PATCH_MODULES: String = js.native
    @scala.inline
    def OTEL_NO_PATCH_MODULES_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OTEL_NO_PATCH_MODULES")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/core/build/src/utils/environment", "DEFAULT_ENVIRONMENT.OTEL_SAMPLING_PROBABILITY")
    @js.native
    def OTEL_SAMPLING_PROBABILITY: Double = js.native
    @scala.inline
    def OTEL_SAMPLING_PROBABILITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OTEL_SAMPLING_PROBABILITY")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def parseEnvironment(values: ENVIRONMENT_MAP): ENVIRONMENT = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEnvironment")(values.asInstanceOf[js.Any]).asInstanceOf[ENVIRONMENT]
  
  trait ENVIRONMENT extends StObject {
    
    var OTEL_LOG_LEVEL: js.UndefOr[LogLevel] = js.undefined
    
    var OTEL_NO_PATCH_MODULES: js.UndefOr[String] = js.undefined
    
    var OTEL_SAMPLING_PROBABILITY: js.UndefOr[Double] = js.undefined
  }
  object ENVIRONMENT {
    
    @scala.inline
    def apply(): ENVIRONMENT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ENVIRONMENT]
    }
    
    @scala.inline
    implicit class ENVIRONMENTMutableBuilder[Self <: ENVIRONMENT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOTEL_LOG_LEVEL(value: LogLevel): Self = StObject.set(x, "OTEL_LOG_LEVEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTEL_LOG_LEVELUndefined: Self = StObject.set(x, "OTEL_LOG_LEVEL", js.undefined)
      
      @scala.inline
      def setOTEL_NO_PATCH_MODULES(value: String): Self = StObject.set(x, "OTEL_NO_PATCH_MODULES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTEL_NO_PATCH_MODULESUndefined: Self = StObject.set(x, "OTEL_NO_PATCH_MODULES", js.undefined)
      
      @scala.inline
      def setOTEL_SAMPLING_PROBABILITY(value: Double): Self = StObject.set(x, "OTEL_SAMPLING_PROBABILITY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTEL_SAMPLING_PROBABILITYUndefined: Self = StObject.set(x, "OTEL_SAMPLING_PROBABILITY", js.undefined)
    }
  }
  
  type ENVIRONMENT_MAP = StringDictionary[String | Double]
}
