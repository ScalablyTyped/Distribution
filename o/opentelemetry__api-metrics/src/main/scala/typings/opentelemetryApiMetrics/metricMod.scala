package typings.opentelemetryApiMetrics

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetryApi.traceAttributesMod.SpanAttributeValue
import typings.opentelemetryApi.traceAttributesMod.SpanAttributes
import typings.opentelemetryApiMetrics.observableResultMod.BatchObservableResult
import typings.opentelemetryApiMetrics.observableResultMod.ObservableResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricMod {
  
  @js.native
  sealed trait ValueType extends StObject
  @JSImport("@opentelemetry/api-metrics/build/src/types/Metric", "ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValueType & Double] = js.native
    
    @js.native
    sealed trait DOUBLE
      extends StObject
         with ValueType
    /* 1 */ val DOUBLE: typings.opentelemetryApiMetrics.metricMod.ValueType.DOUBLE & Double = js.native
    
    @js.native
    sealed trait INT
      extends StObject
         with ValueType
    /* 0 */ val INT: typings.opentelemetryApiMetrics.metricMod.ValueType.INT & Double = js.native
  }
  
  type BatchObservableCallback[AttributesTypes /* <: MetricAttributes */] = js.Function1[
    /* observableResult */ BatchObservableResult[AttributesTypes], 
    Unit | js.Promise[Unit]
  ]
  
  @js.native
  trait Counter[AttributesTypes /* <: MetricAttributes */] extends StObject {
    
    /**
      * Increment value of counter by the input. Inputs may not be negative.
      */
    def add(value: Double): Unit = js.native
    def add(value: Double, attributes: AttributesTypes): Unit = js.native
    def add(value: Double, attributes: AttributesTypes, context: Context): Unit = js.native
    def add(value: Double, attributes: Unit, context: Context): Unit = js.native
  }
  
  @js.native
  trait Histogram[AttributesTypes /* <: MetricAttributes */] extends StObject {
    
    /**
      * Records a measurement. Value of the measurement must not be negative.
      */
    def record(value: Double): Unit = js.native
    def record(value: Double, attributes: AttributesTypes): Unit = js.native
    def record(value: Double, attributes: AttributesTypes, context: Context): Unit = js.native
    def record(value: Double, attributes: Unit, context: Context): Unit = js.native
  }
  
  type MetricAttributeValue = SpanAttributeValue
  
  type MetricAttributes = SpanAttributes
  
  trait MetricOptions extends StObject {
    
    /**
      * The description of the Metric.
      * @default ''
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The unit of the Metric values.
      * @default ''
      */
    var unit: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates the type of the recorded value.
      * @default {@link ValueType.DOUBLE}
      */
    var valueType: js.UndefOr[ValueType] = js.undefined
  }
  object MetricOptions {
    
    inline def apply(): MetricOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricOptions]
    }
    
    extension [Self <: MetricOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setValueType(value: ValueType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    }
  }
  
  trait Observable[AttributesTypes /* <: MetricAttributes */] extends StObject {
    
    /**
      * Sets up a function that will be called whenever a metric collection is initiated.
      *
      * If the function is already in the list of callbacks for this Observable, the function is not added a second time.
      */
    def addCallback(callback: ObservableCallback[AttributesTypes]): Unit
    
    /**
      * Removes a callback previously registered with {@link Observable.addCallback}.
      */
    def removeCallback(callback: ObservableCallback[AttributesTypes]): Unit
  }
  object Observable {
    
    inline def apply[AttributesTypes /* <: MetricAttributes */](
      addCallback: ObservableCallback[AttributesTypes] => Unit,
      removeCallback: ObservableCallback[AttributesTypes] => Unit
    ): Observable[AttributesTypes] = {
      val __obj = js.Dynamic.literal(addCallback = js.Any.fromFunction1(addCallback), removeCallback = js.Any.fromFunction1(removeCallback))
      __obj.asInstanceOf[Observable[AttributesTypes]]
    }
    
    extension [Self <: Observable[?], AttributesTypes /* <: MetricAttributes */](x: Self & Observable[AttributesTypes]) {
      
      inline def setAddCallback(value: ObservableCallback[AttributesTypes] => Unit): Self = StObject.set(x, "addCallback", js.Any.fromFunction1(value))
      
      inline def setRemoveCallback(value: ObservableCallback[AttributesTypes] => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction1(value))
    }
  }
  
  type ObservableCallback[AttributesTypes /* <: MetricAttributes */] = js.Function1[/* observableResult */ ObservableResult[AttributesTypes], Unit | js.Promise[Unit]]
  
  type ObservableCounter[AttributesTypes /* <: MetricAttributes */] = Observable[AttributesTypes]
  
  type ObservableGauge[AttributesTypes /* <: MetricAttributes */] = Observable[AttributesTypes]
  
  type ObservableUpDownCounter[AttributesTypes /* <: MetricAttributes */] = Observable[AttributesTypes]
  
  @js.native
  trait UpDownCounter[AttributesTypes /* <: MetricAttributes */] extends StObject {
    
    /**
      * Increment value of counter by the input. Inputs may be negative.
      */
    def add(value: Double): Unit = js.native
    def add(value: Double, attributes: AttributesTypes): Unit = js.native
    def add(value: Double, attributes: AttributesTypes, context: Context): Unit = js.native
    def add(value: Double, attributes: Unit, context: Context): Unit = js.native
  }
}
