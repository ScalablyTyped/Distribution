package typings.opentelemetryInstrumentation

import typings.opentelemetryApi.buildSrcTraceTracerProviderMod.TracerProvider
import typings.opentelemetryApiMetrics.buildSrcTypesMeterProviderMod.MeterProvider
import typings.opentelemetryInstrumentation.buildSrcTypesInternalMod.AutoLoaderResult
import typings.opentelemetryInstrumentation.buildSrcTypesInternalMod.InstrumentationOption
import typings.opentelemetryInstrumentation.buildSrcTypesMod.Instrumentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcAutoLoaderUtilsMod {
  
  @JSImport("@opentelemetry/instrumentation/build/src/autoLoaderUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disableInstrumentations(instrumentations: js.Array[Instrumentation]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableInstrumentations")(instrumentations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableInstrumentations(instrumentations: js.Array[Instrumentation]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableInstrumentations")(instrumentations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableInstrumentations(instrumentations: js.Array[Instrumentation], tracerProvider: Unit, meterProvider: MeterProvider): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableInstrumentations")(instrumentations.asInstanceOf[js.Any], tracerProvider.asInstanceOf[js.Any], meterProvider.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enableInstrumentations(instrumentations: js.Array[Instrumentation], tracerProvider: TracerProvider): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableInstrumentations")(instrumentations.asInstanceOf[js.Any], tracerProvider.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enableInstrumentations(
    instrumentations: js.Array[Instrumentation],
    tracerProvider: TracerProvider,
    meterProvider: MeterProvider
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableInstrumentations")(instrumentations.asInstanceOf[js.Any], tracerProvider.asInstanceOf[js.Any], meterProvider.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseInstrumentationOptions(): AutoLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInstrumentationOptions")().asInstanceOf[AutoLoaderResult]
  inline def parseInstrumentationOptions(options: js.Array[InstrumentationOption]): AutoLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInstrumentationOptions")(options.asInstanceOf[js.Any]).asInstanceOf[AutoLoaderResult]
}
