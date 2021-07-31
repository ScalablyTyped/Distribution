package typings.opentelemetryApi

import org.scalablytyped.runtime.StringDictionary
import typings.opentelemetryApi.anon.Observer
import typings.opentelemetryApi.boundInstrumentMod.BoundBaseObserver
import typings.opentelemetryApi.boundInstrumentMod.BoundCounter
import typings.opentelemetryApi.boundInstrumentMod.BoundValueRecorder
import typings.opentelemetryApi.loggerMod.Logger
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricMod {
  
  @js.native
  sealed trait ValueType extends StObject
  @JSImport("@opentelemetry/api/build/src/metrics/Metric", "ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValueType & Double] = js.native
    
    @js.native
    sealed trait DOUBLE
      extends StObject
         with ValueType
    /* 1 */ val DOUBLE: typings.opentelemetryApi.metricMod.ValueType.DOUBLE & Double = js.native
    
    @js.native
    sealed trait INT
      extends StObject
         with ValueType
    /* 0 */ val INT: typings.opentelemetryApi.metricMod.ValueType.INT & Double = js.native
  }
  
  trait BaseObserver
    extends StObject
       with UnboundMetric[BoundBaseObserver] {
    
    def observation(value: Double): Observer
  }
  object BaseObserver {
    
    @scala.inline
    def apply(
      bind: Labels => BoundBaseObserver,
      clear: () => Unit,
      observation: Double => Observer,
      unbind: Labels => Unit
    ): BaseObserver = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), clear = js.Any.fromFunction0(clear), observation = js.Any.fromFunction1(observation), unbind = js.Any.fromFunction1(unbind))
      __obj.asInstanceOf[BaseObserver]
    }
    
    @scala.inline
    implicit class BaseObserverMutableBuilder[Self <: BaseObserver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObservation(value: Double => Observer): Self = StObject.set(x, "observation", js.Any.fromFunction1(value))
    }
  }
  
  trait BatchMetricOptions
    extends StObject
       with MetricOptions {
    
    /**
      * Indicates how long the batch metric should wait to update before cancel
      */
    var maxTimeoutUpdateMS: js.UndefOr[Double] = js.undefined
  }
  object BatchMetricOptions {
    
    @scala.inline
    def apply(): BatchMetricOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchMetricOptions]
    }
    
    @scala.inline
    implicit class BatchMetricOptionsMutableBuilder[Self <: BatchMetricOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxTimeoutUpdateMS(value: Double): Self = StObject.set(x, "maxTimeoutUpdateMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeoutUpdateMSUndefined: Self = StObject.set(x, "maxTimeoutUpdateMS", js.undefined)
    }
  }
  
  type BatchObserver = Metric
  
  @js.native
  trait Counter
    extends StObject
       with UnboundMetric[BoundCounter] {
    
    /**
      * Adds the given value to the current value. Values cannot be negative.
      */
    def add(value: Double): Unit = js.native
    def add(value: Double, labels: Labels): Unit = js.native
  }
  
  type Labels = StringDictionary[String]
  
  trait Metric extends StObject {
    
    /**
      * Clears all bound instruments from the Metric.
      */
    def clear(): Unit
  }
  object Metric {
    
    @scala.inline
    def apply(clear: () => Unit): Metric = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[Metric]
    }
    
    @scala.inline
    implicit class MetricMutableBuilder[Self <: Metric] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  trait MetricOptions extends StObject {
    
    /** The name of the component that reports the Metric. */
    var component: js.UndefOr[String] = js.undefined
    
    /** The map of constant labels for the Metric. */
    var constantLabels: js.UndefOr[Map[String, String]] = js.undefined
    
    /**
      * The description of the Metric.
      * @default ''
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates the metric is a verbose metric that is disabled by default
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * User provided logger.
      */
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * The unit of the Metric values.
      * @default '1'
      */
    var unit: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates the type of the recorded value.
      * @default {@link ValueType.DOUBLE}
      */
    var valueType: js.UndefOr[ValueType] = js.undefined
  }
  object MetricOptions {
    
    @scala.inline
    def apply(): MetricOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MetricOptions]
    }
    
    @scala.inline
    implicit class MetricOptionsMutableBuilder[Self <: MetricOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setConstantLabels(value: Map[String, String]): Self = StObject.set(x, "constantLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantLabelsUndefined: Self = StObject.set(x, "constantLabels", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      @scala.inline
      def setValueType(value: ValueType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    }
  }
  
  type SumObserver = BaseObserver
  
  trait UnboundMetric[T]
    extends StObject
       with Metric {
    
    /**
      * Returns a Instrument associated with specified Labels.
      * It is recommended to keep a reference to the Instrument instead of always
      * calling this method for every operations.
      * @param labels key-values pairs that are associated with a specific metric
      *     that you want to record.
      */
    def bind(labels: Labels): T
    
    /**
      * Removes the Instrument from the metric, if it is present.
      * @param labels key-values pairs that are associated with a specific metric.
      */
    def unbind(labels: Labels): Unit
  }
  object UnboundMetric {
    
    @scala.inline
    def apply[T](bind: Labels => T, clear: () => Unit, unbind: Labels => Unit): UnboundMetric[T] = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), clear = js.Any.fromFunction0(clear), unbind = js.Any.fromFunction1(unbind))
      __obj.asInstanceOf[UnboundMetric[T]]
    }
    
    @scala.inline
    implicit class UnboundMetricMutableBuilder[Self <: UnboundMetric[?], T] (val x: Self & UnboundMetric[T]) extends AnyVal {
      
      @scala.inline
      def setBind(value: Labels => T): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnbind(value: Labels => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UpDownCounter
    extends StObject
       with UnboundMetric[BoundCounter] {
    
    /**
      * Adds the given value to the current value. Values can be negative.
      */
    def add(value: Double): Unit = js.native
    def add(value: Double, labels: Labels): Unit = js.native
  }
  
  type UpDownSumObserver = BaseObserver
  
  type ValueObserver = BaseObserver
  
  @js.native
  trait ValueRecorder
    extends StObject
       with UnboundMetric[BoundValueRecorder] {
    
    /**
      * Records the given value to this value recorder.
      */
    def record(value: Double): Unit = js.native
    def record(value: Double, labels: Labels): Unit = js.native
  }
}
