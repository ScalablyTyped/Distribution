package typings.opentelemetryInstrumentationGrpc

import typings.grpc.mod.ClientReadableStream
import typings.grpc.mod.handleCall
import typings.opentelemetryApi.spanMod.Span
import typings.opentelemetryInstrumentationGrpc.anon.TypeofgrpcTypes
import typings.opentelemetryInstrumentationGrpc.grpcTypesMod.SendUnaryDataCallback
import typings.opentelemetryInstrumentationGrpc.grpcTypesMod.ServerCallWithMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grpcServerUtilsMod {
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/grpc/serverUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clientStreamAndUnaryHandler[RequestType, ResponseType_1](
    grpcClient: TypeofgrpcTypes,
    span: Span,
    call: ServerCallWithMeta,
    callback: SendUnaryDataCallback,
    original: ClientReadableStream[RequestType],
    self: js.Object
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("clientStreamAndUnaryHandler")(grpcClient.asInstanceOf[js.Any], span.asInstanceOf[js.Any], call.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], original.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def clientStreamAndUnaryHandler[RequestType, ResponseType_1](
    grpcClient: TypeofgrpcTypes,
    span: Span,
    call: ServerCallWithMeta,
    callback: SendUnaryDataCallback,
    original: handleCall[RequestType, ResponseType_1],
    self: js.Object
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("clientStreamAndUnaryHandler")(grpcClient.asInstanceOf[js.Any], span.asInstanceOf[js.Any], call.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], original.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def serverStreamAndBidiHandler[RequestType, ResponseType_1](
    span: Span,
    call: ServerCallWithMeta,
    original: handleCall[RequestType, ResponseType_1],
    self: js.Object
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("serverStreamAndBidiHandler")(span.asInstanceOf[js.Any], call.asInstanceOf[js.Any], original.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def shouldNotTraceServerCall(call: ServerCallWithMeta, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldNotTraceServerCall")(call.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
