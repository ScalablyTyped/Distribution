package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsSamplingMod {
  
  @js.native
  sealed trait TracesSamplerValues extends StObject
  @JSImport("@opentelemetry/core/build/src/utils/sampling", "TracesSamplerValues")
  @js.native
  object TracesSamplerValues extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TracesSamplerValues & String] = js.native
    
    @js.native
    sealed trait AlwaysOff
      extends StObject
         with TracesSamplerValues
    /* "always_off" */ val AlwaysOff: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.AlwaysOff & String = js.native
    
    @js.native
    sealed trait AlwaysOn
      extends StObject
         with TracesSamplerValues
    /* "always_on" */ val AlwaysOn: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.AlwaysOn & String = js.native
    
    @js.native
    sealed trait ParentBasedAlwaysOff
      extends StObject
         with TracesSamplerValues
    /* "parentbased_always_off" */ val ParentBasedAlwaysOff: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.ParentBasedAlwaysOff & String = js.native
    
    @js.native
    sealed trait ParentBasedAlwaysOn
      extends StObject
         with TracesSamplerValues
    /* "parentbased_always_on" */ val ParentBasedAlwaysOn: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.ParentBasedAlwaysOn & String = js.native
    
    @js.native
    sealed trait ParentBasedTraceIdRatio
      extends StObject
         with TracesSamplerValues
    /* "parentbased_traceidratio" */ val ParentBasedTraceIdRatio: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.ParentBasedTraceIdRatio & String = js.native
    
    @js.native
    sealed trait TraceIdRatio
      extends StObject
         with TracesSamplerValues
    /* "traceidratio" */ val TraceIdRatio: typings.opentelemetryCore.buildSrcUtilsSamplingMod.TracesSamplerValues.TraceIdRatio & String = js.native
  }
}
