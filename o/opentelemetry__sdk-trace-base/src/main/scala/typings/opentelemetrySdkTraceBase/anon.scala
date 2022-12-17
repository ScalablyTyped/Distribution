package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetrySdkTraceBase.buildSrcIdGeneratorMod.IdGenerator
import typings.opentelemetrySdkTraceBase.buildSrcSamplerMod.Sampler
import typings.opentelemetrySdkTraceBase.buildSrcTypesMod.GeneralLimits
import typings.opentelemetrySdkTraceBase.buildSrcTypesMod.SpanLimits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AttributeCountLimit extends StObject {
    
    var attributeCountLimit: Double
    
    var attributeValueLengthLimit: Double
  }
  object AttributeCountLimit {
    
    inline def apply(attributeCountLimit: Double, attributeValueLengthLimit: Double): AttributeCountLimit = {
      val __obj = js.Dynamic.literal(attributeCountLimit = attributeCountLimit.asInstanceOf[js.Any], attributeValueLengthLimit = attributeValueLengthLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeCountLimit]
    }
    
    extension [Self <: AttributeCountLimit](x: Self) {
      
      inline def setAttributeCountLimit(value: Double): Self = StObject.set(x, "attributeCountLimit", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueLengthLimit(value: Double): Self = StObject.set(x, "attributeValueLengthLimit", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttributeValueLengthLimit extends StObject {
    
    var attributeCountLimit: Double
    
    var attributeValueLengthLimit: Double
    
    var eventCountLimit: Double
    
    var linkCountLimit: Double
  }
  object AttributeValueLengthLimit {
    
    inline def apply(
      attributeCountLimit: Double,
      attributeValueLengthLimit: Double,
      eventCountLimit: Double,
      linkCountLimit: Double
    ): AttributeValueLengthLimit = {
      val __obj = js.Dynamic.literal(attributeCountLimit = attributeCountLimit.asInstanceOf[js.Any], attributeValueLengthLimit = attributeValueLengthLimit.asInstanceOf[js.Any], eventCountLimit = eventCountLimit.asInstanceOf[js.Any], linkCountLimit = linkCountLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeValueLengthLimit]
    }
    
    extension [Self <: AttributeValueLengthLimit](x: Self) {
      
      inline def setAttributeCountLimit(value: Double): Self = StObject.set(x, "attributeCountLimit", value.asInstanceOf[js.Any])
      
      inline def setAttributeValueLengthLimit(value: Double): Self = StObject.set(x, "attributeValueLengthLimit", value.asInstanceOf[js.Any])
      
      inline def setEventCountLimit(value: Double): Self = StObject.set(x, "eventCountLimit", value.asInstanceOf[js.Any])
      
      inline def setLinkCountLimit(value: Double): Self = StObject.set(x, "linkCountLimit", value.asInstanceOf[js.Any])
    }
  }
  
  trait ForceFlushTimeoutMillis extends StObject {
    
    var forceFlushTimeoutMillis: Double
    
    var generalLimits: AttributeCountLimit
    
    var sampler: Sampler
    
    var spanLimits: AttributeValueLengthLimit
  }
  object ForceFlushTimeoutMillis {
    
    inline def apply(
      forceFlushTimeoutMillis: Double,
      generalLimits: AttributeCountLimit,
      sampler: Sampler,
      spanLimits: AttributeValueLengthLimit
    ): ForceFlushTimeoutMillis = {
      val __obj = js.Dynamic.literal(forceFlushTimeoutMillis = forceFlushTimeoutMillis.asInstanceOf[js.Any], generalLimits = generalLimits.asInstanceOf[js.Any], sampler = sampler.asInstanceOf[js.Any], spanLimits = spanLimits.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceFlushTimeoutMillis]
    }
    
    extension [Self <: ForceFlushTimeoutMillis](x: Self) {
      
      inline def setForceFlushTimeoutMillis(value: Double): Self = StObject.set(x, "forceFlushTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setGeneralLimits(value: AttributeCountLimit): Self = StObject.set(x, "generalLimits", value.asInstanceOf[js.Any])
      
      inline def setSampler(value: Sampler): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
      
      inline def setSpanLimits(value: AttributeValueLengthLimit): Self = StObject.set(x, "spanLimits", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Required<@opentelemetry/core.@opentelemetry/core.ENVIRONMENT> */
  trait RequiredENVIRONMENT extends StObject {
    
    var CONTAINER_NAME: String
    
    var ECS_CONTAINER_METADATA_URI: String
    
    var ECS_CONTAINER_METADATA_URI_V4: String
    
    var HOSTNAME: String
    
    var KUBERNETES_SERVICE_HOST: String
    
    var NAMESPACE: String
    
    var OTEL_ATTRIBUTE_COUNT_LIMIT: Double
    
    var OTEL_ATTRIBUTE_VALUE_LENGTH_LIMIT: Double
    
    var OTEL_BSP_EXPORT_TIMEOUT: Double
    
    var OTEL_BSP_MAX_EXPORT_BATCH_SIZE: Double
    
    var OTEL_BSP_MAX_QUEUE_SIZE: Double
    
    var OTEL_BSP_SCHEDULE_DELAY: Double
    
    var OTEL_EXPORTER_JAEGER_AGENT_HOST: String
    
    var OTEL_EXPORTER_JAEGER_AGENT_PORT: Double
    
    var OTEL_EXPORTER_JAEGER_ENDPOINT: String
    
    var OTEL_EXPORTER_JAEGER_PASSWORD: String
    
    var OTEL_EXPORTER_JAEGER_USER: String
    
    var OTEL_EXPORTER_OTLP_CERTIFICATE: String
    
    var OTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE: String
    
    var OTEL_EXPORTER_OTLP_CLIENT_KEY: String
    
    var OTEL_EXPORTER_OTLP_COMPRESSION: String
    
    var OTEL_EXPORTER_OTLP_ENDPOINT: String
    
    var OTEL_EXPORTER_OTLP_HEADERS: String
    
    var OTEL_EXPORTER_OTLP_INSECURE: String
    
    var OTEL_EXPORTER_OTLP_METRICS_CERTIFICATE: String
    
    var OTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATE: String
    
    var OTEL_EXPORTER_OTLP_METRICS_CLIENT_KEY: String
    
    var OTEL_EXPORTER_OTLP_METRICS_COMPRESSION: String
    
    var OTEL_EXPORTER_OTLP_METRICS_ENDPOINT: String
    
    var OTEL_EXPORTER_OTLP_METRICS_HEADERS: String
    
    var OTEL_EXPORTER_OTLP_METRICS_INSECURE: String
    
    var OTEL_EXPORTER_OTLP_METRICS_TIMEOUT: Double
    
    var OTEL_EXPORTER_OTLP_TIMEOUT: Double
    
    var OTEL_EXPORTER_OTLP_TRACES_CERTIFICATE: String
    
    var OTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATE: String
    
    var OTEL_EXPORTER_OTLP_TRACES_CLIENT_KEY: String
    
    var OTEL_EXPORTER_OTLP_TRACES_COMPRESSION: String
    
    var OTEL_EXPORTER_OTLP_TRACES_ENDPOINT: String
    
    var OTEL_EXPORTER_OTLP_TRACES_HEADERS: String
    
    var OTEL_EXPORTER_OTLP_TRACES_INSECURE: String
    
    var OTEL_EXPORTER_OTLP_TRACES_TIMEOUT: Double
    
    var OTEL_EXPORTER_ZIPKIN_ENDPOINT: String
    
    var OTEL_LOG_LEVEL: DiagLogLevel
    
    var OTEL_NO_PATCH_MODULES: js.Array[String]
    
    var OTEL_PROPAGATORS: js.Array[String]
    
    var OTEL_RESOURCE_ATTRIBUTES: String
    
    var OTEL_SERVICE_NAME: String
    
    var OTEL_SPAN_ATTRIBUTE_COUNT_LIMIT: Double
    
    var OTEL_SPAN_ATTRIBUTE_VALUE_LENGTH_LIMIT: Double
    
    var OTEL_SPAN_EVENT_COUNT_LIMIT: Double
    
    var OTEL_SPAN_LINK_COUNT_LIMIT: Double
    
    var OTEL_TRACES_EXPORTER: String
    
    var OTEL_TRACES_SAMPLER: String
    
    var OTEL_TRACES_SAMPLER_ARG: String
  }
  object RequiredENVIRONMENT {
    
    inline def apply(
      CONTAINER_NAME: String,
      ECS_CONTAINER_METADATA_URI: String,
      ECS_CONTAINER_METADATA_URI_V4: String,
      HOSTNAME: String,
      KUBERNETES_SERVICE_HOST: String,
      NAMESPACE: String,
      OTEL_ATTRIBUTE_COUNT_LIMIT: Double,
      OTEL_ATTRIBUTE_VALUE_LENGTH_LIMIT: Double,
      OTEL_BSP_EXPORT_TIMEOUT: Double,
      OTEL_BSP_MAX_EXPORT_BATCH_SIZE: Double,
      OTEL_BSP_MAX_QUEUE_SIZE: Double,
      OTEL_BSP_SCHEDULE_DELAY: Double,
      OTEL_EXPORTER_JAEGER_AGENT_HOST: String,
      OTEL_EXPORTER_JAEGER_AGENT_PORT: Double,
      OTEL_EXPORTER_JAEGER_ENDPOINT: String,
      OTEL_EXPORTER_JAEGER_PASSWORD: String,
      OTEL_EXPORTER_JAEGER_USER: String,
      OTEL_EXPORTER_OTLP_CERTIFICATE: String,
      OTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE: String,
      OTEL_EXPORTER_OTLP_CLIENT_KEY: String,
      OTEL_EXPORTER_OTLP_COMPRESSION: String,
      OTEL_EXPORTER_OTLP_ENDPOINT: String,
      OTEL_EXPORTER_OTLP_HEADERS: String,
      OTEL_EXPORTER_OTLP_INSECURE: String,
      OTEL_EXPORTER_OTLP_METRICS_CERTIFICATE: String,
      OTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATE: String,
      OTEL_EXPORTER_OTLP_METRICS_CLIENT_KEY: String,
      OTEL_EXPORTER_OTLP_METRICS_COMPRESSION: String,
      OTEL_EXPORTER_OTLP_METRICS_ENDPOINT: String,
      OTEL_EXPORTER_OTLP_METRICS_HEADERS: String,
      OTEL_EXPORTER_OTLP_METRICS_INSECURE: String,
      OTEL_EXPORTER_OTLP_METRICS_TIMEOUT: Double,
      OTEL_EXPORTER_OTLP_TIMEOUT: Double,
      OTEL_EXPORTER_OTLP_TRACES_CERTIFICATE: String,
      OTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATE: String,
      OTEL_EXPORTER_OTLP_TRACES_CLIENT_KEY: String,
      OTEL_EXPORTER_OTLP_TRACES_COMPRESSION: String,
      OTEL_EXPORTER_OTLP_TRACES_ENDPOINT: String,
      OTEL_EXPORTER_OTLP_TRACES_HEADERS: String,
      OTEL_EXPORTER_OTLP_TRACES_INSECURE: String,
      OTEL_EXPORTER_OTLP_TRACES_TIMEOUT: Double,
      OTEL_EXPORTER_ZIPKIN_ENDPOINT: String,
      OTEL_LOG_LEVEL: DiagLogLevel,
      OTEL_NO_PATCH_MODULES: js.Array[String],
      OTEL_PROPAGATORS: js.Array[String],
      OTEL_RESOURCE_ATTRIBUTES: String,
      OTEL_SERVICE_NAME: String,
      OTEL_SPAN_ATTRIBUTE_COUNT_LIMIT: Double,
      OTEL_SPAN_ATTRIBUTE_VALUE_LENGTH_LIMIT: Double,
      OTEL_SPAN_EVENT_COUNT_LIMIT: Double,
      OTEL_SPAN_LINK_COUNT_LIMIT: Double,
      OTEL_TRACES_EXPORTER: String,
      OTEL_TRACES_SAMPLER: String,
      OTEL_TRACES_SAMPLER_ARG: String
    ): RequiredENVIRONMENT = {
      val __obj = js.Dynamic.literal(CONTAINER_NAME = CONTAINER_NAME.asInstanceOf[js.Any], ECS_CONTAINER_METADATA_URI = ECS_CONTAINER_METADATA_URI.asInstanceOf[js.Any], ECS_CONTAINER_METADATA_URI_V4 = ECS_CONTAINER_METADATA_URI_V4.asInstanceOf[js.Any], HOSTNAME = HOSTNAME.asInstanceOf[js.Any], KUBERNETES_SERVICE_HOST = KUBERNETES_SERVICE_HOST.asInstanceOf[js.Any], NAMESPACE = NAMESPACE.asInstanceOf[js.Any], OTEL_ATTRIBUTE_COUNT_LIMIT = OTEL_ATTRIBUTE_COUNT_LIMIT.asInstanceOf[js.Any], OTEL_ATTRIBUTE_VALUE_LENGTH_LIMIT = OTEL_ATTRIBUTE_VALUE_LENGTH_LIMIT.asInstanceOf[js.Any], OTEL_BSP_EXPORT_TIMEOUT = OTEL_BSP_EXPORT_TIMEOUT.asInstanceOf[js.Any], OTEL_BSP_MAX_EXPORT_BATCH_SIZE = OTEL_BSP_MAX_EXPORT_BATCH_SIZE.asInstanceOf[js.Any], OTEL_BSP_MAX_QUEUE_SIZE = OTEL_BSP_MAX_QUEUE_SIZE.asInstanceOf[js.Any], OTEL_BSP_SCHEDULE_DELAY = OTEL_BSP_SCHEDULE_DELAY.asInstanceOf[js.Any], OTEL_EXPORTER_JAEGER_AGENT_HOST = OTEL_EXPORTER_JAEGER_AGENT_HOST.asInstanceOf[js.Any], OTEL_EXPORTER_JAEGER_AGENT_PORT = OTEL_EXPORTER_JAEGER_AGENT_PORT.asInstanceOf[js.Any], OTEL_EXPORTER_JAEGER_ENDPOINT = OTEL_EXPORTER_JAEGER_ENDPOINT.asInstanceOf[js.Any], OTEL_EXPORTER_JAEGER_PASSWORD = OTEL_EXPORTER_JAEGER_PASSWORD.asInstanceOf[js.Any], OTEL_EXPORTER_JAEGER_USER = OTEL_EXPORTER_JAEGER_USER.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_CERTIFICATE = OTEL_EXPORTER_OTLP_CERTIFICATE.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE = OTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_CLIENT_KEY = OTEL_EXPORTER_OTLP_CLIENT_KEY.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_COMPRESSION = OTEL_EXPORTER_OTLP_COMPRESSION.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_ENDPOINT = OTEL_EXPORTER_OTLP_ENDPOINT.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_HEADERS = OTEL_EXPORTER_OTLP_HEADERS.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_INSECURE = OTEL_EXPORTER_OTLP_INSECURE.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_METRICS_CERTIFICATE = OTEL_EXPORTER_OTLP_METRICS_CERTIFICATE.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATE = OTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATE.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_METRICS_CLIENT_KEY = OTEL_EXPORTER_OTLP_METRICS_CLIENT_KEY.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_METRICS_COMPRESSION = OTEL_EXPORTER_OTLP_METRICS_COMPRESSION.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_METRICS_ENDPOINT = OTEL_EXPORTER_OTLP_METRICS_ENDPOINT.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_METRICS_HEADERS = OTEL_EXPORTER_OTLP_METRICS_HEADERS.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_METRICS_INSECURE = OTEL_EXPORTER_OTLP_METRICS_INSECURE.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_METRICS_TIMEOUT = OTEL_EXPORTER_OTLP_METRICS_TIMEOUT.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_TIMEOUT = OTEL_EXPORTER_OTLP_TIMEOUT.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_TRACES_CERTIFICATE = OTEL_EXPORTER_OTLP_TRACES_CERTIFICATE.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATE = OTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATE.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_TRACES_CLIENT_KEY = OTEL_EXPORTER_OTLP_TRACES_CLIENT_KEY.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_TRACES_COMPRESSION = OTEL_EXPORTER_OTLP_TRACES_COMPRESSION.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_TRACES_ENDPOINT = OTEL_EXPORTER_OTLP_TRACES_ENDPOINT.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_TRACES_HEADERS = OTEL_EXPORTER_OTLP_TRACES_HEADERS.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_TRACES_INSECURE = OTEL_EXPORTER_OTLP_TRACES_INSECURE.asInstanceOf[js.Any], OTEL_EXPORTER_OTLP_TRACES_TIMEOUT = OTEL_EXPORTER_OTLP_TRACES_TIMEOUT.asInstanceOf[js.Any], OTEL_EXPORTER_ZIPKIN_ENDPOINT = OTEL_EXPORTER_ZIPKIN_ENDPOINT.asInstanceOf[js.Any], OTEL_LOG_LEVEL = OTEL_LOG_LEVEL.asInstanceOf[js.Any], OTEL_NO_PATCH_MODULES = OTEL_NO_PATCH_MODULES.asInstanceOf[js.Any], OTEL_PROPAGATORS = OTEL_PROPAGATORS.asInstanceOf[js.Any], OTEL_RESOURCE_ATTRIBUTES = OTEL_RESOURCE_ATTRIBUTES.asInstanceOf[js.Any], OTEL_SERVICE_NAME = OTEL_SERVICE_NAME.asInstanceOf[js.Any], OTEL_SPAN_ATTRIBUTE_COUNT_LIMIT = OTEL_SPAN_ATTRIBUTE_COUNT_LIMIT.asInstanceOf[js.Any], OTEL_SPAN_ATTRIBUTE_VALUE_LENGTH_LIMIT = OTEL_SPAN_ATTRIBUTE_VALUE_LENGTH_LIMIT.asInstanceOf[js.Any], OTEL_SPAN_EVENT_COUNT_LIMIT = OTEL_SPAN_EVENT_COUNT_LIMIT.asInstanceOf[js.Any], OTEL_SPAN_LINK_COUNT_LIMIT = OTEL_SPAN_LINK_COUNT_LIMIT.asInstanceOf[js.Any], OTEL_TRACES_EXPORTER = OTEL_TRACES_EXPORTER.asInstanceOf[js.Any], OTEL_TRACES_SAMPLER = OTEL_TRACES_SAMPLER.asInstanceOf[js.Any], OTEL_TRACES_SAMPLER_ARG = OTEL_TRACES_SAMPLER_ARG.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredENVIRONMENT]
    }
    
    extension [Self <: RequiredENVIRONMENT](x: Self) {
      
      inline def setCONTAINER_NAME(value: String): Self = StObject.set(x, "CONTAINER_NAME", value.asInstanceOf[js.Any])
      
      inline def setECS_CONTAINER_METADATA_URI(value: String): Self = StObject.set(x, "ECS_CONTAINER_METADATA_URI", value.asInstanceOf[js.Any])
      
      inline def setECS_CONTAINER_METADATA_URI_V4(value: String): Self = StObject.set(x, "ECS_CONTAINER_METADATA_URI_V4", value.asInstanceOf[js.Any])
      
      inline def setHOSTNAME(value: String): Self = StObject.set(x, "HOSTNAME", value.asInstanceOf[js.Any])
      
      inline def setKUBERNETES_SERVICE_HOST(value: String): Self = StObject.set(x, "KUBERNETES_SERVICE_HOST", value.asInstanceOf[js.Any])
      
      inline def setNAMESPACE(value: String): Self = StObject.set(x, "NAMESPACE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_ATTRIBUTE_COUNT_LIMIT(value: Double): Self = StObject.set(x, "OTEL_ATTRIBUTE_COUNT_LIMIT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_ATTRIBUTE_VALUE_LENGTH_LIMIT(value: Double): Self = StObject.set(x, "OTEL_ATTRIBUTE_VALUE_LENGTH_LIMIT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_BSP_EXPORT_TIMEOUT(value: Double): Self = StObject.set(x, "OTEL_BSP_EXPORT_TIMEOUT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_BSP_MAX_EXPORT_BATCH_SIZE(value: Double): Self = StObject.set(x, "OTEL_BSP_MAX_EXPORT_BATCH_SIZE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_BSP_MAX_QUEUE_SIZE(value: Double): Self = StObject.set(x, "OTEL_BSP_MAX_QUEUE_SIZE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_BSP_SCHEDULE_DELAY(value: Double): Self = StObject.set(x, "OTEL_BSP_SCHEDULE_DELAY", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_JAEGER_AGENT_HOST(value: String): Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_AGENT_HOST", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_JAEGER_AGENT_PORT(value: Double): Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_AGENT_PORT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_JAEGER_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_JAEGER_PASSWORD(value: String): Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_PASSWORD", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_JAEGER_USER(value: String): Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_USER", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_CLIENT_KEY(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_CLIENT_KEY", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_COMPRESSION(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_COMPRESSION", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_HEADERS(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_HEADERS", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_INSECURE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_INSECURE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_CLIENT_KEY(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_CLIENT_KEY", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_COMPRESSION(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_COMPRESSION", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_HEADERS(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_HEADERS", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_INSECURE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_INSECURE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_TIMEOUT(value: Double): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_TIMEOUT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TIMEOUT(value: Double): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TIMEOUT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_CLIENT_KEY(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_CLIENT_KEY", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_COMPRESSION(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_COMPRESSION", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_HEADERS(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_HEADERS", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_INSECURE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_INSECURE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_TIMEOUT(value: Double): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_TIMEOUT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_ZIPKIN_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_ZIPKIN_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_LOG_LEVEL(value: DiagLogLevel): Self = StObject.set(x, "OTEL_LOG_LEVEL", value.asInstanceOf[js.Any])
      
      inline def setOTEL_NO_PATCH_MODULES(value: js.Array[String]): Self = StObject.set(x, "OTEL_NO_PATCH_MODULES", value.asInstanceOf[js.Any])
      
      inline def setOTEL_NO_PATCH_MODULESVarargs(value: String*): Self = StObject.set(x, "OTEL_NO_PATCH_MODULES", js.Array(value*))
      
      inline def setOTEL_PROPAGATORS(value: js.Array[String]): Self = StObject.set(x, "OTEL_PROPAGATORS", value.asInstanceOf[js.Any])
      
      inline def setOTEL_PROPAGATORSVarargs(value: String*): Self = StObject.set(x, "OTEL_PROPAGATORS", js.Array(value*))
      
      inline def setOTEL_RESOURCE_ATTRIBUTES(value: String): Self = StObject.set(x, "OTEL_RESOURCE_ATTRIBUTES", value.asInstanceOf[js.Any])
      
      inline def setOTEL_SERVICE_NAME(value: String): Self = StObject.set(x, "OTEL_SERVICE_NAME", value.asInstanceOf[js.Any])
      
      inline def setOTEL_SPAN_ATTRIBUTE_COUNT_LIMIT(value: Double): Self = StObject.set(x, "OTEL_SPAN_ATTRIBUTE_COUNT_LIMIT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_SPAN_ATTRIBUTE_VALUE_LENGTH_LIMIT(value: Double): Self = StObject.set(x, "OTEL_SPAN_ATTRIBUTE_VALUE_LENGTH_LIMIT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_SPAN_EVENT_COUNT_LIMIT(value: Double): Self = StObject.set(x, "OTEL_SPAN_EVENT_COUNT_LIMIT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_SPAN_LINK_COUNT_LIMIT(value: Double): Self = StObject.set(x, "OTEL_SPAN_LINK_COUNT_LIMIT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_TRACES_EXPORTER(value: String): Self = StObject.set(x, "OTEL_TRACES_EXPORTER", value.asInstanceOf[js.Any])
      
      inline def setOTEL_TRACES_SAMPLER(value: String): Self = StObject.set(x, "OTEL_TRACES_SAMPLER", value.asInstanceOf[js.Any])
      
      inline def setOTEL_TRACES_SAMPLER_ARG(value: String): Self = StObject.set(x, "OTEL_TRACES_SAMPLER_ARG", value.asInstanceOf[js.Any])
    }
  }
  
  trait SchemaUrl extends StObject {
    
    var schemaUrl: js.UndefOr[String] = js.undefined
  }
  object SchemaUrl {
    
    inline def apply(): SchemaUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaUrl]
    }
    
    extension [Self <: SchemaUrl](x: Self) {
      
      inline def setSchemaUrl(value: String): Self = StObject.set(x, "schemaUrl", value.asInstanceOf[js.Any])
      
      inline def setSchemaUrlUndefined: Self = StObject.set(x, "schemaUrl", js.undefined)
    }
  }
  
  /* Inlined @opentelemetry/sdk-trace-base.@opentelemetry/sdk-trace-base/build/src/types.TracerConfig & {  sampler :@opentelemetry/sdk-trace-base.@opentelemetry/sdk-trace-base/build/src/Sampler.Sampler,   spanLimits :@opentelemetry/sdk-trace-base.@opentelemetry/sdk-trace-base/build/src/types.SpanLimits,   generalLimits :@opentelemetry/sdk-trace-base.@opentelemetry/sdk-trace-base/build/src/types.GeneralLimits} */
  trait TracerConfigsamplerSample extends StObject {
    
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
    var resource: js.UndefOr[Resource] = js.undefined
    
    /**
      * Sampler determines if a span should be recorded or should be a NoopSpan.
      */
    var sampler: js.UndefOr[Sampler] = js.undefined
    
    /** Span Limits */
    var spanLimits: js.UndefOr[SpanLimits] = js.undefined
  }
  object TracerConfigsamplerSample {
    
    inline def apply(): TracerConfigsamplerSample = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracerConfigsamplerSample]
    }
    
    extension [Self <: TracerConfigsamplerSample](x: Self) {
      
      inline def setForceFlushTimeoutMillis(value: Double): Self = StObject.set(x, "forceFlushTimeoutMillis", value.asInstanceOf[js.Any])
      
      inline def setForceFlushTimeoutMillisUndefined: Self = StObject.set(x, "forceFlushTimeoutMillis", js.undefined)
      
      inline def setGeneralLimits(value: GeneralLimits): Self = StObject.set(x, "generalLimits", value.asInstanceOf[js.Any])
      
      inline def setGeneralLimitsUndefined: Self = StObject.set(x, "generalLimits", js.undefined)
      
      inline def setIdGenerator(value: IdGenerator): Self = StObject.set(x, "idGenerator", value.asInstanceOf[js.Any])
      
      inline def setIdGeneratorUndefined: Self = StObject.set(x, "idGenerator", js.undefined)
      
      inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setSampler(value: Sampler): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
      
      inline def setSamplerUndefined: Self = StObject.set(x, "sampler", js.undefined)
      
      inline def setSpanLimits(value: SpanLimits): Self = StObject.set(x, "spanLimits", value.asInstanceOf[js.Any])
      
      inline def setSpanLimitsUndefined: Self = StObject.set(x, "spanLimits", js.undefined)
    }
  }
}
