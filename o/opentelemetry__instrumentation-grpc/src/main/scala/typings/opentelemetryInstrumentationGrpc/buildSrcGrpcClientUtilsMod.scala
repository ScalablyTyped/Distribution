package typings.opentelemetryInstrumentationGrpc

import typings.grpc.mod.Client
import typings.grpc.mod.Metadata
import typings.opentelemetryApi.buildSrcTraceSpanMod.Span
import typings.opentelemetryInstrumentationGrpc.anon.TypeofgrpcTypes
import typings.opentelemetryInstrumentationGrpc.buildSrcGrpcTypesMod.GrpcClientFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGrpcClientUtilsMod {
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/grpc/clientUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMetadata(grpcClient: TypeofgrpcTypes, original: GrpcClientFunc, args: js.Array[Any]): Metadata = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(grpcClient.asInstanceOf[js.Any], original.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Metadata]
  
  inline def makeGrpcClientRemoteCall(
    grpcClient: TypeofgrpcTypes,
    original: GrpcClientFunc,
    args: js.Array[Any],
    metadata: Metadata,
    self: Client
  ): js.Function1[/* span */ Span, js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeGrpcClientRemoteCall")(grpcClient.asInstanceOf[js.Any], original.asInstanceOf[js.Any], args.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any], self.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* span */ Span, js.Function]]
}
