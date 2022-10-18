package typings.opentelemetryInstrumentationGrpc

import typings.grpcGrpcJs.buildSrcServerCallMod.HandleCall
import typings.grpcGrpcJs.mod.Metadata
import typings.opentelemetryApi.buildSrcTraceSpanMod.Span
import typings.opentelemetryInstrumentationGrpc.buildSrcGrpcJsTypesMod.SendUnaryDataCallback
import typings.opentelemetryInstrumentationGrpc.buildSrcGrpcJsTypesMod.ServerCallWithMeta
import typings.opentelemetryInstrumentationGrpc.buildSrcTypesMod.IgnoreMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGrpcJsServerUtilsMod {
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/grpc-js/serverUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/grpc-js/serverUtils", "CALL_SPAN_ENDED")
  @js.native
  val CALL_SPAN_ENDED: js.Symbol = js.native
  
  inline def handleServerFunction[RequestType, ResponseType](
    span: Span,
    `type`: String,
    originalFunc: HandleCall[RequestType, ResponseType],
    call: ServerCallWithMeta[RequestType, ResponseType],
    callback: SendUnaryDataCallback[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleServerFunction")(span.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], originalFunc.asInstanceOf[js.Any], call.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def handleUntracedServerFunction[RequestType, ResponseType](
    `type`: String,
    originalFunc: HandleCall[RequestType, ResponseType],
    call: ServerCallWithMeta[RequestType, ResponseType],
    callback: SendUnaryDataCallback[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("handleUntracedServerFunction")(`type`.asInstanceOf[js.Any], originalFunc.asInstanceOf[js.Any], call.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shouldNotTraceServerCall(metadata: Metadata, methodName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldNotTraceServerCall")(metadata.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shouldNotTraceServerCall(metadata: Metadata, methodName: String, ignoreGrpcMethods: js.Array[IgnoreMatcher]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldNotTraceServerCall")(metadata.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], ignoreGrpcMethods.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
