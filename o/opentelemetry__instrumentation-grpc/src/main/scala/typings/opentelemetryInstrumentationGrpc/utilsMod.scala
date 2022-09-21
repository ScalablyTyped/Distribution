package typings.opentelemetryInstrumentationGrpc

import typings.grpc.mod.status
import typings.grpcGrpcJs.constantsMod.Status
import typings.opentelemetryApi.statusMod.SpanStatus
import typings.opentelemetryApi.statusMod.SpanStatusCode
import typings.opentelemetryInstrumentationGrpc.anon.Method
import typings.opentelemetryInstrumentationGrpc.srcTypesMod.IgnoreMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractMethodAndService(name: String): Method = ^.asInstanceOf[js.Dynamic].applyDynamic("_extractMethodAndService")(name.asInstanceOf[js.Any]).asInstanceOf[Method]
  
  inline def findIndex[T](args: js.Array[T], fn: js.Function1[/* arg */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(args.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def grpcStatusCodeToOpenTelemetryStatusCode(): SpanStatusCode = ^.asInstanceOf[js.Dynamic].applyDynamic("_grpcStatusCodeToOpenTelemetryStatusCode")().asInstanceOf[SpanStatusCode]
  inline def grpcStatusCodeToOpenTelemetryStatusCode(status: status): SpanStatusCode = ^.asInstanceOf[js.Dynamic].applyDynamic("_grpcStatusCodeToOpenTelemetryStatusCode")(status.asInstanceOf[js.Any]).asInstanceOf[SpanStatusCode]
  inline def grpcStatusCodeToOpenTelemetryStatusCode(status: Status): SpanStatusCode = ^.asInstanceOf[js.Dynamic].applyDynamic("_grpcStatusCodeToOpenTelemetryStatusCode")(status.asInstanceOf[js.Any]).asInstanceOf[SpanStatusCode]
  
  inline def grpcStatusCodeToSpanStatus(status: Double): SpanStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("_grpcStatusCodeToSpanStatus")(status.asInstanceOf[js.Any]).asInstanceOf[SpanStatus]
  
  inline def methodIsIgnored(methodName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_methodIsIgnored")(methodName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def methodIsIgnored(methodName: String, ignoredMethods: js.Array[IgnoreMatcher]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_methodIsIgnored")(methodName.asInstanceOf[js.Any], ignoredMethods.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
