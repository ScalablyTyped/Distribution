package typings.pollyjsAdapter

import typings.pollyjsAdapter.anon.PickResponsestatusCodehea
import typings.pollyjsAdapter.anon.Time
import typings.pollyjsAdapter.pollyjsAdapterStrings.body
import typings.pollyjsAdapter.pollyjsAdapterStrings.headers
import typings.pollyjsAdapter.pollyjsAdapterStrings.method
import typings.pollyjsAdapter.pollyjsAdapterStrings.requestArguments
import typings.pollyjsAdapter.pollyjsAdapterStrings.url
import typings.pollyjsCore.mod.Interceptor
import typings.pollyjsCore.mod.Polly
import typings.pollyjsCore.mod.Request
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/adapter", JSImport.Default)
  @js.native
  open class default[TOptions /* <: js.Object */, TRequest /* <: Request[js.Object] */] protected ()
    extends StObject
       with Adapter[TOptions, TRequest] {
    def this(polly: Polly) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@pollyjs/adapter", "default.id")
    @js.native
    val id: String = js.native
    
    @JSImport("@pollyjs/adapter", "default.type")
    @js.native
    val `type`: String = js.native
  }
  
  @js.native
  trait Adapter[TOptions /* <: js.Object */, TRequest /* <: Request[js.Object] */] extends StObject {
    
    def assert(message: String): Unit = js.native
    def assert(message: String, condition: Boolean): Unit = js.native
    
    def connect(): Unit = js.native
    
    val defaultOptions: TOptions = js.native
    
    def disconnect(): Unit = js.native
    
    def handleRequest(request: Pick[TRequest, url | method | headers | body | requestArguments]): js.Promise[TRequest] = js.native
    
    /* private */ def intercept(request: TRequest, interceptor: Interceptor): js.Promise[Unit] = js.native
    
    var isConnected: Boolean = js.native
    
    def onConnect(): Unit = js.native
    
    def onDisconnect(): Unit = js.native
    
    def onFetchResponse(pollyRequest: TRequest): js.Promise[PickResponsestatusCodehea] = js.native
    
    def onIdentifyRequest(request: TRequest): js.Promise[Unit] = js.native
    
    def onIntercept(request: TRequest, interceptor: Interceptor): js.Promise[Unit] = js.native
    
    def onPassthrough(request: TRequest): js.Promise[Unit] = js.native
    
    def onRecord(request: TRequest): js.Promise[Unit] = js.native
    
    def onReplay(request: TRequest): js.Promise[Unit] = js.native
    
    def onRequest(request: TRequest): js.Promise[Unit] = js.native
    
    def onRequestFailed(request: TRequest): js.Promise[Unit] = js.native
    
    def onRequestFinished(request: TRequest): js.Promise[Unit] = js.native
    
    def onRespond(request: TRequest): js.Promise[Unit] = js.native
    def onRespond(request: TRequest, error: js.Error): js.Promise[Unit] = js.native
    
    val options: TOptions = js.native
    
    /* private */ def passthrough(request: TRequest): js.Promise[Unit] = js.native
    
    var persister: typings.pollyjsPersister.mod.default[js.Object] | Null = js.native
    
    var polly: Polly = js.native
    
    /* private */ def record(request: TRequest): js.Promise[Unit] = js.native
    
    /* private */ def replay(request: TRequest): js.Promise[Unit] = js.native
    
    /* private */ def timeout(request: TRequest, options: Time): js.Promise[Unit] = js.native
  }
}
