package typings.opentelemetryInstrumentationGrpc

import typings.grpc.mod.status
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.mod.Metadata
import typings.opentelemetryApi.buildSrcTraceSpanMod.Span
import typings.opentelemetryApi.buildSrcTraceStatusMod.SpanStatus
import typings.opentelemetryApi.buildSrcTraceStatusMod.SpanStatusCode
import typings.opentelemetryInstrumentationGrpc.anon.Method
import typings.opentelemetryInstrumentationGrpc.buildSrcTypesMod.IgnoreMatcher
import typings.opentelemetryInstrumentationGrpc.opentelemetryInstrumentationGrpcStrings.request
import typings.opentelemetryInstrumentationGrpc.opentelemetryInstrumentationGrpcStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsMod {
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/utils", "URI_REGEX")
  @js.native
  val URI_REGEX: js.RegExp = js.native
  
  inline def extractMethodAndService(name: String): Method = ^.asInstanceOf[js.Dynamic].applyDynamic("_extractMethodAndService")(name.asInstanceOf[js.Any]).asInstanceOf[Method]
  
  inline def findIndex[T](args: js.Array[T], fn: js.Function1[/* arg */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def grpcStatusCodeToOpenTelemetryStatusCode(): SpanStatusCode = ^.asInstanceOf[js.Dynamic].applyDynamic("_grpcStatusCodeToOpenTelemetryStatusCode")().asInstanceOf[SpanStatusCode]
  inline def grpcStatusCodeToOpenTelemetryStatusCode(status: status): SpanStatusCode = ^.asInstanceOf[js.Dynamic].applyDynamic("_grpcStatusCodeToOpenTelemetryStatusCode")(status.asInstanceOf[js.Any]).asInstanceOf[SpanStatusCode]
  inline def grpcStatusCodeToOpenTelemetryStatusCode(status: Status): SpanStatusCode = ^.asInstanceOf[js.Dynamic].applyDynamic("_grpcStatusCodeToOpenTelemetryStatusCode")(status.asInstanceOf[js.Any]).asInstanceOf[SpanStatusCode]
  
  inline def grpcStatusCodeToSpanStatus(status: Double): SpanStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("_grpcStatusCodeToSpanStatus")(status.asInstanceOf[js.Any]).asInstanceOf[SpanStatus]
  
  inline def metadataCapture(`type`: request | response, metadataToAdd: js.Array[String]): js.Function2[/* span */ Span, /* metadata */ Metadata | typings.grpc.mod.Metadata, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("metadataCapture")(`type`.asInstanceOf[js.Any], metadataToAdd.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* span */ Span, /* metadata */ Metadata | typings.grpc.mod.Metadata, Unit]]
  
  inline def methodIsIgnored(methodName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_methodIsIgnored")(methodName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def methodIsIgnored(methodName: String, ignoredMethods: js.Array[IgnoreMatcher]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_methodIsIgnored")(methodName.asInstanceOf[js.Any], ignoredMethods.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
