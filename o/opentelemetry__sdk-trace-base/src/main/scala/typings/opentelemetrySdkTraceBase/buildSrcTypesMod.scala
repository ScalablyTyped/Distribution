package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.buildSrcContextTypesMod.ContextManager
import typings.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapPropagator
import typings.opentelemetryResources.buildSrcIresourceMod.IResource
import typings.opentelemetrySdkTraceBase.buildSrcIdGeneratorMod.IdGenerator
import typings.opentelemetrySdkTraceBase.buildSrcSamplerMod.Sampler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypesMod {
  
  trait BatchSpanProcessorBrowserConfig
    extends StObject
       with BufferConfig {
    
    /** Disable flush when a user navigates to a new page, closes the tab or the browser, or,
      * on mobile, switches to a different app. Auto flush is enabled by default. */
    var disableAutoFlushOnDocumentHide: js.UndefOr[Boolean] = js.undefined
  }
  object BatchSpanProcessorBrowserConfig {
    
    inline def apply(): BatchSpanProcessorBrowserConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchSpanProcessorBrowserConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchSpanProcessorBrowserConfig] (val x: Self) extends AnyVal {
      
      inline def setDisableAutoFlushOnDocumentHide(value: Boolean): Self = StObject.set(x, "disableAutoFlushOnDocumentHide", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoFlushOnDocumentHideUndefined: Self = StObject.set(x, "disableAutoFlushOnDocumentHide", js.undefined)
    }
  }
  
  trait BufferConfig extends StObject {
    
    /** How long the export can run before it is cancelled.
      * The default value is 30000ms */
    var exportTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    /** The maximum batch size of every export. It must be smaller or equal to
      * maxQueueSize. The default value is 512. */
    var maxExportBatchSize: js.UndefOr[Double] = js.undefined
    
    /** The maximum queue size. After the size is reached spans are dropped.
      * The default value is 2048. */
    var maxQueueSize: js.UndefOr[Double] = js.undefined
    
    /** The delay interval in milliseconds between two consecutive exports.
      *  The default value is 5000ms. */
    var scheduledDelayMillis: js.UndefOr[Double] = js.undefined
  }
  object BufferConfig {
    
    inline def apply(): BufferConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferConfig] (val x: Self) extends AnyVal {
      
      inline def setExportTimeoutMillis(value: Double): Self = StObject.set(x, "exportTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setExportTimeoutMillisUndefined: Self = StObject.set(x, "exportTimeoutMillis", js.undefined)
      
      inline def setMaxExportBatchSize(value: Double): Self = StObject.set(x, "maxExportBatchSize", value.asInstanceOf[js.Any])
      
      inline def setMaxExportBatchSizeUndefined: Self = StObject.set(x, "maxExportBatchSize", js.undefined)
      
      inline def setMaxQueueSize(value: Double): Self = StObject.set(x, "maxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setMaxQueueSizeUndefined: Self = StObject.set(x, "maxQueueSize", js.undefined)
      
      inline def setScheduledDelayMillis(value: Double): Self = StObject.set(x, "scheduledDelayMillis", value.asInstanceOf[js.Any])
      
      inline def setScheduledDelayMillisUndefined: Self = StObject.set(x, "scheduledDelayMillis", js.undefined)
    }
  }
  
  trait GeneralLimits extends StObject {
    
    /** attributeCountLimit is number of attributes per trace */
    var attributeCountLimit: js.UndefOr[Double] = js.undefined
    
    /** attributeValueLengthLimit is maximum allowed attribute value size */
    var attributeValueLengthLimit: js.UndefOr[Double] = js.undefined
  }
  object GeneralLimits {
    
    inline def apply(): GeneralLimits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeneralLimits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeneralLimits] (val x: Self) extends AnyVal {
      
      inline def setAttributeCountLimit(value: Double): Self = StObject.set(x, "attributeCountLimit", value.asInstanceOf[js.Any])
      
      inline def setAttributeCountLimitUndefined: Self = StObject.set(x, "attributeCountLimit", js.undefined)
      
      inline def setAttributeValueLengthLimit(value: Double): Self = StObject.set(x, "attributeValueLengthLimit", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueLengthLimitUndefined: Self = StObject.set(x, "attributeValueLengthLimit", js.undefined)
    }
  }
  
  trait SDKRegistrationConfig extends StObject {
    
    /** Context manager to register as the global context manager */
    var contextManager: js.UndefOr[ContextManager | Null] = js.undefined
    
    /** Propagator to register as the global propagator */
    var propagator: js.UndefOr[TextMapPropagator[Any] | Null] = js.undefined
  }
  object SDKRegistrationConfig {
    
    inline def apply(): SDKRegistrationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SDKRegistrationConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SDKRegistrationConfig] (val x: Self) extends AnyVal {
      
      inline def setContextManager(value: ContextManager): Self = StObject.set(x, "contextManager", value.asInstanceOf[js.Any])
      
      inline def setContextManagerNull: Self = StObject.set(x, "contextManager", null)
      
      inline def setContextManagerUndefined: Self = StObject.set(x, "contextManager", js.undefined)
      
      inline def setPropagator(value: TextMapPropagator[Any]): Self = StObject.set(x, "propagator", value.asInstanceOf[js.Any])
      
      inline def setPropagatorNull: Self = StObject.set(x, "propagator", null)
      
      inline def setPropagatorUndefined: Self = StObject.set(x, "propagator", js.undefined)
    }
  }
  
  trait SpanLimits extends StObject {
    
    /** attributeCountLimit is number of attributes per span */
    var attributeCountLimit: js.UndefOr[Double] = js.undefined
    
    /** attributePerEventCountLimit is the maximum number of attributes allowed per span event */
    var attributePerEventCountLimit: js.UndefOr[Double] = js.undefined
    
    /** attributePerLinkCountLimit is the maximum number of attributes allowed per span link */
    var attributePerLinkCountLimit: js.UndefOr[Double] = js.undefined
    
    /** attributeValueLengthLimit is maximum allowed attribute value size */
    var attributeValueLengthLimit: js.UndefOr[Double] = js.undefined
    
    /** eventCountLimit is number of message events per span */
    var eventCountLimit: js.UndefOr[Double] = js.undefined
    
    /** linkCountLimit is number of links per span */
    var linkCountLimit: js.UndefOr[Double] = js.undefined
  }
  object SpanLimits {
    
    inline def apply(): SpanLimits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpanLimits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpanLimits] (val x: Self) extends AnyVal {
      
      inline def setAttributeCountLimit(value: Double): Self = StObject.set(x, "attributeCountLimit", value.asInstanceOf[js.Any])
      
      inline def setAttributeCountLimitUndefined: Self = StObject.set(x, "attributeCountLimit", js.undefined)
      
      inline def setAttributePerEventCountLimit(value: Double): Self = StObject.set(x, "attributePerEventCountLimit", value.asInstanceOf[js.Any])
      
      inline def setAttributePerEventCountLimitUndefined: Self = StObject.set(x, "attributePerEventCountLimit", js.undefined)
      
      inline def setAttributePerLinkCountLimit(value: Double): Self = StObject.set(x, "attributePerLinkCountLimit", value.asInstanceOf[js.Any])
      
      inline def setAttributePerLinkCountLimitUndefined: Self = StObject.set(x, "attributePerLinkCountLimit", js.undefined)
      
      inline def setAttributeValueLengthLimit(value: Double): Self = StObject.set(x, "attributeValueLengthLimit", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueLengthLimitUndefined: Self = StObject.set(x, "attributeValueLengthLimit", js.undefined)
      
      inline def setEventCountLimit(value: Double): Self = StObject.set(x, "eventCountLimit", value.asInstanceOf[js.Any])
      
      inline def setEventCountLimitUndefined: Self = StObject.set(x, "eventCountLimit", js.undefined)
      
      inline def setLinkCountLimit(value: Double): Self = StObject.set(x, "linkCountLimit", value.asInstanceOf[js.Any])
      
      inline def setLinkCountLimitUndefined: Self = StObject.set(x, "linkCountLimit", js.undefined)
    }
  }
  
  trait TracerConfig extends StObject {
    
    /**
      * How long the forceFlush can run before it is cancelled.
      * The default value is 30000ms
      */
    var forceFlushTimeoutMillis: js.UndefOr[Double] = js.undefined
    
    /** General Limits */
    var generalLimits: js.UndefOr[GeneralLimits] = js.undefined
    
    /**
      * Generator of trace and span IDs
      * The default idGenerator generates random ids
      */
    var idGenerator: js.UndefOr[IdGenerator] = js.undefined
    
    /** Resource associated with trace telemetry  */
    var resource: js.UndefOr[IResource] = js.undefined
    
    /**
      * Sampler determines if a span should be recorded or should be a NoopSpan.
      */
    var sampler: js.UndefOr[Sampler] = js.undefined
    
    /** Span Limits */
    var spanLimits: js.UndefOr[SpanLimits] = js.undefined
  }
  object TracerConfig {
    
    inline def apply(): TracerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TracerConfig] (val x: Self) extends AnyVal {
      
      inline def setForceFlushTimeoutMillis(value: Double): Self = StObject.set(x, "forceFlushTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setForceFlushTimeoutMillisUndefined: Self = StObject.set(x, "forceFlushTimeoutMillis", js.undefined)
      
      inline def setGeneralLimits(value: GeneralLimits): Self = StObject.set(x, "generalLimits", value.asInstanceOf[js.Any])
      
      inline def setGeneralLimitsUndefined: Self = StObject.set(x, "generalLimits", js.undefined)
      
      inline def setIdGenerator(value: IdGenerator): Self = StObject.set(x, "idGenerator", value.asInstanceOf[js.Any])
      
      inline def setIdGeneratorUndefined: Self = StObject.set(x, "idGenerator", js.undefined)
      
      inline def setResource(value: IResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setSampler(value: Sampler): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
      
      inline def setSamplerUndefined: Self = StObject.set(x, "sampler", js.undefined)
      
      inline def setSpanLimits(value: SpanLimits): Self = StObject.set(x, "spanLimits", value.asInstanceOf[js.Any])
      
      inline def setSpanLimitsUndefined: Self = StObject.set(x, "spanLimits", js.undefined)
    }
  }
}
