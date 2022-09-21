package typings.opentelemetryInstrumentationGrpc

import typings.opentelemetryInstrumentation.mod.InstrumentationBase
import typings.opentelemetryInstrumentationGrpc.srcTypesMod.GrpcInstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grpcJsMod {
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/grpc-js", "GrpcJsInstrumentation")
  @js.native
  open class GrpcJsInstrumentation protected () extends InstrumentationBase[Any] {
    def this(name: String, version: String) = this()
    def this(name: String, version: String, config: GrpcInstrumentationConfig) = this()
    
    /**
      * Parse initial client call properties and start a span to trace its execution
      */
    /* private */ var _getPatchedClientMethods: Any = js.native
    
    /**
      * Entry point for applying client patches to `grpc.makeClientConstructor(...)` equivalents
      * @param this GrpcJsPlugin
      */
    /* private */ var _patchClient: Any = js.native
    
    /**
      * Entry point for client patching for grpc.loadPackageDefinition(...)
      * @param this - GrpcJsPlugin
      */
    /* private */ var _patchLoadPackageDefinition: Any = js.native
    
    /**
      * Utility function to patch *all* functions loaded through a proto file.
      * Recursively searches for Client classes and patches all methods, reversing the
      * parsing done by grpc.loadPackageDefinition
      * https://github.com/grpc/grpc-node/blob/1d14203c382509c3f36132bd0244c99792cb6601/packages/grpc-js/src/make-client.ts#L200-L217
      */
    /* private */ var _patchLoadedPackage: Any = js.native
    
    /**
      * Patch for grpc.Server.prototype.register(...) function. Provides auto-instrumentation for
      * client_stream, server_stream, bidi, unary server handler calls.
      */
    /* private */ var _patchServer: Any = js.native
  }
}
