package typings.opentelemetryCore

import typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel
import typings.opentelemetryCore.buildSrcExportResultMod.ExportResult
import typings.opentelemetryCore.buildSrcInternalExporterMod.Exporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CONTAINERNAME extends StObject {
    
    var CONTAINER_NAME: js.UndefOr[String] = js.undefined
    
    var ECS_CONTAINER_METADATA_URI: js.UndefOr[String] = js.undefined
    
    var ECS_CONTAINER_METADATA_URI_V4: js.UndefOr[String] = js.undefined
    
    var HOSTNAME: js.UndefOr[String] = js.undefined
    
    var KUBERNETES_SERVICE_HOST: js.UndefOr[String] = js.undefined
    
    var NAMESPACE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_JAEGER_AGENT_HOST: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_JAEGER_ENDPOINT: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_JAEGER_PASSWORD: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_JAEGER_USER: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_CERTIFICATE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_CLIENT_KEY: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_COMPRESSION: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_ENDPOINT: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_HEADERS: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_INSECURE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_LOGS_CERTIFICATE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_LOGS_CLIENT_CERTIFICATE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_LOGS_CLIENT_KEY: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_LOGS_COMPRESSION: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_LOGS_ENDPOINT: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_LOGS_HEADERS: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_LOGS_INSECURE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_LOGS_PROTOCOL: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_METRICS_CERTIFICATE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_METRICS_CLIENT_KEY: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_METRICS_COMPRESSION: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_METRICS_ENDPOINT: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_METRICS_HEADERS: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_METRICS_INSECURE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_METRICS_PROTOCOL: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_PROTOCOL: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_TRACES_CERTIFICATE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_TRACES_CLIENT_KEY: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_TRACES_COMPRESSION: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_TRACES_ENDPOINT: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_TRACES_HEADERS: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_TRACES_INSECURE: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_OTLP_TRACES_PROTOCOL: js.UndefOr[String] = js.undefined
    
    var OTEL_EXPORTER_ZIPKIN_ENDPOINT: js.UndefOr[String] = js.undefined
    
    var OTEL_LOGS_EXPORTER: js.UndefOr[String] = js.undefined
    
    var OTEL_LOG_LEVEL: js.UndefOr[DiagLogLevel] = js.undefined
    
    var OTEL_RESOURCE_ATTRIBUTES: js.UndefOr[String] = js.undefined
    
    var OTEL_SERVICE_NAME: js.UndefOr[String] = js.undefined
    
    var OTEL_TRACES_EXPORTER: js.UndefOr[String] = js.undefined
    
    var OTEL_TRACES_SAMPLER: js.UndefOr[String] = js.undefined
    
    var OTEL_TRACES_SAMPLER_ARG: js.UndefOr[String] = js.undefined
  }
  object CONTAINERNAME {
    
    inline def apply(): CONTAINERNAME = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CONTAINERNAME]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CONTAINERNAME] (val x: Self) extends AnyVal {
      
      inline def setCONTAINER_NAME(value: String): Self = StObject.set(x, "CONTAINER_NAME", value.asInstanceOf[js.Any])
      
      inline def setCONTAINER_NAMEUndefined: Self = StObject.set(x, "CONTAINER_NAME", js.undefined)
      
      inline def setECS_CONTAINER_METADATA_URI(value: String): Self = StObject.set(x, "ECS_CONTAINER_METADATA_URI", value.asInstanceOf[js.Any])
      
      inline def setECS_CONTAINER_METADATA_URIUndefined: Self = StObject.set(x, "ECS_CONTAINER_METADATA_URI", js.undefined)
      
      inline def setECS_CONTAINER_METADATA_URI_V4(value: String): Self = StObject.set(x, "ECS_CONTAINER_METADATA_URI_V4", value.asInstanceOf[js.Any])
      
      inline def setECS_CONTAINER_METADATA_URI_V4Undefined: Self = StObject.set(x, "ECS_CONTAINER_METADATA_URI_V4", js.undefined)
      
      inline def setHOSTNAME(value: String): Self = StObject.set(x, "HOSTNAME", value.asInstanceOf[js.Any])
      
      inline def setHOSTNAMEUndefined: Self = StObject.set(x, "HOSTNAME", js.undefined)
      
      inline def setKUBERNETES_SERVICE_HOST(value: String): Self = StObject.set(x, "KUBERNETES_SERVICE_HOST", value.asInstanceOf[js.Any])
      
      inline def setKUBERNETES_SERVICE_HOSTUndefined: Self = StObject.set(x, "KUBERNETES_SERVICE_HOST", js.undefined)
      
      inline def setNAMESPACE(value: String): Self = StObject.set(x, "NAMESPACE", value.asInstanceOf[js.Any])
      
      inline def setNAMESPACEUndefined: Self = StObject.set(x, "NAMESPACE", js.undefined)
      
      inline def setOTEL_EXPORTER_JAEGER_AGENT_HOST(value: String): Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_AGENT_HOST", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_JAEGER_AGENT_HOSTUndefined: Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_AGENT_HOST", js.undefined)
      
      inline def setOTEL_EXPORTER_JAEGER_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_JAEGER_ENDPOINTUndefined: Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_ENDPOINT", js.undefined)
      
      inline def setOTEL_EXPORTER_JAEGER_PASSWORD(value: String): Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_PASSWORD", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_JAEGER_PASSWORDUndefined: Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_PASSWORD", js.undefined)
      
      inline def setOTEL_EXPORTER_JAEGER_USER(value: String): Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_USER", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_JAEGER_USERUndefined: Self = StObject.set(x, "OTEL_EXPORTER_JAEGER_USER", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_CERTIFICATEUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_CERTIFICATE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_CLIENT_CERTIFICATEUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_CLIENT_CERTIFICATE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_CLIENT_KEY(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_CLIENT_KEY", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_CLIENT_KEYUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_CLIENT_KEY", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_COMPRESSION(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_COMPRESSION", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_COMPRESSIONUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_COMPRESSION", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_ENDPOINTUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_ENDPOINT", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_HEADERS(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_HEADERS", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_HEADERSUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_HEADERS", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_INSECURE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_INSECURE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_INSECUREUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_INSECURE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_CERTIFICATEUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_CERTIFICATE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_CLIENT_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_CLIENT_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_CLIENT_CERTIFICATEUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_CLIENT_CERTIFICATE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_CLIENT_KEY(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_CLIENT_KEY", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_CLIENT_KEYUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_CLIENT_KEY", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_COMPRESSION(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_COMPRESSION", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_COMPRESSIONUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_COMPRESSION", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_ENDPOINTUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_ENDPOINT", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_HEADERS(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_HEADERS", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_HEADERSUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_HEADERS", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_INSECURE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_INSECURE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_INSECUREUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_INSECURE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_PROTOCOL(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_PROTOCOL", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_LOGS_PROTOCOLUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_LOGS_PROTOCOL", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_CERTIFICATEUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_CERTIFICATE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATEUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_CLIENT_CERTIFICATE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_CLIENT_KEY(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_CLIENT_KEY", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_CLIENT_KEYUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_CLIENT_KEY", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_COMPRESSION(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_COMPRESSION", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_COMPRESSIONUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_COMPRESSION", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_ENDPOINTUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_ENDPOINT", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_HEADERS(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_HEADERS", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_HEADERSUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_HEADERS", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_INSECURE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_INSECURE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_INSECUREUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_INSECURE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_PROTOCOL(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_PROTOCOL", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_PROTOCOLUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_PROTOCOL", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCEUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_PROTOCOL(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_PROTOCOL", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_PROTOCOLUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_PROTOCOL", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_CERTIFICATEUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_CERTIFICATE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATEUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_CLIENT_CERTIFICATE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_CLIENT_KEY(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_CLIENT_KEY", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_CLIENT_KEYUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_CLIENT_KEY", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_COMPRESSION(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_COMPRESSION", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_COMPRESSIONUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_COMPRESSION", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_ENDPOINTUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_ENDPOINT", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_HEADERS(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_HEADERS", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_HEADERSUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_HEADERS", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_INSECURE(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_INSECURE", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_INSECUREUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_INSECURE", js.undefined)
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_PROTOCOL(value: String): Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_PROTOCOL", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_OTLP_TRACES_PROTOCOLUndefined: Self = StObject.set(x, "OTEL_EXPORTER_OTLP_TRACES_PROTOCOL", js.undefined)
      
      inline def setOTEL_EXPORTER_ZIPKIN_ENDPOINT(value: String): Self = StObject.set(x, "OTEL_EXPORTER_ZIPKIN_ENDPOINT", value.asInstanceOf[js.Any])
      
      inline def setOTEL_EXPORTER_ZIPKIN_ENDPOINTUndefined: Self = StObject.set(x, "OTEL_EXPORTER_ZIPKIN_ENDPOINT", js.undefined)
      
      inline def setOTEL_LOGS_EXPORTER(value: String): Self = StObject.set(x, "OTEL_LOGS_EXPORTER", value.asInstanceOf[js.Any])
      
      inline def setOTEL_LOGS_EXPORTERUndefined: Self = StObject.set(x, "OTEL_LOGS_EXPORTER", js.undefined)
      
      inline def setOTEL_LOG_LEVEL(value: DiagLogLevel): Self = StObject.set(x, "OTEL_LOG_LEVEL", value.asInstanceOf[js.Any])
      
      inline def setOTEL_LOG_LEVELUndefined: Self = StObject.set(x, "OTEL_LOG_LEVEL", js.undefined)
      
      inline def setOTEL_RESOURCE_ATTRIBUTES(value: String): Self = StObject.set(x, "OTEL_RESOURCE_ATTRIBUTES", value.asInstanceOf[js.Any])
      
      inline def setOTEL_RESOURCE_ATTRIBUTESUndefined: Self = StObject.set(x, "OTEL_RESOURCE_ATTRIBUTES", js.undefined)
      
      inline def setOTEL_SERVICE_NAME(value: String): Self = StObject.set(x, "OTEL_SERVICE_NAME", value.asInstanceOf[js.Any])
      
      inline def setOTEL_SERVICE_NAMEUndefined: Self = StObject.set(x, "OTEL_SERVICE_NAME", js.undefined)
      
      inline def setOTEL_TRACES_EXPORTER(value: String): Self = StObject.set(x, "OTEL_TRACES_EXPORTER", value.asInstanceOf[js.Any])
      
      inline def setOTEL_TRACES_EXPORTERUndefined: Self = StObject.set(x, "OTEL_TRACES_EXPORTER", js.undefined)
      
      inline def setOTEL_TRACES_SAMPLER(value: String): Self = StObject.set(x, "OTEL_TRACES_SAMPLER", value.asInstanceOf[js.Any])
      
      inline def setOTEL_TRACES_SAMPLERUndefined: Self = StObject.set(x, "OTEL_TRACES_SAMPLER", js.undefined)
      
      inline def setOTEL_TRACES_SAMPLER_ARG(value: String): Self = StObject.set(x, "OTEL_TRACES_SAMPLER_ARG", value.asInstanceOf[js.Any])
      
      inline def setOTEL_TRACES_SAMPLER_ARGUndefined: Self = StObject.set(x, "OTEL_TRACES_SAMPLER_ARG", js.undefined)
    }
  }
  
  trait FetchStart extends StObject {
    
    var fetchStart: Double
  }
  object FetchStart {
    
    inline def apply(fetchStart: Double): FetchStart = {
      val __obj = js.Dynamic.literal(fetchStart = fetchStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchStart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchStart] (val x: Self) extends AnyVal {
      
      inline def setFetchStart(value: Double): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](exporter: Exporter[T], arg: T): js.Promise[ExportResult] = js.native
  }
}
