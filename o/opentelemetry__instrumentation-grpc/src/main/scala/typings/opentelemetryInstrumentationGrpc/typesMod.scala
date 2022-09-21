package typings.opentelemetryInstrumentationGrpc

import typings.grpcGrpcJs.clientMod.UnaryCallback
import typings.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typings.grpcGrpcJs.serverCallMod.ServerDuplexStream
import typings.grpcGrpcJs.serverCallMod.ServerReadableStream
import typings.grpcGrpcJs.serverCallMod.ServerUnaryCall
import typings.grpcGrpcJs.serverCallMod.ServerWritableStream
import typings.node.eventsMod.EventEmitter
import typings.opentelemetryInstrumentationGrpc.anon.Metadata
import typings.opentelemetryInstrumentationGrpc.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type GrpcClientFunc = (js.Function1[/* repeated */ Any, GrpcEmitter]) & Path
  
  @js.native
  trait GrpcEmitter extends EventEmitter
  
  @js.native
  trait MakeClientConstructorFunction extends StObject {
    
    def apply(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def apply(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  }
  
  type SendUnaryDataCallback[T] = UnaryCallback[T]
  
  type ServerCall[T, U] = (ServerUnaryCall[T, U]) | (ServerReadableStream[T, U]) | (ServerWritableStream[T, U]) | (ServerDuplexStream[T, U])
  
  type ServerCallWithMeta[T, U] = (ServerCall[T, U]) & Metadata
  
  type ServerRegisterFunction = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof grpcJs.Server.prototype.register */ Any
}
