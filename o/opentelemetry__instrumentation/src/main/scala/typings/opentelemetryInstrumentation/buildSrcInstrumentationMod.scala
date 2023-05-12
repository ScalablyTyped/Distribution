package typings.opentelemetryInstrumentation

import typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogger
import typings.opentelemetryApi.buildSrcMetricsMeterMod.Meter
import typings.opentelemetryApi.buildSrcMetricsMeterProviderMod.MeterProvider
import typings.opentelemetryApi.buildSrcTraceTracerMod.Tracer
import typings.opentelemetryApi.buildSrcTraceTracerProviderMod.TracerProvider
import typings.opentelemetryInstrumentation.buildSrcPlatformNodeTypesMod.InstrumentationModuleDefinition
import typings.opentelemetryInstrumentation.buildSrcTypesMod.Instrumentation
import typings.opentelemetryInstrumentation.buildSrcTypesMod.InstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInstrumentationMod {
  
  /* note: abstract class */ @JSImport("@opentelemetry/instrumentation/build/src/instrumentation", "InstrumentationAbstract")
  @js.native
  open class InstrumentationAbstract[T] protected ()
    extends StObject
       with Instrumentation {
    def this(instrumentationName: String, instrumentationVersion: String) = this()
    def this(instrumentationName: String, instrumentationVersion: String, config: InstrumentationConfig) = this()
    
    /* protected */ var _config: InstrumentationConfig = js.native
    
    /* protected */ var _diag: DiagLogger = js.native
    
    /* protected */ def _massUnwrap[Nodule /* <: js.Object */](nodules: js.Array[Nodule], names: js.Array[/* keyof Nodule */ String]): Unit = js.native
    
    /* protected */ def _massWrap[Nodule /* <: js.Object */, FieldName /* <: /* keyof Nodule */ String */](
      nodules: js.Array[Nodule],
      names: js.Array[FieldName],
      wrapper: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ /* original */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ js.Any
        ]
    ): Unit = js.native
    
    /* private */ var _meter: Any = js.native
    
    /* private */ var _tracer: Any = js.native
    
    /* protected */ def _unwrap[Nodule /* <: js.Object */](nodule: Nodule, name: /* keyof Nodule */ String): Unit = js.native
    
    /**
      * Sets the new metric instruments with the current Meter.
      */
    /* protected */ def _updateMetricInstruments(): Unit = js.native
    
    /* protected */ def _wrap[Nodule /* <: js.Object */, FieldName /* <: /* keyof Nodule */ String */](
      nodule: Nodule,
      name: FieldName,
      wrapper: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ /* original */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Nodule[FieldName] */ js.Any
        ]
    ): Unit = js.native
    
    /** Method to disable the instrumentation  */
    /* CompleteClass */
    override def disable(): Unit = js.native
    
    /** Method to enable the instrumentation  */
    /* CompleteClass */
    override def enable(): Unit = js.native
    
    /** Method to get instrumentation config  */
    /* CompleteClass */
    override def getConfig(): InstrumentationConfig = js.native
    
    /**
      * Init method in which plugin should define _modules and patches for
      * methods
      */
    /* protected */ def init(): InstrumentationModuleDefinition[T] | js.Array[InstrumentationModuleDefinition[T]] | Unit = js.native
    
    /** Instrumentation Name  */
    /* CompleteClass */
    var instrumentationName: String = js.native
    
    /** Instrumentation Version  */
    /* CompleteClass */
    var instrumentationVersion: String = js.native
    
    /* protected */ def meter: Meter = js.native
    
    /**
      * Sets InstrumentationConfig to this plugin
      * @param InstrumentationConfig
      */
    def setConfig(): Unit = js.native
    /** Method to set instrumentation config  */
    /* CompleteClass */
    override def setConfig(config: InstrumentationConfig): Unit = js.native
    
    /** Method to set meter provider  */
    /* CompleteClass */
    override def setMeterProvider(meterProvider: MeterProvider): Unit = js.native
    
    /** Method to set tracer provider  */
    /* CompleteClass */
    override def setTracerProvider(tracerProvider: TracerProvider): Unit = js.native
    
    /* protected */ def tracer: Tracer = js.native
  }
}
